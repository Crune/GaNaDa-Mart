package ganada.obj.common;

import ganada.core.DAO;
import ganada.core.DB;
import ganada.core.DBTable;

public class ContentsPageDao extends DAO {

    private static ContentsPageDao instance = new ContentsPageDao();
    
    public static ContentsPageDao getInstance() {
        return instance;
    }

    private ContentsPageDao() {
    }


    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable(null, "CONT_PAGE", "CODE", "REG_DATE", "MOD_DATE");
    		t.setCls("ganada.obj.common.ContentsPage");
    	}
		return t;
	}
}
