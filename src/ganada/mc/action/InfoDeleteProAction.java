package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfoDao;

public class InfoDeleteProAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String pd_infocode = request.getParameter("pd_infocode");
		String pd_infotype = request.getParameter("pd_infotype");
		
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		dbPro.delete(pd_infocode);

		request.setAttribute("pd_infotype", pd_infotype);
		request.setAttribute("pd_infocode", pd_infocode);
		
		return "/jsp/mc/pmc/infoDeletePro.jsp";
	}

}
