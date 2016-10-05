package ganada.action.member;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.member.Account;
import ganada.obj.member.AccountDao;

public class Join2Action implements SuperAction {

	public Join2Action() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String oln = (String)session.getAttribute("overlapName");
		String ole = (String)session.getAttribute("overlapEmail");
		session.setAttribute("oln", oln);
		session.setAttribute("ole", ole);
		
		
		
		
		
		return "/jsp/member/join2.jsp";
	}

}
