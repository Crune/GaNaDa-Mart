package ganada.obj;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ProductTest extends DBTester {
	public static Product productOrg;

    @Ignore("no need test") @BeforeClass
    public static void init() {
    	productOrg = new Product();
    	productOrg.setName("TEST");
    	productOrg.setInfo("테스트 입니다.");
    	productOrg.setPasswd("<BR/>");
    }

    @Test
    public void testInsertProduct() {
	ProductDao dao = ProductDao.getInstance();
	try {
	    dao.insertArticle(productOrg);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
