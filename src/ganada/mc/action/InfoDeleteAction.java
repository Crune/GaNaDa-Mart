package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class InfoDeleteAction implements SuperAction {public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	String pd_infocode = request.getParameter("pd_infocode");
	
	
	request.setAttribute("pd_infocode", pd_infocode);
	
	return "/jsp/mc/pmc/infoDelete.jsp";
}

}
