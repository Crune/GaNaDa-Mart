package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InfoUpdateAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String pd_infocode = request.getParameter("pd_infocode");
		
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		ProductInfo pi = (ProductInfo) dbPro.select(pd_infocode);
		
		request.setAttribute("pi", pi);
		request.setAttribute("pd_infocode", pd_infocode);
		return "/jsp/mc/pmc/infoUpdate.jsp";
	}

}
