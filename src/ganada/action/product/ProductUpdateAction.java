package ganada.action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;

public class ProductUpdateAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "/jsp/product/productUpdate.jsp";
	}
}
