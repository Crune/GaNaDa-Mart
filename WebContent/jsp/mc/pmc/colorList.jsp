<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script language="JavaScript">

</script>
<form name=colorListForm action="./colorUpdate.gnd" method="post" onSubmit="return checkItColor()">
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
    <input type="button" name="colorUpdate" value="색상종류추가" OnClick="javascript:window.location='./colorInsert.gnd?pd_code=${pd_code}'"> 
    <input type="button" value="선택색상변경" onClick="colorSubmit(1)">
    <input type="button" value="선택색상등록" onClick="setColor()">
    <input type="button" value="선택색상삭제" onClick="colorSubmit(2)">
    <input type="button" value="닫기" onClick="clo()">
</form>
<script language="javascript">
<!--
	function setColor(){		
		opener.document.stinform.c_code.value=document.colorListForm.c_code.value;
		window.close();
	}
	function colorSubmit(index){
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
