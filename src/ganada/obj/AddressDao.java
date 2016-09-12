package ganada.obj;
import ganada.core.*;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

public class AddressDao {

	private static AddressDao instance = new AddressDao();

	public static AddressDao getInstance() {
		return instance;
	}

	private AddressDao() {
	}
	 public void insertAddress(Address address) throws Exception {
			DB db = new DB();
			DB.Insert sql = db.new Insert("ADDRESS");
			try {
			    sql.inSql("CODE", "ADDRESS_SEQ.NEXTVAL");
			    sql.in("ZIPCODE", address.getZipcode());
			    sql.in("SIDO", address.getSido());
			    sql.in("EMD", address.getEmd());
			    sql.in("RI", address.getRi());
			    sql.in("RECIPIENT", address.getRecipient());
			    sql.in("NAME", address.getName());
			    sql.in("PHONE", address.getPhone());
			    sql.in("MESSAGE", address.getMessage());
			    sql.run();
			   
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
		    }

		    public Address getaddress(String code) throws Exception {
			DB db = new DB();
			Address address = null;
			try {
			    db.S("*", "BANNER", "CODE=?").var(code).exe();
			    if (db.next()) {
			    	address = new Address();
			    	address.setZipcode(db.getString("ZIPCODE"));
			    	address.setSido(db.getString("SIDO"));
			    	address.setEmd(db.getString("EMD"));
			    	address.setRi(db.getString("RI"));
			    	address.setRecipient(db.getString("RECIPIENT"));
			    	address.setName(db.getString("NAME"));
			    	address.setPhone(db.getString("PHONE"));
			    	address.setMessage(db.getString("MESSAGE"));
				
				

				
				
				
				
				
				
				
				
				

			
			    }
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return address;
		    }

		    public void updateAddress(Address address) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("ADDRESS");
			try {
			    sql.setWhere("SIDO", address.getSido());
        	    sql.set("SIGUNGU", address.getSigungu());
			    sql.set("EMD", address.getEmd());
			    sql.set("RI", address.getRi());
			    sql.set("RECIPIENT", address.getRecipient());
			    sql.set("NAME", address.getName());
			    sql.set("PHONE", address.getPhone());
			    sql.set("MESSAGE", address.getMessage());
			 
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
		    }

		    public int deleteAddress(String code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("ADDRESS", "CODE=?").var(code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
		    }
		}


