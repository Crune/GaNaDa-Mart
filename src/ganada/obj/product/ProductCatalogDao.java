package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.DAO;
import ganada.core.DBTable;

public class ProductCatalogDao extends DAO {

    private static ProductCatalogDao instance = new ProductCatalogDao();

    private ProductCatalogDao() {
    }

    public static ProductCatalogDao getInstance() {
        return instance;
    }   

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("PRODUCT_CATALOG", "CAT_CODE");
    		t.setCls("ganada.obj.product.ProductCatalog");
    	}
		return t;
	}
}
