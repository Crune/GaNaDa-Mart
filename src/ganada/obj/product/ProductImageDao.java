package ganada.obj.product;

import ganada.core.*;
import ganada.obj.product.ProductImage;
import ganada.obj.product.ProductImageDao;

public class ProductImageDao {
	private static ProductImageDao instance = new ProductImageDao();
    
    public static ProductImageDao getInstance() {
        return instance;
    }
    
    private ProductImageDao() {
    }
	
	public ProductImage getProductImage(String c_code) throws Exception {
		DB db = new DB();
		ProductImage productImage = null;
		try {
		    db.sql("").var(c_code).exe();
		    if (db.next()) {
		    	productImage = new ProductImage();
		    	productImage.setIm_code(db.getString("im_code"));
		    	productImage.setPd_code(db.getString("pd_code"));
		    	productImage.setIm_order(db.getString("im_order"));
		    	productImage.setIm_path(db.getString("im_path"));
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return productImage;
	    }
	
	 public void insertProductImage(ProductImage article) {
	        DB db = new DB();
	        DB.Insert sql = db.new Insert("product_image");
	        
	        try {
	            sql.inSql("im_code", "product_image_seq.NEXTVAL");
	            sql.in("im_code", article.getIm_code());
	            sql.in("pd_code", article.getPd_code());
	            sql.in("im_order", article.getIm_order());
	            sql.in("im_path", article.getIm_path());
	            sql.run();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            db.finalize();
	        }
	        
	    }
	
	 public void updateProductImage(ProductImage productImage) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("product_image");
			try {
			    sql.setWhere("im_code", productImage.getIm_code());
			    sql.set("pd_code", productImage.getPd_code());
			    sql.set("im_order", productImage.getIm_order());
			    sql.set("im_path", productImage.getIm_path());
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
	}
	
	 public int deleteProductImage(String im_code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("product_image", "im_code=?").var(im_code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
	 }
}
