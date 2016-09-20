package ganada.action.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import ganada.action.common.SuperAction;
import ganada.obj.member.Account;

public class ChkLoginAjaxAction implements SuperAction {
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        
        String loginId = (String) session.getAttribute("loginId");
        Account account = (Account) session.getAttribute("userAccount");                

        Double mile = account.getMile();
        if (mile == null) mile = 0d;
        String memberNo = "000000004695213";
        String memberName = (String) session.getAttribute("memName");
        
        String cartId = (String) session.getAttribute("cartId");        
        String cartCount = (String) session.getAttribute("cartCount");
        if (cartCount == null) cartCount = "1";
        
        String token = "짤";
        
        if (loginId == null) loginId = "guest";
        
        session.setAttribute("ajaxStr", loginId+token+cartCount+token+mile+token+memberNo+token+memberName+token);
        
        return "/jsp/template/ajax.jsp";
    }

}
