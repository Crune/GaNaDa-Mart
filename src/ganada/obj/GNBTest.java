package ganada.obj;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.geom.CubicCurve2D;

public class GNBTest extends DBTester {
	public static GNB gnbOrg;

	@BeforeClass
	public static void init() {
		gnbOrg = new GNB();
	}

	@Test
	public void test() {
		GNBDao dao = GNBDao.getInstance();
		
		List<GNB> gnbList = new ArrayList<GNB>();
		
		try {
			gnbList = dao.getMenu();
			
			for(GNB cur1 : gnbList) {
				if(cur1.getUpper().equals("0")){	
					String step1=cur1.getId();	
					System.out.println(cur1.getName()+cur1.getId());
					for(GNB cur2 : gnbList) {
						if(cur2.getUpper().equals(step1)){
							String step2=cur2.getId();	
							System.out.println("\t"+cur2.getName()+cur2.getId());
							for(GNB cur3 : gnbList) {
								if(cur3.getUpper().equals(step2)){
									System.out.println("\t\t"+cur3.getName()+cur3.getId());
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
