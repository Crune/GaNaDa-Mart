package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.obj.Product;
import ganada.obj.ProductDao;

public class ProductContentAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		num = 3;
		
		ProductDao dao = ProductDao.getInstance();
		Product product = dao.getProduct(num);
		
		request.setAttribute("num", new Integer(num));
		request.setAttribute("product", product);
		
		return "/jsp/product/productContent.jsp";
		//https://github.com/Crune/GaNaDa-Mart
	}
}
