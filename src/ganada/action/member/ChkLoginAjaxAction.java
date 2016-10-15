package ganada.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.core.DB;
import ganada.core.NULL;
import ganada.obj.member.Account;
import ganada.obj.payment.CartDao;

public class ChkLoginAjaxAction implements SuperAction {
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();

        Account account = (Account) session.getAttribute("userAccount"); 
        Double mile = 0d;
        String memberCode="000000000000000", memberName="guest", cartId="0", cartCount="0", tk= "짤";
                
        String loginId = (String) session.getAttribute("loginId");


        if (loginId == null || account == null) {
            loginId = "guest";
        } else {
            mile = (double) NULL.R(account.getMile(), mile);
            memberCode = account.getCode();
            memberName = account.getName();

            CartDao cartDao = CartDao.getInstance();
            try {
                int count = cartDao.getCart(loginId).size();
                cartCount = count+"";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String result = loginId+tk+cartCount+tk+mile+tk+memberCode+tk+memberName+tk;
        session.setAttribute("ajaxStr", result);
        DB.OUTLN("\t-login. "+result);
        
        return "/jsp/template/ajax.jsp";
    }

}
