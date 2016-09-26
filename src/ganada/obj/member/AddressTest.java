package ganada.obj.member;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ganada.core.DBTester;

public class AddressTest extends DBTester{
	public static Address AddressOrg;
	
	@BeforeClass
	public static void init(){
		AddressOrg = new Address();
		AddressOrg.setZipcode("1");
		AddressOrg.setSigungu("1");
		AddressOrg.setSido("1");
		AddressOrg.setEmd("1");
		AddressOrg.setRi("1");
		AddressOrg.setRecipient("1");
		AddressOrg.setName("1");
		AddressOrg.setPhone("1");
		AddressOrg.setMessage("1");	
	}
	
	@Test
	public void test() {
		AddressDao dao = AddressDao.getInstance();
		try {
		    dao.insert(AddressOrg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
