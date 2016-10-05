<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <input type="button" value="목록으로" onclick="javascript:window.location='./mc.gnd?menu=product'">
	 
    <form id="inform" name="inform" action="./insertPro.gnd" method="post">
    <div id="productForm" class="box">
    <ul>
 	<li><label for="menu_code">메뉴코드</label>
    <input name="menu_code" type="text" size="50" value="${product.menu_code }" placeholder="메뉴코드" maxlength="50">
    <li><label for="pd_name">상품명</label>
    <input name="pd_name" type="text" size="50" value="${product.pd_name }" placeholder="상품명" maxlength="50">
    <li><label for="pd_price">가격</label>
    <input name="pd_price" type="text" size="10" value="${product.pd_price }" placeholder="가격" maxlength="10">원
    
    <input type="hidden" name="pd_infocode1" value="${product.pd_infocode1 }"> 
    <li><label for="pd_infocode1">상품정보</label>
    <input type="button" name="pd_infobt1" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=1','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    
    <input type="hidden" name="pd_infocode2" value="${product.pd_infocode2 }"> 
    <li><label for="pd_infocode2">배송/결제정보</label>
    <input type="button" name="pd_infobt2" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=2','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    
    <input type="hidden" name="pd_infocode3" value="${product.pd_infocode3 }"> 
    <li><label for="pd_infocode3">유의사항</label>
    <input type="button" name="pd_infobt3" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=3','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    
    <input type="hidden" name="pd_infocode4" value="${product.pd_infocode4 }"> 
    <li><label for="pd_infocode4">A/S정보</label>
    <input type="button" name="pd_infobt4" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=4','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    
    
    <li class="label2">
    <input type="submit" id="inProduct" value="상품수정">
    </ul>
    </div>
    </form>