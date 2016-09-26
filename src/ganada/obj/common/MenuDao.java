package ganada.obj.common;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ganada.core.*;

public class MenuDao extends DAO {
    private static MenuDao instance = new MenuDao();

    public static MenuDao getInstance() {
        if (menus.isEmpty()) {
            try {
                refresh();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    private MenuDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("MENU", "CODE");
    		t.setCls("ganada.obj.common.Menu");
    	}
		return t;
	}
	
    private static List<Menu> menus = new ArrayList<Menu>();
    public static void refresh() {
        menus.clear();
        String sql = "SELECT LEVEL, CODE, NAME, TYPE, UPPER, ORDER_LV, TARGET_CODE"
                    +" FROM MENU"
                    +" WHERE CODE!='0'"
                    +" START WITH CODE='0'"
                    +" CONNECT BY PRIOR CODE=UPPER"
                    +" ORDER SIBLINGS BY TYPE DESC, ORDER_LV";
        DB db = new DB();
        Menu cur;
        try {
            db.sql(sql).exe();
            while (db.next()) {
                cur = new Menu();
                cur.setLevel(db.getInt("LEVEL"));
                cur.setCode(db.getString("CODE"));
                cur.setName(db.getString("NAME"));
                cur.setType(db.getInt("TYPE"));
                cur.setUpper(db.getString("UPPER"));
                cur.setOrder_lv(db.getInt("ORDER_LV"));
                cur.setTarget(db.getString("TARGET_CODE"));
                //System.out.println(cur);
                menus.add(cur);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }             
    }    

    public List<Menu> getChild(String code) {
        List<Menu> result = new ArrayList<Menu>();
        for (Menu cur : menus) {
            if (cur.getUpper().equals(code)) {
                result.add(cur);
            }
        }
        return result;
    }
    
    public List<Menu> getMenus() {
        return menus;        
    }

}
