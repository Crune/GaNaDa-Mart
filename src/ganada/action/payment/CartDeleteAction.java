package ganada.action.payment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.core.DataBinding;
import ganada.obj.payment.Cart;
import ganada.obj.payment.CartDao;

public class CartDeleteAction implements SuperAction, DataBinding{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		Cart cartSVO = (Cart)session.getAttribute("cart");
		
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
		return "/cart/cartdelete.jsp";
	}

	@Override
	public Object[] getDataBinders() {
		// TODO Auto-generated method stub
		return new Object[]{"cart",  ganada.obj.payment.Cart.class};
	}
}