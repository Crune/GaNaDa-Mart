<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script language="JavaScript">
<!--
    function openUpdate(userinput) {
        if (userinput.pd_infocode.value == "") {
            alert("정보종류를 선택해주세요");
            return;
        }
        url = "colorUpdate.gnd?pd_code=" + userinput.c_code.value ;
        
        open(url, "open", 
        "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
    }
	function checkIt() {
    if(!document.colorListForm.pd_infocode.value) {
        alert("수정할 정보를 골라주세요");
        return false;
    }
}
-->
</script>
<form name=colorListForm action="./colorUpdate.gnd" method="post" onSubmit="return checkIt()">
   <table>
	   	<c:forEach var="i" items="${cList }">
	 		<tr>
	 			<td>정보내용
	 				<input type="radio" name="c_code" value="${i.c_code }">
	 			</td>
			 	<td>
			 		${i.c_name }
				</td>
				<td>${i.c_code }</td>
			</tr>
		</c:forEach>
	</table>
    <input type="button" name="openUpdate" value="새정보등록" OnClick="javascript:window.location='./colorInsert.gnd?pd_code=${pd_code}'"> 
    <input type="button" value="정보수정" onClick="mySubmit(1)">
    <input type="button" value="선택정보등록" onClick="setInfo()">
    <input type="button" value="선택정보삭제" onClick="mySubmit(2)">
    <input type="button" value="닫기" onClick="clo()">
</form>
<script language="javascript">
<!--
	function setInfo(){		
		var pd_infotype = ${pd_infotype};
		if(pd_infotype==1){
			opener.document.inform.pd_infocode1.value=document.infoListForm.pd_infocode.value;
		}else if(pd_infotype==2){
			opener.document.inform.pd_infocode2.value=document.infoListForm.pd_infocode.value;
		}else if(pd_infotype==3){
			opener.document.inform.pd_infocode3.value=document.infoListForm.pd_infocode.value;
		}else{
			opener.document.inform.pd_infocode4.value=document.infoListForm.pd_infocode.value;
		}
		window.close();
	}
	function mySubmit(index){
		if(index==1){
			document.colorListForm.action='./colorUpdate.gnd';
		}
		if(index==2){
			document.colorListForm.action='./colorDeletePro.gnd?pd_code=${pd_code}';
		}
		document.colorListForm.submit();
 	}
	function clo()
	{		
		window.close();
	}
-->
</script>
