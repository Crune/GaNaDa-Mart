package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class StorageTest extends DBTester {
	public static Storage StorageOrg;

    @BeforeClass
    public static void init() {
    	StorageOrg = new Storage(); 	
    	StorageOrg.setSt_name("매장이름");
    	StorageOrg.setSt_address("매장주소");
    }

    @Test
    public void test() {
    	StorageDao dao = StorageDao.getInstance();
		try {
		    dao.insertStorage(StorageOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}