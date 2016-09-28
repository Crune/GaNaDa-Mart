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
    <li><label for="pd_infocode2">정보코드2</label>
    <input id="pd_infocode2" name="pd_infocode2" type="text" size="50" placeholder="상품명" maxlength="50">
    <li><label for="pd_infocode3">정보코드3</label>
    <input id="pd_infocode3" name="pd_infocode3" type="text" size="50" placeholder="상품명" maxlength="50">
    <li><label for="pd_infocode4">정보코드4</label>
    <input id="pd_infocode4" name="pd_infocode4" type="text" size="50" placeholder="상품명" maxlength="50">
   
    <li><label for="pd_infocode">정보</label>
    	<select name="pd_infotype">
			<option value="" selected>정보구분</option>
			<forEach var="i" items="${piList }">
				<option value="${i }">${piList.pd_infocontent}</option>
			</forEach>
		</select>
    
    <li class="label2">

    <input type="submit" id="inProduct" value="상품등록">
    </ul>
    </div>
    </form>