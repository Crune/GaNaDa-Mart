package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NotFoundAction implements SuperAction {
    
    public String executeAction(
	    HttpServletRequest request, HttpServletResponse response
	    ) throws Exception
    {	
	String id = request.getParameter("id");
	if (id != null) System.out.println(id);
	return "/0831/main.jsp";
    }

}
