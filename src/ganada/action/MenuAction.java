package ganada.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ganada.core.*;
import ganada.obj.*;

public class MenuAction implements SuperAction {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*GNBDao menuList = GNBDao.getInstance();
		List menu =  menuList.getInsert();	
		
		
		request.setAttribute("menu", menu);*/
		return "/jsp/menu/menu.jsp";
	}

}
