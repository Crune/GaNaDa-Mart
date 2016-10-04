<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <form name="stinform" action="./stockUpdatePro.gnd" method="post">
	    <div id="productForm" class="box">
		    <ul>
		 	  	<input id="sk_code" name="sk_code" type="hidden" value="${stock.sk_code }">
		 	  	<input id="pd_code" name="pd_code" type="hidden" value="${stock.pd_code }">
			   	<li><label for="c_code">색상코드</label>
			    	<input type="text" name="c_code" readonly value="${pc.c_code }"> 
    				<input type="button" name="c_codebt" value="색상등록" onclick="window.open('./colorList.gnd?pd_code=${pd_code}','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
   
			    <li><label for="pd_size">사이즈</label>
			    	<input id="pd_size" name="pd_size" type="text" value="${stock.pd_size }" size="10" placeholder="사이즈" maxlength="10">
			    <li><label for="amount">수량</label>
			    	<input id="amount" name="amount" type="text" value="${stock.amount }" size="10" placeholder="수량" maxlength="10">
			    
			    <li class="label2">
			   		<input type="submit" id="stinProduct" value="상품재고수정">
			    
		    </ul>
	    </div>
    </form>