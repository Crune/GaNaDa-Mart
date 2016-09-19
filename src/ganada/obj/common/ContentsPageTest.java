package ganada.obj.common;

import org.junit.*;

import ganada.core.DBTester;

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
	ContentsPage modOrg = new ContentsPage();	
    ContentsPage getModOrg = new ContentsPage(); 
	try {	   
	    modOrg.setCode("1"); 
	    modOrg.setName("1"+pageOrg.getName());
	    modOrg.setInfo("1"+pageOrg.getInfo());
	    modOrg.setBanners(pageOrg.getBanners());
	    modOrg.addBanner("2");
	    dao.updatePage(modOrg);
	    getModOrg = dao.getPage("1");
        dao.insertPage(pageOrg);
	    //dao.deletePage("2");
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
