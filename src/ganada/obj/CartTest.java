package ganada.obj;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartTest extends DBTester{
	public static Cart CartOrg;

	@Test
	public void init() {
		CartOrg = new Cart();
		CartOrg.setCart_id("sss");
		CartOrg.setItem_num("123");
		CartOrg.setItem_cl("red");
		CartOrg.setItem_size("250");
		CartOrg.setItem_cnt(1);
		CartOrg.setItem_total(1);
	
    }
	 @Test
	    public void testInsertCart() {
		CartDao dao = CartDao.getInstance();
		try {
		    dao.insertCart(CartOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	 
	 @Test
	    public void testGetCart() {
		CartDao dao = CartDao.getInstance();
		Cart getVO;
		try {
		    getVO = dao.getCart("0");
		    assertEquals(getVO.getCart_id(), CartOrg.getCart_id());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }

}
