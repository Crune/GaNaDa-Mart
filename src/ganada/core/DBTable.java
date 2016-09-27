package ganada.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DBTable {

	private String tableName = "";
	private String cNameCode = "CODE";
	private String cNameReg = "";
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
		this.tableName = TABLE_NAME;
		this.cNameCode = COL_NAME_CODE;
		this.cNameReg = COL_NAME_REG;
		this.cNameMod = COL_NAME_MOD;
	}	

    private Method getPK;   
    public Method getPK() {
        return getPK;
    }
	public void init() {
		if (voCls != null) {
            String getPKMethodName = "get";
            getPKMethodName += cNameCode.toLowerCase().indexOf(0);
            getPKMethodName += cNameCode.toLowerCase().substring(1);
			for (Method m : voCls.getMethods()) {
				String name = m.getName();

				for (Method objM : Object.class.getMethods())
					if (objM.getName().equals(name))
						name = "";
				if (name.startsWith("get")) {
				    getMethods.add(m);
				    if (name.equals(getPKMethodName))
				        getPK = m;
				}
				if (name.startsWith("set")) setMethods.add(m);
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
