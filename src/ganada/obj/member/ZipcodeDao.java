package ganada.obj.member;

import ganada.core.*;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

public class ZipcodeDao {

	private static ZipcodeDao instance = new ZipcodeDao();

	public static ZipcodeDao getInstance() {
		return instance;
	}

	private ZipcodeDao() {
	}
	 public void insertZipcode(Zipcode zipcode) throws Exception {
			DB db = new DB();
			DB.Insert sql = db.new Insert("ZIPCODE");
			try {
			    sql.inSql("CODE", "ACCOUNT_SEQ.NEXTVAL");
			    sql.in("ZIPCODE", zipcode.getZipcode());
			    sql.in("SIDO", zipcode.getSido());
			    sql.in("SIDOENG", zipcode.getSidoeng());
			    sql.in("SIGUNGU", zipcode.getSigungu());
			    sql.in("SUGUNGUEG", zipcode.getSugungueg());
			    sql.in("EUBMYNDONG", zipcode.getEubmyndong());
			    sql.in("EUBMYNDONGEN", zipcode.getEubmyndongen());
			    sql.in("RI", zipcode.getRi());
			    sql.in("MOUNTAIN", zipcode.getMountain());
			    sql.in("DONG", zipcode.getDong());
			    sql.in("JUSTART", zipcode.getJustart());
			    sql.in("BUSTART", zipcode.getBustart());
			    sql.in("JULAST", zipcode.getJulast());
			    sql.in("BULAST", zipcode.getBulast());
			    sql.inSql("REG_DATE", "sysdate");
			    sql.run();
			   
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
		    }

		    public Zipcode getzipcode(String code) throws Exception {
			DB db = new DB();
			Zipcode zipcode = null;
			try {
			    db.S("*", "ZIPCODE", "CODE=?").var(zipcode).exe();
			    if (db.next()) {
			    	zipcode = new Zipcode();
			    	zipcode.setZipcode(db.getInt("ZIPCODE"));
			    	zipcode.setSido(db.getString("SIDO"));
			    	zipcode.setSidoeng(db.getString("SIDOENG"));
			    	zipcode.setSigungu(db.getString("SIGUNGU"));
			    	zipcode.setSugungueg(db.getString("SUGUNGUEG"));
			    	zipcode.setEubmyndong(db.getString("EUBMYNDONG"));
			    	zipcode.setEubmyndongen(db.getString("EUBMYNDONGEN"));
			    	zipcode.setRi(db.getString("RI"));
			    	zipcode.setJustart(db.getInt("JUSTART"));
			    	zipcode.setBustart(db.getInt("BUSTART"));
			    	zipcode.setJulast(db.getInt("JULAST"));
			    	zipcode.setBulast(db.getInt("BULAST"));
			    }
		
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return zipcode;
		    }

		    public void updateZipcode(Zipcode zipcode) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("ZIPCODE");
			try {
			    sql.setWhere("ZIPCODE", zipcode.getZipcode());
        	    sql.set("SIDO", zipcode.getSido());
			    sql.set("SIDOENG", zipcode.getSidoeng());
			    sql.set("SIGUNGU", zipcode.getSigungu());
			    sql.set("SIGUNGUEG", zipcode.getSugungueg());
			    sql.set("EUBMYNDONG", zipcode.getEubmyndong());
			    sql.set("EUBMYNDONGEN", zipcode.getEubmyndongen());
			    sql.set("RI", zipcode.getRi());
			    sql.set("JUSTART", zipcode.getJustart());
			    sql.set("BUSTART", zipcode.getBustart());
			    sql.set("JULAST", zipcode.getJulast());
			    sql.set("BULAST", zipcode.getBulast());
			    
			    
			    
			    
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
		    }

		    public int deleteZipcode(String code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("ZIPCODET", "CODE=?").var(code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
		    }
		}
