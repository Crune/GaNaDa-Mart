package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class StockTest extends DBTester {
	public static Stock StockOrg;

    @BeforeClass
    public static void init() {
    	StockOrg = new Stock(); 	
    	StockOrg.setSk_code("9");
    	StockOrg.setC_code("3");
    	StockOrg.setPd_size("225");
    	StockOrg.setAmount(7);
    	StockOrg.setPd_code("12");
    }

    @Test
    public void test() {
    	StockDao dao = StockDao.getInstance();
		try {
		    dao.update(StockOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}