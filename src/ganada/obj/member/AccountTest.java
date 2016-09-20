package ganada.obj.member;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DBTester;

public class AccountTest extends DBTester{
	public static Account account;

	@BeforeClass
	public static void init(){
	    account = new Account();

        account = new Account();
        account.setName("테스터");
        account.setInfo("");
        
        account.setEmail("test@test.com");
        account.setId("test");
        account.setPasswd("1234");
        
        account.setBirthday("1986-04-15");
        account.setLunisolar(1);
        account.setGender(1);

        account.setContact_call_code("");
        account.setPhone_call_code("");
        account.setSms_allow(1);
		
	}
	
	@Test
	public void test() {
		AccountDao dao = AccountDao.getInstance();
		try {
		    dao.insertAccount(account);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
