package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class IndexAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//관리자 구분할 때
		request.setAttribute("type", new Integer(0));
		return "/jsp/mc/pmc/index.jsp";
	}

}
