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

@WebServlet("/cartUpdate.gnd")
public class CartUpdateAction extends HttpServlet{ //독립적인 서블릿
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

	
	public void executeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String item_cnt_str = request.getParameter("item_cnt");
		String cart_id_str  = request.getParameter("cart_id");

		int cart_id = 0;
		int item_cnt = 0;
		
		if(cart_id_str !=null){
			cart_id = Integer.parseInt(cart_id_str);
		}
		if(item_cnt_str !=null){
			item_cnt = Integer.parseInt(item_cnt_str);
		}
		
		try{
			
			if(cart_id > 0){
		
			int result  =0;
			CartDao dao  = CartDao.getInstance();	
			
			Cart cart = dao.getOneCart(cart_id);
			
			cart.setCart_id(cart_id);
			cart.setItem_cnt(item_cnt);
			
			dao.updateCart(cart);
			// int total_pd_price = 
					
			JSONObject jObj  = new JSONObject();
			
			jObj.put("code", new Integer(10000));
			response.getWriter().write(jObj.toString());	
	   }
	}catch(Exception e){
		e.printStackTrace();
	}
}
	}

