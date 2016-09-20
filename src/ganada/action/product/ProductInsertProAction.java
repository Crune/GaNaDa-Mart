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
			String imageright = mr.getFilesystemName("imageright");
			String imageleft = mr.getFilesystemName("imageleft");	
			String imagebot = mr.getFilesystemName("imagebot");	
			String imagetop = mr.getFilesystemName("imagetop");	
			String image = mr.getFilesystemName("image");	
			String imageback = mr.getFilesystemName("imageback");	
			//String orgName2 = mr.getOriginalFileName("colorimage");	
			String colorimage = mr.getFilesystemName("colorimage");	
			
			File f = mr.getFile("image");
			String type = mr.getContentType("image");	
			type = type.split("/")[0];
			if(!type.equals("image")){		
				f.delete();					
			}
			
			Product article = new Product();
		 	//article.setNum(Integer.parseInt(request.getParameter("num")));
			article.setName(mr.getParameter("name"));
		 	article.setPrice(Integer.parseInt(mr.getParameter("price")));
		 	article.setDiscount(Integer.parseInt(mr.getParameter("discount")));
		 	article.setColor(mr.getParameter("color"));
		 	article.setColorcode(mr.getParameter("colorcode"));
		 	article.setColorimage(colorimage);
		 	article.setPd_size(mr.getParameter("pd_size"));
		 	article.setStock(Integer.parseInt(mr.getParameter("stock")));
		 	article.setStoread(mr.getParameter("storead"));
		 	//String i = imageright+"/"+imageleft+"/"+imagebot+"/"+imagetop+"/"+image+"/"+imageback;
		 	article.setImage(imageright+"/"+imageleft+"/"+imagebot+"/"+imagetop+"/"+image+"/"+imageback);
		 	article.setInfo(mr.getParameter("info"));
		 	article.setDeliveryinfo(mr.getParameter("deliveryinfo"));
		 	article.setNote(mr.getParameter("note"));
		 	article.setAsinfo(mr.getParameter("asinfo"));
		 	//article.setStar(Integer.parseInt(mr.getParameter("star")));		별점 추가할땐 없어도됨
		 	//article.setRecommend(Integer.parseInt(mr.getParameter("recommend")));	추천수 추가할땐 없어도됨
		 	article.setPasswd(mr.getParameter("passwd"));
			
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
