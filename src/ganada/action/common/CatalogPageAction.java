package ganada.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CatalogPageAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 페이지 정보 불러오기
        String pageCode = (String) request.getParameter("code");
        if (pageCode == null) {
            pageCode = "";
        }
        
        return "/jsp/type/type.jsp";
    }

}
