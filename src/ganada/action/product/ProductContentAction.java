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

        ProductDao pDao = ProductDao.getInstance();
        Product product = (Product) pDao.select(pd_code);

        ProductColorDao colordao = ProductColorDao.getInstance();
        List colors = colordao.search(pd_code);

        ProductImageDao imgDao = ProductImageDao.getInstance();
        Map<String, ProductImage> pImgs = imgDao.mapColorImg(pd_code);
        /*
        for (String color : pImgs.keySet()) {
            ProductImage cur = pImgs.get(color);
        }
        */

        StockDao stockDao = StockDao.getInstance();
        Map<String, Stock> stocks = stockDao.mapColorStock(pd_code);
        /*
        for (String color : stocks.keySet()) {
            Stock cur = stocks.get(color);
        }
        */

        ProductInfoDao pInfoDao = ProductInfoDao.getInstance();
        List infos = pInfoDao.select(pd_code, pd_code);

        request.setAttribute("pdp_product", product);
        request.setAttribute("pdp_colors", colors);
        request.setAttribute("pdp_stocks", stocks);
        request.setAttribute("pdp_infos", infos);

        return "/jsp/product/pdp.jsp";
    }
}
