package ganada.core;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

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
    
    public static final int maxCut = 30;
    public static String cutter(Object value) {
    	return cutter(value, maxCut);
    }
    public static String cutter(Object value, int max) {
    	String result = value+"";
    	String returnChar = "┘";
    	result = result.replace("\r\n", returnChar);
    	result = result.replace("\r", returnChar);
    	result = result.replace("\n", returnChar);
    	result = result.replace("\t", "↔");
    	result = result.trim();
    	if (max > 0 && !result.isEmpty() && result.length() > max) {
    		result = result.substring(0, max) + "…";
    	}
		return result;
    	
    }
    
    public static String cName(Method m) {
    	String result = m.getName();
    	if (result.startsWith("get") || result.startsWith("set")) {
    		result = result.substring(3).toUpperCase();
            return result;       
    	} else return null;
    }

    public Object bind(MultipartRequest request) throws Exception {
        return bind(null, request);
    }

    public Object bind(HttpServletRequest request) throws Exception {
        return bind(request, null);
    }    
    
    public Object bind(HttpServletRequest req, MultipartRequest mreq) throws Exception {
        DBTable t = gT();
        Object obj = t.getVoCls().newInstance();
        try {
            DB.OUTLN("┌ Binding Data ────…");
            for (Method m : t.setter()) {
                
            	String dataU="", dataL="", data="";
            	if (req == null) {
                    dataU = mreq.getParameter(cName(m).toUpperCase());
            	    dataL = mreq.getParameter(cName(m).toLowerCase());
            	}
                if (mreq == null) {
                    dataU = req.getParameter(cName(m).toUpperCase());
                    dataL = req.getParameter(cName(m).toLowerCase());
                }

                if (dataU==null) dataU = "";
                if (dataL==null) dataL = "";
                data = (dataU.length()>0)?dataU:(dataL.length()>0)?dataL:"";
                
                DB.OUTLN("\tDATA:"+m.getName()+"/"+dataU+"/"+dataL+">"+data);
            	if (!data.isEmpty()) {
            		Object value = cVO(m.getParameterTypes()[0], data);
	                m.invoke(obj, value);
	                DB.OUTLN(" »\tField: "+tabber(cName(m),2)+m.getName()+"("+cutter(value)+")");
            	}
            }
            DB.OUTLN("└────…");
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
		return obj;    	
    }    
    
    public Object select(String code) throws Exception {
    	return select(code, code).get(0);
    }

    public List<?> selects(String code) throws Exception {    	
    	return select(code, code);
    }
    public List<?> select(String startCode, String endCode) throws Exception {    	
    	return search(gT().getCNameCode(), startCode, endCode);
    }
    
    public List<?> search(String colName, String start, String... end) {
        DB db = new DB();
        DBTable t = gT();
        List objList = new ArrayList<Object>();
        try {
            String endVar = start;
            if (end.length>0) endVar = end[0];
            db.S("*", t.getTableName(), colName + " BETWEEN ? AND ?").var(start).var(endVar).exe();
            DB.OUTLN("┌ Selected Data ────…");
            int count = 0;
            while (db.next()) {
                Object obj = t.getVoCls().newInstance();
                for (Method m : t.setter()) {
                	if (db.getString(cName(m)) != null) {
	                    DB.OUT(" »\tColumn: "+tabber(cName(m),2)+m.getName()+"(");
	                    Object value = cVO(m.getParameterTypes()[0], db.getString(cName(m)));
	                    DB.OUT(cutter(value)+")\r\n");
	                    m.invoke(obj, value);
                	}
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

    public void insert(Object obj) throws Exception {
        DB db = new DB();
        DBTable t = gT();
        DB.Insert sql = db.new Insert(t.getTableName());
        try {
            DB.OUTLN("\r\n┌ Insert Data ────…");
            sql.inSql(t.getCNameCode(), t.getTableName() + "_SEQ.NEXTVAL");
            for (Method m : t.getter()) {
            	Object getValue = m.invoke(obj);
            	if (getValue != null && !cName(m).equals(t.getCNameCode())) {
                    sql.in(cName(m), getValue);
                    DB.OUTLN(" »\tColumn: "+tabber(cName(m),2)+"\t <-"+m.getName()+" / "+cutter(getValue));
            	}
            }
            if ( !t.getCNameReg().isEmpty() ) {
                sql.inSql(t.getCNameReg(), "sysdate");
                DB.OUTLN(" »\tColumn: "+tabber(t.getCNameReg(),2)+"\t <- sysdate");
            } else if (!t.getCNameMod().isEmpty() ) {
                sql.inSql(t.getCNameMod(), "sysdate");
                DB.OUTLN(" »\tColumn: "+tabber(t.getCNameMod(),2)+"\t <- sysdate");
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
                        DB.OUTLN(" »\tTarget: "+tabber(name,2)+m.getName()+"("+cutter(getValue)+")");
                		isValidate = true;
                	} else {
                		sql.set(name, getValue);
                        DB.OUTLN(" »\tColumn: "+tabber(name,2)+m.getName()+"("+cutter(getValue)+")");
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
		return count(null, code);
    }

    public int count(String column, String data) throws Exception {
		DB db = new DB();
        DBTable t = gT();
		int x = 0;
		
		try {
			if (column==null && data == null) {
				db.S("count(*)", t.getTableName()).exe();
			} else if (column == null) {
				db.S("count(*)", t.getTableName(), t.getCNameCode()+"=?").var(data).exe();
			} else {
				db.S("count(*)", t.getTableName(), column+"=?").var(data).exe();
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

    public int isExist(String whereColumnName, String whereVar) throws Exception {
		return isSame(whereColumnName, whereVar, whereColumnName, whereVar);
    }    
    
    public int isSame(String whereColumnName, String whereVar, String selectColumnName, String conditionVar) throws Exception {
		DB db = new DB();
        DBTable t = gT();
		int x = -1;
		try {
		    db.S(selectColumnName, t.getTableName(), whereColumnName+"=?").var(whereVar).exe();
		    if (conditionVar == null) {
		    	conditionVar = whereVar;
	    	}
		    if (db.next()) {
				String dst = db.exe().getString(selectColumnName);
				x = (dst.equals(conditionVar)) ? 1 : 0;
		    }
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    db.finalize();
		}
		return x;
    }
}
