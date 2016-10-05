package ganada.mc.action;

import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.HaveSubAction;
import ganada.action.common.SuperAction;
import ganada.core.DAO;
import ganada.core.DB;
import ganada.core.Reflections;

public class MCPageAction implements SuperAction {

    protected static Map<String, SuperAction> actions = new HashMap<String, SuperAction>();
    
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {               
            if (actions.isEmpty()) {
        		Set<Class> set = Reflections.getClasses("ganada.mc.action");
        		for (Class cls : set) {
        			if (cls.isAnnotationPresent(MCAction.class)) {
        				String key = ((MCAction) cls.getAnnotation(MCAction.class)).value();
        				DB.OUTLN("MC +@ url " +DAO.tabber(key, 3) +cls.getName());
        	            actions.put(key, (SuperAction) cls.newInstance());              
        			}
        		}            	
            }
            /* actions.put("error", new MCErrorAction());
            -> 해당 클래스 상단에 어노테이션 부착 예) @MCAction("error") */
    		
            String cIp = request.getRemoteAddr();
            DB.OUTLN("관리자 접속 IP : "+cIp);
            
            HttpSession session = request.getSession();
            session.setAttribute("pageTitle", "관리 콘솔");
            
            // 메뉴명을 가져오되 없으면 error로 설정
            request.setCharacterEncoding("UTF-8");
            String menu = request.getParameter("menu");
            session.setAttribute("mc_menu", menu);
            if (menu == null) menu = "main";
            menu = actions.containsKey(menu)?menu:"error";
            
            // 해당 메뉴의 액션 불러오기
            Class<? extends SuperAction> cls = actions.get(menu).getClass();
            String url = actions.get(menu).executeAction(request, response);
            session.setAttribute("urlMCCont", (String) url);
            
            // MCType 어노테이션 사용시 빵조각 설정
			if (cls.isAnnotationPresent(MCType.class)) {
				String curMCSubName = cls.getAnnotation(MCType.class).name();
				String curMCSubUrl = cls.getAnnotation(MCType.class).url();
	            session.setAttribute("curMCSubName", curMCSubName);
	            session.setAttribute("curMCSubUrl", curMCSubUrl);
			}			

            // MCMenu 어노테이션 사용시 빵조각 설정
			if (cls.isAnnotationPresent(MCMenu.class)) {
				String name = cls.getAnnotation(MCMenu.class).value();
	            session.setAttribute("curMCMenu", name);
			} else {
	            session.setAttribute("curMCMenu", menu);
			}
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/jsp/mc/mc.jsp";
    }
}
