package ganada.action.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.core.Action;
import ganada.obj.common.BannerHTML;
import ganada.obj.common.BannerHTMLDao;
import ganada.obj.common.ContentsPage;
import ganada.obj.common.ContentsPageDao;

@Action("/page.gnd")
public class ContentsPageAction implements SuperAction {
    
	private static ContentsPageDao pageDao;
    private static BannerHTMLDao bannerDao;

    @Override
    public String executeAction(HttpServletRequest request, HttpServletResponse response) {
        try {
            pageDao = ContentsPageDao.getInstance();
            bannerDao = BannerHTMLDao.getInstance();

            // 페이지 정보 불러오기
            String pageCode = (String) request.getParameter("code");
            if (pageCode == null) {
                pageCode = "";
            }
            ContentsPage page = (ContentsPage) pageDao.select(pageCode);

            // 불러온 페이지의 배너들을 조회하여 innerHTML에 집어넣음.
            String innerHTML = "";
            for (int key : page.bannerMap().keySet()) {
                String bannerCode = page.bannerMap().get(key);
                BannerHTML cur = (BannerHTML) bannerDao.select(bannerCode);
                innerHTML += cur.getHtml();
            }
            
            // 불러온 페이지의 이름, 코드, 정보를 세션에 집어 넣음.
            HttpSession session = request.getSession();
            session.setAttribute("pageTitle", page.getName());
            session.setAttribute("menu", page.getCode());
            session.setAttribute("innerHTML", innerHTML);        

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/jsp/template/page.jsp";
    }

}
