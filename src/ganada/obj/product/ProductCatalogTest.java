package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductCatalogTest extends DBTester {
	public static ProductCatalog productCat;

    @BeforeClass
    public static void init() {
        productCat = new ProductCatalog(); 	
        productCat.setCat_info("테스트 입니다.");
        productCat.setCat_name("TEST");
    }

    @Test
    public void test() {
        ProductCatalogDao dao = ProductCatalogDao.getInstance();
		try {
		    System.out.println(dao.count("1"));
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}