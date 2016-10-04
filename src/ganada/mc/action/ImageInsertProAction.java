package ganada.mc.action;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.ItemReview;
import ganada.obj.product.ItemReviewDao;
import ganada.obj.product.ProductImage;
import ganada.obj.product.ProductImageDao;

public class ImageInsertProAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String filename="";
		String realFolder="";
		String saveFolder="/img";
		//String path = request.getRealPath("img");
		int maxSize = 1024*1024*10; 
		String enc = "UTF-8";
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();
		String im_name="";
		ServletContext context = request.getSession().getServletContext();
		realFolder = context.getRealPath(saveFolder);
		MultipartRequest mr = new MultipartRequest(request,realFolder,maxSize,enc,dp);
		//String im_name = mr.getFilesystemName("product_image");
		Enumeration params = mr.getParameterNames();
		while(params.hasMoreElements()){
		filename = (String)params.nextElement();
		String orgname  = mr.getOriginalFileName(filename);
		im_name=mr.getFilesystemName("filename");
		
		}
		ProductImage Image = new ProductImage();
		//String im_code = mr.getParameter("im_code");
		String pd_code = mr.getParameter("pd_code");
		String im_order = mr.getParameter("im_order");
		String pd_name = mr.getParameter("pd_name");
		

		
		Image.setIm_name(im_name);
        System.out.println(Image.toString());
		ProductImageDao  dao = ProductImageDao.getInstance();
		dao.insert(Image);
		
		
		request.setAttribute("pd_code", pd_code);
		request.setAttribute("im_name", im_name);
		
	
	
	return "/jsp/mc/pmc/imageInsertPro.jsp";
	}

}
