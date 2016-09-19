<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import = "java.util.StringTokenizer" %>
<html>
<head><title>상품상세페이지(상단)</title>
<script language="javascript">
     <!--
     function mySubmit(index){
    	if(index==1){
    		if(!document.product.size.value ) {
                alert("사이즈를 입력하세요");
                return false;
            }
            if(!document.product.amount.value ) {
                alert("수량을 입력하세요");
                return false;
            }
            document.product.action='cart.gnd';
 		}
    	if(index==2){
    		if(!document.product.size.value ) {
                alert("사이즈를 입력하세요");
                return false;
            }
            if(!document.product.amount.value ) {
                alert("수량을 입력하세요");
                return false;
            }
            document.product.action='order.gnd';
 		}
    	document.product.submit();
     }
     
     function chgimg(){
     	var img = document.right.src;
     	document.right.src = img;
     }
     //-->
   </script>
</head>
<body>
	<form method="get" name="product">
	<table border="1" width="1000" align="center">
		<tr>
			<td colspan="4"><a href="#">카테</a>
			><a href="#">고리</a>
			><a href="#">12</a>
			</td>
		</tr>
		<tr>
			<td>화살표</td>
			<td rowspan="10" width="500"><img name="center" src="#">중단사진</td>
			<td colspan="2">${product.name }<br />카테고리</td>
		</tr>
		<tr>
			<td><img name="right" src="right.png" onClick="javascript:chgimg();">${pdImageSt.nextToken()}</td>
			<c:if test="${product.discount == null }">
				<td><fmt:formatNumber value="${product.price }" /></td>
			</c:if>
			<c:if test="${product.discount != null }">
				<td><strike><font><fmt:formatNumber value="${product.price }" /></font></strike>
					<fmt:formatNumber value="${product.discount }" />
				</td>
			</c:if>
			<td align="right">별점</td>
		</tr>
		<tr>
			<td><img src="#">${pdImageSt.nextToken()}</td>
			<td>카드사별 무이자 할부 안내</td>
			<td align="right"><br /><a href="#">혜택자세히보기</a></td>
		</tr>
		<tr>
			<td><img src="#">${pdImageSt.nextToken()}</td>
			<td>${product.color }</td>
			<td align="right">${product.colorcode }(get)</td>
		</tr>
		<tr>
			<td><img src="#">${pdImageSt.nextToken()}</td>
			<td colspan="2">
				<c:forTokens var="ci" items="${product.colorimage}" delims="/">
					<img src="#">${ci }
				</c:forTokens>
			</td>
		</tr>
		<tr>
			<td><img src="#">${pdImageSt.nextToken()}</td>
			<td colspan="2">가격인하제품 아래 제품 목록은 할인된 가격으로 판매합니다</td>
		</tr>
		<tr>
			<td><img src="#">${pdImageSt.nextToken()}</td>
			<td colspan="2">
			<c:forTokens var="ci" items="${product.colorimage}" delims="/">
					<img src="#">${ci }
			</c:forTokens>
			</td>
		</tr>
		<tr>
			<td>화살표</td>
			<td colspan="2" align="right">
				<select name="size">
			    	<option value="" selected>사이즈</option>
			    	<option value="240">240</option>
			    	<option value="245">245</option>
			    	<option value="250">250</option>
			    	<option value="260">260</option>
			    	<option value="270">270</option>
			    	<option value="280">280</option>
			    </select>
			    <select name="amount">
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
				<input type="button" name="cart" value="장바구니" onClick="mySubmit(1)">         
				<input type="button" name="buy" value="구매하기" onClick="mySubmit(2)"><br />
				<a href="#">위시리스트담기</a>
      		</td>
		</tr>
		<tr>
			<td rowspan="2">&nbsp;</td>
			<td colspan="2"><a href="#">${product.name }</a>에 대해 더 알아보세요.<br /> 
				페이지 하단의<a href="#review">스토어 리뷰</a>를 통해 매장 스페셜리스트의 상세한 리뷰를 확인해보세요.<br />
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right"><a href="#">사이즈 가이드</a></td>
		</tr>
	</table>
	</form>
	<br />
	<table border="1" width="1000" align="center">
		<tr>
			<td colspan="4" align="center">추천하는상품</td>
		</tr>
		<tr>
			<td width="250"><a href="#"><img src="#"></a><br />
				상품이름 <br />
				카테고리 <br />
				가격(할인가)<br />
			</td>
			<td width="250"><a href="#"><img src="#"></a><br />
				상품이름 <br />
				카테고리 <br />
				가격(할인가)<br />
			</td>
			<td width="250"><a href="#"><img src="#"></a><br />
				상품이름 <br />
				카테고리 <br />
				가격(할인가)<br />
			</td>
			<td width="250"><a href="#"><img src="#"></a><br />
				상품이름 <br />
				카테고리 <br />
				가격(할인가)<br />
			</td>
		</tr>
	</table>
	<br />
	<table border="1" width="1000" align="center">
		<tr>
			<td align="center">상세정보</td>
			<td align="center">배송/결제정보</td>
			<td align="center">유의사항</td>
			<td align="center">교환/반품/AS</td>
		</tr>
		<tr>
			<td colspan="4" align="center"><img src="#"></td>
		</tr>
	</table>
	<br />
	<table border="1" width="1000" align="center">
		<tr>
			<td align="left" width="300">제품 주소재</td>
			<td align="left">배송/결제정보</td>
		</tr>
		<tr>
			<td align="left">색상</td>
			<td align="left">상단표시</td>
		</tr>
		<tr>
			<td align="left">치수</td>
			<td align="left">최소치수(DB)-최대치수(DB)</td>
		</tr>
		<tr>
			<td align="left">제조국</td>
			<td align="left">제조국(DB)</td>
		</tr>
		<tr>
			<td align="left">품질보증기준</td>
			<td align="left">품질보증기간:구입후 6개월<br />
				유통중 손상되었거나 품질에 이상이 있는 제품에 한하여 소비자피해보상규정 에 의거 보상하여 드립니다.<br />
				단, 제품에 부착되어 있는 사용방법 및 취급시주의사항에 따라 제품을 관리해 주시고, 소비자 부주의로 인한 품질 이상 및 변형에 대해서는 책임을 지지 않습니다.<br />
			</td>
		</tr>
		<tr>
			<td align="left">수입자(수입업체명)</td>
			<td align="left">수입업체명(DB)</td>
		</tr>
		<tr>
			<td align="left">고객센터전화번호</td>
			<td align="left">고객전화번호(DB)</td>
		</tr>
	</table>
	<a name="review">review</a>
</body>
</html>