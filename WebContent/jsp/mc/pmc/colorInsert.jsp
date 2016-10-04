<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script language="javascript">
<!--
	function checkColor(cksub) {
    if(!cksub.c_name.value) {
        alert("색상을 입력해주세요");
        return false;
    }
-->
</script>
    <form name="colorInsertForm" action="./colorInsertPro.gnd" method="post" onSubmit="return checkColor(this.form)">
	    <table>
	    	<input name="pd_code" type="hidden" value="${pd_code}">
		  	<tr>
	    		<td>
					${pd_code}
				</td>
			</tr>
			<tr>
				<td>색상</td>
				<td>
					<input type="text" name="c_name" size="30" maxlength="30">
				</td>
			</tr>
		</table>
	    <input type="submit" value="색상등록">
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