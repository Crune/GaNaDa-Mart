package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.member.AccountDao;

public class LoginProAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("loginId");
        String passwd = request.getParameter("password");

        AccountDao dao = AccountDao.getInstance();
        HttpSession session = request.getSession();

        int check = dao.userCheck(id, passwd);
        request.setAttribute("check", check);
        if (check == 1) {
            session.setAttribute("memId", id);
            session.setAttribute("memName", dao.getaccount(id).getName());
            return "/page.gnd?code=MAIN";
        }
        
        return "/jsp/member/popup_login_pro.jsp";
    }

}
