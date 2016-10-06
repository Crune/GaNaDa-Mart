<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Style Sheet -->
<link href="${pageContext.request.contextPath}/css/default.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/nike.css" rel="stylesheet" type="text/css">
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.2.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-ui-1.10.2.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.jqzoom-core.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.2.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.word-break-keep-all.min.js"></script>
<link href="${pageContext.request.contextPath}/css/jquery.jqzoom.css" rel="stylesheet" type="text/css">
<!-- CP Javascript -->
<script src="${pageContext.request.contextPath}/js/global_renewal.js"></script>
<!-- Custom Javascript -->
<script src="${pageContext.request.contextPath}/js/default.js"></script>
<script language="JavaScript">
function openConfirmid() {    	
    // 아이디를 입력했는지 검사
    if (document.joinClass.id.value == "") {
        alert("아이디를 입력하세요");
        return;
    }
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
	frameLogin.src = "confirmId.gnd";

	document.getElementById("login_Pop").style.visibility = "visible";
	$("html, body").animate({
		scrollTop : $("#login_Pop").attr("offsetTop") - 45
	}, 0);

}
	$(function() {
		$(window).load(function() {
			document.body.scrollIntoView(true);
			parent.document.all.frameLogin.height = document.body.scrollHeight;
		});
	});
	function doJoinCancel() {
		if (confirm("회원가입을 취소하시겠습니까?") == true) { //확인
			self.opener = self;
			window.close();
			opener.parent.location = "/page.gnd?code=MAIN";
		} else { //취소
			return false;
		}
	}
	function checkIt() {
		
		var userinput = eval("document.joinClass");
		if (!userinput.id.value) {
			alert("아이디 정보를 입력해 주세요");
			return false;
		}

		if (!userinput.password.value) {
			alert("패스워드 정보를 입력해 주세요");
			return false;
		}
		if (!userinput.repwd.value) {
			alert("패스워드를 한번 더 입력해 주세요");
			return false;
		}
		if (userinput.password.value != userinput.repwd.value) {
			alert("패스워드와 패스워드확인 정보가 일치하지 않습니다");
			return false;
		}

		if (!userinput.birthdayDurationTimeYear.value) {
			alert("사용자 이름을 입력하세요");
			return false;
		}
		if (!userinput.jumin1.value || !userinput.jumin2.value) {
			alert("주민등록번호를 입력하세요");
			return false;
		}
		 
	}

	function memberJoin() {
		$('#joinForm').submit();
	}

  
</script>

<form method="post" id="joinForm" action="/joinRequest.gnd" name="joinClass" onSubmit="return checkIt()">
	<div class="popLayer" >
		<div class="layerBox clx">
			<div class="contents">
<div class="layerArea" id="login_Pop">
	<iframe src="" allowtransparency="false" id="frameLogin" name="login" width="840px" height="400px" frameborder="0" marginwidth="0" scrolling="no"></iframe>
</div>
				<h4>회원가입 정보입력</h4>
				<ul class="step clx">
					<li>본인인증</li>
					<li>약관동의</li>
					<li class="on">정보입력</li>
					<li>가입요청</li>
					<li class="last">가입완료</li>
				</ul>
				<fieldset>
					<legend>회원가입 정보입력 폼</legend>
					<div class="infoInput">
						<p class="txt02">는 필수 입력 항목입니다.</p>
						<table summary="회원가입에 필요한 이름, 이메일주소, 아이디, 패스워드, 패스워드 확인, 생년월일, 성별, 연락처, 휴대폰 입력 폼">
							<caption>회원가입 정보입력</caption>
							<colgroup>
								<col style="width: 130px;">
								<col style="width: 650px;">
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><p><span class="star">이름</span></p></th>
									<td>${oln }</td>
								</tr>
								<tr>
									<th scope="row" class="verT"><p><span class="star">E-mail 주소</span></p></th>
									<td>
										<span class="email">${ole }</span>
										<p class="mt10"><input type="checkbox" id="chkEmail" name="chkEmail" checked="checked"> <label class="checkType01" for="chkEmail">서비스 및 이벤트 소식이 담긴 Nike 이메일을 수신하겠습니다.</label></p>
										<p class="pointTxt mt05">패스워드 분실 시 본 이메일 주소로 임시 패스워드를 발급받을 수 있습니다.</p>
									</td>
								</tr>
								<tr>
									<th scope="row"><label for="loginId" class="layerLabel02"><span class="star">아이디</span></label></th>
									<td>
										<div class="formBox">
											<div class="speech type05">
												<span class="over">4~15자리의 영문숫자를 조합하여 사용 가능합니다.<br>숫자만으로는 안됩니다.<br>특수문자는 사용하실 수 없습니다.<span class="arr02"></span></span>
											</div>
											<input type="text" class="inputType01" style="width: 120px;" name="id" id="loginId" onkeyup="wordCheck(this);" onfocus="helpView('loginId');" onblur="$('#loginIdHelp').hide();"
												maxlength="15">
											<a class="btn-type6 btn-black ml03" href="javascript:openConfirmid();" name="showDuplChkDiv" >
												<span class="right">중복확인</span>
											</a>
										</div>
									</td>
								</tr>
								<tr>
									<th scope="row"><label for="password" class="layerLabel02"><span class="star">패스워드</span></label></th>
									<td>
										<div class="formBox">
											<div class="speech type06">
												<span class="over">6~12자의 영문숫자를 조합해서 정해주십시오.<br>아이디 및 이메일 등과 같거나 포함하면 안됩니다. <br>단일 문자열, 연속 문자열 등 쉬운 패스워드는 안됩니다.<br> 기타 일반 정보 등으로부터 추측이 용이한 <br>패스워드는 피해주십시오.<span
													class="arr02"></span></span>
											</div>
											<input type="password" class="inputType02" style="width: 195px;" name="passwd" id="password" onkeyup="passwordCheck(this);" onfocus="helpView('password');"
												onblur="$('#passwordHelp').hide(),secCheck();" maxlength="12">
											<span class="txt03">보안등급</span><span id="secLevel" class="txt03"></span>
										</div>
									</td>
								</tr>
								<tr>
									<th scope="row"><label for="repwd" class="layerLabel02"><span class="star">패스워드 확인</span></label></th>
									<td>
										<input type="password" style="width: 195px;" name="repwd" id="repwd" maxlength="12" onkeyup="passwordCheck(this);">
									</td>
								</tr>
								<tr>
									<th scope="row"><p><span class="star">생년월일</span></p></th>
									<td>
										<select class="birthday" title="년도 선택" id="birthday" name="b_year" style="height: 20;">
											<option value="">년도</option>
											<option value="2002">2002</option>
											<option value="2001">2001</option>
											<option value="2000">2000</option>
											<option value="1999">1999</option>
											<option value="1998">1998</option>
											<option value="1997">1997</option>
											<option value="1996">1996</option>
											<option value="1995">1995</option>
											<option value="1994">1994</option>
											<option value="1993">1993</option>
											<option value="1992">1992</option>
											<option value="1991">1991</option>
											<option value="1990">1990</option>
											<option value="1989">1989</option>
											<option value="1988">1988</option>
											<option value="1987">1987</option>
											<option value="1986">1986</option>
											<option value="1985">1985</option>
											<option value="1984">1984</option>
											<option value="1983">1983</option>
											<option value="1982">1982</option>
											<option value="1981">1981</option>
											<option value="1980">1980</option>
											<option value="1979">1979</option>
											<option value="1978">1978</option>
											<option value="1977">1977</option>
											<option value="1976">1976</option>
											<option value="1975">1975</option>
											<option value="1974">1974</option>
											<option value="1973">1973</option>
											<option value="1972">1972</option>
											<option value="1971">1971</option>
											<option value="1970">1970</option>
											<option value="1969">1969</option>
											<option value="1968">1968</option>
											<option value="1967">1967</option>
											<option value="1966">1966</option>
											<option value="1965">1965</option>
											<option value="1964">1964</option>
											<option value="1963">1963</option>
											<option value="1962">1962</option>
											<option value="1961">1961</option>
											<option value="1960">1960</option>
											<option value="1959">1959</option>
											<option value="1958">1958</option>
											<option value="1957">1957</option>
											<option value="1956">1956</option>
											<option value="1955">1955</option>
											<option value="1954">1954</option>
											<option value="1953">1953</option>
											<option value="1952">1952</option>
											<option value="1951">1951</option>
											<option value="1950">1950</option>
											<option value="1949">1949</option>
											<option value="1948">1948</option>
											<option value="1947">1947</option>
											<option value="1946">1946</option>
											<option value="1945">1945</option>
											<option value="1944">1944</option>
											<option value="1943">1943</option>
											<option value="1942">1942</option>
											<option value="1941">1941</option>
											<option value="1940">1940</option>
											<option value="1939">1939</option>
											<option value="1938">1938</option>
											<option value="1937">1937</option>
											<option value="1936">1936</option>
											<option value="1935">1935</option>
											<option value="1934">1934</option>
											<option value="1933">1933</option>
											<option value="1932">1932</option>
											<option value="1931">1931</option>
											<option value="1930">1930</option>
											<option value="1929">1929</option>
											<option value="1928">1928</option>
											<option value="1927">1927</option>
											<option value="1926">1926</option>
											<option value="1925">1925</option>
											<option value="1924">1924</option>
											<option value="1923">1923</option>
											<option value="1922">1922</option>
											<option value="1921">1921</option>
											<option value="1920">1920</option>
											<option value="1919">1919</option>
											<option value="1918">1918</option>
											<option value="1917">1917</option>
											<option value="1916">1916</option>
											<option value="1915">1915</option>
											<option value="1914">1914</option>
											<option value="1913">1913</option>
											<option value="1912">1912</option>
											<option value="1911">1911</option>
											<option value="1910">1910</option>
											<option value="1909">1909</option>
											<option value="1908">1908</option>
											<option value="1907">1907</option>
											<option value="1906">1906</option>
											<option value="1905">1905</option>
											<option value="1904">1904</option>
											<option value="1903">1903</option>
											<option value="1902">1902</option>
											<option value="1901">1901</option>
											<option value="1900">1900</option>
										</select> <span class="bir">년</span> <select class="b_month" title="월 선택" id="b_month" name="b_month">
											<option value="">월</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
											<option value="11">11</option>
											<option value="12">12</option>
										</select> <span class="bir">월</span> <select class="b_day" title="일 선택" id="b_day" name="b_day">
											<option value="">일</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
											<option value="11">11</option>
											<option value="12">12</option>
											<option value="13">13</option>
											<option value="14">14</option>
											<option value="15">15</option>
											<option value="16">16</option>
											<option value="17">17</option>
											<option value="18">18</option>
											<option value="19">19</option>
											<option value="20">20</option>
											<option value="21">21</option>
											<option value="22">22</option>
											<option value="23">23</option>
											<option value="24">24</option>
											<option value="25">25</option>
											<option value="26">26</option>
											<option value="27">27</option>
											<option value="28">28</option>
											<option value="29">29</option>
											<option value="30">30</option>
											<option value="31">31</option>
										</select> <span class="bir">일</span>
										<input type="radio" id="solar" class="ml10" name="lunisolar" checked="checked" value="0">
										<label class="radioType" for="solar">양력</label>
										<input type="radio" id="lunar" class="ml05" name="lunisolar" value="1">
										<label class="radioType" for="lunar">음력</label>
									</td>
								</tr>
								<tr>
									<th scope="row"><p><span class="star">성별</span></p></th>
									<td>
										<input type="radio" id="female" name="gender" checked="checked" value="0">
										<label class="radioType" for="female">여성</label>
										<input type="radio" id="male" name="gender" class="ml05" value="1">
										<label class="radioType" for="male">남성</label>
									</td>
								</tr>
								<tr>
									<th scope="row"><label for="infoNumber" class="layerLabel02">연락처</label></th>
									<td class="num">
										<input type="text" name="c_first" id="cableTelephoneRegionNo" class="inputType03 fir" title="지역번호" onkeyup="numCheck(this.id);" style="width: 50px;" maxlength="4">
										-
										<input type="text" name="c_second" id="cableTelephoneTelephoneExchangeNo" class="inputType03" title="연락처 앞자리" value="" onkeyup="numCheck(this.id);" style="width: 50px;" maxlength="4">
										-
										<input type="text" name="c_third" id="cableTelephoneEndNo" class="inputType03" title="연락처 뒷자리" value="" onkeyup="numCheck(this.id);" style="width: 53px;" maxlength="4">
									</td>
								</tr>
								<tr>
									<th scope="row" class="verT"><label for="infoCellular" class="layerLabel02"><span class="star">휴대폰</span></label></th>
									<td class="num">
										<input type="text" name="p_first" id="cellSectionNo" class="inputType03 fir" title="통신사번호" onkeyup="numCheck(this.id);" style="width: 50px;" maxlength="3">
										-
										<input type="text" name="p_second" id="cellTelephoneExchangeNo" class="inputType03" title="휴대폰 앞자리" onkeyup="numCheck(this.id);" style="width: 50px;" maxlength="4">
										-
										<input type="text" name="p_third" id="cellEndNo" class="inputType03" title="휴대폰 뒷자리" onkeyup="numCheck(this.id);" style="width: 53px;" maxlength="4">
										<p class="mt10"><input type="checkbox" name="sms_allow" id="chkSms" checked="checked"><label class="checkType01" for="chkSms">SMS 정보를 수신하겠습니다.</label></p>
										<p class="pointTxt mt05">패스워드 분실 시 확인 받을 수 있는 휴대폰 번호를 입력해 주세요.</p>
									</td>
								</tr>
								<!-- 150709 : str -->
								<tr>
									<th scope="row" class="verT"><p class="lh18">개인정보 보관<br> <span class="star">기간 설정</span>
									</p></th>
									<td class="num">
										<input type="radio" id="year01" name="info_store_term" value="01" checked="checked">
										<label class="radioType" for="year01">1년</label>
										<input type="radio" id="year02" name="info_store_term" value="02" class="ml05">
										<label class="radioType" for="year02">3년</label>
										<input type="radio" id="year03" name="info_store_term" value="03" class="ml05">
										<label class="radioType" for="year03">영구</label>
										<p class="checkType01 mt10 lh18">- 정보통신망 이용촉진 및 정보 보호 등에 관한 법률 제29조 제2항에 따라 설정된 개인정보 보관 기간 동안 NIKE.COM의<br>&nbsp;&nbsp;사용이력이 없는 경우 휴면계정으로 되며, 휴면계정의 개인정보는 안전하게 분리 보관 처리됩니다.
										</p>
										<p class="checkType01 mt05 lh18">- 개인정보 보관 기간 설정은 회원정보관리에서 수정 가능합니다.</p>
										<p class="checkType01 mt05 lh18">- NIKE.COM 사용 이력이 없어 휴면계정이 된 경우 계정 활성화 요청에 의해 활성화 가능합니다.</p>
									</td>
								</tr>
								<!-- //150709 : end -->
							</tbody>
						</table>
					</div>
				</fieldset>
				<div class="alR mt20">
					<a href="#none" onclick="memberJoin();" class="btn-type1 btn-orange">
						<span class="right">가입하기</span>
					</a>
					<a href="#none" onclick="doJoinCancel();" class="btn-type1 btn-gray ml05">
						<span class="right">취소</span>
					</a>
				</div>
				<a href="#" onclick="doJoinCancel();" class="close">레이어팝업 닫기</a>
			</div>
			<!-- // .content -->
		</div>
		<!-- // .layerBox -->
	</div>
	<div id="login_background"
	style="visibility: hidden; width: 2000px; height: 100%; position: absolute;
	 top: -100px; left: 0px; z-index: 499; background: black; filter: alpha(opacity = 70);
	  opacity: 0.7; -moz-opacity: 0.7"></div>
</form>

