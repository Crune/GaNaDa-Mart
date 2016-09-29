package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class ProductDao extends DAO {
	private static ProductDao instance = new ProductDao();
	    
	    public static ProductDao getInstance() {
	        return instance;
	    }
	    
	    private ProductDao() {
	    }
	    private static DBTable t;
		@Override
		protected DBTable gT() {
	    	if (t == null) {
	    		t = new DBTable(null, "product", "pd_code", "PD_REG_DATE", "");
	    		t.setCls("ganada.obj.product.Product");
	    	}
			return t;
		}

		public List getArticle(String pd_code) throws Exception {
			/*
			DB db = new DB();
			List<Product> productList = new ArrayList<Product>();
			try {
			    db.S("*", "product").exe();
		    	while(db.next()){
			    	Product product = new Product();
			    	product.setPd_code(db.getString("pd_code"));
			    	product.setMenu_code(db.getString("menu_code"));
			    	product.setPd_name(db.getString("pd_name"));
			    	product.setPd_price(db.getInt("pd_price"));
			    	product.setPd_reg_date(db.getTimestamp("pd_reg_date"));
			    	product.setPd_infocode1(db.getString("pd_infocode1"));
			    	product.setPd_infocode2(db.getString("pd_infocode2"));
			    	product.setPd_infocode3(db.getString("pd_infocode3"));
			    	product.setPd_infocode4(db.getString("pd_infocode4"));
			    	productList.add(product);
			    	
				}
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return productList;
			*/
			return select(pd_code, pd_code);
		    }

		
	
		 public int getCount() throws Exception {
			 return count();
		 }

}
