package ganada.action.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import ganada.action.common.SuperAction;

public class ChkLoginAjaxAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        
        String loginId = (String) session.getAttribute("memId");
        String cartCount = "1";
        String var1 = "15";
        String var2 = "000000004695213";
        String memberName = (String) session.getAttribute("memName");
        String token = "짤";
        
        if (loginId == null) loginId = "guest";
        
        session.setAttribute("ajaxStr", loginId+token+cartCount+token+var1+token+var2+token+memberName+token);
        
        return "/jsp/template/ajax.jsp";
    }

}
