package ganada.obj.product;

import ganada.core.DAO;

public class ProductCatalogDao extends DAO {

    private static ProductCatalogDao instance;
    
    public static ProductCatalogDao getInstance() {
        instance = new ProductCatalogDao();
        try {
            init("ProductCatalog", "PRODUCT_CATALOG");
            setPKName("CAT_CODE");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }   

    private ProductCatalogDao() {
    }
    
    

}
