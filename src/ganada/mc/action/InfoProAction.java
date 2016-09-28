package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InfoProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String pd_code = request.getParameter("pd_code");
		ProductInfo pi = new ProductInfo();
		ProductInfoDao process = ProductInfoDao.getInstance();
		pi.setPd_infocontent(request.getParameter("pd_infocontent1"));

	//	pi.setPd_code(pd_code);
		
		process.insert(pi);
		
	
		request.setAttribute("pd_code", pd_code);
		return "/jsp/mc/pmc/infoPro.jsp";
	}

}
