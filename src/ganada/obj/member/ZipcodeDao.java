package ganada.obj.member;

import ganada.core.*;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

public class ZipcodeDao extends DAO {

	private static ZipcodeDao instance = new ZipcodeDao();

	public static ZipcodeDao getInstance() {
		return instance;
	}

	private ZipcodeDao() {
	}

	private static DBTable t;

	@Override
	protected DBTable gT() {
		if (t == null) {
			t = new DBTable("ZIPCODE", "zipcode");
			t.setCls("ganada.obj.member.Zipcode");
		}
		return t;
	}

}
