package ganada.obj.member;

import ganada.core.*;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

public class AddressDao extends DAO {

	private static AddressDao instance = new AddressDao();

	public static AddressDao getInstance() {
		return instance;
	}

	private AddressDao() {
	}

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("ADDRESS", "CODE");
    		t.setCls("ganada.obj.member.Address");
    	}
		return t;
	}
}
