package ganada.obj;

import static org.junit.Assert.*;

import org.junit.*;

public class BannerHTMLTest extends DBTester {
    public static BannerHTML bannerOrg;

    @Ignore("no need test") @BeforeClass
    public static void init() {
	bannerOrg = new BannerHTML();
	bannerOrg.setName("TEST");
	bannerOrg.setInfo("테스트 입니다.");
	bannerOrg.setHtml("<BR/>");
    }

    @Test
    public void testInsertBanner() {
	BannerHTMLDao dao = BannerHTMLDao.getInstance();
	try {
	    dao.insertBanner(bannerOrg);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    @Test
    public void testGetBanner() {
	BannerHTMLDao dao = BannerHTMLDao.getInstance();
	BannerHTML getVO;
	try {
	    getVO = dao.getBanner("0");
	    assertEquals(getVO.getName(), bannerOrg.getName());
	    assertEquals(getVO.getInfo(), bannerOrg.getInfo());
	    assertEquals(getVO.getHtml(), bannerOrg.getHtml());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    @Test
    public void testUpdateBanner() {
	BannerHTMLDao dao = BannerHTMLDao.getInstance();
	BannerHTML getVO, modiVO, checkVO;
	try {
	    // 1번 항목 기본값으로 복구
	    getVO = dao.getBanner("1");
	    getVO.setName(bannerOrg.getName());
	    getVO.setInfo(bannerOrg.getInfo());
	    getVO.setHtml(bannerOrg.getHtml());	   
	    dao.updateBanner(getVO); 

	    // 1번 항목 앞에 1 붙임
	    modiVO = dao.getBanner("1");
	    modiVO.setName("1TEST");
	    modiVO.setInfo("1테스트 입니다.");
	    modiVO.setHtml("1<BR/>");	    
	    dao.updateBanner(modiVO);
	    
	    // 1번 항목 값 앞에 1 붙은지 확인
	    checkVO = dao.getBanner("1");	    
	    assertEquals(modiVO.getName(), checkVO.getName());
	    assertEquals(modiVO.getInfo(), checkVO.getInfo());
	    assertEquals(modiVO.getHtml(), checkVO.getHtml());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    @Ignore("no need test") @Test
    public void testDeleteBanner() {
	BannerHTMLDao dao = BannerHTMLDao.getInstance();
	try {
	    dao.deleteBanner("9999");
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
