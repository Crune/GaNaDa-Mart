package ganada.obj.common;

import java.sql.Timestamp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class LogDB {
    private static String log_code="";
    private static String log_type="";
    private static String log_group1="";
    private static String log_group2="";
    private static String log_msg; // NOT NULL !!
    private static String log_value="";
    private static Timestamp log_reg_date;
    
    public final static String INFO = ".";
    public final static String CODE_YELLOW = "?";
    public final static String CODE_RED = "!";
    public final static String TRACE = "TR";
    public final static String MSG = "TR";

    LogDB(String type, String group1, String group2, String msg, String value) { 
        init(type, group1, group2, msg, value);
    }    
    LogDB(String type, String group1, String group2, String msg) {    
        init(type, group1, group2, msg, "");
    }    
    LogDB(String type, String group, String msg) {
        init(type, group, "", msg, "");
    }    
    LogDB(String msg) {
        init("", "", "", msg, "");
    }
    
    public static void init(String type, String group1, String group2, String msg, String value) { 
        log_type = type;
        log_group1 = group1;
        log_group2 = group2;        
        log_msg = msg; 
        log_value = value;
    }

    public String toString() {
        String result = "LogDB{"
                +"log_code:"+log_code
                +", log_type:"+log_type
                +", log_group1:"+log_group1
                +", log_group2:"+log_group2
                +", log_msg:"+log_msg
                +", log_value:"+log_value
                +", log_reg_date:"+log_reg_date
                +"}";        
        return result;        
    }
    
    public String toJSONString() {     
        return getJSONObject().toJSONString();
    }
    
    @SuppressWarnings("unchecked")
    public JSONObject getJSONObject() {
        JSONObject logObj = new JSONObject();   
        { 
            logObj.put("log_code", log_code); 
            logObj.put("log_type", log_type); 
            logObj.put("log_group1", log_group1); 
            logObj.put("log_group2", log_group2); 
            logObj.put("log_msg", log_msg); 
            logObj.put("log_value", log_value); 
            logObj.put("log_reg_date", log_reg_date);
        }
        return logObj;        
    }
    
    public String getLog_code() {
        return log_code;
    }
    public void setLog_code(String log_code) {
        this.log_code = log_code;
    }
    public String getLog_type() {
        return log_type;
    }
    public void setLog_type(String log_type) {
        this.log_type = log_type;
    }
    public String getLog_group1() {
        return log_group1;
    }
    public void setLog_group1(String log_group1) {
        this.log_group1 = log_group1;
    }
    public String getLog_group2() {
        return log_group2;
    }
    public void setLog_group2(String log_group2) {
        this.log_group2 = log_group2;
    }
    public String getLog_msg() {
        return log_msg;
    }
    public void setLog_msg(String log_msg) {
        this.log_msg = log_msg;
    }
    public String getLog_value() {
        return log_value;
    }
    public void setLog_value(String log_value) {
        this.log_value = log_value;
    }
    public Timestamp getLog_reg_date() {
        return new Timestamp(log_reg_date.getTime() + 9*60*60*1000);
    }
    public void setLog_reg_date(Timestamp log_reg_date) {
        this.log_reg_date = log_reg_date;
    } 
}
