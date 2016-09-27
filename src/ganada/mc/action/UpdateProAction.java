package ganada.mc.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class UpdateProAction implements SuperAction{

	
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
		product.setPd_code(mr.getParameter("pd_code"));
		product.setMenu_code(mr.getParameter("menu_code"));
		product.setPd_name(mr.getParameter("pd_name"));
		product.setPd_price(Integer.parseInt(mr.getParameter("pd_price")));
		product.setPd_infocode1(mr.getParameter("pd_infocode1"));
		product.setPd_infocode2(mr.getParameter("pd_infocode2"));
		product.setPd_infocode3(mr.getParameter("pd_infocode3"));
		product.setPd_infocode4(mr.getParameter("pd_infocode4"));
//		product.setColorcode(mr.getParameter("colorcode"));
//		product.setColorimage(colorimage);
//		product.setPd_size(mr.getParameter("pd_size"));
//	 	product.setStock(Integer.parseInt(mr.getParameter("stock")));
//	 	product.setStoread(mr.getParameter("storead"));
//	 	product.setImage(imageright+"/"+imageleft+"/"+imagebot+"/"+imagetop+"/"+image+"/"+imageback);
//	 	product.setInfo(mr.getParameter("info"));
//	 	product.setDeliveryinfo(mr.getParameter("deliveryinfo"));
//	 	product.setNote(mr.getParameter("note"));
//	 	product.setAsinfo(mr.getParameter("asinfo"));
//	 	product.setStar(1);
//	 	product.setRecommend(1);
	 	
		ProductDao dbPro = ProductDao.getInstance();
		dbPro.update(product);
		return null;
	}

}
