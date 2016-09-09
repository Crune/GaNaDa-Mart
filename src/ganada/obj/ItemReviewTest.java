package ganada.obj;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ItemReviewTest extends DBTester {
    public static ItemReview ItemReviewOrg;

    @BeforeClass
    public static void init() {
    	ItemReviewOrg = new ItemReview();
    	ItemReviewOrg.setItemname("나이키 티엠포 레거시 II FG");
    	ItemReviewOrg.setItemnum(4);
    	ItemReviewOrg.setWriter("writer");
    	ItemReviewOrg.setSubject("편해요");
    	ItemReviewOrg.setLik(1);
    	ItemReviewOrg.setBad(-1);
    	ItemReviewOrg.setSiz(0);
    	ItemReviewOrg.setComfortable(1);
    	ItemReviewOrg.setWid(0);
    	ItemReviewOrg.setDura(1);
    	ItemReviewOrg.setItemsize("240");
    	ItemReviewOrg.setWei("45kg");
    	ItemReviewOrg.setHei("160cm");
    	ItemReviewOrg.setAge("30세");
    	ItemReviewOrg.setMail("kkk@gmail.com");
    	ItemReviewOrg.setContent("편하고 좋아요 착화감도 좋고 무게도 가볍습니다 최고의 축구화예요");
    	ItemReviewOrg.setStar(5);
    	ItemReviewOrg.setPasswd("1111");
    	
    }

	@Test
	public void test() {
		ItemReviewDao dao = ItemReviewDao.getInstance();
		try {
		    dao.insertArticle(ItemReviewOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
