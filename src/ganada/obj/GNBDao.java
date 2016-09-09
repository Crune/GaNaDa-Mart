package ganada.obj;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.*;


import ganada.core.DB;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

import javax.naming.*;

public class GNBDao {
	private static GNBDao instance = new GNBDao();
	
	public static GNBDao getInstance(){
		return instance;
	}	
	private GNBDao(){}
	

    public void insertBanner(GNB menu) throws Exception {
	DB db = new DB();
	DB.Insert sql = db.new Insert("MENU");
	try {
		sql.in("ID", menu.getId());
	    sql.in("STEP", menu.getStep());
	    sql.in("UPPER", menu.getUpper());
	    sql.in("NAME", menu.getName());
	    sql.in("URL", menu.getUrl());
	    sql.run();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
    }

    public GNB getBanner(String id) throws Exception {
    	DB db = new DB();
    	GNB menu = null;
    	try {
    		db.S("*", "MENU", "ID=?").var(id).exe();
    		if (db.next()) {
    			menu = new GNB();
    			menu.setId(db.getString("ID"));
    			menu.setStep(db.getString("STEP"));
    			menu.setUpper(db.getString("UPPER"));
    			menu.setName(db.getString("NAME"));
    			menu.setUrl(db.getString("URL"));
    		}
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	} finally {
    		db.finalize();
    	}
    	return menu;
    }

    public void updateBanner(GNB menu) throws Exception {
	DB db = new DB();
	DB.Update sql = db.new Update("MENU");
	try {
	    sql.setWhere("ID", menu.getId());
	    sql.set("STEP", menu.getStep());
	    sql.set("UPPER", menu.getUpper());
	    sql.set("NAME", menu.getName());
	    sql.set("URL", menu.getUrl());
	    sql.run();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    db.finalize();
	}
    }

    private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public int deleteBanner(String id) throws Exception {
	DB db = new DB();
	int x = -1;
	try {
	    db.D("MENU", "id=?").var(id).exe();
	    x = 1;
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    db.finalize();
	}
	return x;
    }
	

	public List getInsert() throws Exception {
		DB db = new DB();	
		List menuList=null;
		GNB menu=null;	
		try {					
			db.S("*","nike").exe();
			if(db.next()){
				menuList = new ArrayList();
				do{	
				menu=new GNB();			
				menu.setId(db.getString("ID"));
				menu.setStep(db.getString("STEP"));
				menu.setUpper(db.getString("UPPER"));
				menu.setName(db.getString("NAME"));
				menu.setUrl(db.getString("URL"));
				menuList.add(menu); 
				}while(db.next());
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}		
		return menuList;
	}
	public List getMenu()throws Exception{
		DB db = new DB();
		List<GNB> menuList=new ArrayList<GNB>();
		GNB menu = null;
		try{
			db.S("*","nike").exe();
			while(db.next()){
				menu=new GNB();			
				menu.setId(db.getString("ID"));
				menu.setUpper(db.getString("UPPER"));
				menu.setName(db.getString("NAME"));
				menu.setUrl(db.getString("URL"));
				menuList.add(menu); 
			}
		}catch (Exception e) {
			e.printStackTrace();		
		}
		return menuList;
	}
}
