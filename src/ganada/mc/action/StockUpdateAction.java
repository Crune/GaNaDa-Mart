package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductColorDao;
import ganada.obj.product.Stock;
import ganada.obj.product.StockDao;

@MCAction("stockUpdate")
public class StockUpdateAction implements SuperAction {

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sk_code = request.getParameter("sk_code");
		String pd_code = request.getParameter("pd_code");
		
		StockDao dbPro = StockDao.getInstance();
		Stock stock = (Stock) dbPro.select(sk_code);
		
		ProductColorDao dbProC = ProductColorDao.getInstance();
		ProductColor pc = (ProductColor) dbProC.select(stock.getC_code());
		
		request.setAttribute("stock", stock);
		request.setAttribute("pc", pc);
		
		request.setAttribute("sk_code", sk_code);
		request.setAttribute("pd_code", pd_code);
		
		return "/jsp/mc/pmc/stockUpdate.jsp";
	}

}
