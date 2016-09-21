package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.member.Account;
import ganada.obj.member.AccountDao;

public class LoginProAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("loginId");
        String passwd = request.getParameter("password");

        AccountDao dao = AccountDao.getInstance();

        int check = dao.userCheck(id, passwd);
        request.setAttribute("check", check);
        
        if (check == 1) {            
            HttpSession session = request.getSession();
            session.setAttribute("loginId", id);

            Account vo = dao.getAccountLast(id);
            session.setAttribute("userAccount", vo);
            session.setAttribute("memName", vo.getName());
        }
        return "/jsp/member/popup_login_pro.jsp";
    }

}
