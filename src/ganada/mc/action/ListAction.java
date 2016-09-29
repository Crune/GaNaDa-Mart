package ganada.mc.action;
import ganada.obj.product.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import ganada.action.common.SuperAction;
import ganada.core.DB;

public class ListAction implements SuperAction{


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Product> plist = new ArrayList<>();
		String pd_code = request.getParameter("pd_code");
		int count = 0;

	

		ProductDao process = ProductDao.getInstance();
		count = process.getCount();
		
		if(count > 0){
			for (Object obj : process.select("1", "999999999999999")) {
				plist.add((Product) obj);
			}
		}
		System.out.println(plist.toString());
		request.setAttribute("plist", plist);
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pd_code", pd_code);
		return "/jsp/mc/pmc/list.jsp";
	}

}
