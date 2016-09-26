package ganada.obj.member;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;

public class AccountDao extends DAO {

    private static AccountDao instance = new AccountDao();
    public static AccountDao getInstance() {
        return instance;
    }
    private AccountDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable(null, "ACCOUNT", "CODE", "REG_DATE", "MOD_DATE");
    		t.setCls("ganada.obj.member.Account");
    	}
		return t;
	}
	

    public Account getAccountLast(String id) throws Exception {
        DB db = new DB();
        Account acc = null;
        try {
            acc = (Account) select(getAccounts(id).get(0));
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
