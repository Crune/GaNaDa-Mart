package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class StockDeleteAction implements SuperAction {public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String st_code = request.getParameter("st_code");
		
		
		request.setAttribute("st_code", st_code);
		
		return "/jsp/mc/pmc/stockDelete.jsp";
	}

}
