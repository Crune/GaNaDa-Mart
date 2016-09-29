package ganada.mc.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;
public class InsertProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {


		
		Product pd = new Product();
		pd.setMenu_code("menu_code");
		pd.setPd_name(request.getParameter("pd_name"));
		pd.setPd_price(Integer.parseInt(request.getParameter("pd_price")));
		ProductDao process = ProductDao.getInstance();
		
		process.insert(pd);
		
		
		

		
		return "/jsp/mc/pmc/insert.jsp";
	}

}
