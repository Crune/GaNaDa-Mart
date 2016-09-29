<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./insertPro.gnd" method="post">
    <div id="productForm" class="box">
    <ul>
 	<li><label for="menu_code">메뉴코드</label>
    <input id="menu_code" name="menu_code" type="text" size="50" placeholder="상품명" maxlength="50">
    <li><label for="pd_name">상품명</label>
    <input id="pd_name" name="pd_name" type="text" size="50" placeholder="상품명" maxlength="50">
    <li><label for="pd_price">가격</label>
    <input id="pd_price" name="pd_price" type="text" size="10" placeholder="가격" maxlength="10">원
    <li><label for="pd_infocode1">정보코드1</label>
    <input id="pd_infocod1e" name="pd_infocode1" type="text" size="50" placeholder="상품명" maxlength="50">
    
     <li><label for="pd_infocode">정보</label>
    	<select name="pd_infotype">
			<option value="" selected>정보구분</option>
			<option value="1">상품정보</option>
			<option value="2">배송/결재정보</option>
			<option value="3">유의사항</option>
			<option value="4">A/S정보</option>
		</select>
   	<c:forEach var="i" items="${piList1 }">
				${i.pd_infocontent}
				<textarea name="pd_infocontent" rows="13" cols="35">
	 					${i.pd_infocontent }
	 			</textarea>
	</c:forEach>
    
    <li class="label2">

    <input type="submit" id="inProduct" value="상품등록">
    </ul>
    </div>
    </form>