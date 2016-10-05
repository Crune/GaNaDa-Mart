package ganada.core;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.jar.JarFile;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.util.ReadAllStream;

import ganada.action.common.*;

import ganada.mc.action.*;

public class DispatcherAction extends HttpServlet {

	private static final long serialVersionUID = 8798431058519727326L;

	private Map<String, SuperAction> map = new HashMap<String, SuperAction>();
	private SuperAction notFoundAction = new NotFoundAction();

	private SuperAction headerAction = new HeaderAction();
	private SuperAction footerAction = new FooterAction();
	private SuperAction headerMCAction = new MCHeaderAction();
	private SuperAction footerMCAction = new MCFooterAction();

	@Override
	public void init(ServletConfig config) throws ServletException {
		if (map.isEmpty()) {
			Set<String> pack = new HashSet<String>();
			pack.add("ganada.action.common");
			pack.add("ganada.action.member");
			pack.add("ganada.action.payment");
			pack.add("ganada.action.product");

			for (String packStr : pack) {
				Set<Class> set = Reflections.getClasses(packStr);
				for (Class cls : set) {
					if (cls.isAnnotationPresent(Action.class)) {
						String key = ((Action) cls.getAnnotation(Action.class)).value();
						DB.OUTLN(" +A url @ " + DAO.tabber(key, 4) + cls.getName());
						try {
							map.put(key, (SuperAction) cls.newInstance());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}

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
				Class actionClass;
				Object instance = null;
				try {
					actionClass = Class.forName(value);
					instance = actionClass.newInstance();
					DB.OUTLN(" +P url @ " + DAO.tabber((String) key, 4) + instance.getClass().getName());
					map.put((String) key, (SuperAction) instance);
				} catch (Exception e) {
					e.printStackTrace();
				}
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

			System.out.println("\r\n────────────────────────────────────────────");
			System.out.println("\r\n호출URI: " + uri);

			SuperAction sa = map.get(uri);
			sa = (sa == null) ? notFoundAction : sa;

			HttpSession session = request.getSession();
			String url = "";

			url = headerAction.executeAction(request, response);
			session.setAttribute("urlHeader", (String) url);
			url = footerAction.executeAction(request, response);
			session.setAttribute("urlFooter", (String) url);

			url = headerMCAction.executeAction(request, response);
			session.setAttribute("urlMCHeader", (String) url);
			url = footerMCAction.executeAction(request, response);
			session.setAttribute("urlMCFooter", (String) url);

			String view = sa.executeAction(request, response);
			if (view != null) {
				RequestDispatcher rd = request.getRequestDispatcher(view);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
