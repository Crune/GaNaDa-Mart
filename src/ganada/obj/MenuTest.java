package ganada.obj;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MenuTest extends DBTester {
    public static Menu menuOrg;

    @BeforeClass
    public static void init() {
        menuOrg = new Menu();
    }

    @Ignore("test")
    @Test
    public void insert() {
        MenuDao dao = MenuDao.getInstance();

        menuOrg.setCode("M004");
        menuOrg.setName("테크플리스 컬렉션");
        menuOrg.setOrder_lv(2);
        menuOrg.setType(1);
        menuOrg.setUpper("0");

        try {
            dao.insertMenu(menuOrg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @Test
    public void test() {
        MenuDao dao = MenuDao.getInstance();

        List<Menu> curList = new ArrayList<Menu>();

        try {
            curList = dao.getChild("0");
            Collections.sort(curList, new MenuCompare());
            
            for (Menu menu : curList) {
                System.out.println("1D:" + menu.getName());
                
                List<Menu> curList2 = dao.getChild(menu.getCode());                  
                Collections.sort(curList2, new MenuCompare());           
                for (Menu menu2 : curList2) {
                    if (menu2.getType() == Menu.TYPE_EVENT)
                        System.out.print("\t2DE:");
                    else 
                        System.out.print("\t2DN:");
                    System.out.println(menu2.getName());

                    List<Menu> curList3 = dao.getChild(menu2.getCode());                  
                    Collections.sort(curList3, new MenuCompare());           
                    for (Menu menu3 : curList3) {
                        System.out.println("\t\t3D:" + menu3.getName());
                    }
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
