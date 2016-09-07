package ganada.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainImageAction implements SuperAction {

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
	HttpSession session = request.getSession(); 
	String urlImgMain = "./img/main_p1_160822_NRC_p1_bg.png";
	session.setAttribute("urlImgMain", urlImgMain);

	return "/jsp/cont/main_img.jsp";
    }

}
