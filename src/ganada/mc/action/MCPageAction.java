package ganada.mc.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.HaveSubAction;
import ganada.action.common.SuperAction;

public class MCPageAction implements SuperAction {

    protected static Map<String, SuperAction> actions = new HashMap<String, SuperAction>();
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            actions.put("main", new MCMainAction());
            actions.put("error", new MCErrorAction());      
            
            HttpSession session = request.getSession();
            session.setAttribute("pageTitle", "관리 콘솔");

            request.setCharacterEncoding("UTF-8");
            String menu = request.getParameter("menu");
            if (menu == null) menu = "main";
            menu = actions.containsKey(menu)?menu:"error";
            
            String url = actions.get(menu).executeAction(request, response);
            session.setAttribute("urlCont", (String) url);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/jsp/mc/mc.jsp";
    }
}
