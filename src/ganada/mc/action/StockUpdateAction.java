package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Stock;
import ganada.obj.product.StockDao;

public class StockUpdateAction implements SuperAction {

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sk_code = request.getParameter("sk_code");
		
		StockDao dbPro = StockDao.getInstance();
		Stock stock = (Stock) dbPro.select(sk_code);
		
		request.setAttribute("stock", stock);
		request.setAttribute("sk_code", sk_code);
		
		return "/jsp/mc/pmc/stockUpdate.jsp";
	}

}
