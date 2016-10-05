package ganada.mc.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;
public class InsertProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		
		ProductDao process = ProductDao.getInstance();
		Product pd = (Product) process.bind(request);		
		
	//	int pd_price = Integer.parseInt(request.getParameter("pd_price"));
		/*
		pd.setMenu_code(request.getParameter("menu_code"));
		pd.setPd_name(request.getParameter("pd_name"));
		pd.setPd_price(pd_price);
		pd.setPd_infocode1(request.getParameter("pd_infocode1"));
		pd.setPd_infocode2(request.getParameter("pd_infocode2"));
		pd.setPd_infocode3(request.getParameter("pd_infocode3"));
		pd.setPd_infocode4(request.getParameter("pd_infocode4"));
		*/
		
		process.insert(pd);
		
		return "/jsp/mc/pmc/insertPro.jsp";
	}

}
