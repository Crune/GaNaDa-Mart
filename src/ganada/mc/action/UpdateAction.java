package ganada.mc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

@MCAction("productUpdate")
@MCMenu("상품수정")
public class UpdateAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try{String pd_code = request.getParameter("pd_code");
		ProductDao dbPro = ProductDao.getInstance();
		Product product = (Product)dbPro.select(pd_code);
		
		request.setAttribute("product", product);
		}catch(Exception e){e.printStackTrace();}		
		
		return "/jsp/mc/pmc/update.jsp";
	}

}
