package ganada.obj;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ProductTest extends DBTester {
	public static Product productOrg;

    @BeforeClass
    public static void init() {
    	productOrg = new Product();
    	productOrg.setNum(1);   	
    	productOrg.setPasswd("글비밀번호");
    	productOrg.setName("상품명");
    	productOrg.setPrice(1);
    	productOrg.setDiscount(2);
    	productOrg.setColor("상품색");
    	productOrg.setPd_size("상품크기");
    	productOrg.setStock(1);
    	productOrg.setStoread("매장주소");
    	productOrg.setImage("이미지");
    	productOrg.setStar(1);
    	productOrg.setRecommend(1);
    	productOrg.setInfo("상품설명");
    	productOrg.setDeliveryinfo("배송/결제정보");
    	productOrg.setNote("유의사항");
    	productOrg.setAsinfo("A/S정보");    	
    }

    @Test
    public void test() {
		ProductDao dao = ProductDao.getInstance();
		try {
		    dao.insertProduct(productOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}
