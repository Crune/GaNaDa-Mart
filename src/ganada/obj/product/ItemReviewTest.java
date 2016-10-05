package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DBTester;

public class ItemReviewTest extends DBTester {
    public static ItemReview ItemReviewOrg;

    @BeforeClass
    public static void init() {
    	ItemReviewOrg = new ItemReview();
    	ItemReviewOrg.setPd_name("나이키 머큐리얼 베이퍼 XI FG");
    	ItemReviewOrg.setPd_code("55");
    	ItemReviewOrg.setWriter("kkk");
    	ItemReviewOrg.setSubject("최고의 축구화");
    	ItemReviewOrg.setSiz(0);
    	ItemReviewOrg.setComfortable(1);
    	ItemReviewOrg.setWid(0);
    	ItemReviewOrg.setDura(1);
    	ItemReviewOrg.setItemsize("240");
    	ItemReviewOrg.setWei("55kg");
    	ItemReviewOrg.setHei("180cm");
    	ItemReviewOrg.setAge("35세");
    	ItemReviewOrg.setContent("편하고 좋아요 착화감도 좋고 무게도 가볍습니다 최고의 축구화예요");
    	ItemReviewOrg.setStar(5);
    	
    }

	@Test
	public void test() {
		ItemReviewDao dao = ItemReviewDao.getInstance();
		try {
		    dao.insert(ItemReviewOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
