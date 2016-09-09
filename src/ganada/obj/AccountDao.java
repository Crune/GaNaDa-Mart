package ganada.obj;

import ganada.core.*;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

public class AccountDao {

	private static AccountDao instance = new AccountDao();

	public static AccountDao getInstance() {
		return instance;
	}

	private AccountDao() {
	}
	 public void insertAccount(Account account) throws Exception {
			DB db = new DB();
			DB.Insert sql = db.new Insert("ACCOUNT");
			try {
			    sql.inSql("CODE", "ACCOUNT_SEQ.NEXTVAL");
			    sql.in("NAME", account.getName());
			    sql.in("EMAIL", account.getEmail());
			    sql.in("PASSWD", account.getPasswd());
			    			    sql.in("birthday", account.getBirthday());
			    sql.in("birthday1", account.getBirthday1());
			    sql.in("birthday2", account.getBirthday2());
			    sql.in("lunisolar", account.getLunisolar());
			    sql.in("gender", account.getGender());
			    sql.in("contact", account.getContact());
			    sql.in("contact1", account.getContact1());
			    sql.in("contact2", account.getContact2());
			    sql.in("Phone", account.getPhone());
			    sql.in("Phone1", account.getPhone1());
			    sql.in("Phone2", account.getPhone2());
			    sql.in("sms_check", account.getSms_check());
			    sql.in("passwd_phone", account.getPasswd_phone());
			    sql.in("security", account.getSecurity());
			    sql.inSql("REG_DATE", "sysdate");
			    sql.run();
			   
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
		    }

		    public Account getaccount(String code) throws Exception {
			DB db = new DB();
			Account account = null;
			try {
			    db.S("*", "BANNER", "CODE=?").var(code).exe();
			    if (db.next()) {
				account = new Account();
				account.setName(db.getString("NAME"));
				account.setEmail(db.getString("EMAIL"));
				account.setPasswd(db.getString("PASSWD"));
				account.setBirthday(db.getString("BIRTHDAY"));
				account.setBirthday1(db.getString("BIRTHDAY1"));
				account.setBirthday2(db.getString("BIRTHDAY2"));
				account.setLunisolar(db.getInt("LUNISOLAR"));
				account.setGender(db.getString("GENDER"));
				account.setContact(db.getString("CONTACT"));
				account.setContact1(db.getString("CONTACT1"));
				account.setContact2(db.getString("CONTACT2"));
				account.setPhone(db.getString("PHONE"));
				account.setPhone1(db.getString("PHONE1"));
				account.setPhone2(db.getString("PHONE2"));
				account.setSms_check(db.getString("SMS_CHECK"));
				account.setPasswd_phone(db.getString("PASSWD_PHONE"));
				account.setSecurity(db.getInt("SECURITY"));
				
				
				
				
				
				
				
				
				
				
				account.setReg_date(db.getTimestamp("reg_date"));
			    }
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return account;
		    }

		    public void updateAccount(Account account) throws Exception {
			DB db = new DB();
			DB.Update sql = db.new Update("BANNER");
			try {
			    sql.setWhere("CODE", account.getCode());
        	    sql.set("NAME", account.getName());
			    sql.set("EMAIL", account.getEmail());
			    sql.set("PASSWD", account.getPasswd());
			    sql.set("BIRTHDAY", account.getBirthday());
			    sql.set("BIRTHDAY1", account.getBirthday1());
			    sql.set("BIRTHDAY2", account.getBirthday2());
			    sql.set("LUNISOLAR", account.getLunisolar());
			    sql.set("GENDER", account.getGender());
			    sql.set("CONTACT", account.getContact());
			    sql.set("CONTACT1", account.getContact1());
			    sql.set("CONTACT2", account.getContact2());
			    sql.set("PHONE", account.getPhone());
			    sql.set("PHONE1", account.getPhone1());
			    sql.set("PHONE2", account.getPhone2());
			    sql.set("SMS_CHECK", account.getSms_check());
			    sql.set("PASSWD_PHONE", account.getPasswd_phone());
			    sql.set("SECURITY", account.getSecurity());
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    sql.run();
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
		    }

		    public int deleteBanner(String code) throws Exception {
			DB db = new DB();
			int x = -1;
			try {
			    db.D("ACCOUNT", "CODE=?").var(code).exe();
			    x = 1;
			} catch (Exception e) {
			    e.printStackTrace();
			} finally {
			    db.finalize();
			}
			return x;
		    }
		}
