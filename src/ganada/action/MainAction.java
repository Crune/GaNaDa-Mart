package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainAction implements SuperAction {

    private static MainImageAction imgAction = new MainImageAction();
    private static SubModuleAction subAction = new SubModuleAction();

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub

	HttpSession session = request.getSession();
	session.setAttribute("pageTitle", "메인화면 입니다");
	session.setAttribute("menu", "0");
	
	String url = "";
	url = imgAction.executeAction(request, response);
	session.setAttribute("urlImg", (String)url);
	url = subAction.executeAction(request, response);
	session.setAttribute("urlSub", (String)url);

	return "/jsp/menu/main.jsp";
    }

}
