package ganada.action.product;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class ProductInsertProAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 	request.setCharacterEncoding("UTF-8");
		 	
			String path = request.getRealPath("img/product");
			String enc = "UTF-8";		
			int maxSize = 1024*1024*5;	
			DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();	
			MultipartRequest mr = new MultipartRequest(request, path, maxSize, enc, dp);
			
			//String orgName1 = mr.getOriginalFileName("image");	//이미지원본이름
			String image = mr.getFilesystemName("image");	
			//String orgName2 = mr.getOriginalFileName("colorimage");	
			String colorimage = mr.getFilesystemName("colorimage");	
			
			File f = mr.getFile("image");
			String type = mr.getContentType("image");	
			type = type.split("/")[0];
			if(!type.equals("image")){		
				f.delete();					
			}
			
			//String price = request.getParameter("price");
			//String price = request.getParameter("discount");
			
			Product article = new Product();
		 	//article.setNum(Integer.parseInt(request.getParameter("num")));
			article.setName(request.getParameter("name"));
		 	article.setPrice(Integer.parseInt(request.getParameter("price")));
		 	article.setDiscount(Integer.parseInt(request.getParameter("discount")));
		 	article.setColor(request.getParameter("color"));
		 	article.setColorcode(request.getParameter("colorcode"));
		 	article.setColorimage(colorimage);
		 	article.setPd_size(request.getParameter("pd_size"));
		 	article.setStock(Integer.parseInt(request.getParameter("stock")));
		 	article.setStoread(request.getParameter("storead"));
		 	article.setImage(image);
		 	article.setInfo(request.getParameter("info"));
		 	article.setDeliveryinfo(request.getParameter("deliveryinfo"));
		 	article.setNote(request.getParameter("note"));
		 	article.setAsinfo(request.getParameter("asinfo"));
		 	article.setStar(Integer.parseInt(request.getParameter("star")));
		 	article.setRecommend(Integer.parseInt(request.getParameter("recommend")));
		 	article.setPasswd(request.getParameter("passwd"));
			
		 	ProductDao dbPro = ProductDao.getInstance();
		 	dbPro.insertProduct(article);
		 	
			
		//	request.setAttribute("image", image);
		//	request.setAttribute("orgName1", orgName1);
		//	request.setAttribute("colorimage", colorimage);
		//	request.setAttribute("orgName2", orgName2);
		//	request.setAttribute("path", path);		//경호롹인
		
		return "/jsp/product/productInsertPro.jsp";
	}
}
