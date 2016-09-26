package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.DAO;
import ganada.core.DBTable;

public class ProductCatalogDao extends DAO {

    private static ProductCatalogDao instance = new ProductCatalogDao();
    
    public static ProductCatalogDao getInstance() {
    	if (t == null) {
    		t = new DBTable("PRODUCT_CATALOG", "CAT_CODE");
    		t.setCls("ganada.obj.product.ProductCatalog");
    	}
        return instance;
    }   

    private ProductCatalogDao() {
    }
}
