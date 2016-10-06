<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
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
function resetId() {
	if (confirm("회원가입을 취소하시겠습니까?") == true) { //확인
		self.opener = self;
		window.close();
		
	} else { //취소
		return false;
	}
}

</script>
<div class="popLayer typeS" id="duplChkDiv" style="z-index: 30000; top: 80px;">
 	<div class="layerBox clx">
    <div class="contents">
    	<h4>아이디 중복확인</h4>
      <p class="txtBox" id="txtDiv">	<span>사용가능한 아이디입니다.<strong>${oId }</strong>을(를) 사용하시겠습니까?</span>	
      <a href="javascript:doClose()" class="btn-type6 btn-orange"><span class="right">사용하기</span></a></p>
      <p class="txt04">다른 아이디를 입력해 주세요.</p>
      <div class="borAlign">
        <label for="hopeLoginId" class="layerLabel type02"><span class="star">희망 아이디</span></label>
        <input type="text" class="inputType04 verT" name="hopeLoginId" id="hopeLoginId">
        <a class="btn-type6 btn-black ml01" href="#" name="showDuplChkDiv1"><span class="right">중복확인</span></a>
      </div>
      <a href="#" onclick="resetId();" class="close">레이어팝업 닫기</a>
    </div>
  </div>
 </div>