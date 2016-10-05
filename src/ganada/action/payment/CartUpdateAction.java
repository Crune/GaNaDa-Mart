package ganada.action.payment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import ganada.obj.payment.Cart;
import ganada.obj.payment.CartDao;
import ganada.obj.product.Product;

@WebServlet("/cartUpdate.gnd")
public class CartUpdateAction extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		executeAction(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		executeAction(req, resp);
	}

	
	@SuppressWarnings("unchecked")
	public void executeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String item_cnt_str = request.getParameter("item_cnt");  // 업데이트할 제품 개수
		String cart_id_str  = request.getParameter("cart_id");  // 장바구니 id
		
		int cart_id  = 0;
		int item_cnt  = 0;
		
		if(cart_id_str !=null){  // 넘어온값이 있는지 체그
			cart_id = Integer.parseInt(cart_id_str);
		}
	
		if(item_cnt_str !=null){
			item_cnt  = Integer.parseInt(item_cnt_str);
		}

		try{
			
			if(cart_id > 0){	//정버규나 아이디가 정상적이라면...
			
				CartDao dao  = CartDao.getInstance();	
				Cart cart = dao.getOneCart(cart_id);  // 해당 장바구니 내용 가져오기
				Product pVo  = dao.getProduct(cart.getItem_id()); // 장바구니에 담긴 물품정보 가져오기
				cart.setCart_id(cart_id);  // 장바구니 id
				cart.setItem_cnt(item_cnt); // 수량
				
				dao.updateCart(cart); //수량 업데이트
				
				int total_pd_price  = pVo.getPd_price() * item_cnt; // 총 금액
				
				JSONObject jObj  = new JSONObject();
				
				jObj.put("total_price", total_pd_price);  
				
				response.getWriter().write(jObj.toString());  //JSON 객체 린턴을 위해서 쓴다..
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
