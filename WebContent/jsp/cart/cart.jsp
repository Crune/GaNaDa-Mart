<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html  >
<html>
<head>
<%
  String root = request.getContextPath();
%>
<title>cart</title>
<link href="<%=root%>/css/default.css" rel="stylesheet" type="text/css">
<link href="<%=root%>/css/bootstrap.css" rel="stylesheet">
<link href="<%=root%>/css/nike.css" rel="stylesheet">
<link href="<%=root%>/css/order.css" rel="stylesheet">

<style>
.row .join { padding:20px 0 10px;}
	.row .join p { color:#434343;font-size:12px}
	.row .join span { color:#fa5400;}
	.row .join a { font-weight:bold; color:#434343; display:inline-block; margin-left:10px;  padding-right:10px;}
</style>
</head>
<jsp:include page="${urlHeader}" flush="false" />
<body>
  <script type="text/javascript">
  
  function  init(){
  }
  
  window.onload = init;
  </script>
   <form id="cart" method="post">
	 <div  style="height:60px"></div>
	 <div id="content" class="container" style="height:600px">
	   <div class="container show-grid">
	     <div class="row">
	       <div class="col-md-6" style="border-bottom: 1px solid #333;">
	         <h1> <img src="<%=root%>/img/cart/tit_mycat.png" /></h1>
	       </div>
	       <div class="col-md-6" style="border-bottom: 1px solid #333;direction: rtl;">
	         <h1> <img src="<%=root%>/img/cart/tab_cat01.png" /></h1>
	       </div>
	     </div>
	     <div class="row">
	        <div class="col-md-12">
		      <div class="join">
		         <p> 로그인 하시면 장바구니에 담은 상품이
		         <span>30일간</span>보관됩니다.
		         <a href="javascript:#">로그인</a>
		         </p> 
		         <p>가나다마트 회원이 되시면 다양한 혜택을 누리실 수 있습니다.</p>
		       </div>
	       </div>
	    </div>
	    <div class="row">
	      <div class="col-md-12" style="padding:0px 0px 0px 0px">
	       <div class ="orderList">
			    <table summary="상품, 상품금액, 수량, 합계금액에 따른 총 결제예정금액 및 장바구니에 담은 제품 정보"><!-- #nike -->
				   <colgroup>
				         <col style="width: 40px;">
				         <col>
				         <col style="width: 70px;">
				         <col style="width: 100px;">
				         <col style="width: 150px;">
				         <col style="width: 120px;">
			          </colgroup>
			      	<thead>
					  <tr>
						<th scope="col">
						 <label class="hidden" for="check">선택</label>
						 <input type="checkbox" id="check">
						</th>
						<th scope="col">상품</th>
						<th scope="col">상품금액</th>
						<th scope="col">수량</th>
						<th scope="col">합계금액</th>
						<th scope="col">저장</th>
					 </tr>
				    </thead>
					<tbody>
					<c:forEach var="vo" items="${itemList}">
					 <tr>
					  <td class="lns01">
					   <input type="checkbox" id="check_${vo.item_name}" checked="checked">
					 </td>
					  <td class="lns02">
						   <div class ="ms">
						    <img src="<%=root%>/img/${vo.item_image}" class="thumb" alt="" />
					      </div>
						   <div class="ms">
					            <strong>
								  ${vo.item_name}
								</strong>
	 						    <span>COLOR : ${vo.item_cl}</span>
								<span>SIZE : ${vo.item_size}</span>
								 <img src="<%=root%>/img/cart/btn_option.gif" alt="옵션변경">
	                       </div>   
					   </td>
					   <td class="lns03">
					     <strong>${vo.item_price} 원</strong>
					   </td>
					   <td class="lns04">
                         <label class="hidden" for="amountType02">수량입력</label>
                         <input name="qty" title="수량선택" class="qty" id="qty0_10" style="-ms-ime-mode: disabled;" type="text" maxlength="4" value="1">
						  <div class="option">
				               <a href="#"><img alt="수량증가" src="<%=root%>/img/cart/up_arrow.png"></a>
							   <a href="#"><img alt="수량감소" src="<%=root%>/img/cart/down_arrow.png"></a>
				          </div>
					      <div>
						    <a title="변경" href="javascript:$('input[name=&quot;chkdel&quot;]', document.cartForm).get('0').checked=true;fn_updateOrderQuantity('0', '60670243', 1, 'on');">
						    <img alt="변경" src="<%=root%>/img/cart/order_count_modify_btn.gif"></a>						   
						 </div>
				       </td>
				       <td class="lns05">
			            <!-- <span class="discount">139,000원</span> -->
						  <strong>${vo.item_total} 원</strong>
					      <input type="hidden" id="finalPricePerGoods" name="finalPricePerGoods" value="139000">
					   </td>
					   <td class="lns06">
						  <a href="javascript:openLogin();"><img src="<%=root%>/img/cart/btn_cat.gif" alt="보관하기"></a>
						  
						  
						  <a href="javascript:fn_deleteCartItem('ONE', '60673823', 'NK31073830');fn_catalystDelCart('844595-708');">
						  <img src="<%=root%>/img/cart/btn_delete.gif" alt="삭제"></a>
	 
	 
				        </td>
					</tr>
				    </c:forEach>
				    <tr>
					 <td colspan="6" class="lns07">
					   <div>
					    <p>상품주문금액 <strong>237,300</strong></p>
					    <p>할인금액 - <strong>0원</strong></p>
						<p>배송비 + <strong>0원</strong></p>
					   </div>								
					   <div class="total">
						 <p>총 결제 예정금액</p>
						 <strong><em>237,300</em> 원</strong>
						</div>
					  </td>
					</tr>
				  </tbody>
				</table>
		     </div>		
	       </div>
	     </div>
	     <div class="row">
	       <div class="col-md-12" style="padding:10px 0px 0px 0px;text-align: right">
	       <c:if test="${itemList == null || itemList.size() == 0 }">
	    	 <button type="button" id="goShop" name="goShop" class="btn btn-primary">쇼핑계속하기</button>
	      </c:if>	 
	       <c:if test="${itemList != null && itemList.size() > 0 }">
	    	 <button type="button"  id="goShop" name="goShop" class="btn btn-primary" action="/page.gnd?code=MAIN">쇼핑계속하기</button>
	    	<!--  <button type="button" class="btn btn-primary">비회원주문하기</button> -->
	    	 <button type="button" id="order" name="order" class="btn btn-primary" action="/page.gnd?code=MAIN">주문하기</button>
	      </c:if>	 
	       </div>
	     </div>
	   </div>
	 </div>
   </form>
<jsp:include page='${urlFooter}' flush="false" />
</body>
</html>