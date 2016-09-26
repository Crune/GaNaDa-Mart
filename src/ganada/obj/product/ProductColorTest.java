package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductColorTest extends DBTester {
	public static ProductColor productColorOrg;

    @BeforeClass
    public static void init() {
    	productColorOrg = new ProductColor(); 	
    	productColorOrg.setIm_code("1");						
    	productColorOrg.setC_name("블랙");	
    }

    @Test
    public void test() {
		ProductColorDao dao = ProductColorDao.getInstance();
		try {
		    dao.insert(productColorOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}