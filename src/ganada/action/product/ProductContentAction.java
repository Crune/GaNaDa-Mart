package ganada.action.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.*;

public class ProductContentAction implements SuperAction {

    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String pd_code = request.getParameter("code");
        request.setAttribute("pd_code", pd_code);
        
        ProductJoin p = new ProductJoin(pd_code);
        request.setAttribute("curProduct", p);

        return "/jsp/product/pdp.jsp";
    }
}
