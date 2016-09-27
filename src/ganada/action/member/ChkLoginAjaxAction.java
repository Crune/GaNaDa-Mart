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

    private Object nullChk(Object checkObj, Object nullReplace) {
        if (checkObj == null) return nullReplace;
        else return checkObj;
    }
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();

        Account account = (Account) nullChk(session.getAttribute("userAccount"), null); 
        Double mile = 0d;
        String memberCode="000000000000000", memberName="guest", cartId="0", cartCount="0", tk= "짤";
                
        String loginId = (String) session.getAttribute("loginId");
        
        //ystem.out.println("ChkLoginAjaxAction.executeAction.loginId="+loginId);        

        if (loginId == null || account == null) {
            loginId = "guest";
        } else {            
            mile = (double) nullChk(account.getMile(), mile);
            memberCode = (String) nullChk(account.getCode(), memberCode);
            memberName = (String) nullChk(account.getName(), memberName);
            
            cartId = (String) nullChk(session.getAttribute("cartId"), cartId);
            cartCount = (String) nullChk(session.getAttribute("cartCount"), "1");
        }
        session.setAttribute("ajaxStr", loginId+tk+cartCount+tk+mile+tk+memberCode+tk+memberName+tk);
        
        return "/jsp/template/ajax.jsp";
    }

}
