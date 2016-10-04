package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductColorDao;

public class ColorUpdateAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String c_code = request.getParameter("c_code");
		
		ProductColorDao dbPro = ProductColorDao.getInstance();
		ProductColor pc = (ProductColor) dbPro.select(c_code);
		
		request.setAttribute("pc", pc);
		request.setAttribute("c_code", c_code);
		
	return "/jsp/mc/pmc/colorUpdate.jsp";
	}

}
