package ganada.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NotFoundAction implements SuperAction {

    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	HttpSession session = request.getSession();
	session.setAttribute("pageTitle", "Action 클래스 찾기실패");

	response.setStatus(HttpServletResponse.SC_OK);

	String id = request.getParameter("id");
	if (id != null)
	    System.out.println(id);

	return "/jsp/error/404.jsp";
    }

}
