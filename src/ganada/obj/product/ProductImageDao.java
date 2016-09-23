package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

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
    
  /*  public int getActicleConut(String pd_code, String c_code) throws Exception{
		DB db = new DB();
		ProductImage productimage = null;
		int x = 0;
		
		try{
			db.S("count(*)", "stock", "pd_code=? and c_code=?").var(pd_code).var(c_code).exe();
			if(db.next())
				x = db.getInt("1");
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			db.finalize();
		}
		return x;
	}*/
    
    public List<ProductImage> getProductImageList(String pd_code, String c_code) throws Exception {
		DB db = new DB();
		List<ProductImage> articleList = null;
		try {
		    db.S("*", "product_image", "pd_code=? and c_code=?").var(pd_code).var(c_code).exe();
		    if (db.next()) {
		    	//System.out.println("ProductImageDao.getProductImageList.next?:독작둥");
		    	articleList = new ArrayList<ProductImage>();
		    	do{
		    		ProductImage article= new ProductImage();
		    		article.setIm_code(db.getString("im_code"));
			    	article.setPd_code(db.getString("pd_code"));
			    	article.setIm_order(db.getInt("im_order"));
			    	article.setIm_name(db.getString("im_name"));
			    	article.setC_code(db.getString("c_code"));
			    	articleList.add(article);
		    	}while(db.next());
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return articleList;
	  }
	
	public ProductImage getProductImage(String im_code) throws Exception {
		DB db = new DB();
		ProductImage productImage = null;
		try {
		    db.S("*", "product_image", "im_code=?").var(im_code).exe();
		    if (db.next()) {
		    	productImage = new ProductImage();
		    	productImage.setIm_code(db.getString("im_code"));
		    	productImage.setPd_code(db.getString("pd_code"));
		    	productImage.setIm_order(db.getInt("im_order"));
		     	productImage.setIm_name(db.getString("im_name"));
		     	productImage.setC_code(db.getString("c_code"));
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
	            sql.in("pd_code", article.getPd_code());
	            sql.in("im_order", article.getIm_order());
	            sql.in("im_name", article.getIm_name());
	            sql.in("c_code", article.getC_code());
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
			    sql.set("im_name", productImage.getIm_name());
			    sql.set("c_code", productImage.getC_code());
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
