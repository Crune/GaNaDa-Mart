package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<ProductInfo> getInfos(Product prd) throws Exception {
	    List<ProductInfo> rst = new ArrayList<ProductInfo>();
	    
        rst.add((ProductInfo) select(prd.getPd_infocode1()));
        rst.add((ProductInfo) select(prd.getPd_infocode2()));
        rst.add((ProductInfo) select(prd.getPd_infocode3()));
        rst.add((ProductInfo) select(prd.getPd_infocode4()));
        
	    return rst;
	}
}
