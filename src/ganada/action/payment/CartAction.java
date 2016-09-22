package ganada.action.payment;

import java.text.DecimalFormat;
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
		 cartSVO = (Cart)session.getAttribute("cart");
		}*/
		
		cartSVO  = new Cart(); //임시방편 최종적으로는 지울거임...
		
		CartDao cartDao  = CartDao.getInstance();
		
		//이것도 테스트용 나중에는 지울거임...
		if(cartSVO.getUser_id() ==null){
			cartSVO.setUser_id("test1");
		}
		
		List<Cart> cartList  = cartDao.getCart(cartSVO.getUser_id());
		int order_price  = 0;
		int total_discount_price  =0;
		int total_price = 0; // 카트리스트 총 금액 
		DecimalFormat Commas = new DecimalFormat("#,###");
		
		if(cartList !=null && cartList.size() > 0){

			int discount_price =0;
			int total = 0;
			for(Cart vo : cartList){
				total =0;
				
				Product pVo  = cartDao.getProduct(vo.getItem_id());
				total = pVo.getPd_price() * vo.getItem_cnt();
				
				//할인율이 있을 경우만 적용 
				/*if(pVo.getDiscount() > 0 ){
					discount_price =  ( pVo.getPrice() *( pVo.getDiscount() /100) ) * vo.getItem_cnt();
				}
				*/
				vo.setItem_price(pVo.getPd_price());
				vo.setItem_total(total);
				vo.setItem_name(pVo.getPd_name());
				
				order_price += total;
				total_discount_price += discount_price;
				
			}
		}
		
		total_price = order_price - total_discount_price;
		
		request.setAttribute("itemList", cartList);  // 장바구니 리스트
		request.setAttribute("order_price", Commas.format(order_price));  //주문금액
		request.setAttribute("discount_price", Commas.format(total_discount_price));  //할인금액
		request.setAttribute("total_price", Commas.format(total_price));  //총 결제예정금액

		// TODO Auto-generated method stub
		return "/jsp/cart/cart.jsp";
		}
	
	@Override
	public Object[] getDataBinders() {
		// TODO Auto-generated method stub
		return new Object[]{"cart",  ganada.obj.payment.Cart.class};
	}
}