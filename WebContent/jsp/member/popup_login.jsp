<%@ page contentType="text/html; charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script language="JavaScript">
	function checkIt() {
		var userinput = eval("document.userinput");
		if (!userinput.loginId.value) {
			alert("ID를 입력하세요");
			return false;
		} else if (!userinput.password.value) {
			alert("비밀번호를 입력하세요");
			return false;
		} else {
			userinput.submit();
		}
	}

	function goLogOut() {
		var logout = eval("document.logout");
		logout.submit();
	}
	function goJoinView() {
		$(".global_login_modal").hide();
		$('.global_right_nav').find('.global_login a').removeClass('active');

		var loginBack = document.getElementById("login_background");
		loginBack.style.height = document.body.clientHeight + 100 + "px";
		loginBack.style.visibility = "visible";
		//	비활성화 효과  end	-->
		var frameLogin = document.getElementById("frameLogin");
		$("#login_Pop").css({
			"visibility" : "hidden"
		});
		$("#frameLogin").src = "";
		frameLogin.src = "inner_join.gnd";

		document.getElementById("login_Pop").style.visibility = "visible";
		$("html, body").animate({
			scrollTop : $("#login_Pop").attr("offsetTop") - 45
		}, 0);

		/*
		var login = eval("document.login");
		login.src = "inner_join.gnd";
		var uri = '팝업창 url'
		    var width = 520;
		    var height = 500;
		    var top = (screen.availHeight - height) / 2;
		    var left = (screen.availWidth - width) / 2;

		    var strFeature;
		    strFeature = 'height=' + height + ',width=' + width + ',menubar=no,toolbar=no,location=no,resizable=no,status=no,scrollbars=yes,top=' + top + ',left=' + left
			url = "inner_join.gnd";
		
		// 새로운 윈도우를 엽니다.
		open(url, "confirm",strFeature);
		 */
	}
</script>
<div class="layerArea" id="login_Pop">
	<iframe src="" allowtransparency="false" id="frameLogin" name="login" width="840px" height="400px" frameborder="0" marginwidth="0" scrolling="no"></iframe>
</div>
<form name="logout" action="doLogout.gnd" method="post"></form>
<form name="userinput" id="loginForm_1" action="doLogin.gnd" method="post" onSubmit="return checkIt()">
	<div class="global_login_modal" style="height: 1589px; display: none;">
		<div class="gb_register_cont">
			<div class="gb_login_tit">회원가입</div>
			<p>나이키 회원이 되시면 다양한 혜택을 누리실 수 있습니다.</p>
			<ul>
				<li>다양한 프로모션 코드를 통한 할인 혜택</li>
			</ul>
			<a href="javascript:goJoinView();" class="global_btn_type1">회원가입</a>
		</div>
		<div class="gb_login_cont">
			<div class="gb_login_tit">로그인</div>
			<div class="place_input">
				<label for="loginId_1" class="gb_login_label" id="id_text">아이디를 입력하세요</label>
				<input type="text" id="loginId_1" name="loginId" value="">
			</div>
			<div class="place_input">
				<label for="password_1" class="gb_login_label" id="pw_text">비밀번호를 입력하세요</label>
				<input type="password" id="password_1" name="password">
			</div>
			<div class="global_id_pass_info">
				<span><input type="checkbox" id="ck" name="idSave" value="Y"><label for="ck">아이디 저장</label></span>
				<div>
					<span><a href="javascript:fn_loginFlag('6');">아이디 찾기 ㅣ</a></span> <span><a href="javascript:fn_loginFlag('7');">패스워드 찾기</a></span>
				</div>
			</div>
			<a href="javascript:checkIt()" class="global_btn_type1">
				<span>로그인</span>
			</a>
		</div>
		<a href="#" onclick="return false;" class="global_modal_close">닫기</a>
	</div>
</form>
<div id="login_background"
	style="visibility: hidden; width: 2000px; height: 100%; position: absolute;
	 top: -100px; left: 0px; z-index: 499; background: black; filter: alpha(opacity = 70);
	  opacity: 0.7; -moz-opacity: 0.7"></div>
