package ganada.obj.product;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class ProductService {    
    
    public ProductCatalog pCat; // 분류 정보
    
    public Product org;
    
    public String price=""; // 원래 가격
    public String sale=""; // 판매 가격
    public String mark=""; // 평가점수
    public String review=""; // 리뷰 갯수
    
    public List<ProductColor> pColos; // 색상명(및 코드) 목록
    public Map<ProductColor, ProductImage> pImages; // 색상별 이미지 목록
    public Map<ProductColor, Stock> pStocks; // 색상별 재고 목록
    
    public List<ProductInfo> pInfos; // 추가설명 목록
    
}
