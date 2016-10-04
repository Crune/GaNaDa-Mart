package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class ColorInsertAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String pd_code = request.getParameter("pd_code");
		request.setAttribute("pd_code", pd_code);
	
		return "/jsp/mc/pmc/colorInsert.jsp";
	}

}
