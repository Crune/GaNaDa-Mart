package ganada.action.payment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class OrderAction implements SuperAction{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String cart_ids   = request.getParameter("cart_ids");
		return "/jsp/order/order.jsp";
	}

}
