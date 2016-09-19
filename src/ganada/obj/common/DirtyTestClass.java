package ganada.obj.common;

import org.junit.*;

import ganada.core.*;

public class DirtyTestClass extends DBTester {

    @Test
    public void test() {
        DB db = new DB();
        DB.Insert in = db.new Insert("BANNER");
        DB.Update up = db.new Update("BANNER");
        int number=0;
        try {
            db.S("count(code)", "BANNER").exe();

            if (db.next()) {
                number = db.exe().getInt(1) + 1;
            } else {
                number = 1;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("result:"+number);
    }
}
