<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>기본Product수정</title>
</head>
<body>  
	<form method="post" name="productUpdate" action="updatePro.gnd">
		<table width="500" border="1" cellspacing="0" cellpadding="0"  align="center">
	   		<tr>
	    		<td align="right" colspan="2">
		    		<a href="./list.gnd">상품목록</a> 
	   			</td>
	   		</tr>
	   		<tr>
	    		<td width="170" align="center">상품명</td>
	    		<td width="330">
	    			<input type="hidden" name="pd_code" value="${pd_code }">
	      			<input type="text" size="40" name="name" value="${pd_name }"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">가격</td>
	    		<td width="330">
					<input type="text" size="40" name="price" value="${pd_price }"></td>
			<tr>
	   
				<td colspan=2 align="center"> 
					<input type="submit" value="수정하기">  
		  			<input type="reset" value="다시작성">
		  			<input type="button" value="글삭제" onClick="document.location.href='pdpDeletePro.gnd?num=${product.num}'">
		  		</td>
			</tr>
		</table>  
	</form>      
</body>
</html>      