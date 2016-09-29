package ganada.action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.core.DAO;
import ganada.obj.product.ItemReview;
import ganada.obj.product.ItemReviewDao;

public class ReviewFormAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try{
			String itemnum = request.getParameter("itemnum");
			ItemReviewDao Pro = ItemReviewDao.getInstance();
			//ItemReview review = (ItemReview)Pro.getMember(itemnum);
		//request.setAttribute("review", review);
		}catch(Exception e){ e.printStackTrace();}
		
		return "/jsp/review/reviewForm.jsp";
	}

}
