package ganada.action.product;
import java.io.File;
import java.sql.Timestamp;
import java.util.Enumeration;

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
		String path = request.getRealPath("img");
		int maxSize = 1024*1024*5; 
		String enc = "euc-kr";
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();
		MultipartRequest mr = new MultipartRequest(request,path,maxSize,enc,dp);
		
		Enumeration<?> files = mr.getFileNames();
		
		while(files.hasMoreElements()){
			
			String name = (String)files.nextElement();//input태그 file속성을 가진 태그의 파라미터 
			filename = mr.getFilesystemName(name);//서버에 저장된 파일 이름
			
		}
	
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
	
		System.out.println(wid);
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
		review.setReg_date(new Timestamp(System.currentTimeMillis()));
		
		ItemReviewDao  ird = ItemReviewDao.getInstance();
		ird.insert(review);
		
		request.setAttribute("itemnum", itemnum);
		return "/jsp/review/reviewPro.jsp";
	}

}
