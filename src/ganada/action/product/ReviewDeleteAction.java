package ganada.action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ItemReviewDao;

public class ReviewDeleteAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		ItemReviewDao review = ItemReviewDao.getInstance();
		int check = review.deleteArticle(num);
		
		request.setAttribute("check", new Integer(check));
		return "/review/reviewdelete.jsp";
	}

	
}
