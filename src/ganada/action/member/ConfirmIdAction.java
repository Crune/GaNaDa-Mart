package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.member.AccountDao;

public class ConfirmIdAction implements SuperAction {

	public ConfirmIdAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("euc-kr");
		try{
			HttpSession session = request.getSession();
			AccountDao dao = AccountDao.getInstance();
		    String oId = request.getParameter("id");
			
		    int rst = dao.isExist("id", oId);
		    
		    session.setAttribute("ajaxStr", rst);
		    session.setAttribute("id", oId);

			
		    
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		return "/jsp/member/confirmId.jsp";
	}

}
