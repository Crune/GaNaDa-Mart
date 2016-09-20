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
        session.setAttribute("ajaxStr", "luon12짤1짤153짤000000004695213짤최윤짤");
        
        return "/jsp/template/ajax.jsp";
    }

}
