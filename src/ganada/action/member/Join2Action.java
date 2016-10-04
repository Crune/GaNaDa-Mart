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
		/*
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String oln = (String)session.getAttribute("overlapName");
		String ole = (String)session.getAttribute("overlapEmail");
		session.setAttribute("oln", oln);
		session.setAttribute("ole", ole);
		try{
			Account account = new Account();
			account.setId(request.getParameter("id"));
			account.setName(request.getParameter("passwd"));
			account.setInfo(request.getParameter("info"));
			account.setEmail(request.getParameter("email"));
			account.setPasswd(request.getParameter("passwd"));			
			account.setBirth(request.getParameter());
			account.setContact(request.getParameter("contact"));
			account.setGender(request.());
			account.setInfo_store_term(request.getParameter(""));
			account.setLunisolar(request.getParameter(""));
			account.setMile(request.getParameter(""));
			account.setMod_date(request.getParameter());
			account.setPhone(request.getParameter());			
			account.setSms_allow(request.getParameter());
			account._setBirthday(request.getParameter());				
			account.setReg_date(new Timestamp(System.currentTimeMillis()));				
			
			AccountDao dao = AccountDao.getInstance();
			dao.insert(account);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		*/
		return "/jsp/member/join2.jsp";
	}

}
