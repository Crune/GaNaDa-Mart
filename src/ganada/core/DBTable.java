package ganada.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DBTable {

	private String tableName = "";
	private String cNameCode = "CODE";
	private String cNameReg = "";
	@Override
	public String toString() {
		return "DBTable [테이블명=" + tableName + ", PK컬럼명=" + cNameCode + ", 등록일컬럼명=" + cNameReg + ", 수정일컬럼명="
				+ cNameMod + "]";
	}

	private String cNameMod = "";		
	
	private Class voCls;
	
	private List<Method> getMethods = new ArrayList<Method>();
	private List<Method> setMethods = new ArrayList<Method>();

    public DBTable() {
	}

	public DBTable(Class OBJ, String TABLE_NAME) {
		set(OBJ, TABLE_NAME, "CODE", "", "");
	}	
	public DBTable(String TABLE_NAME, String COL_NAME_CODE) {
		set(voCls, TABLE_NAME, COL_NAME_CODE, "", "");
	}
	public DBTable(Class OBJ, String TABLE_NAME, String COL_NAME_CODE) {
		set(OBJ, TABLE_NAME, COL_NAME_CODE, "", "");
	}
	public DBTable(Class OBJ, String TABLE_NAME, String COL_NAME_CODE, String COL_NAME_REG, String COL_NAME_MOD) {
		set(OBJ, TABLE_NAME, COL_NAME_CODE, COL_NAME_REG, COL_NAME_MOD);
	}	

	public void setCls(String packNCls) {
		try {
			voCls = Class.forName(packNCls);
			init();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void set(Class OBJ, String TABLE_NAME, String COL_NAME_CODE, String COL_NAME_REG, String COL_NAME_MOD) {
		this.voCls = OBJ;
		this.tableName = TABLE_NAME.toUpperCase();
		this.cNameCode = COL_NAME_CODE.toUpperCase();
		this.cNameReg = COL_NAME_REG.toUpperCase();
		this.cNameMod = COL_NAME_MOD.toUpperCase();
	}	

    private Method getPK;   
    public Method getPK() {
        return getPK;
    }
	public void init() {
		if (voCls != null) {
            String getPKMethodName = "get";
            getPKMethodName += cNameCode.toUpperCase().subSequence(0, 1);
            getPKMethodName += cNameCode.toLowerCase().substring(1);
            
			for (Method m : voCls.getMethods()) {
				String name = m.getName();

				for (Method objM : Object.class.getMethods())
					if (objM.getName().equals(name))
						name = "";
				if (name.startsWith("get")) {
				    if (name.equals(getPKMethodName)) {
				        getPK = m;
				    }
				    getMethods.add(m);
				}
				if (name.startsWith("set")) {
					setMethods.add(m);
				}
			}

			System.out.println("\r\nDAO.TABLE:\t"+toString());
			System.out.println("DAO.CLASS:\t"+voCls.getName());

			for (Method m : getter()) {
			    String msg = "\tG+ ";
			    msg += (m.getName().equals(getPKMethodName))?"[PK]\t":"\t";
			    msg += m.getName()+"()";	
			    System.out.println(msg);
			}

			for (Method m : setter()) {
			    System.out.println("\tS+ \t"+m.getName()+"()");
			}
		}
	}
	
    public List<Method> getter() {
		return getMethods;
    }

    public List<Method> setter() {
		return setMethods;
    }
	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getCNameCode() {
		return cNameCode;
	}

	public void setCNameCode(String colNameCode) {
		this.cNameCode = colNameCode;
	}

	public String getCNameReg() {
		return cNameReg;
	}

	public void setCNameReg(String colNameReg) {
		this.cNameReg = colNameReg;
	}

	public String getCNameMod() {
		return cNameMod;
	}

	public void setCNameMod(String colNameMod) {
		this.cNameMod = colNameMod;
	}

	public Class getVoCls() {
		return voCls;
	}

	public void setVoCls(Class voCls) {
		this.voCls = voCls;
	}

	
}
