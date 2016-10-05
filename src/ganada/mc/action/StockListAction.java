package ganada.mc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Stock;
import ganada.obj.product.StockDao;

@MCAction("stock")
public class StockListAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pd_code = request.getParameter("pd_code");
		int count = 0;
		
		StockDao process = StockDao.getInstance();
		
		List<Stock> plist = (List<Stock>) process.search("pd_code", pd_code);
		count = process.count("pd_code", pd_code);
		
		request.setAttribute("plist", plist);
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pd_code", pd_code);
		
		return "/jsp/mc/pmc/stockList.jsp";
	}

}
