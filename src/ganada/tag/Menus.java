package ganada.tag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import ganada.obj.*;

public class Menus {

    public HashMap<String, String> getChild(String code, Integer type) {
        MenuDao dao = MenuDao.getInstance();
        HashMap<String, String> result = new HashMap<String, String>();
        List<Menu> curList = new ArrayList<Menu>();
        try {
                curList = dao.getChild(code);                  
                Collections.sort(curList, new MenuCompare());           
                for (Menu menu : curList) {
                    if (menu.getType() == type)
                        result.put(menu.getCode(), menu.getName());
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
}
