package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartInsertAction implements SuperAction{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return "/cart/cartinsert.jsp";
	}

}