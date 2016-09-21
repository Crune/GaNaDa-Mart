package ganada.action.product;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class ProductUpdateProAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		String path = request.getRealPath("img/product");
		String enc = "UTF-8";		
		int maxSize = 1024*1024*5;	
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();	
		MultipartRequest mr = new MultipartRequest(request, path, maxSize, enc, dp);
		
		String imageright = mr.getFilesystemName("imageright");
		String imageleft = mr.getFilesystemName("imageleft");	
		String imagebot = mr.getFilesystemName("imagebot");	
		String imagetop = mr.getFilesystemName("imagetop");	
		String image = mr.getFilesystemName("image");	
		String imageback = mr.getFilesystemName("imageback");	
		String colorimage = mr.getFilesystemName("colorimage");	
		
		File f = mr.getFile("image");
		String type = mr.getContentType("image");	
		type = type.split("/")[0];
		if(!type.equals("image")){		
			f.delete();					
		}
		
		Product product = new Product();
		product.setNum(Integer.parseInt(mr.getParameter("num")));
		product.setName(mr.getParameter("name"));
		product.setPrice(Integer.parseInt(mr.getParameter("price")));
		product.setDiscount(Integer.parseInt(mr.getParameter("discount")));
		product.setColor(mr.getParameter("color"));
		product.setColorcode(mr.getParameter("colorcode"));
		product.setColorimage(colorimage);
		product.setPd_size(mr.getParameter("pd_size"));
	 	product.setStock(Integer.parseInt(mr.getParameter("stock")));
	 	product.setStoread(mr.getParameter("storead"));
	 	product.setImage(imageright+"/"+imageleft+"/"+imagebot+"/"+imagetop+"/"+image+"/"+imageback);
	 	product.setInfo(mr.getParameter("info"));
	 	product.setDeliveryinfo(mr.getParameter("deliveryinfo"));
	 	product.setNote(mr.getParameter("note"));
	 	product.setAsinfo(mr.getParameter("asinfo"));
	 	product.setStar(1);
	 	product.setRecommend(1);
	 	
		ProductDao dbPro = ProductDao.getInstance();
		dbPro.updateProduct(product);
		
		return "/jsp/product/productUpdatePro.jsp";
	}
}
