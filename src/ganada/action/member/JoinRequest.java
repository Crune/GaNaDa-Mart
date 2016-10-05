package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.member.Account;
import ganada.obj.member.AccountDao;
import ganada.obj.member.Phone;
import ganada.obj.member.PhoneDao;

public class JoinRequest implements SuperAction {

	public JoinRequest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try{

			AccountDao dao = AccountDao.getInstance();
			
			Account account = new Account();
			account = (Account) dao.bind(request);			
			account._setBirthday(request.getParameter("b_year")+"-"+request.getParameter("b_month")+"-"+request.getParameter("b_day"));
			account.setContact(request.getParameter("c_first")+"-"+request.getParameter("c_second")+"-"+request.getParameter("c_third"));
			account.setPhone(request.getParameter("p_first")+"-"+request.getParameter("p_second")+"-"+request.getParameter("p_third"));
			dao.insert(account);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "/jsp/member/joinRequest.jsp";
	}

}
