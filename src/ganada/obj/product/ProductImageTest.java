package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductImageTest extends DBTester {
	public static ProductImage productImageOrg;

    @BeforeClass
    public static void init() {
    	productImageOrg = new ProductImage(); 	
    	productImageOrg.setPd_code("11");
    	productImageOrg.setIm_order("이미지순서");
    	productImageOrg.setIm_path("이미지경로");
    }

    @Test
    public void test() {
		ProductImageDao dao = ProductImageDao.getInstance();
		try {
		    dao.insertProductImage(productImageOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}