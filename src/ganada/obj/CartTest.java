package ganada.obj;

import static org.junit.Assert.*;

import org.junit.*;

public class CartTest extends DBTester{
	public static Cart CartOrg;

	@BeforeClass
	public static void init() {
		CartOrg = new Cart();
		CartOrg.setCart_id("sally");
		CartOrg.setItem_num("1");
		CartOrg.setItem_cl("red");
		CartOrg.setItem_size("1");
		CartOrg.setItem_cnt(1);
		CartOrg.setItem_total(1000);
		
		
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
		
	 
	 /*
	 
	 @Test
	    public void testGetCart() {
		CartDao dao = CartDao.getInstance();
		ArrayList<Cart> getVO;
		try {
		    getVO = dao.getCart("0");
		    assertEquals(getVO.getCart_id, CartOrg.getCart_id());
		    assertEquals(getVO.getItem_num, CartOrg.getItem_num());
		    assertEquals(getVO.getItem_cl, CartOrg.getItem_cl());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }

	    @Test
	    public void testUpdateCart() {
		CartDao dao = CartDao.getInstance();
		Cart getVO, modiVO, checkVO;
		try {
		    // 1번 항목 기본값으로 복구
		    getVO = dao.getCart("1");
		    getVO.setCart_id(CartOrg.Cart_id());
		    getVO.setItem_num(CartOrg.getItem_num());
		    getVO.setItem_cl(CartOrg.getItem_cl());	   
		    dao.updateCart(getVO); 

		    // 1번 항목 앞에 1 붙임
		    modiVO = dao.getCart("1");
		    modiVO.setCart_id("");
		    modiVO.setItem_num("");
		    modiVO.setItem_cl("");	    
		    dao.updateCart(modiVO);
		    
		    // 1번 항목 값 앞에 1 붙은지 확인
		    checkVO = dao.getCart("1");	    
		    assertEquals(modiVO.getCart_id(), checkVO.getCart_id());
		    assertEquals(modiVO.getItem_num(), checkVO.getItem_num());
		    assertEquals(modiVO.getItem_cl(), checkVO.getItem_cl());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }

	    @Ignore("no need test") @Test
	    public void testDeleteCart() {
		CartDao dao = CartDao.getInstance();
		try {
		    dao.deleteCart("9999");
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }

	} */
