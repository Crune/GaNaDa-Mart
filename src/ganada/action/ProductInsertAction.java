package ganada.action;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProductInsertAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
			String path = request.getRealPath("img");
			String enc = "UTF-8";		
			int maxSize = 1024*1024*5;	
			DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();	
			MultipartRequest mr = new MultipartRequest(request, path, maxSize, enc, dp);
			
			String orgName = mr.getOriginalFileName("image");	
			String sysName = mr.getFilesystemName("image");	
			
			File f = mr.getFile("image");
			String type = mr.getContentType("image");	
			type = type.split("/")[0];		
			if(!type.equals("image")){		
				f.delete();					
			}
			request.setAttribute("sysName", sysName);
			
		
		return "/jsp/product/productInsert.jsp";
	}
}
