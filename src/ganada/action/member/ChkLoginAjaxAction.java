package ganada.action.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import ganada.action.common.SuperAction;
import ganada.core.NULL;
import ganada.obj.member.Account;

public class ChkLoginAjaxAction implements SuperAction {
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();

        Account account = (Account) session.getAttribute("userAccount"); 
        Double mile = 0d;
        String memberCode="000000000000000", memberName="guest", cartId="0", cartCount="0", tk= "짤";
                
        String loginId = (String) session.getAttribute("loginId");
        
        //ystem.out.println("ChkLoginAjaxAction.executeAction.loginId="+loginId);        

        if (loginId == null || account == null) {
            loginId = "guest";
        } else {            
            mile = (double) NULL.R(account.getMile(), mile);
            memberCode = (String) NULL.R(account.getCode(), memberCode);
            memberName = (String) NULL.R(account.getName(), memberName);
            
            cartId = (String) NULL.R(session.getAttribute("cartId"), cartId);
            cartCount = (String) NULL.R(session.getAttribute("cartCount"), "1");
        }
        String result = loginId+tk+cartCount+tk+mile+tk+memberCode+tk+memberName+tk;
        session.setAttribute("ajaxStr", result);
        
        System.out.println("\t-login. "+result);
        
        return "/jsp/template/ajax.jsp";
    }

}
