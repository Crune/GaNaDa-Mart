package ganada.mc.action;
import ganada.obj.product.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import ganada.action.common.SuperAction;

public class ListAction implements SuperAction{


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		list<Product> List = null;
		
		return "/jsp/mc/pmc/list.jsp";
	}

}
