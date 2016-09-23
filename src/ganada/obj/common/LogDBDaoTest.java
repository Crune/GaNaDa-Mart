package ganada.obj.common;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DBTester;

public class LogDBDaoTest extends DBTester {

    public static LogDB tempLog;

    @BeforeClass
    public static void init() {
        tempLog = new LogDB(LogDB.MSG, "gr1", "gr2", "test");
    }

    @Test
    public void test() {
        LogDBDao dao = LogDBDao.getInstance();
        try {
            dao.newLog(tempLog);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
