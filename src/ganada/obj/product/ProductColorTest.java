package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DB;
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
		    for (Object cur : dao.search("pd_code","1")) {
		        String name = ((ProductColor) cur).getC_name();
		        DB.OUTLN(name);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}