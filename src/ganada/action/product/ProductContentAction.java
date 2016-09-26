package ganada.action.product;

import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.*;

public class ProductContentAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		String pd_code = request.getParameter("pd_code");
		
		ProductDao productdao = ProductDao.getInstance();
		Product product = productdao.getProduct(pd_code);
				
		StockDao stockdao = StockDao.getInstance();
		Stock stock = stockdao.getStock(pd_code);
		
		ProductColorDao colordao = ProductColorDao.getInstance();
		ProductColor productcolor = colordao.getProductColor(stock.getC_code());
		List<ProductImage> productImageList = null;
		ProductImageDao imagedao = ProductImageDao.getInstance();
		productImageList = imagedao.getProductImageList(pd_code,productcolor.getC_code());
		//String im_path = ProductImage.getIm_path();
		
		ProductInfoDao productinfodao = ProductInfoDao.getInstance();
		ProductInfo productinfo1 = productinfodao.getProductInfo(product.getPd_infocode1());
		ProductInfo productinfo2 = productinfodao.getProductInfo(product.getPd_infocode2());
		ProductInfo productinfo3 = productinfodao.getProductInfo(product.getPd_infocode3());
		ProductInfo productinfo4 = productinfodao.getProductInfo(product.getPd_infocode4());
		
		StorageDao storagedao = StorageDao.getInstance();
		Storage storage = storagedao.getStorage(stock.getSt_code());
		
		//StringTokenizer pdImageSt = new StringTokenizer(im_path, "/");
			
		//request.setAttribute("pdImageSt", pdImageSt);
		//request.setAttribute("pd_code", pd_code);
		request.setAttribute("product", product);
		request.setAttribute("stock", stock);
		request.setAttribute("productcolor", productcolor);
		request.setAttribute("productImageList", productImageList);
		request.setAttribute("productinfo1", productinfo1);
		request.setAttribute("productinfo2", productinfo2);
		request.setAttribute("productinfo3", productinfo3);
		request.setAttribute("productinfo4", productinfo4);
		request.setAttribute("storage", storage);
		
		*/
		return "/jsp/product/pdp.jsp";
		//return "/jsp/product/productContent.jsp";
	}
}
