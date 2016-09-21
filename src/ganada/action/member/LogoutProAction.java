package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;

public class LogoutProAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("loginId");
        if (id != null || id != "") {
            session.invalidate();
        }
        response.sendRedirect("page.gnd?type=MAIN");
        
        return null;
    }


}
