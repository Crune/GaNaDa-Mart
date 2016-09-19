package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.obj.Product;
import ganada.obj.ProductDao;

public class ProductInsertAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		return "/jsp/product/productInsert.jsp";
	}
}
