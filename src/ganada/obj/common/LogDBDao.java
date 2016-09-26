package ganada.obj.common;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import ganada.core.DB;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;
import ganada.core.NULL;

public class LogDBDao {

    private static LogDBDao instance = new LogDBDao();

    public static LogDBDao getInstance() {
        return instance;
    }

    private LogDBDao() {
    }

    public void newLog(String msg) throws Exception {
        newLog(new LogDB(msg));
    }

    public void newLog(LogDB log) throws Exception {
        DB db = new DB();
        DB.Insert sql = db.new Insert("LOG");
        try {
            sql.inSql("LOG_CODE", "LOG_SEQ.NEXTVAL");
            sql.in("LOG_GROUP1", log.getLog_group1());
            sql.in("LOG_GROUP2", log.getLog_group2());
            sql.in("LOG_MSG", log.getLog_msg());
            sql.inSql("LOG_REG_DATE", "sysdate");
            sql.in("LOG_TYPE", log.getLog_type());
            sql.in("LOG_VALUE", log.getLog_value());
            sql.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public List<LogDB> getLogs(Timestamp time1, Timestamp time2) throws Exception {
        DB db = new DB();
        List<LogDB> logs = new ArrayList<LogDB>();
        LogDB curLog = null;

        long hour = 1000*60*60;
        long gmt = 9*hour;
        time1 = (Timestamp) NULL.R(time1, new Timestamp(System.currentTimeMillis()-gmt));
        time2 = (Timestamp) NULL.R(time2, new Timestamp(System.currentTimeMillis()-gmt-hour));
        try {
            //System.out.println("LOG호출:"+time2.toString()+" ~ "+time1.toString());
            db.S("*", "LOG", "LOG_REG_DATE BETWEEN ? AND ?").var(time1).var(time2).exe();
            while (db.next()) {
                curLog = new LogDB(db.getString("LOG_MSG"));
                curLog.setLog_code(db.getString("LOG_CODE"));
                curLog.setLog_type(db.getString("LOG_TYPE"));
                curLog.setLog_group1(db.getString("LOG_GROUP1"));
                curLog.setLog_group2(db.getString("LOG_GROUP2"));
                curLog.setLog_value(db.getString("LOG_VALUE"));
                curLog.setLog_reg_date(db.getTimestamp("LOG_REG_DATE"));
                //System.out.println(curLog.toJSONString());
                logs.add(curLog);                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return logs;
    }
}
