package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InfoUpdateProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		String pd_infocode = request.getParameter("pd_infocode");
		
		ProductInfo pi = new ProductInfo();
		pi.setPd_infocode(request.getParameter("pd_infocode"));
		pi.setPd_infotype(request.getParameter("pd_infotype"));
		pi.setPd_infocontent(request.getParameter("pd_infocontent"));
		pi.setPd_infoname(request.getParameter("pd_infoname"));
		
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		dbPro.update(pi);
		
		request.setAttribute("pd_infocode", pd_infocode);
		
		return "/jsp/mc/pmc/infoUpdatePro.jsp";
	}

}
