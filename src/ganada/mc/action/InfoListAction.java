package ganada.mc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InfoListAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pd_infotype = request.getParameter("pd_infotype");
		
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		
		List<ProductInfo> piList = (List<ProductInfo>) dbPro.search("pd_infotype", pd_infotype);
//		List<ProductInfo> piList2 = (List<ProductInfo>) dbPro.search("pd_infotype", "2");
//		List<ProductInfo> piList3 = (List<ProductInfo>) dbPro.search("pd_infotype", "3");
//		List<ProductInfo> piList4 = (List<ProductInfo>) dbPro.search("pd_infotype", "4");
		
		request.setAttribute("piList", piList);
//		request.setAttribute("piList2", piList2);
//		request.setAttribute("piList3", piList3);
//		request.setAttribute("piList4", piList4);
		
		
		return "/jsp/mc/pmc/infoList.jsp";
	}

}
