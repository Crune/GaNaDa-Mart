<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <form name="inform" action="./infoUpdatePro.gnd" method="post" onSubmit="return checkIt()">
	    <table>
	  		  <input id="pd_infocode" name="pd_infocode" type="hidden" value="${pi.pd_infocode }">
		 	  <input id="pd_infopyte" name="pd_infotype" type="hidden" value="${pi.pd_infotype }">
			  <tr>
	 			<td>정보제목</td>
	 			<td>
	 				<input id="pd_infoname" name="pd_infoname" type="text" size="20" value="${pi.pd_infoname }" maxlength="20">
	 			</td>
			</tr>
	 		<tr>
	 			<td>정보내용</td>
	 			<td>
	 				<textarea id="pd_infocontent" name="pd_infocontent" rows="13" cols="35">
	 					${pi.pd_infocontent }
	 				</textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" id="inProduct" value="정보수정">
	    <input type="button" value="닫기" onclick="setInfo()">
	    <input type="button" name="back" value="뒤로가기" onClick="javascript:history.go(-1);"/>
    </form>
<script language="javascript">
<!--
	function setInfo()
	    {		
	    	window.close();
		}
-->
</script>