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
		int count = 0;
		ProductInfoDao dbPro = ProductInfoDao.getInstance();
		
		List<ProductInfo> piList = (List<ProductInfo>) dbPro.search("pd_infotype", pd_infotype);

		request.setAttribute("piList", piList);
		request.setAttribute("pd_infotype", pd_infotype);
		request.setAttribute("count", count);
		
		
		
		return "/jsp/mc/pmc/infoList.jsp";
	}

}
