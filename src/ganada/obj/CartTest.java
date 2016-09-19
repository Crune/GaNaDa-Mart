package ganada.obj;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CartTest extends DBTester {
    public static Cart CartOrg;

    @BeforeClass
    public static void init() {
    	CartOrg = new Cart();
    	CartOrg.setItem_num("12346");
    	CartOrg.setItem_cl("black");
    	CartOrg.setItem_size("260mm");
    	CartOrg.setItem_cnt(1);
    	CartOrg.setItem_total(100000);
    	CartOrg.setUser_id("janny");	
    }

	@Test
	public void test() {
		CartDao dao = CartDao.getInstance();
		try {
		    dao.insertCart(CartOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
