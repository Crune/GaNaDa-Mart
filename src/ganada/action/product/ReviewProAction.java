package ganada.action.product;
import java.io.File;
import java.sql.Timestamp;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.ItemReview;
import ganada.obj.product.ItemReviewDao;
public class ReviewProAction implements SuperAction {

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String filename="";
		String realFolder="";
		String saveFolder="/img";
		//String path = request.getRealPath("img");
		int maxSize = 1024*1024*5; 
		String enc = "UTF-8";
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();
		
		ServletContext context = request.getSession().getServletContext();
		realFolder = context.getRealPath(saveFolder);
		MultipartRequest mr = new MultipartRequest(request,realFolder,maxSize,enc,dp);
		String sysName = mr.getFilesystemName("review_image");
	
		ItemReview review = new ItemReview();
		String star = mr.getParameter("star");
		String itemsize = mr.getParameter("itemsize");
		String itemnum = mr.getParameter("itemnum");
		String itemname = mr.getParameter("itemname");
		String writer = mr.getParameter("writer");
		String siz = mr.getParameter("siz");
		String wei = mr.getParameter("wei");
		String comfortable = mr.getParameter("comfortable");
		String hei = mr.getParameter("hei");
		String wid = mr.getParameter("wid");
		String age = mr.getParameter("age");
		String dura = mr.getParameter("dura");
		String subject = mr.getParameter("subject");
		String content = mr.getParameter("content");

		review.setItemnum(itemnum);
		review.setItemname(itemname);
		review.setWriter(writer);
		review.setStar(Integer.parseInt(star));
		review.setItemsize(itemsize);
		review.setSiz(Integer.parseInt(siz));
		review.setWei(wei);
		review.setComfortable(Integer.parseInt(comfortable));
		review.setHei(hei);
		review.setWid(Integer.parseInt(wid));
		review.setAge(age);
		review.setDura(Integer.parseInt(dura));
		review.setSubject(subject);
		review.setContent(content);
		review.setImg(sysName);
        System.out.println(review.toString());
		ItemReviewDao  ird = ItemReviewDao.getInstance();
		ird.insert(review);
		
		
		request.setAttribute("itemnum", itemnum);
		request.setAttribute("sysName", sysName);
		return "/jsp/review/reviewPro.jsp";
	}

}
