package ganada.mc.action;
import ganada.obj.product.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import ganada.action.common.SuperAction;

public class ListAction implements SuperAction{


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Product> plist = null;
		String pd_code = request.getParameter("pd_code");
		int count = 0;

	

		ProductDao process = ProductDao.getInstance();
		count = process.getCount();
		
		if(count > 0){
			plist = process.getArticle(pd_code);
			System.out.println(plist);
			
			
		}else{
			plist = new ArrayList<Product>();
		}
		request.setAttribute("plist", plist);
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pd_code", pd_code);
		return "/jsp/mc/pmc/list.jsp";
	}

}
