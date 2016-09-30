<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script language="JavaScript">
<!--
    function openUpdate(userinput) {
        if (userinput.pd_infocode.value == "") {
            alert("정보종류를 선택해주세요");
            return;
        }
        url = "infoUpdate.gnd?pd_infocode=" + userinput.pd_infocode.value ;
        
        open(url, "open", 
        "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
    }
	function openList(userinput) {
    if (userinput.pd_infocode.value == "") {
        alert("정보종류를 선택해주세요");
        return;
    }
    url = "infoList.gnd?pd_infocode=" + userinput.pd_infocode.value ;
    
    open(url, "open", 
    "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
}
-->
</script>
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
    
    <li><label for="pd_infocode1">상품정보</label>
    <input type="button" name="pd_infocode1" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=1','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    <li><label for="pd_infocode2">배송/결제정보</label>
    <input type="button" name="pd_infocode2" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=2','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    <li><label for="pd_infocode3">유의사항</label>
    <input type="button" name="pd_infocode3" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=3','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    <li><label for="pd_infocode4">A/S정보</label>
    <input type="button" name="pd_infocode4" value="등록" onclick="window.open('./infoList.gnd?pd_infotype=4','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
    
    
    <li class="label2">
    <input type="submit" id="inProduct" value="상품등록">
    </ul>
    </div>
    </form>