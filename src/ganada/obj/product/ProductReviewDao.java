package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;
import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductReviewDao;

public class ProductReviewDao extends DAO {
	private static ProductReviewDao instance = new ProductReviewDao();
    
    public static ProductReviewDao getInstance() {
        return instance;
    }
    
    private ProductReviewDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable(null, "PRODUCT_REVIEW", "RV_CODE","RV_REG_DATE", "");
    		t.setCls("ganada.obj.product.ProductReview");
    	}
		return t;
	}	
}
