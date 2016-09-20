package ganada.obj.product;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductTest extends DBTester {
	public static Product productOrg;

    @BeforeClass
    public static void init() {
    	productOrg = new Product(); 	
   // 	productOrg.setPasswd("1234");		//글비밀번호
    	productOrg.setName("나이키 루나에픽 로우 플라이니트 ULTD");	//상품명
    	productOrg.setPrice(199000);	//가격
    	productOrg.setDiscount(139300);		//할인가격
    	productOrg.setColor("멀티-컬러/멀티-컬러");		//상품색
    	productOrg.setColorcode("스타일-컬러 # 844862-999");		//상품색상코드
    	productOrg.setColorimage("blue.png/red.png/black,png");		//상품색이미지
    	productOrg.setPd_size("260");		//상품크기
    	productOrg.setStock(10);			//재고량
    	productOrg.setStoread("매장주소");		//매장주소
    	productOrg.setImage("right.png/left.png/bot.png/top.png/image.png/back.png");
    	productOrg.setStar(1);				//별점
    	productOrg.setRecommend(1);			//추천수
    	productOrg.setInfo("상품설명");		
    	productOrg.setDeliveryinfo("배송/결제정보");
    	productOrg.setNote("유의사항");
    	productOrg.setAsinfo("A/S정보");    	
    }

    @Test
    public void test() {
		ProductDao dao = ProductDao.getInstance();
		try {
		    dao.insertProduct(productOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}
