package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductColorDao;

public class ColorInsertProAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String pd_code = request.getParameter("pd_code");
		ProductColor pc = new ProductColor();
		ProductColorDao process = ProductColorDao.getInstance();
		pc.setC_name(request.getParameter("c_name"));
		pc.setPd_code(request.getParameter("pd_code"));
		
		process.insert(pc);
		
		request.setAttribute("pd_code", pd_code);
	return "/jsp/mc/pmc/colorInsertPro.jsp";
	}

}
