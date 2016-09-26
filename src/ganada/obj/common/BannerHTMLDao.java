package ganada.obj.common;

import ganada.core.*;

public class BannerHTMLDao extends DAO {

    private static BannerHTMLDao instance = new BannerHTMLDao();

    public static BannerHTMLDao getInstance() {
	return instance;
    }

    private BannerHTMLDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable(null, "BANNER", "CODE", "REG_DATE", "");
    		t.setCls("ganada.obj.common.BannerHTML");
    	}
		return t;
	}
}
