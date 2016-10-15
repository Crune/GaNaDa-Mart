<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html  >
<html>
<head>
<%
  String root = request.getContextPath();
%>
<title>cart</title>
<script src="<%=root%>/js/jquery-1.11.3.min.js"></script>
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
	  initBtnEvent();
  }
  
  function initBtnEvent(){
	  
	  //쇼핑계속하기 버튼 누르면 메인페이지로 이동
	  $("#goShop").bind("click", function(){
		  $(location).attr('href',"<%=root%>/page.gnd?code=MAIN");
	  });
	  
	  $("#order").bind("click", function(){
		  orderItem();
	  });	
	  
  }
  
  function deleteItem(item_num, cart_id){
	  
	  var result = confirm('정말 삭제하시겠습니까?');
      if(result) {
    	  var form  = $("#deletecartForm");
    	  
    	  console.log(form);
    	  
    	  form.find("#cart_id").val(cart_id);
    	  form.find("#item_num").val(item_num);
    	  
    	  form.submit();
      } else {
          //no
      }
  }
  
  function changeAmount(item_id, cnt, type){
	  
	  var id ="qty_" + item_id + "_" + cnt;
	  var itemCnt  = Number($("#"+id).val());  //수량값 가져오기
	  
	  /*
	     $(# + 가져올 값을 가지고있는  input 의 id).val()  >> 값을 get
	     $(# + 가져올 값을 가지고있는  input 의 id).val(값)  >> 값을  get	  
	  */
	  
	  if(type =="up"){
		  itemCnt = itemCnt +1;  //가져온 수량에서 1개 늘린다...
		  $("#"+id).val(itemCnt);		  
	  }else if(type =="down"){		  
		  if(itemCnt ==1){
			  alert("제품은 최소 1개이상 선택되어야합니다.");
			  return false;
		  }else if(itemCnt >1){
			  itemCnt = itemCnt -1;
		  }
		  $("#"+id).val(itemCnt);	
	  } 
  }
  
  function modifyAmount(cart_id, item_id, cnt){
  
	  
 	 var id ="qty_" + item_id + "_" + cnt;
 	 var itemCnt  = Number($("#"+id).val());
 	 var currentTotal  = $("#finalPricePerGoods_"+cart_id).val();  //  현재 제품한개의 총금액
 	 var currentTtoal_price  =$("#total_item_price").val();  // 현재 총 결제 예상금액

 	 
 	 $("#updateForm").find("#cart_id").val(cart_id);
 	 $("#updateForm").find("#item_cnt").val(itemCnt);
 	 
 	 var form  =  $("#updateForm");
 	 var url  = "<%=root%>/cartUpdate.gnd";
 	 
 	
 	$.ajax({
		type:"post",
		dataType:"json",
		url:url,
		data:form.serialize(),
		success:function(result){
			console.log(result);
			var goods_id  ="total_goods_"+cart_id;
			var price  = 0;
			if(result!=null){
				price = result.total_price;		
				var cart_total_price  = (currentTtoal_price - currentTotal) + price;
				console.log(price);
				$("#"+goods_id).html(numberComma(price) +"원");  // 디스플레이용 합계금액
				$("#finalPricePerGoods_"+cart_id).val(price); // 계산용 합계금액
				$("#order_total_price").html(numberComma(cart_total_price)+"원");// 디스플레이용 상품주문금액
				$("#order_total_pay").html("<em>"+numberComma(cart_total_price) +"</em> 원");  // 디스플레이용 총 예상금액
				$("#total_item_price").val(cart_total_price); // 계산용 총 예상금액
			}
		},
		fail:function(){
			console.log("Ajax Error Java 소스 확인해보세요 ...")
		}
	});
  }
  
  //정규식을 이용한 천단위 콤마찍기 로직....
  // 안쓰려고했는데 스크립트에 포메터 넣으면 오류난다..
  //이유는 스크립트가 로딩될때 숫자를 문자로 인식하네 아오...
  function numberComma(number) {
	    return number.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  }
  
  var cart_idArr=[];
  
  function orderItem(){
	  $(":checkbox[name='cart_check']:checked").each(function(index,obj){
		  cart_idArr.push(obj.value);
	  });
	  
	  var cartForm  = $("#cartForm");
	  
	  cartForm.find("#cart_ids").val(cart_idArr.join(','));
	  
  }
	 
  //페이지 로드되자마자 해당 펑션을 실행시키도록 함...
  // 제이쿼리함수써도 되는데 이게 더 보기 좋아서 그냥 씀...
  window.onload = init;
  </script>
   <form id="cartForm" method="post" action="<%=root%>/orderItem.gnd">
     <input type="hidden" id ="cart_ids" name="cart_ids" value="" />
   </form>
   <form id="updateForm" method="post">
     <input type="hidden" id ="item_cnt" name="item_cnt" value="" />
     <input type="hidden" id ="cart_id" name="cart_id" value="" />
   </form>
   <form id="deletecartForm" method="post" action="<%=root%>/cartDelete.gnd">
     <input type="hidden" id="item_num" name="item_num" value="" />
     <input type="hidden" id="cart_id" name="cart_id" value="" />
   </form>
	 <div  style="height:100px"></div>
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
		         <p>나이키닷컴 회원이 되시면 다양한 혜택을 누리실 수 있습니다</p>
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
						 <input type="checkbox" id="checkAll">
						</th>
						<th scope="col">상품</th>
						<th scope="col">상품금액</th>
						<th scope="col">수량</th>
						<th scope="col">합계금액</th>
						<th scope="col">저장</th>
					 </tr>
				    </thead>
					<tbody>
					<c:forEach var="vo" items="${itemList}" varStatus="status">
					 <tr>
					  <td class="lns01">
					   <input type="checkbox" id="check_${vo.cart_id}" name="cart_check" value="${vo.cart_id}" checked="checked">
					 </td>
					  <td class="lns02">
						   <div class ="ms">
						    <img src="<%=root%>/img/cart/${vo.item_image}" class="thumb" alt="" />
					      </div>
						   <div class="ms">
					            <strong>
								  ${vo.item_name}
								</strong>
	 						    <span>COLOR : ${vo.item_cl}</span>
								<span>SIZE : ${vo.item_size}</span>
								
	                       </div>   
					   </td>
					   <td class="lns03">
					     <strong><fmt:formatNumber value="${vo.item_price}" pattern="#,###" />원</strong>
					   </td>
					   <td class="lns04">
                         <label class="hidden" for="amountType02">수량입력</label>
                         <input name="qty" title="수량선택" class="qty" id="qty_${vo.item_id}_${status.count}" readonly="readonly" style="-ms-ime-mode: disabled;" type="text" maxlength="4" value="${vo.item_cnt}">
						  <div class="option">
				               <a href="javascript:void(0);" onclick="javascript:changeAmount('${vo.item_id}', ${status.count}, 'up')"><img alt="수량증가" src="<%=root%>/img/cart/up_arrow.png"></a>
							   <a href="javascript:void(0);" onclick="javascript:changeAmount('${vo.item_id}', ${status.count}, 'down')"><img alt="수량감소" src="<%=root%>/img/cart/down_arrow.png"></a>
				          </div>
					      <div>
						    <a title="변경" href="javascript:void(0);" onclick="javascript:modifyAmount('${vo.cart_id}','${vo.item_id}', ${status.count})">
						    <img alt="변경" src="<%=root%>/img/cart/order_count_modify_btn.gif"></a>						   
						 </div>
				       </td>
				       <td class="lns05">
						  <strong id="total_goods_${vo.cart_id}"><fmt:formatNumber value="${vo.item_total}" pattern="#,###" />원</strong>
					      <input type="hidden" id="finalPricePerGoods_${vo.cart_id}" name="finalPricePerGoods_${vo.cart_id}" value="${vo.item_total}">
					   </td>
					   <td class="lns06">
						  <a href="javascript:openLogin();"><img src="<%=root%>/img/cart/btn_cat.gif" alt="보관하기"></a>
						  <a href="javascript:void(0)" onclick="javascript:deleteItem('${vo.item_num}', '${vo.cart_id}')"> <img src="<%=root%>/img/cart/btn_delete.gif" alt="삭제"></a>
				        </td>
					</tr>
				    </c:forEach>
				    <tr>
					 <td colspan="6" class="lns07">
					   <div>
					    <p>상품주문금액 <strong id="order_total_price"><fmt:formatNumber value="${order_price}" pattern="#,###" />원</strong></p>
					    <p>할인금액 - <strong id="order_total_discount"><fmt:formatNumber value="${discount_price}" pattern="#,###" />원</strong></p>
						<p>배송비 + <strong id="order_total_delivery">0원</strong></p>
					   </div>								
					   <div class="total">
						 <p>총 결제 예정금액</p>
						 <strong id ="order_total_pay"><em><fmt:formatNumber value="${total_price}" pattern="#,###" /></em> 원</strong>
						 <input type="hidden" id="total_item_price" value="${total_price}"/>
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
	    	 <button type="button"  id="goShop" name="goShop" class="btn btn-primary">쇼핑계속하기</button>
	    	<!--  <button type="button" class="btn btn-primary">비회원주문하기</button> -->
	    	 <button type="button" id="order" name="order" class="btn btn-primary">주문하기</button>
	      </c:if>	 
	       </div>
	     </div>
	   </div>
	 </div>
 
<jsp:include page='${urlFooter}' flush="false" />
</html>