package ganada.obj;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartTest extends DBTester{
	public static Cart CartOrg;

	@Test
	public void init() {
		CartOrg = new Cart();
		CartOrg.setItem_num("123");
		CartOrg.setItem_cl("red");
		CartOrg.setItem_size("250");
		CartOrg.setItem_cnt(1);
		CartOrg.setItem_total(1);
	
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
