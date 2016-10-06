package ganada.obj.member;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ganada.core.DBTester;

public class AccountTest extends DBTester{
	public static Account account;

	@BeforeClass
	public static void init(){
	    account = new Account();

        account = new Account();
        account.setName("test2");
        account.setInfo("");
        
        account.setEmail("test55@test.com");
        account.setId("test");
        account.setPasswd("123123");
        
        account._setBirth("2002-01-01");
        account.setLunisolar(0);
        account.setGender(0);

        account.setContact("");
        account.setPhone("");
        account.setSms_allow(1);
		
	}

	@Test
	public void test() {
		AccountDao dao = AccountDao.getInstance();
		try {
		    dao.insert(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
