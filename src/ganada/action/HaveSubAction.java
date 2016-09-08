package ganada.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class HaveSubAction implements SuperAction {

    protected static Map<String, SuperAction> actions = new HashMap<String, SuperAction>();

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	HttpSession session = request.getSession();
	String url = "";
	for (String key : actions.keySet()) {
	    try {
		url = actions.get(key).executeAction(request, response);
		session.setAttribute(key, url);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return exe(request, response);
    }

    public abstract String exe(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
