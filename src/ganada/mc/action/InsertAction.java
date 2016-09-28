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
		//String pd_infotype = request.getParameter("pd_infotype");
		//int count = dbPro.count(pd_infotype);
		//String startCode = "1";
		//String endCode = String.valueOf(count);		
		//List<Object> piList = dbPro.select(startCode, endCode);
		
		List<Object> piList1 = dbPro.search("pd_infotype", "1");
		List<Object> piList2 = dbPro.search("pd_infotype", "2");
		List<Object> piList3 = dbPro.search("pd_infotype", "3");
		List<Object> piList4 = dbPro.search("pd_infotype", "4");

		request.setAttribute("piList1", piList1);
		request.setAttribute("piList2", piList2);
		request.setAttribute("piList3", piList3);
		request.setAttribute("piList4", piList4);
		
		//request.setAttribute("pi", pi);
		//request.setAttribute("type", new Integer(0));
		return "/jsp/mc/pmc/insert.jsp";
	}

}
