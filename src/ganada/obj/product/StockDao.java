package ganada.obj.product;

import ganada.core.*;

import ganada.obj.product.Stock;
import ganada.obj.product.StockDao;

public class StockDao {
private static StockDao instance = new StockDao();
    
    public static StockDao getInstance() {
        return instance;
    }
    
    private StockDao() {
    }
	
	public Stock getStock(String sk_code) throws Exception {
		DB db = new DB();
		Stock stock = null;
		try {
		    db.sql("").var(sk_code).exe();
		    if (db.next()) {
		    	stock = new Stock();
		    	stock.setSk_code(db.getString("sk_code"));
		    	stock.setSt_code(db.getString("st_code"));
		    	stock.setC_code(db.getString("c_code"));
		    	stock.setPd_size(db.getString("pd_size"));
		    	stock.setAmount(db.getInt("amount"));
		    	stock.setPd_code(db.getString("pd_code"));
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return stock;
	    }
	
	 public void insertStock(Stock article) {
	        DB db = new DB();
	        DB.Insert sql = db.new Insert("stock");
	        
	        try {
	            sql.inSql("sk_code", "stock_seq.NEXTVAL");
	            sql.in("st_code", article.getSt_code());
	            sql.in("c_code", article.getC_code());
	            sql.in("pd_size", article.getPd_size());
	            sql.in("amount", article.getAmount());
	            sql.in("pd_code", article.getPd_code());
	            sql.run();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            db.finalize();
	        }
	        
	    }
	
	 public void updateStock(Stock stock) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("stock");
			try {
			    sql.setWhere("sk_code", stock.getSk_code());
			    sql.set("st_code", stock.getSt_code());
			    sql.set("c_code", stock.getC_code());
			    sql.set("pd_size", stock.getPd_size());
			    sql.set("amount", stock.getAmount());
			    sql.set("pd_code", stock.getPd_code());
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
	}
	
	 public int deleteStock(String sk_code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("stock", "sk_code=?").var(sk_code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
	 }
}