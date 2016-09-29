package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.core.NULL;
import ganada.obj.member.AccountDao;

public class OverlapAction implements SuperAction {

	public OverlapAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
        HttpSession session = request.getSession();
        
        AccountDao dao = AccountDao.getInstance();
        
        String name = request.getParameter("name");	
        String email = request.getParameter("email"); 
        
        int rst = dao.isExist("email", email);
        
		session.setAttribute("ajaxStr", rst);
		session.setAttribute("overlapName", name );
		session.setAttribute("overlapEmail", email );
		
		return "/jsp/template/ajax.jsp";
	}
}
