package ganada.obj.common;

import java.sql.Timestamp;
import java.util.List;

import ganada.core.DB;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

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

    public List<LogDB> getLogs(Timestamp start) throws Exception {
        return getLogs(start);
    }    
    
    public List<LogDB> getLogs(Timestamp time1, Timestamp time2) throws Exception {
        DB db = new DB();
        List<LogDB> logs = null;
        LogDB curLog = null;

        long hour = 1000*60*60;
        if (time2 == null) new Timestamp(System.currentTimeMillis()+hour);
        if (time1 == null) new Timestamp(System.currentTimeMillis()-hour);
        try {
            db.S("*", "LOG", "LOG_REG_DATE BETWEEN ? AND ?").var(time1).var(time2).exe();
            while (db.next()) {
                curLog = new LogDB(db.getString("MSG"));
                curLog.setLog_code(db.getString("CODE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return logs;
    }
}
