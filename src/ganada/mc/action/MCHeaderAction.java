package ganada.mc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.common.Menu;
import ganada.obj.common.MenuDao;

public class MCHeaderAction implements SuperAction {
    
    static List<Menu> menus;

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        session.setAttribute("mc_header", "/jsp/mc/header.jsp");
                
        return "/jsp/mc/header.jsp";
    }

}
