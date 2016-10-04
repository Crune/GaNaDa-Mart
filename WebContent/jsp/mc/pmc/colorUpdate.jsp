<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <form name="inform" action="./colorUpdatePro.gnd" method="post" onSubmit="return checkIt()">
	    <table>
	  		  <input id="c_code" name="c_code" type="hidden" value="${pc.c_code }">
		 	  <input id="pd_code" name="pd_code" type="hidden" value="${pc.pd_code }">
			  <tr>
	 			<td>색상</td>
	 			<td>
	 				<input id="c_name" name="c_name" type="text" size="20" value="${pc.c_name }" maxlength="20">
	 			</td>
			</tr>
		</table>
	    <input type="submit" value="색상수정">
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