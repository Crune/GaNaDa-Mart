<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>상품등록(수정)</title>
</head>
<body>  
	<form method="post" name="productUpdate" enctype="multipart/form-data" action="updatePro.gnd">
		<table width="500" border="1" cellspacing="0" cellpadding="0"  align="center">
	   		<tr>
	    		<td align="right" colspan="2">
		    		<a href="./list.gnd">상품목록</a> 
	   			</td>
	   		</tr>
	   		<tr>
	    		<td width="170" align="center">상품명</td>
	    		<td width="330">
	    			<input type="hidden" name="num" value="${product.num }">
	      			<input type="text" size="40" name="name" value="${product.name }"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">가격</td>
	    		<td width="330">
					<input type="text" size="40" name="price" value="${product.price }"></td>
			<tr>
	    		<td align="center">할인가격</td>
	    		<td width="330">
	       			<input type="text" size="40" name="discount" value="${product.discount }"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">색상</td>
	    		<td width="330">
	       			<input type="text" size="40" name="color" value="${product.color }"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">색상코드</td>
	    		<td width="330">
	       			<input type="text" size="40" name="colorcode" value="${product.colorcode }"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">색상이미지업로드</td>
	    		<td width="330"><input type="file" name="colorimage"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">사이즈</td>
	    		<td width="330">
	       			<select name="pd_size">
				    	<option value="" <c:if test="${product.pd_size==null}">selected</c:if>>사이즈</option>
				    	<option value="220" <c:if test="${product.pd_size=='220'}">selected</c:if>>220</option>
				    	<option value="225" <c:if test="${product.pd_size=='225'}">selected</c:if>>225</option>
				    	<option value="230" <c:if test="${product.pd_size=='230'}">selected</c:if>>230</option>
				    	<option value="235" <c:if test="${product.pd_size=='235'}">selected</c:if>>235</option>
				    	<option value="240" <c:if test="${product.pd_size=='240'}">selected</c:if>>240</option>
				    	<option value="245" <c:if test="${product.pd_size=='245'}">selected</c:if>>245</option>
				    	<option value="250" <c:if test="${product.pd_size=='250'}">selected</c:if>>250</option>
				    	<option value="255" <c:if test="${product.pd_size=='255'}">selected</c:if>>255</option>
				    	<option value="260" <c:if test="${product.pd_size=='260'}">selected</c:if>>260</option>
				    	<option value="265" <c:if test="${product.pd_size=='265'}">selected</c:if>>265</option>
				    	<option value="270" <c:if test="${product.pd_size=='270'}">selected</c:if>>270</option>
				    	<option value="275" <c:if test="${product.pd_size=='275'}">selected</c:if>>275</option>
				    	<option value="280" <c:if test="${product.pd_size=='280'}">selected</c:if>>280</option>
				    </select>
				    <c:if test="${product.stock=='1'}">selected</c:if>
				    <select name="stock">
				    	<option value="" <c:if test="${product.stock==null}">selected</c:if>>수량</option>
				    	<option value="1" <c:if test="${product.stock=='1'}">selected</c:if>>1</option>
				    	<option value="2" <c:if test="${product.stock=='2'}">selected</c:if>>2</option>
				    	<option value="3" <c:if test="${product.stock=='3'}">selected</c:if>>3</option>
				    	<option value="4" <c:if test="${product.stock=='4'}">selected</c:if>>4</option>
				    	<option value="5" <c:if test="${product.stock=='5'}">selected</c:if>>5</option>
				    	<option value="6" <c:if test="${product.stock=='6'}">selected</c:if>>6</option>
				    	<option value="7" <c:if test="${product.stock=='7'}">selected</c:if>>7</option>
				    	<option value="8" <c:if test="${product.stock=='8'}">selected</c:if>>8</option>
				    	<option value="9" <c:if test="${product.stock=='9'}">selected</c:if>>9</option>
				    	<option value="10" <c:if test="${product.stock=='10'}">selected</c:if>>10</option>
				    </select>
				</td>
	  		</tr>
	  		<tr>
	    		<td align="center">매장위치</td>
	    		<td width="330">
	       			<input type="text" size="40" name="storead" value="${product.storead }"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지(우측)</td>
	    		<td width="330"><input type="file" name="imageright"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지(좌측)</td>
	    		<td width="330"><input type="file" name="imageleft"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지(하단)</td>
	    		<td width="330"><input type="file" name="imagebot"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지(상단)</td>
	    		<td width="330"><input type="file" name="imagetop"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지(정면)</td>
	    		<td width="330"><input type="file" name="image"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지(후면)</td>
	    		<td width="330"><input type="file" name="imageback"></td>
	  		</tr>
			<tr>
			    <td align="center">상품정보</td>
			    <td width="330" >
			    	<textarea name="info" rows="13" cols="40">${product.info }</textarea></td>
			</tr>
			<tr>
			    <td align="center">배송정보</td>
			    <td width="330" >
			    	<textarea name="deliveryinfo" rows="13" cols="40">${product.deliveryinfo }</textarea></td>
			</tr>
			<tr>
			    <td align="center">유의사항</td>
			    <td width="330" >
			    	<textarea name="note" rows="13" cols="40">${product.note }</textarea></td>
			</tr>
			<tr>
			    <td align="center">A/S정보</td>
			    <td width="330" >
			    	<textarea name="asinfo" rows="13" cols="40">${product.asinfo }</textarea></td>
			</tr>
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