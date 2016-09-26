package ganada.obj.product;

import ganada.core.*;
import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductColorDao;

public class ProductColorDao extends DAO {
	private static ProductColorDao instance = new ProductColorDao();
    
    public static ProductColorDao getInstance() {
        return instance;
    }
    
    private ProductColorDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("product_color", "c_code");
    		t.setCls("ganada.obj.product.ProductColor");
    	}
		return t;
	}
	
}
