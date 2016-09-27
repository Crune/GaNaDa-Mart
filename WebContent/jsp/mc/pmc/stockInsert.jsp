<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="stinform" action="./stockInsertPro.gnd" method="post">
	    <div id="productForm" class="box">
		    <ul>
			   	<input id="pd_code" name="pd_code" type="hidden" placeholder="상품코드" value="${pd_code }">
			    <li><label for="pd_size">사이즈</label>
			    	<input id="pd_size" name="pd_size" type="text" size="10" placeholder="사이즈" maxlength="10">
			    <li><label for="amount">수량</label>
			    	<input id="amount" name="amount" type="text" size="10" placeholder="수량" maxlength="10">
			    
			    <li class="label2">
			   		<input type="submit" id="stinProduct" value="상품수정">
			    
		    </ul>
	    </div>
    </form>