package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InfoInsertProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String pd_infotype = request.getParameter("pd_infotype");
		ProductInfo pi = new ProductInfo();
		ProductInfoDao process = ProductInfoDao.getInstance();
		pi.setPd_infoname(request.getParameter("pd_infoname"));
		pi.setPd_infocontent(request.getParameter("pd_infocontent"));
		pi.setPd_infotype(request.getParameter("pd_infotype"));
		
		process.insert(pi);
		
			
		request.setAttribute("pd_infotype", pd_infotype);
		return "/jsp/mc/pmc/infoInsertPro.jsp";
	}

}
