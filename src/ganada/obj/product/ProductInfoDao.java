package ganada.obj.product;

import ganada.core.*;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class ProductInfoDao {
	private static ProductInfoDao instance = new ProductInfoDao();
    
    public static ProductInfoDao getInstance() {
        return instance;
    }
    
    private ProductInfoDao() {
    }
	
	public ProductInfo getProductInfo(String pd_infocode) throws Exception {
		DB db = new DB();
		ProductInfo productInfo = null;
		try {
		    db.sql("").var(pd_infocode).exe();
		    if (db.next()) {
		    	productInfo = new ProductInfo();
		    	productInfo.setPd_infocode(db.getString("pd_infocode"));
		    	productInfo.setPd_infocontent(db.getString("pd_infocontent"));
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return productInfo;
	    }
	
	 public void insertProductInfo(ProductInfo article) {
	        DB db = new DB();
	        DB.Insert sql = db.new Insert("product_info");
	        
	        try {
	            sql.inSql("pd_infocode", "product_info_seq.NEXTVAL");
	            sql.in("pd_infocontent", article.getPd_infocontent());
	            sql.run();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            db.finalize();
	        }
	        
	    }
	
	 public void updateProductInfo(ProductInfo productInfo) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("product_info");
			try {
			    sql.setWhere("pd_infocode", productInfo.getPd_infocode());
			    sql.set("pd_infocontent", productInfo.getPd_infocontent());
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
	}
	
	 public int deleteProductInfo(String pd_infocode) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("product_info", "pd_infocode=?").var(pd_infocode).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
	 }
}
