<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="stinform" action="./stockUpdatePro.gnd" method="post">
	    <div id="productForm" class="box">
		    <ul>
		 	  	<input id="pd_code" name="pd_code" type="hidden" placeholder="상품코드" value="${pd_code }">
			   	<li><label for="c_code">색상</label>
			    	<select id="c_code" name="c_code">
				    	<option value="" <c:if test="${stock.c_code==null}">selected</c:if>>색상</option>
				    	<option value="1" <c:if test="${stock.c_code=='1'}">selected</c:if>>블랙</option>
				    	<option value="2" <c:if test="${stock.c_code=='2'}">selected</c:if>>블루</option>
				    	<option value="3" <c:if test="${stock.c_code=='3'}">selected</c:if>>레드</option>
				    </select>
			    <li><label for="pd_size">사이즈</label>
			    	<input id="pd_size" name="pd_size" type="text" value="${stock.pd_size }" size="10" placeholder="사이즈" maxlength="10">
			    <li><label for="amount">수량</label>
			    	<input id="amount" name="amount" type="text" value="${stock.amount }" size="10" placeholder="수량" maxlength="10">
			    
			    <li class="label2">
			   		<input type="submit" id="stinProduct" value="상품재고수정">
			    
		    </ul>
	    </div>
    </form>