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
    	ItemReviewOrg.setItemname("나이키 머큐리얼 벨로체 III AG- PRO");
    	ItemReviewOrg.setItemnum(45);
    	ItemReviewOrg.setWriter("anonymous");
    	ItemReviewOrg.setSubject("착화감이 좋아요");
    	ItemReviewOrg.setLik(1);
    	ItemReviewOrg.setBad(-1);
    	ItemReviewOrg.setSiz(0);
    	ItemReviewOrg.setComfortable(1);
    	ItemReviewOrg.setWid(0);
    	ItemReviewOrg.setDura(1);
    	ItemReviewOrg.setItemsize("250");
    	ItemReviewOrg.setWei("55kg");
    	ItemReviewOrg.setHei("175cm");
    	ItemReviewOrg.setAge("32세");
    	ItemReviewOrg.setMail("jjg@gmail.com");
    	ItemReviewOrg.setContent("편하고 좋아요 착화감도 좋고 무게도 가볍습니다 최고의 축구화예요");
    	ItemReviewOrg.setStar(5);
    	ItemReviewOrg.setPasswd("1111");
    	ItemReviewOrg.setIp("12345");
    	
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
