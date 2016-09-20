package ganada.action.product;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import ganada.action.common.SuperAction;

public class ProductInsertProAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
			String path = request.getRealPath("img/product");
			String enc = "UTF-8";		
			int maxSize = 1024*1024*5;	
			DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();	
			MultipartRequest mr = new MultipartRequest(request, path, maxSize, enc, dp);
			
			String orgName1 = mr.getOriginalFileName("image");	
			String sysName1 = mr.getFilesystemName("image");	
			String orgName2 = mr.getOriginalFileName("colorimage");	
			String sysName2 = mr.getFilesystemName("colorimage");	
			
			File f = mr.getFile("image");
			String type = mr.getContentType("image");	
			type = type.split("/")[0];
			if(!type.equals("image")){		
				f.delete();					
			}
			request.setAttribute("sysName1", sysName1);
			request.setAttribute("orgName1", orgName1);
			request.setAttribute("sysName2", sysName2);
			request.setAttribute("orgName2", orgName2);
			request.setAttribute("path", path);
		
		return "/jsp/product/productInsertPro.jsp";
	}
}
