package ganada.mc.action;
import ganada.obj.product.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import ganada.action.common.SuperAction;

public class ListAction implements SuperAction{


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
<<<<<<< HEAD
		List<Product> plist = null;
		String pd_code = request.getParameter("pd_code");
		int count = 0;
=======
		List<Product> List = null;
>>>>>>> branch 'master' of https://github.com/Crune/GaNaDa-Mart.git
		
		ProductDao process = ProductDao.getInstance();
		count = process.getCount();
		
		if(count > 0){
			plist = process.getArticle(pd_code);
			
			
			
		}
		request.setAttribute("plist", plist);
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pd_code", pd_code);
		return "/jsp/mc/pmc/list.jsp";
	}

}
