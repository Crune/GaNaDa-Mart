package ganada.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ganada.core.DB.Insert;
import ganada.core.DB.Update;
import ganada.obj.common.*;
import ganada.obj.product.*;
import ganada.obj.member.*;

public abstract class DAO {

    protected DAO() {
    }
    
    private static Class objClass;
    private static List<Method> objGetMethods = new ArrayList<Method>();
    private static List<Method> objSetMethods = new ArrayList<Method>();

    private static String tableName;

    protected static void init(String className, String tableName) throws Exception {
        objClass = Class.forName(className);

        DAO.tableName = tableName;

        Method[] methods = objClass.getMethods();
        for (Method m : methods) {
            if (!m.getName().startsWith("set"))
                objSetMethods.add(m);
            if (!m.getName().startsWith("get"))
                objGetMethods.add(m);
        }
        System.out.println("init:"+className+"/"+tableName);
    }

    private boolean reg_date = false;
    private boolean mod_date = false;

    public boolean isReg_date() {
        return reg_date;
    }

    public void setReg_date(boolean reg_date) {
        this.reg_date = reg_date;
    }

    public boolean isMod_date() {
        return mod_date;
    }

    public void setMod_date(boolean mod_date) {
        this.mod_date = mod_date;
    }

    private static String cNamePK = "CODE";
    protected static void setPKName(String cNamePK) {
        cNamePK = (String) NULL.R(cNamePK, cNamePK);
    }

    private static String cNameReg = "REG_DATE";
    protected void setRegName(String cNameReg) {
        cNameReg = (String) NULL.R(cNameReg, cNamePK);
    }
    private static String cNameMod = "MOD_DATE";
    protected void setModName(String cNameMod) {
        cNameMod = (String) NULL.R(cNameMod, cNamePK);
    }

    public static Object cVO(Class<?> type, String value){
        return createValueObject(type, value);
    }
    private static Object createValueObject(Class<?> type, String value) {
        if (type.getName().equals("int") || type == Integer.class) {
            return new Integer(value);
        } else if (type.getName().equals("float") || type == Float.class) {
            return new Float(value);
        } else if (type.getName().equals("double") || type == Double.class) {
            return new Double(value);
        } else if (type.getName().equals("long") || type == Long.class) {
            return new Long(value);
        } else if (type.getName().equals("boolean") || type == Boolean.class) {
            return new Boolean(value);
        } else if (type == Date.class) {
            return java.sql.Date.valueOf(value);
        } else {
            return value;
        }
    }
    
    public static String cName(Method setter) {
        return setter.getName();        
    }
    
    public void insert(Object obj) throws Exception {
        DB db = new DB();
        DB.Insert sql = db.new Insert(tableName);
        try {
            sql.inSql(cNamePK, tableName + "_SEQ.NEXTVAL");
            for (Method m : objGetMethods) {
                boolean isTaken = cName(m).equals(cNamePK) 
                        || cName(m).equals(cNameReg) 
                        || cName(m).equals(cNameMod);
                if (!isTaken)
                    sql.in(cName(m), m.invoke(objClass));
            }
            if (reg_date) sql.inSql("REG_DATE", "sysdate");
            if (mod_date) sql.inSql("MOD_DATE", "sysdate");
            sql.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public Object select(String code) throws Exception {
        DB db = new DB();
        Object obj = null;
        try {
            db.S("*", tableName, cNamePK + "=?").var(code).exe();
            if (db.next()) {
                obj = objClass.newInstance();
                /*
                 * banner.setCode(db.getString("CODE"));
                 * banner.setName(db.getString("NAME"));
                 * banner.setInfo(db.getString("INFO"));
                 * banner.setHtml(db.getString("HTML"));
                 * banner.setReg_date(db.getTimestamp("reg_date"));
                 */
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return obj;
    }

    public void update(Object obj) throws Exception {
        DB db = new DB();
        DB.Update sql = db.new Update(tableName);
        try {/*
              * sql.setWhere("CODE", obj.getCode());
              * 
              * sql.set("NAME", banner.getName()); sql.set("INFO",
              * banner.getInfo()); sql.set("HTML", banner.getHtml());
              */
            sql.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public int delete(String code) throws Exception {
        DB db = new DB();
        int x = -1;
        try {
            db.D(tableName, cNamePK + "=?").var(code).exe();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return x;
    }
}
