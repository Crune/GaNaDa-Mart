package ganada.obj.common;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DB;
import ganada.core.DBTester;

public class LogDBDaoTest extends DBTester {

    public static LogDB tempLog;

    @BeforeClass
    public static void init() {
        tempLog = new LogDB(LogDB.MSG, "gr1", "gr2", "되나?");
    }

    @Test
    public void test() {
        LogDBDao dao = LogDBDao.getInstance();
        try {
            //dao.newLog(tempLog);   
            List<LogDB> list = dao.getLogs(DB.getTime("1986-04-01"), null);
            for (LogDB log : list) {
                log.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
