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
	if (confirm("ȸ�������� ����Ͻðڽ��ϱ�?") == true) { //Ȯ��
		self.opener = self;
		window.close();
		
	} else { //���
		return false;
	}
}

</script>
<div class="popLayer typeS" id="duplChkDiv" style="z-index: 30000; top: 80px;">
 	<div class="layerBox clx">
    <div class="contents">
    	<h4>���̵� �ߺ�Ȯ��</h4>
      <p class="txtBox" id="txtDiv">	<span>��밡���� ���̵��Դϴ�.<strong>${oId }</strong>��(��) ����Ͻðڽ��ϱ�?</span>	
      <a href="javascript:doClose()" class="btn-type6 btn-orange"><span class="right">����ϱ�</span></a></p>
      <p class="txt04">�ٸ� ���̵� �Է��� �ּ���.</p>
      <div class="borAlign">
        <label for="hopeLoginId" class="layerLabel type02"><span class="star">��� ���̵�</span></label>
        <input type="text" class="inputType04 verT" name="hopeLoginId" id="hopeLoginId">
        <a class="btn-type6 btn-black ml01" href="#" name="showDuplChkDiv1"><span class="right">�ߺ�Ȯ��</span></a>
      </div>
      <a href="#" onclick="resetId();" class="close">���̾��˾� �ݱ�</a>
    </div>
  </div>
 </div>