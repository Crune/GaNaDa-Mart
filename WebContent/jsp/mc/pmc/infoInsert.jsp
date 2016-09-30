<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script language="javascript">
<!--
	function checkInfo(cksub) {
    if(!cksub.pd_infoname.value) {
        alert("수정할 정보를 골라주세요");
        return false;
    }
    if(!cksub.pd_infocontent.value) {
        alert("수정할 정보를 골라주세요");
        return false;
    }
-->
</script>
    <form name="infoInsertForm" action="./infoInsertPro.gnd" method="post" onSubmit="return checkInfo(this.form)">
	    <table>
	    	<input name="pd_infotype" type="hidden" value="${pd_infotype}">
		  	<tr>
	    		<td>
	    			<select name="pd_infotype" disabled>
				    	<option value="1" <c:if test="${pd_infotype=='1'}">selected</c:if>>상품정보</option>
				    	<option value="2" <c:if test="${pd_infotype=='2'}">selected</c:if>>배송/결재정보</option>
				    	<option value="3" <c:if test="${pd_infotype=='3'}">selected</c:if>>유의사항</option>
				    	<option value="4" <c:if test="${pd_infotype=='4'}">selected</c:if>>A/S정보</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>정보이름</td>
				<td>
					<input type="text" name="pd_infoname" size="30" maxlength="30">
				</td>
			</tr>
	 		<tr>
	 			<td>정보내용</td>
	 			<td>
	 				<textarea name="pd_infocontent" rows="13" cols="35"></textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" value="상품등록">
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