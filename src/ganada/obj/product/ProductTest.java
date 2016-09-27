package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductTest extends DBTester {
	public static Product productOrg;

    @BeforeClass
    public static void init() {
    	productOrg = new Product(); 	
    	productOrg.setMenu_code("1234");						//메뉴코드
    	productOrg.setPd_name("나이키 루나에픽 로우");	//상품명
    	productOrg.setPd_price(240000);							//가격
    	productOrg.setPd_infocode1("1");	//상품정보코드
    	productOrg.setPd_infocode2("2");	//상품정보코드
    	productOrg.setPd_infocode3("3");	//상품정보코드
    	productOrg.setPd_infocode4("4");	//상품정보코드
    }

    @Test
    public void test() {
		ProductDao dao = ProductDao.getInstance();
		try {
		    dao.insert(productOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}
