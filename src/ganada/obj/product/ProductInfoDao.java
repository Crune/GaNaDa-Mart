package ganada.obj.product;

import ganada.core.*;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class ProductInfoDao extends DAO {
	private static ProductInfoDao instance = new ProductInfoDao();
    
    public static ProductInfoDao getInstance() {
        return instance;
    }
    
    private ProductInfoDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("product_info", "pd_infocode");
    		t.setCls("ganada.obj.product.ProductInfo");
    	}
		return t;
	}	
}
