package ganada.mc.action;
import ganada.obj.product.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;
import ganada.action.common.SuperAction;
import ganada.core.DB;

@MCAction("product")
@MCType(url="product", name="상품")
@MCMenu("상품목록")
public class ListAction implements SuperAction{


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        session.setAttribute("curMCMenuSub", "product");
        
		List<Product> plist = new ArrayList<>();
		String pd_code = request.getParameter("pd_code");
		int count = 0;

		ProductDao process = ProductDao.getInstance();
		count = process.getCount();
		
		if(count > 0){
		/*	for (Object obj : process.getInfoName()) {
				plist.add((Product) obj);
			}*/
			plist = process.getInfoName();
		}
		
		System.out.println(plist.toString());
		request.setAttribute("plist", plist);
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pd_code", pd_code);
		return "/jsp/mc/pmc/list.jsp";
	}

}
