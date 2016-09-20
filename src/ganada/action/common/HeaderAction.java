package ganada.action.common;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.obj.common.Menu;
import ganada.obj.common.MenuDao;

public class HeaderAction implements SuperAction {
    
    static List<Menu> menus;

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        if (menus ==null) {
            MenuDao dao = MenuDao.getInstance();
            MenuDao.refresh();
            menus = dao.getMenus();
        }

        HttpSession session = request.getSession();
        session.setAttribute("menus", menus);
        

        
        return "/jsp/template/header.jsp";
    }

}
