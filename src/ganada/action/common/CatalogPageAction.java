package ganada.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.obj.common.BannerHTMLDao;
import ganada.obj.common.ContentsPageDao;

public class CatalogPageAction implements SuperAction {
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 페이지 정보 불러오기
        String pageCode = (String) request.getParameter("code");
        if (pageCode == null) {
            pageCode = "";
        }

        // 불러온 페이지의 이름, 코드, 정보를 세션에 집어 넣음.
        HttpSession session = request.getSession();
        session.setAttribute("urlTypeLNB", "/jsp/type/lnb.jsp");
        session.setAttribute("urlTypeCont", "/jsp/type/cont.jsp");
        
        return "/jsp/type/type.jsp";
    }

}
