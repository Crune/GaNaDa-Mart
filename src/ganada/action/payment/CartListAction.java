package ganada.action.payment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.member.Account;
import ganada.obj.payment.Cart;
import ganada.obj.payment.CartDao;
import ganada.obj.product.Product;

/**
 * 실제 장바구니를 호출하는 액션
 * @author Han
 */
public class CartListAction implements SuperAction{
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		//세션에서 사용자 정보를 가져온다.
		Account userVO  = (Account)session.getAttribute("userAccount");
		CartDao cartDao  = CartDao.getInstance();
		
		//현재 로그인된 사용자가 가진 장바구니 리스트를 출력한다.
		List<Cart> cartList  = cartDao.getCart(userVO.getId());
		int order_price  = 0;
		int total_discount_price  =0; // 혹시나 할인율 적용하면 쓰려고 만들어만 놓
		int total_price = 0; // 카트리스트 총 금액 
		DecimalFormat Commas = new DecimalFormat("#,###");
		
		//사용자가 지닌 장바구니 정보가 있을 시 각각의 상품에 대한 가격정보 및 총가격을 구해야한다.
		if(cartList !=null && cartList.size() > 0){

			int discount_price =0;
			int total = 0;
			for(Cart vo : cartList){
				total =0;
				// 장바구니에 있는 각각의 상품코드를 통해서 상품에 대한 가격정보, 상품명 을 가져온다.
				Product pVo  = cartDao.getProduct(vo.getItem_id());
				total = pVo.getPd_price() * vo.getItem_cnt();

				vo.setItem_price(pVo.getPd_price());
				vo.setItem_total(total);
				vo.setItem_name(pVo.getPd_name());
				
				order_price += total; // 총 예상 가격
				total_discount_price += discount_price; // 총 예상 할인가격....
			}
		}else{
			//null point Exception 방지
			cartList = new ArrayList<Cart>();
		}
		
		total_price = order_price - total_discount_price;  // 총 예산가격에서 할인가격을 빼면 실제 예상 결제금액이 나온다.
		
		request.setAttribute("itemList", cartList);  // 장바구니 리스트
		request.setAttribute("order_price", Commas.format(order_price));  //주문금액
		request.setAttribute("discount_price", Commas.format(total_discount_price));  //할인금액
		request.setAttribute("total_price", Commas.format(total_price));  //총 결제예정금액

		//장바구니 리스트화면으로 이동 
		return "/jsp/cart/cartList.jsp";
	}

}
