package ganada.action.payment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import ganada.obj.payment.CartDao;

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

	
	public void executeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String item_cnt = request.getParameter("item_cnt");
		String cart_id  = request.getParameter("cart_id");

		int result  =0;
		CartDao dao  = CartDao.getInstance();	
		
		JSONObject jObj  = new JSONObject();
		
		jObj.put("code", new Integer(10000));
		response.getWriter().write(jObj.toString());	
	}
}
