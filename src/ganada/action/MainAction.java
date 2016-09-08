package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainAction extends HaveSubAction {

    MainAction() {
	actions.put("urlImg", new MainImageAction());
	actions.put("urlSub", new SubModuleAction());
    }

    public String exe(HttpServletRequest request, HttpServletResponse response) {
	HttpSession session = request.getSession();
	session.setAttribute("pageTitle", "메인화면 입니다");
	session.setAttribute("menu", "0");

	return "/jsp/menu/main.jsp";
    }

}
