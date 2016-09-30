package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfoDao;

public class InfoDeleteProAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String pd_infocode = request.getParameter("pd_infocode");
		
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		dbPro.delete(pd_infocode);
		
		return "/jsp/mc/pmc/infoDeletePro.jsp";
	}

}
