package ganada.obj.product;

import java.util.List;
import java.util.Map;

public class ProductJoin {


	private static final ProductDao pDao = ProductDao.getInstance();
	private static final ProductCatalogDao catDao = ProductCatalogDao.getInstance(); 

	private static final ProductReviewDao rDao = ProductReviewDao.getInstance();	
	
	private static final ProductColorDao cDao = ProductColorDao.getInstance();
	private static final ProductImageDao imgDao = ProductImageDao.getInstance();
	private static final StockDao stockDao = StockDao.getInstance();
	
	private static final ProductInfoDao pInfoDao = ProductInfoDao.getInstance();
	

    private Product product; // 상품 명 및 가격
    private ProductCatalog catalog; // 분류 정보    

    private List<ProductReview> reviews; // 상품 리뷰
    
    private List<ProductColor> colos; // 색상명(및 코드) 목록
    private Map<String,ProductImage> images; // 색상별 이미지 목록
    private Map<String, Stock> stocks; // 색상별 재고 목록
    
    private List<ProductInfo> infos; // 추가설명 목록

    public ProductJoin(String pd_code) {
    	init(pd_code);
    }

    public ProductJoin() {
    }
    
    @SuppressWarnings("unchecked")
	public void init(String pd_code) {
        try {
        	product = (Product) pDao.select(pd_code);
        	catalog = (ProductCatalog) catDao.select(product.getMenu_code());

            reviews = (List<ProductReview>) rDao.search("PD_CODE", pd_code); // 상품 리뷰
            
        	colos = (List<ProductColor>) cDao.search("PD_CODE", pd_code);    
        	images = imgDao.mapColorImg(pd_code);
        	stocks = stockDao.mapColorStock(pd_code);
            
        	infos = pInfoDao.getInfos(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductCatalog getCatalog() {
		return catalog;
	}

	public void setCatalog(ProductCatalog catalog) {
		this.catalog = catalog;
	}

	public List<ProductReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews) {
		this.reviews = reviews;
	}

	public List<ProductColor> getColos() {
		return colos;
	}

	public void setColos(List<ProductColor> colos) {
		this.colos = colos;
	}

	public Map<String, ProductImage> getImages() {
		return images;
	}

	public void setImages(Map<String, ProductImage> images) {
		this.images = images;
	}

	public Map<String, Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Map<String, Stock> stocks) {
		this.stocks = stocks;
	}

	public List<ProductInfo> getInfos() {
		return infos;
	}

	public void setInfos(List<ProductInfo> infos) {
		this.infos = infos;
	}
    


}
