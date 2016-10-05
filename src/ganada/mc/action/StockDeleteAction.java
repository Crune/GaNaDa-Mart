package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class StockDeleteAction implements SuperAction {public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sk_code = request.getParameter("sk_code");
		
		
		request.setAttribute("sk_code", sk_code);
		
		return "/jsp/mc/pmc/stockDelete.jsp";
	}

}
