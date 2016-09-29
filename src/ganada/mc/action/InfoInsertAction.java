package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InfoInsertAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//String pd_code = request.getParameter("pd_code");
		//request.setAttribute("pd_code", pd_code);
		return "/jsp/mc/pmc/infoInsert.jsp";
	}

}
