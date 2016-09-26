package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class ProductDao {
	private static ProductDao instance = new ProductDao();
	    
	    public static ProductDao getInstance() {
	        return instance;
	    }
	    
	    private ProductDao() {
	    }
		
		public Product getProduct(String pd_code) throws Exception {
			DB db = new DB();
			Product product = null;
			try {
			    db.S("*", "product", "pd_code=?").var(pd_code).exe();
			    if (db.next()) {
			    	product = new Product();
			    	product.setPd_code(db.getString("pd_code"));
			    	product.setMenu_code(db.getString("menu_code"));
			    	product.setPd_name(db.getString("pd_name"));
			    	product.setPd_price(db.getInt("pd_price"));
			    	product.setPd_reg_date(db.getTimestamp("pd_reg_date"));
			    	product.setPd_infocode1(db.getString("pd_infocode1"));
			    	product.setPd_infocode2(db.getString("pd_infocode2"));
			    	product.setPd_infocode3(db.getString("pd_infocode3"));
			    	product.setPd_infocode4(db.getString("pd_infocode4"));
				}
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return product;
		    }
		public List<Product> getArticle(String pd_code) throws Exception {
			DB db = new DB();
			List<Product> productList = null;
			try {
			    db.S("*", "product", "pd_code=?").var(pd_code).exe();
			    if (db.next()) {
			    	productList = new ArrayList<Product>();
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
		    }
		 public void insertProduct(Product article) {
		        DB db = new DB();
		        DB.Insert sql = db.new Insert("product");
		        
		        try {
		            sql.inSql("pd_code", "product_seq.NEXTVAL");
		           // sql.in("pd_code", article.getPd_code());
		            sql.in("menu_code", article.getMenu_code());
		            sql.in("pd_name", article.getPd_name());
		            sql.in("pd_price", article.getPd_price());
		            sql.in("pd_infocode1", article.getPd_infocode1());
		            sql.in("pd_infocode2", article.getPd_infocode2());
		            sql.in("pd_infocode3", article.getPd_infocode3());
		            sql.in("pd_infocode4", article.getPd_infocode4());
		            sql.inSql("pd_reg_date", "sysdate");
		            sql.run();
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            db.finalize();
		        }
		        
		    }
		
		 public void updateProduct(Product product) throws Exception {
				DB db = new DB();
				DB.Update sql = db.new Update("product");
				try {
				    sql.setWhere("pd_code", product.getPd_code());
				    sql.set("menu_code", product.getMenu_code());
				    sql.set("pd_name", product.getPd_name());
				    sql.set("pd_price", product.getPd_price());
				    sql.set("pd_infocode1", product.getPd_infocode1());
				    sql.set("pd_infocode1", product.getPd_infocode2());
				    sql.set("pd_infocode1", product.getPd_infocode3());
				    sql.set("pd_infocode1", product.getPd_infocode4());
				    sql.run();
				} catch (Exception ex) {
				    ex.printStackTrace();
				} finally {
				    db.finalize();
				}
		}
		
		 public int getCount() throws Exception {
			 DB db = new DB();
			 int x = 0;
			 try{
				 x = db.count("product");
			 }catch(Exception ex){
				 ex.printStackTrace();
			 }finally{
				 db.finalize();
			 }
			 return x;
		 }
		 
		 public int deleteProduct(String pd_code) throws Exception {
				DB db = new DB();
				int x = -1;
				try {
				    db.D("product", "pd_code=?").var(pd_code).exe();
				    x = 1;
				} catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    db.finalize();
				}
				return x;
		 }
}
