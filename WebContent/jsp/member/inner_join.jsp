<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script language="JavaScript">
	function doNext(){
		
	}
	function doCancel(){
		if (confirm("회원가입을 취소하시겠습니까?") == true){    //확인
		    this.close();
		}else{   //취소
		    return;
		}
	}	
	function checkIt() {
		var memberForm = eval("document.memberForm");
		if (!memberForm.memberName.value) {
			alert("이름을 입력하세요");
			return false;
		} else if (!memberForm.email1Address.value) {
			alert("이메일을 입력하세요");
			return false;
		} else {
			memberForm.submit();
		}
	}

</script>
<div class="popLayer log">
	<div class="layerBox clx">
		<div class="contents">
			<h4>회원가입</h4>
			<ul class="step clx">
				<li class="on">본인인증</li>
				<li>약관동의</li>
				<li>정보입력</li>
				<li>가입요청</li>
				<li class="last">가입완료</li>
			</ul>
			<div class="sectionL">
				<p class="txt type02">본인인증</p>
				<div class="loginArea clx">
					<form id="memberForm" name="memberForm" method="post">
						<input type="hidden" id="checedkDuplicateEmailFlag"
							name="checedkDuplicateEmailFlag" value="N">

						<fieldset>
							<legend>로그인 관련 입력 폼</legend>
							<div class="loginForm type02">
								<div class="formBox">
									<div class="speech type03"    >
										<span class="over">이름을 입력해주세요<span class="arr"></span></span>
									</div>
									<label for="loginName" class="layerLabel">이름</label> <input
										type="text" id="loginName" name="memberName"
										class="inputType02" style="width: 170px;"
										onchange="javascript:resetFlag();">
								</div>
								<div class="formBox mt05">
									<div class="speech type04">
										<span class="over">이메일를 입력해주세요<span class="arr"></span></span>
									</div>
									<label for="loginEmail" class="layerLabel">이메일</label> <input
										type="text" id="loginEmail" class="inputType02"
										name="email1Address" style="width: 170px;"
										onchange="javascript:resetFlag();">
								</div>
							</div>
							<a href="javascript:checkIt()" onclick="checkDuplicate();" class="loginBtn type02">중복확인</a>
						</fieldset>
					</form>

				</divㅣ>
				<!-- // .loginArea -->
				<div class="starTxt alR">
					<a href="#" class="btn-type1 btn-orange" onclick="doNext();"><span
						class="right">다음</span></a> 
					<a href="#" class="btn-type1 btn-gray ml05" onclick="doCancel();"><span
						class="right">취소</span></a>
				</div>
			</div>
			<!-- // .sectionL -->
			<div class="sectionR02">
				<div class="desc">
					2012년 8월 18일부터 시행되는 『정보통신망 이용 촉진 및 정보보호등에 관한 법률(이하 정보통신망법)』 제23조의
					2”주민등록번호의 사용 제한”에 따라 나이키닷컴 내 모든 서비스에서 주민등록번호를 입력받지 않습니다. 이에 따라
					나이키닷컴의 회원으로 가입하실 때는 주민등록번호를 입력하는 실명인증 대신 이메일을 이용하여 본인인증 하셔야 합니다. <br>
					<br> 입력하신 이메일로 가입승인 메일이 발송됩니다.<br> <strong>회원가입요청
						완료 후 24시간 이내 본인인증 메일을 확인</strong> 하시면 회원가입이 최종 완료됩니다.
				</div>
			</div>
			<!-- // .sectionR -->
			<a href="#" onclick="doCancel();" class="close">레이어팝업 닫기</a>
		</div>
		<!-- // .content -->
	</div>
	<!-- // .layerBox -->
</div>