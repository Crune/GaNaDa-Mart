package ganada.obj.product;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class RProduct {    
    
    private ProductCatalog pCat; // 분류 정보
    
    private Product org;
    
    private String price=""; // 원래 가격
    private String sale=""; // 판매 가격
    private String mark=""; // 평가점수
    private String review=""; // 리뷰 갯수
    
    private List pColos; // 색상명(및 코드) 목록
    private Map pImages; // 색상별 이미지 목록
    private Map pStocks; // 색상별 재고 목록
    
    private List pInfos; // 추가설명 목록
    
    public void init(String pd_code) throws Exception {
        ProductDao pDao = ProductDao.getInstance();
        org = (Product) pDao.select(pd_code);

        ProductColorDao cDao = ProductColorDao.getInstance();
        pColos = cDao.search("pd_code", pd_code);

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
    }
    
}
