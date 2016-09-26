package ganada.obj.product;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class ProductImageTest extends DBTester {
	public static ProductImage productImageOrg;

    @BeforeClass
    public static void init() {
    	productImageOrg = new ProductImage(); 	
    	productImageOrg.setPd_code("11");
    	productImageOrg.setIm_order(1);	//이미지순서
    	productImageOrg.setIm_name("이미지이름");
    	productImageOrg.setC_code("색상코드");
    }

    @Ignore    
    @Test
    public void insert() {
		ProductImageDao dao = ProductImageDao.getInstance();
		try {
		    dao.insert(productImageOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }
    
    @Test
    public void get() {
		ProductImageDao dao = ProductImageDao.getInstance();
		try {
			List<ProductImage> list = dao.getProductImageList("11","1");
			for (ProductImage pImg : list) {
				System.out.println(pImg.toString());
			}
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }

}