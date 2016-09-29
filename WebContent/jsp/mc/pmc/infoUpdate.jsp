<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./infoUpdatePro.gnd" method="post">
	    <table>
	 		<tr>
	 			<td>정보내용</td>
	 			<td>
	 				<textarea name="pd_infocontent" rows="13" cols="35">
	 					${pi.pd_infocontent }
	 				</textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" id="inProduct" value="정보등록">
	    <input type="button" value="닫기" onclick="setInfo()">
    </form>
<script language="javascript">
<!--
  function setInfo()
    {		
    	opener.document.userinput.pd_infocode.value="${pi.pd_infocode}";
		self.close();
	}
		-->
</script>