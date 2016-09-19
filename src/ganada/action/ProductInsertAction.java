package ganada.action;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProductInsertAction implements SuperAction{
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
			String path = request.getRealPath("img");		//���������ϰ��
			//String path = "F://save//";
			String enc = "UTF-8";		//�������ڵ�
			int maxSize = 1024*1024*5;	//5MB���� ���ϸ�, -1=����������x
			DefaultFileRenamePolicy dp = new DefaultFileRenamePolicy();	//�����̸� �ߺ�����
			MultipartRequest mr = new MultipartRequest(request, path, maxSize, enc, dp);	//��û����, ���ε��Ұ��, �����ִ�ũ��, ���ڵ�, ��������
			
			//String writer = mr.getParameter("writer");		//�ۼ���
			String orgName = mr.getOriginalFileName("image");	//�����̸�(java.png)
			String sysName = mr.getFilesystemName("image");	//���ε�� �̸�(java1.png)
			
			File f = mr.getFile("image");
			String type = mr.getContentType("image");	//������ Ÿ��(text(����)/html(Ȯ����))�� ���� ����
			type = type.split("/")[0];		// "/"�� �����ؼ� [0]/[1]�ε� 0��° ���� ����ϰڴٴ� �ǹ�
			if(!type.equals("image")){		//���ε��Ϸ��� ������ ����
				f.delete();					//�̹����� �ƴϸ� ����, �̹����� ���ε��ϱ����� ����ϴ� ���α׷�, ���ε�� �̹� ������ �Ǿ��� ������ ���ε�� ������ ������ �־���Ѵ�.
			}
			request.setAttribute("sysName", sysName);
			
		
		return "/jsp/product/productInsert.jsp";
	}
}
