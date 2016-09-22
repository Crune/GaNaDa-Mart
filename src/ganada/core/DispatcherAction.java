package ganada.core;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.*;

import ganada.mc.action.*;

public class DispatcherAction extends HttpServlet {

    private static final long serialVersionUID = 8798431058519727326L;

    private Map<String, SuperAction> map = new HashMap<String, SuperAction>();
    private SuperAction notFoundAction = new NotFoundAction();
    private SuperAction headerAction = new HeaderAction();
    private SuperAction footerAction = new FooterAction();

    @Override
    public void init(ServletConfig config) throws ServletException {
        String path = config.getInitParameter("propertiesPath");
        path = config.getServletContext().getRealPath(path);
        Properties p = new Properties();
        FileReader f = null;
        try {
            f = new FileReader(path);
            p.load(f);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Object key : p.keySet()) {
            String value = p.getProperty((String) key);
            try {
                Class actionClass = Class.forName(value);
                Object instance = actionClass.newInstance();
                System.out.println("DispatcherAction.init.instance:" + instance.toString());
                map.put((String) key, (SuperAction) instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String path = request.getContextPath();
            String uri = request.getRequestURI();
            if (uri.indexOf(path) == 0) // sub domain check
                uri = uri.substring(path.length());

            System.out.println("DispatcherAction.service.uri:" + uri);

            // MC 헤더 푸터 적용 {
            if (uri.contains("/mc/")) {
                headerAction = new MCHeaderAction();
                footerAction = new MCFooterAction();
            }
            // } MC 헤더 푸터 적용

            SuperAction sa = map.get(uri);
            sa = (sa == null) ? notFoundAction : sa;

            // START - Data Binding
            HashMap<String, Object> model = new HashMap<String, Object>();
            model.put("session", request.getSession());
            if (sa instanceof DataBinding) {
                prepareRequestData(request, model, (DataBinding) sa);
            }
            for (String key : model.keySet()) {
                request.setAttribute(key, model.get(key));
            }
            // END - Data Binding

            HttpSession session = request.getSession();
            String url = "";
            url = headerAction.executeAction(request, response);
            session.setAttribute("urlHeader", (String) url);

            url = footerAction.executeAction(request, response);
            session.setAttribute("urlFooter", (String) url);

            String view = sa.executeAction(request, response);
            if (view != null) {
                RequestDispatcher rd = request.getRequestDispatcher(view);
                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void prepareRequestData(HttpServletRequest request, HashMap<String, Object> model, DataBinding dataBinding)
            throws Exception {
        Object[] dataBinders = dataBinding.getDataBinders();
        String dataName = null;
        Class<?> dataType = null;
        Object dataObj = null;
        for (int i = 0; i < dataBinders.length; i += 2) {
            dataName = (String) dataBinders[i];
            dataType = (Class<?>) dataBinders[i + 1];
            dataObj = ServletRequestDataBinder.bind(request, dataType, dataName);
            model.put(dataName, dataObj);
        }
    }
}
