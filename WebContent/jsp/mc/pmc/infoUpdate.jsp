<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./infoUpdatePro.gnd" method="post">
	    <table>
	    	<tr>
	    		<td>
		    		<input name="pd_infocode" type="hidden" value="${pi.pd_infocode }">
	    			<select id="pd_infotype" name="pd_infotype">
				    	<option value="" <c:if test="${pi.pd_infocode==null}">selected</c:if>>구분</option>
				    	<option value="1" <c:if test="${pi.pd_infotype=='1'}">selected</c:if>>상품정보</option>
				    	<option value="2" <c:if test="${pi.pd_infotype=='2'}">selected</c:if>>배송/결재정보</option>
				    	<option value="3" <c:if test="${pi.pd_infotype=='3'}">selected</c:if>>유의사항</option>
				    	<option value="4" <c:if test="${pi.pd_infotype=='4'}">selected</c:if>>A/S정보</option>
				    </select>
				</td>
			</tr>
	 		<tr>
	 			<td>정보내용</td>
	 			<td>
	 				<textarea name="pd_infocontent" rows="13" cols="35">
	 					${pi.pd_infocontent }
	 				</textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" id="inProduct" value="상품등록">
    </form>