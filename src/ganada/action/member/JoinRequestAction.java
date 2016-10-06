package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import ganada.action.common.SuperAction;
import ganada.obj.member.Account;
import ganada.obj.member.AccountDao;
import ganada.obj.member.Phone;
import ganada.obj.member.PhoneDao;

public class JoinRequestAction implements SuperAction {

	public JoinRequestAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try{
			HttpSession session = request.getSession();
			String ole = (String)session.getAttribute("overlapEmail");
			String oln = (String)session.getAttribute("overlapName");
			AccountDao dao = AccountDao.getInstance();
			
			Account account = new Account();
			account = (Account) dao.bind(request);			
			account._setBirth(request.getParameter("b_year")+"-"+request.getParameter("b_month")+"-"+request.getParameter("b_day"));
			account.setContact(request.getParameter("c_first")+"-"+request.getParameter("c_second")+"-"+request.getParameter("c_third"));
			account.setPhone(request.getParameter("p_first")+"-"+request.getParameter("p_second")+"-"+request.getParameter("p_third"));
			account.setEmail(ole);
			account.setName(oln);
			dao.insert(account);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "/jsp/member/joinRequest.jsp";
	}

}
