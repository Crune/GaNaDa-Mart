package ganada.action.payment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ganada.action.common.SuperAction;

/**
 * 장바구니 진입전에 로그인상태인지 체크하는 Action
 * @author Han
 *
 */
public class CartAction implements SuperAction{

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		String login_status  = "no";
		//세션에 유저 정보가 없다는 것은 로그인이 되지 않은 상태
		if(session.getAttribute("userAccount") ==  null){
			login_status ="no";  //로그인 아님
		}else{			
			login_status ="yes"; // 세션이 있다면 로그인
		}

		//상태를 request 에 저장
		request.setAttribute("login_status", login_status);

		// 로그인 상태에 대한 결과 처리를 위한 jsp  후출 
		return "/jsp/cart/cart.jsp";	
	}
}