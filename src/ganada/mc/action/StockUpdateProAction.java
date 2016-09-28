package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Stock;
import ganada.obj.product.StockDao;

public class StockUpdateProAction implements SuperAction {

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String pd_code = request.getParameter("pd_code");
		
		Stock stock = new Stock();
		stock.setSk_code(request.getParameter("sk_code"));
		stock.setC_code(request.getParameter("c_code"));
		stock.setPd_size(request.getParameter("pd_size"));
		stock.setAmount(Integer.parseInt(request.getParameter("amount")));
		stock.setPd_code(request.getParameter("pd_code"));
		
		StockDao dbPro = StockDao.getInstance();
		dbPro.update(stock);
		
		request.setAttribute("pd_code", pd_code);
		
		return "/jsp/mc/pmc/stockUpdatePro.jsp";
	}

}
