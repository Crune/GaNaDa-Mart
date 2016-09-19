package ganada.action.payment;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.core.DataBinding;
import ganada.obj.payment.Cart;
import ganada.obj.payment.CartDao;
import ganada.obj.product.Product;

public class CartAction implements SuperAction, DataBinding{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		Cart cartSVO = null;
		
	/*	if(session.getAttribute("user") ==  null){
			return null;
		}else{			
		 cartSVO = (Cart)session.getAttribute("user");
		}*/
		
		cartSVO  = new Cart(); //임시방편 최종적으로는 지울 것
		
		CartDao cartDao  = CartDao.getInstance();
		
		//이것도 테스트용 나중에는 지울 것
		
		if(cartSVO.getUser_id() ==null){
			cartSVO.setUser_id("test1");
		}
		
		List<Cart> cartList  = cartDao.getCart(cartSVO.getUser_id());
		int total_price = 0; // 카트리스트 총 금액 
		if(cartList !=null && cartList.size() > 0){
			int price = 0;
			int total = 0;
			for(Cart vo : cartList){
				price = 0;
				total =0;
				
				Product pVo  = cartDao.getProduct(vo.getItem_num());
				
				if(pVo.getDiscount() > 0){
					price = pVo.getPrice() *( 1 - (pVo.getDiscount()/100) );
				}else{
					price = pVo.getPrice();
				}
				
				total = price * vo.getItem_cnt();
				
				vo.setItem_price(price);
				vo.setItem_total(total);
				vo.setItem_name(pVo.getName());
				
				total_price += total;
				
			}
		}
		
		request.setAttribute("itemList", cartList);
		request.setAttribute("total_price", total_price);

		// TODO Auto-generated method stub
		return "/jsp/cart/cart.jsp";
		}
	
	@Override
	public Object[] getDataBinders() {
		// TODO Auto-generated method stub
		return new Object[]{"cart",  ganada.obj.payment.Cart.class};
	}
}