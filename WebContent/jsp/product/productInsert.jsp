<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>상품등록</title>
</head>
<body>  
	<form method="post" name="productInsert" enctype="multipart/form-data" action="pdpInsertPro.gnd">
		<table width="500" border="1" cellspacing="0" cellpadding="0"  align="center">
	   		<tr>
	    		<td align="right" colspan="2">
		    		<a href="#">상품목록</a> 
	   			</td>
	   		</tr>
	   		<tr>
	    		<td width="170" align="center">상품명</td>
	    		<td width="330">
	      			<input type="text" size="10" name="name"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">가격</td>
	    		<td width="330">
					<input type="text" size="40" name="price"></td>
			<tr>
	    		<td align="center">할인가격</td>
	    		<td width="330">
	       			<input type="text" size="40" name="discount" ></td>
	  		</tr>
	  		<tr>
	    		<td align="center">색상</td>
	    		<td width="330">
	       			<input type="text" size="40" name="color" ></td>
	  		</tr>
	  		<tr>
	    		<td align="center">색상코드</td>
	    		<td width="330">
	       			<input type="text" size="40" name="colorcode" ></td>
	  		</tr>
	  		<tr>
	    		<td align="center">색상이미지업로드</td>
	    		<td width="330"><input type="file" name="colorimage"></td>
	  		</tr>
	  		<tr>
	    		<td align="center">사이즈</td>
	    		<td width="330">
	       			<select name="pd_size">
				    	<option value="" selected>사이즈</option>
				    	<option value="220">220</option>
				    	<option value="225">225</option>
				    	<option value="230">230</option>
				    	<option value="240">240</option>
				    	<option value="245">245</option>
				    	<option value="250">250</option>
				    	<option value="255">255</option>
				    	<option value="260">260</option>
				    	<option value="265">265</option>
				    	<option value="270">270</option>
				    	<option value="275">275</option>
				    	<option value="280">280</option>
				    </select>
				    <select name="stock">
				    	<option value="" selected>수량</option>
				    	<option value="1">1</option>
				    	<option value="2">2</option>
				    	<option value="3">3</option>
				    	<option value="4">4</option>
				    	<option value="5">5</option>
				    	<option value="6">6</option>
				    	<option value="7">7</option>
				    	<option value="8">8</option>
				    	<option value="9">9</option>
				    </select>
				</td>
	  		</tr>
	  		<tr>
	    		<td align="center">매장위치</td>
	    		<td width="330">
	       			<input type="text" size="40" name="storead" ></td>
	  		</tr>
	  		<tr>
	    		<td align="center">상품이미지업로드</td>
	    		<td width="330"><input type="file" name="image"></td>
	  		</tr>
			<tr>
			    <td align="center">상품정보</td>
			    <td width="330" >
			    	<textarea name="info" rows="13" cols="40"></textarea></td>
			</tr>
			<tr>
			    <td align="center">배송정보</td>
			    <td width="330" >
			    	<textarea name="deliveryinfo" rows="13" cols="40"></textarea></td>
			</tr>
			<tr>
			    <td align="center">유의사항</td>
			    <td width="330" >
			    	<textarea name="note" rows="13" cols="40"></textarea></td>
			</tr>
			<tr>
			    <td align="center">A/S정보</td>
			    <td width="330" >
			    	<textarea name="asinfo" rows="13" cols="40"></textarea></td>
			</tr>
	  		<tr>
	   			<td align="center">글비밀번호</td>
	   			<td width="330" >
	     			<input type="password" size="8" maxlength="12" name="passwd"> 
		 		</td>
	  		</tr>
			<tr>      
				<td colspan=2 align="center"> 
					<input type="submit" value="글쓰기">  
		  			<input type="reset" value="다시작성">
		  		</td>
			</tr>
		</table>  
	</form>      
</body>
</html>      