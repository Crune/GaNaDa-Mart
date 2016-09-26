package ganada.obj.member;

import ganada.core.DAO;
import ganada.core.DB;
import ganada.core.DBTable;

public class PhoneDao extends DAO {

    private static PhoneDao instance = new PhoneDao();
    public static PhoneDao getInstance() {
        return instance;
    }
    private PhoneDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("PHONE", "CODE");
    		t.setCls("ganada.obj.member.Phone");
    	}
		return t;
	}
	
}
