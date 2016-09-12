package ganada.obj;

import java.util.Comparator;

public class MenuCompare implements Comparator<Menu> {
    @Override
    public int compare(Menu arg0, Menu arg1) {
        if (arg0.getType() < arg1.getType()) {
            return 1;
        } else if (arg0.getType() > arg1.getType()) {
            return -1;
        } else if (arg0.getOrder_lv() < arg1.getOrder_lv()) {
            return -1;
        } else if (arg0.getOrder_lv() > arg1.getOrder_lv()) {
            return 1;
        } else {
            return 0;
        }
    }

}
