package ganada.core;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class DAO {
	
	abstract protected DBTable gT();
	
    protected DAO() {
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
        }  else if (type == Timestamp.class) {
            return DB.string2Timestamp(value, "yyyy-MM-dd hh:mm:ss");
        } else {
            return value;
        }
    }
    
    public static String tabber(String str, int maxTabNumber) {
        String result = "";
        for (int i=1; i<=maxTabNumber;i++) {
            if (str.length()<i*8) result += "\t";
        }
        return str+result ;
    }
    
    public static String cName(Method m) {
    	String result = m.getName();
    	if (result.startsWith("get") || result.startsWith("set")) {
    		result = result.substring(3).toUpperCase();
            return result;       
    	} else return null;
    }
    
    public void insert(Object obj) throws Exception {
        DB db = new DB();
        DBTable t = gT();
        DB.Insert sql = db.new Insert(t.getTableName());
        try {
            DB.OUTLN("\r\n┌ Insert Data ────…");
            sql.inSql(t.getCNameCode(), t.getTableName() + "_SEQ.NEXTVAL");
            for (Method m : t.getter()) {
            	Object getValue = m.invoke(obj);
            	if (getValue != null) {
                    sql.in(cName(m), getValue);
                    DB.OUTLN(" »\tColumn: "+tabber(cName(m),2)+"\t <-"+m.getName()+""+getValue);
            	}
            }
            if ( !t.getCNameReg().isEmpty() ) {
                sql.inSql(t.getCNameReg(), "sysdate");
                DB.OUTLN(" »\tColumn: "+tabber(t.getCNameReg(),2)+" <- sysdate");
            } else if (!t.getCNameMod().isEmpty() ) {
                sql.inSql(t.getCNameMod(), "sysdate");
                DB.OUTLN(" »\tColumn: "+tabber(t.getCNameMod(),2)+" <- sysdate");
            }
            DB.OUTLN(" -ㆍInsert Start...! ───…");
            sql.run();
            DB.OUTLN("SQL.R: Insert Started!");
            DB.OUTLN("└────…");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public Object select(String code) throws Exception {
        DB db = new DB();
        DBTable t = gT();
        Object obj = t.getVoCls().newInstance();
        try {
            db.S("*", t.getTableName(), t.getCNameCode() + "=?").var(code).exe();
            DB.OUTLN("*"+"/"+t.getTableName()+"/"+t.getCNameCode() + "=?");
            if (db.next()) {
                DB.OUTLN("┌ Selected Data ────…");
                for (Method m : t.setter()) {
            		Object value = cVO(m.getParameterTypes()[0], db.getString(cName(m)));
                    m.invoke(obj, value);
                    DB.OUTLN(" »\tColumn: "+tabber(cName(m),2)+m.getName()+"("+value+")");
                }
                DB.OUTLN("└────…");
            } else {
                DB.OUTLN(" » No data.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return obj;
    }

    public List<?> select(String startCode, String endCode) throws Exception {
        DB db = new DB();
        DBTable t = gT();
        List objList = new ArrayList<Object>();
        try {
            db.S("*", t.getTableName(), t.getCNameCode() + " BETWEEN ? AND ?").var(startCode).var(endCode).exe();
            DB.OUTLN("┌ Selected Data ────…");
            int count = 0;
            while (db.next()) {
                Object obj = t.getVoCls().newInstance();
                for (Method m : t.setter()) {
            		Object value = cVO(m.getParameterTypes()[0], db.getString(cName(m)));
            		m.invoke(obj, value);
                    DB.OUTLN(" »\tColumn: "+tabber(cName(m),2)+m.getName()+"("+value+")");
                }
        		objList.add(obj);
                DB.OUTLN("\tㆍ────…");
                count++;
            }
            if (count==0) {
                DB.OUTLN(" » No data.");
            }
            DB.OUTLN("└────…");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return objList;
    }
    
    public List<?> search(String colName, String start, String... end) {
        DB db = new DB();
        DBTable t = gT();
        List objList = new ArrayList<Object>();
        try {
            String endVar = start;
            if (end.length>0) endVar = end[0];
            db.S("*", t.getTableName(), colName + " BETWEEN ? AND ?").var(start).var(endVar).exe();
            DB.OUTLN("┌ Searched Data ────…");
            int count = 0;
            while (db.next()) {
                Object obj = t.getVoCls().newInstance();
                for (Method m : t.setter()) {
                    Object value = cVO(m.getParameterTypes()[0], db.getString(cName(m)));
                    m.invoke(obj, value);
                    DB.OUTLN(" »\tColumn: "+tabber(cName(m),2)+m.getName()+"("+value+")");
                }
                objList.add(obj);
                DB.OUTLN("\tㆍ────…");
                count++;
            }
            if (count==0) {
                DB.OUTLN(" » No data.");
            }
            DB.OUTLN("└────…");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return objList;   
    }

    public void update(Object obj) throws Exception {
        DB db = new DB();
        DBTable t = gT();
        DB.Update sql = db.new Update(t.getTableName());
        try {
            boolean isValidate = false;
            boolean isNoModDate = true;
            DB.OUTLN("\r\n┌ Update Data ──────…");
            int count = 0;
            for (Method m : t.getter()) {
            	String name = cName(m);
            	Object getValue = m.invoke(obj);
            	
            	boolean isModCol = name.equals(t.getCNameMod());
                boolean isRegCol = name.equals(t.getCNameReg());
                if (getValue != null && !isModCol && !isRegCol) {
                	if (name.equals(t.getCNameCode())) {
                		sql.setWhere(t.getCNameCode(), getValue);
                        DB.OUTLN(" »\tTarget: "+tabber(name,2)+m.getName()+"("+getValue+")");
                		isValidate = true;
                	} else {
                		sql.set(name, getValue);
                        DB.OUTLN(" »\tColumn: "+tabber(name,2)+m.getName()+"("+getValue+")");
                    }
                }
            }       
            if (count==0) {
                DB.OUTLN(" » No data.");
            }
            if (!t.getCNameMod().isEmpty() ) {
                sql.setSql(t.getCNameMod(), "sysdate");
                DB.OUTLN(" :\tColumn: "+tabber(t.getCNameMod(),2)+" <- sysdate");
            }
            DB.OUTLN(" -ㆍUpdate Start...! ───…");
            if (isValidate) {
                sql.run();
                DB.OUTLN("SQL.R: Update Started!");
            } else {
                DB.OUTLN("SQL.R: Update Fail! Target이 없습니다.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public int delete(String code) throws Exception {
        DB db = new DB();
        DBTable t = gT();
        int x = -1;
        try {
            db.D(t.getTableName(), t.getCNameCode() + "=?").var(code).exe();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return x;
    }

    public int count() throws Exception {
		return count(null);
    }

    public int count(String code) throws Exception {
		DB db = new DB();
        DBTable t = gT();
		int x = 0;
		code = (String) NULL.R(code, "0");
		int num = Integer.parseInt(code);
		
		try {
			if (num==0) {
				db.S("count(*)", t.getTableName()).exe();
			} else {
				db.S("count(*)", t.getTableName(), t.getCNameCode()+"=?").var(num).exe();
			}
			if(db.next()){
				x = db.exe().getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.finalize();
		}
		return x;
    }

    public int isSame(String keyColumnName, String target, String varColumnName, String var) throws Exception {
		DB db = new DB();
        DBTable t = gT();
		int x = -1;
		try {
		    db.S(varColumnName, t.getTableName(), keyColumnName+"=?").var(target).exe();
		    if (db.next()) {
			String dst = db.exe().getString(varColumnName);
			x = (dst.equals(var)) ? 1 : 0;
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return x;
    }

    public int isExist(String keyColumnName, String target) throws Exception {
		DB db = new DB();
        DBTable t = gT();
		int x = -1;
	
		try {
		    db.S(keyColumnName, t.getTableName(), keyColumnName+"=?").var(target).exe();
		    x = db.next() ? 1 : -1;
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return x;
    }
}
