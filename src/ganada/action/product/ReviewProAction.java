package ganada.action.product;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.ItemReview;

public class ReviewProAction implements SuperAction {


	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String path = request.getRealPath("img");
		int maxSize = 1024*1024*5; 
		String enc = "euc-kr";
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();
		MultipartRequest mr = new MultipartRequest(request,path,maxSize,enc,dp);
		String orgName = mr.getOriginalFileName("review_image");
		String sysName = mr.getFilesystemName("review_image");
		File f = mr.getFile("review_image");
		String type = mr.getContentType("review_image");
		type = type.split("/")[0];
		System.out.println(type);
		if(!type.equals("image")){
			f.delete();
		}
		
		request.setAttribute("sysName", sysName);
	try{
		ItemReview review = new ItemReview();
		review.setStar(Integer.parseInt(request.getParameter("star")));
		review.setItemsize(request.getParameter("itemsize"));
		review.setSiz(Integer.parseInt(request.getParameter("siz")));
		review.setWei(request.getParameter("wei"));
		review.setComfortable(Integer.parseInt(request.getParameter("comfortable")));
		review.setHei(request.getParameter("hei"));
		review.setWid(Integer.parseInt(request.getParameter("wid")));
		review.setAge(request.getParameter("age"));
		review.setDura(Integer.parseInt(request.getParameter("dura")));
		review.setSubject(request.getParameter("subject"));
		review.setContent(request.getParameter("content"));
	
	}catch(Exception e){e.printStackTrace();}
		return "/jsp/review/reviewPro.jsp";
	}

}
