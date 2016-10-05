<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="stdeform" action="./stockDeletePro.gnd" method="post">
	    <div id="productForm" class="box">
		    <ul>
			   	<input name="sk_code" type="hidden" value="${sk_code }">
			    
			    <li class="label2">
			   		<input type="submit" id="stinProduct" value="상품재고삭제">
			    
		    </ul>
	    </div>
    </form>