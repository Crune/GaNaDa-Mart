package ganada.obj.product;

import ganada.core.*;

import ganada.obj.product.Storage;
import ganada.obj.product.StorageDao;

public class StorageDao {
private static StorageDao instance = new StorageDao();
    
    public static StorageDao getInstance() {
        return instance;
    }
    
    private StorageDao() {
    }
	
	public Storage getStorage(String st_code) throws Exception {
		DB db = new DB();
		Storage storage = null;
		try {
		    db.sql("").var(st_code).exe();
		    if (db.next()) {
		    	storage = new Storage();
		    	storage.setSt_code(db.getString("st_code"));
		    	storage.setSt_name(db.getString("st_name"));
		    	storage.setSt_address(db.getString("st_address"));
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return storage;
	    }
	
	 public void insertStorage(Storage article) {
	        DB db = new DB();
	        DB.Insert sql = db.new Insert("storage");
	        
	        try {
	            sql.inSql("st_code", "storage_seq.NEXTVAL");
	            sql.in("st_name", article.getSt_name());
	            sql.in("st_address", article.getSt_address());
	            sql.run();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            db.finalize();
	        }
	        
	    }
	
	 public void updateStorage(Storage storage) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("storage");
			try {
			    sql.setWhere("st_code", storage.getSt_code());
			    sql.set("st_name", storage.getSt_name());
			    sql.set("st_address", storage.getSt_address());
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
	}
	
	 public int deleteStock(String st_code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("storage", "st_code=?").var(st_code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
	 }
}
