package ganada.obj.common;

import ganada.core.DB;

public class ContentsPageDao {

    private static ContentsPageDao instance = new ContentsPageDao();
    public static ContentsPageDao getInstance() {
	return instance;
    }
    private ContentsPageDao() {
    }

    public void insertPage(ContentsPage page) throws Exception {
	DB db = new DB();
	DB.Insert sql = db.new Insert("CONT_PAGE");
	try {
	    sql.inSql("CODE", "CONT_PAGE_SEQ.NEXTVAL");
	    sql.in("NAME", page.getName());
	    sql.in("INFO", page.getInfo());
	    sql.in("BANNERS", page.getBanners());
	    sql.inSql("REG_DATE", "sysdate");
	    sql.inSql("MOD_DATE", "sysdate");
	    sql.run();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
    }

    public ContentsPage getPage(String code) throws Exception {
	DB db = new DB();
	ContentsPage page = null;
	try {
	    db.S("*", "CONT_PAGE", "CODE=?").var(code).exe();
	    if (db.next()) {
		page = new ContentsPage();
		page.setCode(db.getString("CODE"));
		page.setName(db.getString("NAME"));
		page.setInfo(db.getString("INFO"));
		page.setBanners(db.getString("BANNERS"));
		page.setReg_date(db.getTimestamp("reg_date"));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
	return page;
    }

    public void updatePage(ContentsPage page) throws Exception {
	DB db = new DB();
	DB.Update sql = db.new Update("CONT_PAGE");
	try {
	    sql.setWhere("CODE", page.getCode());
	    sql.set("NAME", page.getName());
	    sql.set("INFO", page.getInfo());
	    sql.set("BANNERS", page.getBanners());
	    sql.setSql("MOD_DATE", "sysdate");
	    sql.run();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    db.finalize();
	}
    }

    public int deletePage(String code) throws Exception {
	DB db = new DB();
	int x = -1;
	try {
	    db.D("CONT_PAGE", "CODE=?").var(code).exe();
	    x = 1;
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
	return x;
    }
}
