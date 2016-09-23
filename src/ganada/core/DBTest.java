package ganada.core;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DB;
import ganada.core.DB.*;

public class DBTest extends DBTester {

    @BeforeClass
    public static void init() {
        
    }
    
    @Test
    public void test() {
        DB db = new DB();
        try {
            db.sql("SELECT COUNT(*) FROM MEMBER WHERE ID=?").var("test1").exe();
            if (db.next()) {
                System.out.println(db.exe().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

}
