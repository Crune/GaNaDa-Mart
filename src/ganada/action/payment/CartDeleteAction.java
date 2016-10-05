package ganada.action.payment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.payment.Cart;
import ganada.obj.payment.CartDao;

public class CartDeleteAction implements SuperAction {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Cart cartSVO = (Cart)request.getAttribute("cart");
		
		int result  =0;
		CartDao dao  = CartDao.getInstance();
		result  = dao.deleteCart(cartSVO.getCart_id());
		
		String resultCode = null;
		
		if(result > 0){
			resultCode ="Sucess";
		}else{
			resultCode ="Fail";
		}
		
		request.setAttribute("resultCode", resultCode);
		
		// TODO Auto-generated method stub
		return "/jsp/cart/cartDelete.jsp";
	}

}