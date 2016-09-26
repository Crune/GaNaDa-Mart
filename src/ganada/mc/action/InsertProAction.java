package ganada.mc.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;
import ganada.obj.product.Product;

public class InsertProAction implements SuperAction{

	
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		String filename="";
		String realFolder="";
		String saveFolder="/img";
		//String path = request.getRealPath("img");
		int maxSize = 1024*1024*5; 
		String enc = "euc-kr";
		DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();
		
		ServletContext context = request.getSession().getServletContext();
		realFolder = context.getRealPath(saveFolder);
		MultipartRequest mr = new MultipartRequest(request,realFolder,maxSize,enc,dp);
		String im_name = mr.getFilesystemName("im_name");
		
		Product pd = new Product();
		String pd_code = mr.getParameter("pd_code");
		String menu_code = mr.getParameter("menu_code");
		String pd_name = mr.getParameter("pd_name");
		String pd_price = mr.getParameter("pd_price");
		String pd_infocode1 = mr.getParameter("pd_infocode1");
		String pd_infocode2 = mr.getParameter("pd_infocode2");
		String pd_infocode3 = mr.getParameter("pd_infocode3");
		String pd_infocode4 = mr.getParameter("pd_infocode4");
		
		return "/jsp/mc/pmc/insertPro.jsp";
	}

}
