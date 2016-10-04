package ganada.mc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductColorDao;

public class ColorListAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pd_code = request.getParameter("pd_code");
		int count = 0;
		ProductColorDao dbPro = ProductColorDao.getInstance();
		
		List<ProductColor> cList = (List<ProductColor>) dbPro.search("pd_code", pd_code);

		request.setAttribute("cList", cList);
		request.setAttribute("pd_code", pd_code);
		request.setAttribute("count", count);
		
	return "/jsp/mc/pmc/colorList.jsp";
	}

}
