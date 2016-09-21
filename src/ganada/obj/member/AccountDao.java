package ganada.obj.member;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;

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
            sql.in("INFO", account.getInfo());
            
            sql.in("EMAIL", account.getEmail());
            sql.in("ID", account.getId());
            sql.in("PASSWD", account.getPasswd());
            
            sql.in("BIRTH", account.getBirthday());
            sql.in("LUNISOLAR", account.getLunisolar());            
            sql.in("GENDER", account.getGender());
            
            sql.in("CONTACT", account.getContact_call_code());
            sql.in("PHONE", account.getPhone_call_code());
            sql.in("SMS_ALLOW", account.getSms_allow());
            
            sql.in("MILE", account.getMile());
            
            sql.in("INFO_STORE_TERM", account.getInfo_store_term());
            
            sql.inSql("REG_DATE", "sysdate");
            sql.inSql("MOD_DATE", "sysdate");
            sql.run();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public Account getAccount(String code) throws Exception {
        DB db = new DB();
        Account account = null;
        try {
            db.S("*", "ACCOUNT", "CODE=?").var(code).exe();
            if (db.next()) {
                account = new Account();
                account.setCode(db.getString("CODE"));
                account.setName(db.getString("NAME"));
                account.setInfo(db.getString("INFO"));
                
                account.setEmail(db.getString("EMAIL"));
                account.setId(db.getString("ID"));
                account.setPasswd(db.getString("PASSWD"));

                account.setBirthday(db.getTimestamp("BIRTH"));
                account.setLunisolar(db.getInt("LUNISOLAR"));
                account.setGender(db.getInt("GENDER"));

                account.setContact_call_code(db.getString("CONTACT"));
                account.setPhone_call_code(db.getString("PHONE"));
                account.setSms_allow(db.getInt("SMS_ALLOW"));
                
                account.setReg_date(db.getTimestamp("REG_DATE"));
                account.setMod_date(db.getTimestamp("MOD_DATE"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return account;
    }

    public Account getAccountLast(String id) throws Exception {
        DB db = new DB();
        Account acc = null;
        try {
            acc = getAccount(getAccounts(id).get(0));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return acc;
    }
    
    public List<String> getAccounts(String id) throws Exception {
        DB db = new DB();
        List<String> result = new ArrayList<String>();
        try {
            db.S("*", "ACCOUNT", "ID=?","REG_DATE DESC").var(id).exe();
            while (db.next()) {
                result.add(db.getString("CODE"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return result;
    }

    public void updateAccount(Account account) throws Exception {
        DB db = new DB();
        DB.Update sql = db.new Update("ACCOUNT");
        try {
            sql.setWhere("CODE", account.getCode());
            sql.set("NAME", account.getName());
            sql.set("INFO", account.getInfo());
            
            sql.set("EMAIL", account.getEmail());
            sql.set("ID", account.getId());
            sql.set("PASSWD", account.getPasswd());
            
            sql.set("BIRTH", account.getBirthday());
            sql.set("LUNISOLAR", account.getLunisolar());            
            sql.set("GENDER", account.getGender());
            
            sql.set("CONTACT", account.getContact_call_code());
            sql.set("PHONE", account.getPhone_call_code());
            sql.set("SMS_ALLOW", account.getSms_allow());
            
            sql.set("MILE", account.getMile());
            
            sql.set("INFO_STORE_TERM", account.getInfo_store_term());
            
            sql.setSql("MOD_DATE", "sysdate");
            sql.run();
            
            sql.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public int deleteAccount(String code) throws Exception {
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

    public int userCheck(String id, String passwd) throws Exception {
        DB db = new DB();
        int x = -1;
        try {
            db.S("PASSWD", "ACCOUNT", "id=?").var(id).exe();
            if (db.next()) {
                String dst = db.exe().getString("passwd");
                x = DB.isSame(passwd, dst) ? 1 : 0;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return x;
    }
}
