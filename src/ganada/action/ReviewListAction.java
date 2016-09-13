package ganada.action;
import java.util.List;
import ganada.obj.ItemReview;
import ganada.obj.ItemReviewDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReviewListAction implements SuperAction {

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ItemReview> reviewLists ;
		int itemnum = Integer.parseInt(request.getParameter("itemnum"));
		System.out.println("ReviewListAction.GETNUM:"+itemnum);
		ItemReviewDao reviewProcess = ItemReviewDao.getInstance();
		int count = reviewProcess.getArticleCount(itemnum);
		if( count > 0){
			reviewLists = reviewProcess.getArticles(count, itemnum);
			request.setAttribute("reviewLists", reviewLists);
		}
		request.setAttribute("itemnum", new Integer(itemnum));
		request.setAttribute("count", new Integer(count));
		return "/jsp/review/reviewList.jsp";
	}

}
