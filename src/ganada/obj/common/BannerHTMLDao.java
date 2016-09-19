package ganada.obj.common;

import ganada.core.*;

public class BannerHTMLDao {

    private static BannerHTMLDao instance = new BannerHTMLDao();

    public static BannerHTMLDao getInstance() {
	return instance;
    }

    private BannerHTMLDao() {
    }

    public void insertBanner(BannerHTML banner) throws Exception {
	DB db = new DB();
	DB.Insert sql = db.new Insert("BANNER");
	try {
	    sql.inSql("CODE", "BANNER_SEQ.NEXTVAL");
	    sql.in("NAME", banner.getName());
	    sql.in("INFO", banner.getInfo());
	    sql.in("HTML", banner.getHtml());
	    sql.inSql("REG_DATE", "sysdate");
	    sql.run();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
    }

    public BannerHTML getBanner(String code) throws Exception {
	DB db = new DB();
	BannerHTML banner = null;
	try {
	    db.S("*", "BANNER", "CODE=?").var(code).exe();
	    if (db.next()) {
		banner = new BannerHTML();
		banner.setCode(db.getString("CODE"));
		banner.setName(db.getString("NAME"));
		banner.setInfo(db.getString("INFO"));
		banner.setHtml(db.getString("HTML"));
		banner.setReg_date(db.getTimestamp("reg_date"));
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    db.finalize();
	}
	return banner;
    }

    public void updateBanner(BannerHTML banner) throws Exception {
	DB db = new DB();
	DB.Update sql = db.new Update("BANNER");
	try {
	    sql.setWhere("CODE", banner.getCode());

	    sql.set("NAME", banner.getName());
	    sql.set("INFO", banner.getInfo());
	    sql.set("HTML", banner.getHtml());
	    sql.run();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    db.finalize();
	}
    }

    public int deleteBanner(String code) throws Exception {
	DB db = new DB();
	int x = -1;
	try {
	    db.D("BANNER", "CODE=?").var(code).exe();
	    x = 1;
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
	return x;
    }
}
