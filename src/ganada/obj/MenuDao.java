package ganada.obj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ganada.core.*;

public class MenuDao {
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

    private static List<Menu> menus = new ArrayList<Menu>();
    public static void refresh() {
        menus.clear();
        String sql = "SELECT LEVEL, CODE, NAME, TYPE, UPPER, ORDER_LV"
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
                System.out.println(cur);
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

    public void insertMenu(Menu menu) throws Exception {
        DB db = new DB();
        DB.Insert sql = db.new Insert("MENU");
        try {
            sql.in("CODE", menu.getCode());
            sql.in("NAME", menu.getName());
            sql.in("TYPE", menu.getType());
            sql.in("UPPER", menu.getUpper());
            sql.in("ORDER_LV", menu.getOrder_lv());
            sql.run();
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public void updateMenu(Menu menu) throws Exception {
        DB db = new DB();
        DB.Update sql = db.new Update("MENU");
        try {
            sql.set("CODE", menu.getCode());
            sql.set("NAME", menu.getName());
            sql.set("TYPE", menu.getType());
            sql.set("UPPER", menu.getUpper());
            sql.set("ORDER_LV", menu.getOrder_lv());
            sql.run();
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public int deleteMenu(String code) throws Exception {
        DB db = new DB();
        int x = -1;
        try {
            db.D("MENU", "CODE=?").var(code).exe();
            refresh();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return x;
    }

    public Menu getMenu(String code) throws Exception {
        DB db = new DB();
        Menu menu = null;
        try {
            db.S("*", "MENU", "CODE=?").var(code).exe();
            if (db.next()) {
                menu = new Menu();                
                menu.setCode(db.getString("CODE"));
                menu.setName(db.getString("NAME"));
                menu.setType(db.getInt("TYPE"));
                menu.setUpper(db.getString("UPPER"));
                menu.setOrder_lv(db.getInt("ORDER_LV"));                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return menu;
    }
    
}
