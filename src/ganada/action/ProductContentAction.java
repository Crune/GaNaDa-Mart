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
		
		//String colorImage = product.getImage();
		//StringTokenizer tokens = new StringTokenizer(colorImage, "/");
		//for(int x=1; tokens.hasMoreElements(); x++){}
		//request.setAttribute("tokens", tokens);
		request.setAttribute("num", new Integer(num));
		request.setAttribute("product", product);
		
		return "/jsp/product/productContent.jsp";
	}
}
