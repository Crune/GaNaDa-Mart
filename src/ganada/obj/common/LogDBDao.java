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

    public void newLog(LogDB log) throws Exception {
        DB db = new DB();
        DB.Insert sql = db.new Insert("LOG");
        try {
            sql.inSql("LOG_CODE", "LOG_SEQ.NEXTVAL");
            sql.in("LOG_CODE", log.getLog_code());
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

    public List<LogDB> getLogs(Timestamp start, Timestamp end) throws Exception {
        DB db = new DB();
        List<LogDB> logs = null;
        LogDB curLog = null;
        try {
            db.S("*", "LOG", "LOG_REG_DATE=?").var(start).var(end).exe();
            while (db.next()) {
                curLog = new LogDB();
                curLog.setLog_code(db.getString("CODE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return logs;
    }

    public void updatePage(ContentsPage page) throws Exception {
        DB db = new DB();
        DB.Update sql = db.new Update("CONT_PAGE");
        try {
            sql.setWhere("CODE", page.getCode());
            sql.set("NAME", page.getName());
            sql.set("INFO", page.getInfo());
            sql.set("BANNERS", page.getBanners());
            sql.setSql("MOD_DATE", "sysdate");
            sql.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public int deletePage(String code) throws Exception {
        DB db = new DB();
        int x = -1;
        try {
            db.D("CONT_PAGE", "CODE=?").var(code).exe();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return x;
    }
}
