package ganada.mc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ganada.action.common.SuperAction;
import ganada.obj.product.ProductInfo;
import ganada.obj.product.ProductInfoDao;

public class InsertAction implements SuperAction {
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "/jsp/mc/pmc/insert.jsp";
	}

}
