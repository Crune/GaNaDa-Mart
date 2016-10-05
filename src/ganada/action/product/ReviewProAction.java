package ganada.action.product;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductReview;
import ganada.obj.product.ProductReviewDao;
public class ReviewProAction implements SuperAction {

	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String realFolder="";
		String saveFolder="/img";
		int maxSize = 1024*1024*5; 
		String enc = "UTF-8";
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();
		
		ServletContext context = request.getSession().getServletContext();
		realFolder = context.getRealPath(saveFolder);
		MultipartRequest mr = new MultipartRequest(request,realFolder,maxSize,enc,dp);
		String sysName = mr.getFilesystemName("review_image");

        ProductReviewDao dao = ProductReviewDao.getInstance();
        ProductReview review = (ProductReview) dao.bind(mr);
		review.setRv_img(sysName);
		dao.insert(review);

        response.sendRedirect("pdp.gnd?code="+review.getPd_code());
		return null;
	}

}
