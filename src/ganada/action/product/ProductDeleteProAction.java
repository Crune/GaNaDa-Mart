package ganada.action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductDao;

public class ProductDeleteProAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		ProductDao dbPro = ProductDao.getInstance();
		dbPro.deleteProduct(num);
				
		return "/jsp/product/productDeletePro.jsp";
	}
}
