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
    	StockOrg.setSk_code("1");
    	StockOrg.setC_code("2");
    	StockOrg.setPd_size("245");
    	StockOrg.setAmount(9);
    	StockOrg.setPd_code("11");
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