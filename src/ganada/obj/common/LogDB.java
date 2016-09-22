package ganada.obj.common;

import java.sql.Timestamp;

public class LogDB {
    private String log_code="";
    private String log_type="";
    private String log_group1="";
    private String log_group2="";
    private String log_msg="";
    private String log_value="";
    private Timestamp log_reg_date;
        
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
        return log_reg_date;
    }
    public void setLog_reg_date(Timestamp log_reg_date) {
        this.log_reg_date = log_reg_date;
    } 
}
