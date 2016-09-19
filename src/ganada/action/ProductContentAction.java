package ganada.action;

import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.obj.Product;
import ganada.obj.ProductDao;

public class ProductContentAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		
		ProductDao dao = ProductDao.getInstance();
		Product product = dao.getProduct(num);
		
		String pdImage = product.getImage();
		StringTokenizer pdImageSt = new StringTokenizer(pdImage, "/");
		//for(int x=1; tokens.hasMoreElements(); x++){}
		String colorImage = product.getColorimage();
		StringTokenizer colorImageSt = new StringTokenizer(colorImage, "/");
			
		request.setAttribute("pdImageSt", pdImageSt);
		request.setAttribute("colorImageSt", colorImageSt);
		request.setAttribute("num", new Integer(num));
		request.setAttribute("product", product);
		
		return "/jsp/product/productContent.jsp";
	}
}
