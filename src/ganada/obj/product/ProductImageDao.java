package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;
import ganada.obj.product.ProductImage;
import ganada.obj.product.ProductImageDao;

public class ProductImageDao extends DAO {
	private static ProductImageDao instance = new ProductImageDao();
    
    public static ProductImageDao getInstance() {
        return instance;
    }
    
    private ProductImageDao() {
    }


    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("product_image", "im_code");
    		t.setCls("ganada.obj.product.ProductImage");
    	}
		return t;
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
	
}
