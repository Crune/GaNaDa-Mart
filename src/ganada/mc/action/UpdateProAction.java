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
		
//		String path = request.getRealPath("img/product");
//		String enc = "UTF-8";		
//		int maxSize = 1024*1024*5;	
//		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();	
//		MultipartRequest mr = new MultipartRequest(request, path, maxSize, enc, dp);
//		
//		String imageright = mr.getFilesystemName("imageright");
//		String imageleft = mr.getFilesystemName("imageleft");	
//		String imagebot = mr.getFilesystemName("imagebot");	
//		String imagetop = mr.getFilesystemName("imagetop");	
//		String image = mr.getFilesystemName("image");	
//		String imageback = mr.getFilesystemName("imageback");	
//		String colorimage = mr.getFilesystemName("colorimage");	
//		
//		File f = mr.getFile("image");
//		String type = mr.getContentType("image");	
//		type = type.split("/")[0];
//		if(!type.equals("image")){		
//			f.delete();					
//		}
		
		try{
		String pd_code = request.getParameter("pd_code");
		System.out.println(pd_code);	
		ProductDao dbPro = ProductDao.getInstance();
		Product product = (Product) dbPro.bind(request);
		/*
		product.setPd_name(request.getParameter("pd_name"));
		product.setPd_price(Integer.parseInt(request.getParameter("pd_price")));
		product.setPd_infocode1(request.getParameter("pd_infocode1"));
		product.setPd_infocode2(request.getParameter("pd_infocode2"));
		product.setPd_infocode3(request.getParameter("pd_infocode3"));
		product.setPd_infocode4(request.getParameter("pd_infocode4"));
		product.setPd_code(request.getParameter("pd_code"));
	 	*/
		dbPro.update(product);
		}catch(Exception e){e.printStackTrace();}
		return "/jsp/mc/pmc/updatePro.jsp";
	}

}
