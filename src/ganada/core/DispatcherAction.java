package ganada.core;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.*;

public class DispatcherAction extends HttpServlet {

	private static final long serialVersionUID = 8798431058519727326L;

	private Map<String, SuperAction> map = new HashMap<String, SuperAction>();
	private SuperAction notFoundAction = new NotFoundAction();

	@Override
	public void init(ServletConfig config) throws ServletException {
		String path = config.getInitParameter("propertiesPath");
		path = config.getServletContext().getRealPath(path);
		Properties p = new Properties();
		FileReader f = null;
		try {
			f = new FileReader(path);
			p.load(f);
			System.out.println("Prop : " + p + "\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Object key : p.keySet()) {
			String value = p.getProperty((String) key);
			try {
				Class<?> actionClass = Class.forName(value);
				Object instance = actionClass.newInstance();
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

			SuperAction sa = map.get(uri);
			sa = (sa == null) ? notFoundAction : sa;

			HashMap<String, Object> model = new HashMap<String, Object>();
			model.put("session", request.getSession());
			if (sa instanceof DataBinding) {
				prepareRequestData(request, model, (DataBinding) sa);
			}
			for (String key : model.keySet()) {
				request.setAttribute(key, model.get(key));
			}

			String view = sa.executeAction(request, response);
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
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
