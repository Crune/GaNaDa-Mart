package ganada.obj;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DB;

public class ContentsPageTest extends DBTester {
    
    public static ContentsPage pageOrg;

    @BeforeClass
    public static void init() {
	pageOrg = new ContentsPage();
	pageOrg.setName("TEST");
	pageOrg.setInfo("테스트 입니다.");
	pageOrg.setBanners("1=0|2=1");
    }

    @Test
    public void test() {
	ContentsPageDao dao = ContentsPageDao.getInstance();
	ContentsPage page = new ContentsPage();	
	try {
	    dao.insertPage(pageOrg);	    
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
