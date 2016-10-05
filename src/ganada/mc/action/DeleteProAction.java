package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductDao;

public class DeleteProAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pd_code= request.getParameter("pd_code");
		
		ProductDao dbPro = ProductDao.getInstance();
		dbPro.delete(pd_code);
		return "/jsp/mc/pmc/delete.jsp";
	}

}
