package ganada.tag;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.tagext.TagSupport;

import ganada.obj.Menu;
import ganada.obj.MenuDao;

public class GetChild extends TagSupport {

    private static final long serialVersionUID = 1L;
    private String code;
    private String type;

    public void setCode(String code) {
        this.code = code;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public int doStartTag() {
        
        MenuDao dao = MenuDao.getInstance();
        List<Menu> result = new ArrayList<Menu>();

        try {
            List<Menu> curList = dao.getChild(code);
            if (curList != null) {
                for (Menu cur : curList) {
                    if (type.equals("1")) {
                        if (cur.getType() == 1) result.add(cur);
                    } else {
                        if (cur.getType() == 0) result.add(cur);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        pageContext.setAttribute("ChildMenu", result);

        return EVAL_BODY_INCLUDE;
    }

}