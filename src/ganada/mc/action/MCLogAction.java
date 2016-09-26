package ganada.mc.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.*;

import ganada.action.common.SuperAction;
import ganada.core.DB;
import ganada.core.NULL;
import ganada.obj.common.LogDB;
import ganada.obj.common.LogDBDao;

public class MCLogAction implements SuperAction {

    @SuppressWarnings("unchecked")
    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        
        LogDBDao dao = LogDBDao.getInstance();
        List<LogDB> logs;

        String ajaxStr="";
        String reqTime1 = NULL.toDQ(request.getParameter("st")); 
        String reqTime2 = NULL.toDQ(request.getParameter("en")); 
        Timestamp time1 = null, time2 = null;
        if (!reqTime1.isEmpty()) {
            time1 = DB.string2Timestamp(reqTime1, "yyyy-MM-dd/hh:mm");
        }
        if (!reqTime2.isEmpty()) {
            time2 = DB.string2Timestamp(reqTime2, "yyyy-MM-dd/hh:mm");
        }
        
        System.out.println("mm:"+time1.toString());
        
        //최종 완성될 JSONObject 선언(전체)
        JSONObject json = new JSONObject();

        //person의 JSON정보를 담을 Array 선언
        JSONArray logArray = new JSONArray();
                
        logs = dao.getLogs(time1, time2);        
        
        for (LogDB log : logs) {
            logArray.add(log.getJSONObject());
        }
        
        //전체의 JSONObject에 사람이란 name으로 JSON의 정보로 구성된 Array의 value를 입력
        json.put("logs", logArray);
 
        //JSONObject를 String 객체에 할당
        ajaxStr = json.toJSONString();
        
        session.setAttribute("ajaxStr", ajaxStr);
        return "/jsp/template/ajax.jsp";
    }

}
