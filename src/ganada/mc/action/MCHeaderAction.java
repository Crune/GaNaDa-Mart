package ganada.mc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;
import ganada.obj.common.Menu;
import ganada.obj.common.MenuDao;

public class MCHeaderAction implements SuperAction {
    
    public static Map<String, String> mid = new HashMap<String, String>();
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        session.setAttribute("mc_header", "/jsp/mc/header.jsp");

        mid.put("error", "에러");
        mid.put("product", "상품");
        mid.put("main", "메인");

        session.setAttribute("breadMap", mid);
        
        return "/jsp/mc/header.jsp";
    }

}
