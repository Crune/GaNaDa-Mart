package ganada.obj.product;

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
		
		public Product getProduct(int num) throws Exception {
			DB db = new DB();
			Product product = null;
			try {
			    db.S("*", "product", "num=?").var(num).exe();
			    if (db.next()) {
			    	product = new Product();
			    	product.setNum(db.getInt("num"));
			    //	product.setPasswd(db.getString("passwd"));
			    	product.setName(db.getString("name"));
			    	product.setPrice(db.getInt("price"));
			    	product.setDiscount(db.getInt("discount"));
			    	product.setColor(db.getString("color"));
			    	product.setColorcode(db.getString("colorcode"));
			    	product.setColorimage(db.getString("colorimage"));
			    	product.setPd_size(db.getString("pd_size"));
			    	product.setStock(db.getInt("stock"));
			    	product.setStoread(db.getString("storead"));
			    	product.setImage(db.getString("image"));
			    	product.setStar(db.getInt("star"));
			    	product.setRecommend(db.getInt("recommend"));
			    	product.setInfo(db.getString("info"));
			    	product.setDeliveryinfo(db.getString("deliveryinfo"));
			    	product.setNote(db.getString("note"));
			    	product.setAsinfo(db.getString("asinfo"));
			    	product.setReg_date(db.getTimestamp("reg_date"));
			    }
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return product;
		    }
		
		 public void insertProduct(Product article) {
		        DB db = new DB();
		        DB.Insert sql = db.new Insert("product");
		        
		        try {
		            sql.inSql("num", "product_seq.NEXTVAL");
		           // sql.in("passwd", article.getPasswd());
		            sql.in("name", article.getName());
		            sql.in("price", article.getPrice());
		            sql.in("discount", article.getDiscount());
		            sql.in("color", article.getColor());
		            sql.in("colorcode", article.getColorcode());
		            sql.in("colorimage", article.getColorimage());
		            sql.in("pd_size", article.getPd_size());
		            sql.in("stock", article.getStock());
		            sql.in("storead", article.getStoread());
		            sql.in("image", article.getImage());
		            sql.in("star", article.getStar());
		            sql.in("recommend", article.getRecommend());
		            sql.in("info", article.getInfo());
		            sql.in("deliveryinfo", article.getDeliveryinfo());
		            sql.in("note", article.getNote());
		            sql.in("asinfo", article.getAsinfo());
		            		            
		            sql.inSql("REG_DATE", "sysdate");
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
				    sql.setWhere("num", product.getNum());
				   // sql.set("passwd", product.getPasswd());
		            sql.set("name", product.getName());
		            sql.set("price", product.getPrice());
		            sql.set("discount", product.getDiscount());
		            sql.set("color", product.getColor());
		            sql.set("colorcode", product.getColorcode());
		            sql.set("colorimage", product.getColorimage());
		            sql.set("pd_size", product.getPd_size());
		            sql.set("stock", product.getStock());
		            sql.set("storead", product.getStoread());
		            sql.set("image", product.getImage());
		            sql.set("star", product.getStar());
		            sql.set("recommend", product.getRecommend());
		            sql.set("info", product.getInfo());
		            sql.set("deliveryinfo", product.getDeliveryinfo());
		            sql.set("note", product.getNote());
		            sql.set("asinfo", product.getAsinfo());
				    sql.run();
				} catch (Exception ex) {
				    ex.printStackTrace();
				} finally {
				    db.finalize();
				}
		}
		
		 public int deleteProduct(int num) throws Exception {
				DB db = new DB();
				int x = -1;
				try {
				    db.D("product", "num=?").var(num).exe();
				    x = 1;
				} catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    db.finalize();
				}
				return x;
		 }
}
