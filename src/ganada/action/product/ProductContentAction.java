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

    
    private String price=""; // 원래 가격
    private String sale=""; // 판매 가격
    private String mark=""; // 평가점수
    private String review=""; // 리뷰 갯수

    private Product org; // 상품 명 및 가격
    private ProductCatalog pCat; // 분류 정보    
    private List<ProductColor> pColos; // 색상명(및 코드) 목록
    private Map<String,ProductImage> pImages; // 색상별 이미지 목록
    private Map<String, Stock> pStocks; // 색상별 재고 목록
    
    private List<ProductInfo> pInfos; // 추가설명 목록

    @SuppressWarnings("unchecked")
    public void set(String pd_code) {
        ProductDao pDao = ProductDao.getInstance();
        ProductCatalogDao catDao = ProductCatalogDao.getInstance(); 
        ProductColorDao cDao = ProductColorDao.getInstance();
        ProductImageDao imgDao = ProductImageDao.getInstance();
        StockDao stockDao = StockDao.getInstance();
        ProductInfoDao pInfoDao = ProductInfoDao.getInstance();
        try {
            org = (Product) pDao.select(pd_code);
            pCat = (ProductCatalog) catDao.select(org.getMenu_code());
            
            pColos = (List<ProductColor>) cDao.search("pd_code", pd_code);    
            pImages = imgDao.mapColorImg(pd_code);
            pStocks = stockDao.mapColorStock(pd_code);
            
            pInfos = pInfoDao.getInfos(org);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String pd_code = request.getParameter("code");
        request.setAttribute("pd_code", pd_code);
        
        set(pd_code);

        request.setAttribute("pdp_product", org);
        request.setAttribute("pdp_catalog", pCat);
        request.setAttribute("pdp_colors", pColos);
        request.setAttribute("pdp_images", pImages);
        request.setAttribute("pdp_stocks", pStocks);
        request.setAttribute("pdp_infos", pInfos);

        return "/jsp/product/pdp.jsp";
    }
}
