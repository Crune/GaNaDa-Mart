package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductReviewTest extends DBTester {
    public static ProductReview org = new ProductReview();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		org.setPd_code("1");
		org.setAc_code("1");
		org.setRv_subject("이거슨 제목2");
		org.setRv_cont("이거슨 내용2.");
		org.setRv_vote_up(0);
		org.setRv_vote_down(0);
		org.setRv_rate1(1);
		org.setRv_rate2(2);
		org.setRv_rate3(3);
		org.setRv_rate4(4);
		org.setRv_img("https://www.google.co.kr/logos/doodles/2016/434th-anniversary-of-the-introduction-of-the-gregorian-calendar-5700260446863360-res.png");
	}

	@Test
	public void test() {
		try {
			ProductReviewDao dao = ProductReviewDao.getInstance();
			dao.insert(org);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
