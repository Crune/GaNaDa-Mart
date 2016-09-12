package ganada.obj;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest extends DBTester{
	public static Account accountOrg;

	@BeforeClass
	public static void init(){
		accountOrg = new Account();
		accountOrg.setName("dsadf");
		accountOrg.setEmail("jbh");
		accountOrg.setId("bmw");
		accountOrg.setPasswd("saff");
		accountOrg.setBirthday(84);
		accountOrg.setBirthday1(02);
		accountOrg.setBirthday2(15);
		accountOrg.setLunisolar(2);
		accountOrg.setGender(1);
		accountOrg.setContact(02);
		accountOrg.setContact1(903);
		accountOrg.setContact2(9365);
		accountOrg.setPhone(010);
		accountOrg.setPhone1(8822);
		accountOrg.setPhone2(5446);
		accountOrg.setSms_check(1);
		accountOrg.setPasswd_phone(1088220880);
		accountOrg.setSecurity(1);
	
		
	}
	
	@Test
	public void test() {
		AccountDao dao = AccountDao.getInstance();
		try {
		    dao.insertAccount(accountOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
