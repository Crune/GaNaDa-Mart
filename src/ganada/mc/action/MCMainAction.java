package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;

@MCAction("main")
@MCType(url="main", name="메인")
@MCMenu("시작")
public class MCMainAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        session.setAttribute("curMCMenuSub", "main");
        
        String logTimeST = "";
        String logTimeEN = "";
        
        return "/jsp/mc/main.jsp";
    }

}
