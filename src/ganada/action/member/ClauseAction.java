package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class ClauseAction implements SuperAction {

	public ClauseAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		return "/jsp/member/clause.jsp";
	}

}
