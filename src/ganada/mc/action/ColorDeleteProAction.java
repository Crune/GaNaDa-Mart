package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductColorDao;

public class ColorDeleteProAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String c_code = request.getParameter("c_code");
		String pd_code = request.getParameter("pd_code");
		
		ProductColorDao dbPro = ProductColorDao.getInstance();
		dbPro.delete(c_code);

		request.setAttribute("c_code", c_code);
		request.setAttribute("pd_code", pd_code);
		
		return "/jsp/mc/pmc/colorDeletePro.jsp";
	}

}
