package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.StockDao;

public class StockDeleteProAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String sk_code = request.getParameter("sk_code");
		
		StockDao dbPro = StockDao.getInstance();
		dbPro.delete(sk_code);
		
		return "/jsp/mc/pmc/stockDeletePro.jsp";
	}

}
