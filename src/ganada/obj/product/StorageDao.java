package ganada.obj.product;

import ganada.core.*;

import ganada.obj.product.Storage;
import ganada.obj.product.StorageDao;

public class StorageDao extends DAO {
private static StorageDao instance = new StorageDao();
    
    public static StorageDao getInstance() {
        return instance;
    }
    
    private StorageDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("storage", "st_code");
    		t.setCls("ganada.obj.product.Storage");
    	}
		return t;
	}		
	
}
