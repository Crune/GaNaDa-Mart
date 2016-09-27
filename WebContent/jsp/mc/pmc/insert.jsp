<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


    
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./insertPro.gnd" method="post"></form>
    <div id="productForm" class="box">
    <ul>
   
    <li><label for="pd_name">상품명</label>
    <input id="pd_name" name="pd_name" type="text" size="50" placeholder="상품명" maxlength="50">
    <li><label for="pd_price">가격</label>
    <input id="pd_price" name="pd_price" type="text" size="10" placeholder="가격" maxlength="10">원
    
    <li class="label2">
    <input type="submit" id="inProduct" value="상품등록">
    
    </ul>
    </div>
    </form>