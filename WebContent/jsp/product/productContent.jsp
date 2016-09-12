<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>상품상세페이지(상단)</title>
<style type="text/css">
        body { text-align:center; width:100%; height:100%;}        
        #header {
            width:1000px; height:50px; background-color:#FFFFFF; border:groove 1px silver;
            padding:5px 5px 5px 5px; margin:0px 0px 10px 0px; text-align:left;}            
        #left{
            width:150px; height:300px; background-color:#FFFFFF; border:groove 1px silver;
            padding:5px 5px 5px 5px; margin:0px 10px 0px 0px; float:left;}        
        #content{
            width:500px; height:300px; background-color:#FFFFFF; border:groove 1px silver;
            padding:5px 5px 5px 5px; margin:0px 0px 0px 0px;
            float:left;} 
        #right{
            width:330px; height:300px; background-color:#FFFFFF; border:groove 1px silver;
            padding:5px 5px 5px 5px; margin:0px 0px 0px 10px; text-align:left; float:left;}
        #footer{
            clear:both;
            width:1000px; height:100px; background-color:#FFFFFF; border:groove 1px silver;
            padding:5px 5px 5px 5px; margin:10px 0px 0px 0px;
            float:left;}
</style>
<style>
	*{margin:0; padding:0;}
	ui{list-style:none;}
	body{font-size:12px; font-family:gulim; color:#333333; padding:30px;}
	
	.tab{overflow:hidden; zoom:1;
		background:url(이미지파일path) left bottom repeat-x;}
	.tab li{foat:left; margin-rigt:5px; border:1px solid #666666; text-align:center; line-height:50px;
		border-bottom:none;}
	.tab li a{float:left; width:100px; height:100px;}
	.tab li.current{background:white;}
	.tab li.current a{font-weight:bold; color:red;}
</style>    
</head>
<body>
	<form method="post" action="#" name="product" onsubmit="#">
	<div style="width:1000px;" id="header">
		<a href="#">카테</a>>
		<a href="#">고리</a>>
		<a href="#">12</a>
	</div>
	<div style="width:1000px;">
		<div id="left">
			<img src="#">화살표<br />
			<img src="#">상품사진(우)<br />
			<img src="#">상품사진(하)<br />
			<img src="#">상품사진(좌)<br />
			<img src="#">상품사진(상)<br />
			<img src="#">상품사진(일반)<br />
			<img src="#">상품사진(후)<br />
			<img src="#">화살표<br />
		</div>		
		<div id="content">
			<img src="#">중단사진
		</div>
		<div id="right">
			상품명<br />
			카테고리<br />
			가격(할인)<div align="right">별점</div><br />
			카드사별 무이자할부 안내<p align="right">혜택 자세히 보기</p><br />
			제품색상이름 불러오기   제품색상코드 불러오기(get)<br />
			<img src="#">색상사진<br />
			가격인하제품 아래 제품 목록은 할인된 가격으로 판매합니다<br />
			<img src="#">색상사진<br />
			<select name="size">
			 	<option value="" selected>사이즈</option>
			  	<option value="240">240</option>
			  	<option value="245">245</option>
			  	<option value="250">250</option>
			</select>
			<select name="amount">
			   	<option value="" selected>수량</option>
			   	<option value="1">1</option>
			   	<option value="2">2</option>
			   	<option value="3">3</option>
			</select>
			<input type="submit" name="cart"value="장바구니">         
			<input type="submit" name="buy" value="구매하기" >
			<p align="right"><a href="#">위시리스트담기</a></p>
			<a href="#">상품이름</a>에 대해 더 알아보세요.<br /> 
				페이지 하단의<a href="#review">스토어 리뷰</a>를 통해 매장 스페셜리스트의 상세한 리뷰를 확인해보세요.<br />
			<p align="right"><a href="#">사이즈가이드</a></p>
		</div>
		<div id="footer">
			<ul class="tab">
				<li><a href="#">탭내용1</a></li>
				<li class="current"><a href="#">탭내용2</a></li>
				<li><a href="#">탭내용3</a></li>
				<li><a href="#">탭내용4</a></li>
			</ul>
		</div>
	</div>
	<a name="review">review</a>
	</form>
</body>
</html>