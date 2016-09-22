package ganada.action.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class HaveSubAction implements SuperAction {

    protected static Map<String, SuperAction> subActions = new HashMap<String, SuperAction>();
    protected static Map<String, String> actionURLs = new HashMap<String, String>();
        
    protected abstract void doBefore(HttpServletRequest request, HttpServletResponse response) throws Exception;

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        doBefore(request, response);
        for (String key : subActions.keySet()) {
            try {
                actionURLs.put(key, subActions.get(key).executeAction(request, response));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return doAfter(request, response);
    }

    protected abstract String doAfter(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
