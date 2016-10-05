<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- Style Sheet -->
<link href="${pageContext.request.contextPath}/css/default.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/nike.css"
	rel="stylesheet" type="text/css">

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.2.js"></script>
<script
	src="${pageContext.request.contextPath}/js/jquery-ui-1.10.2.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
<script
	src="${pageContext.request.contextPath}/js/jquery.jqzoom-core.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.2.js"></script>
<script
	src="${pageContext.request.contextPath}/js/jquery.word-break-keep-all.min.js"></script>

<link href="${pageContext.request.contextPath}/css/jquery.jqzoom.css"
	rel="stylesheet" type="text/css">

<!-- CP Javascript -->
<script src="${pageContext.request.contextPath}/js/global_renewal.js"></script>

<!-- Custom Javascript -->
<script src="${pageContext.request.contextPath}/js/default.js"></script>

<div class="popLayer">
 	<div class="layerBox clx">
    <div class="contents">
    	<form method="post" name="frmJoin" id="frmJoin">
    	<h4>회원가입 요청</h4>
      <ul class="step clx">
      	<li>본인인증</li>
        <li>약관동의</li>
        <li>정보입력</li>
        <li class="on">가입요청</li>
        <li class="last">가입완료</li>
      </ul>
      <div class="sectionL">
        <p class="txt type03">ddd님</p>
        <p class="txt05 mt20">
          나이키닷컴의 회원가입 요청을 감사드립니다.<br>
          본인인증을 위하여 ddd@dd.com 로 인증메일을 발송하였으니, <br>
          24시간 이내에 꼭 확인해 주세요.
        </p>
        <div class="alL mt40">
          <a href="#" onclick="goLoginPage();" class="btn-type1 btn-black"><span class="right">확인</span></a>
        </div>
      </div><!-- // .sectionL -->  
      <div class="sectionR02">
        <div class="desc">
          인증메일의 “본인인증하기” 버튼을 클릭하시면 <br>
          나이키닷컴 회원가입이 최종 완료되며, <br>
          쿠폰/이벤트 등 각종 회원 혜택을 이용하실 수 있습니다.<br><br>
          <strong>본인인증은 24시간 이내에 반드시 해주셔야 합니다.</strong><br>
          24시간이 지나면 본인인증이 불가하며, 회원가입을 위하여 <br>
          다시 회원가입 요청을 진행해 주셔야 합니다.
        </div>
      </div><!-- // .sectionR -->
      <a href="#" onclick="doClose();" class="close">레이어팝업 닫기</a>
      </form>
    </div><!-- // .content -->
  </div><!-- // .layerBox -->
 </div>