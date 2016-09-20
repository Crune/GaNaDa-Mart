package ganada.action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class ProductUpdateAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		ProductDao dbPro = ProductDao.getInstance();
		Product product = dbPro.getProduct(num);
		
		request.setAttribute("product", product);
		
		return "/jsp/product/productUpdate.jsp";
	}
}
