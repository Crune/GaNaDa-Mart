package ganada.mc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InsertAction implements SuperAction {

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String pd_infocode = request.getParameter("pd_infocode");
		
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		//ProductInfo pi = (ProductInfo) dbPro.select(pd_infocode);
		
		int count = dbPro.count();
		String startCode = "1";
		String endCode = String.valueOf(count);		
		List<Object> piList = dbPro.select(startCode, endCode);
		//request.setAttribute("pi", pi);
		request.setAttribute("piList", piList);
		//request.setAttribute("type", new Integer(0));
		return "/jsp/mc/pmc/insert.jsp";
	}

}
