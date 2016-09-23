package ganada.obj.product;

import ganada.core.*;
import ganada.obj.product.ProductColor;
import ganada.obj.product.ProductColorDao;

public class ProductColorDao {
	private static ProductColorDao instance = new ProductColorDao();
    
    public static ProductColorDao getInstance() {
        return instance;
    }
    
    private ProductColorDao() {
    }
	
	public ProductColor getProductColor(String c_code) throws Exception {
		DB db = new DB();
		ProductColor productColor = null;
		try {
		    db.S("*", "product_color", "c_code=?").var(c_code).exe();
		    if (db.next()) {
		    	productColor = new ProductColor();
		    	productColor.setC_code(db.getString("c_code"));
		    	productColor.setIm_code(db.getString("im_code"));
		    	productColor.setC_name(db.getString("c_name"));
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return productColor;
	    }
	
	 public void insertProductColor(ProductColor article) {
	        DB db = new DB();
	        DB.Insert sql = db.new Insert("product_color");
	        
	        try {
	            sql.inSql("c_code", "product_color_seq.NEXTVAL");
	            sql.in("im_code", article.getIm_code());
	            sql.in("c_name", article.getC_name());
	           // sql.inSql("pd_reg_date", "sysdate");
	            sql.run();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            db.finalize();
	        }
	        
	    }
	
	 public void updateProductColor(ProductColor productColor) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("product_color");
			try {
			    sql.setWhere("c_code", productColor.getC_code());
			    sql.set("im_code", productColor.getIm_code());
			    sql.set("c_name", productColor.getC_name());
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
	}
	
	 public int deleteProductColor(String c_code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("product_color", "c_code=?").var(c_code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
	 }
}
