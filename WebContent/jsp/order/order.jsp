<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
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
<link href="<%=root%>/css/global_renewal.css" rel="stylesheet">
<link href="<%=root%>/css/order.css" rel="stylesheet">

</head>
<jsp:include page="${urlHeader}" flush="false" />
 <div id="content" style="padding-top: 30px">
   <div class="cat_order">
      <div class="store"><a href="http://www.nike.co.kr/" class="storeGo type02">나이키닷컴으로 돌아가기</a></div>
      <div class="mycat">
        <h1><img src="<%=root%>/img/cart/tit_tex20.gif" alt="주문서 작성/결제"></h1>
        <div class="cart_buy"><img src="<%=root%>/img/cart/tab_cat02.gif" alt="주문서작성/결제"></div>
      </div>
      <div class="orderListBox">
         <h2><img src="<%=root%>/img/cart/tit_tex02.gif" alt="1. 주문하시는 상품"></h2>
          <!-- 세트할인 rowspan을 위한 변수 -->		
         <div class="orderList">
		   <table summary="상품, 수량, 주문금액, 배송정보에 따른 주문하시는 상품 정보">
			  <caption>주문하시는 상품 정보</caption>
			    <colgroup>
			        <col style="width:340px;">
			        <col style="width:50px;">
			        <col style="width:100px;">
			        <col>
			    </colgroup>
			    <thead>
				  <tr>
					<th scope="col">상품</th>
					<th scope="col">수량</th>
					<th scope="col">주문금액</th>
					<th scope="col">배송정보</th>
				  </tr>
			     </thead>
	  		     <tbody>
			       <!-- 일반상품 -->
				   <!-- 판매중인것 -->
				   <tr>
					<td class="lns02">
					  <div class="ms">
					    <a href="http://www.nike.co.kr//goods/showGoodsDetail.lecs?goodsNo=NK31073701" target="_blank">
				          <img src="https://simage.nike.co.kr/goods/31/07/37/01/843384_COL_843384-401_55.png" class="thumb" alt="" >
						</a>
				      </div>
			          <div class="ms">
			            <a href="http://www.nike.co.kr/goods/showGoodsDetail.lecs?goodsNo=NK31073701" target="_blank">
						  <strong>나이키 에어맥스 1 울트라 플라이니트</strong>
					    </a>
	                    <span>COLOR : 다크 옵시디언/화이트-레...</span>
					    <span>SIZE : 250</span>
				      </div>
			         </td>
					 <td class="lns03"><strong>1개</strong></td>
				     <td class="lns04"><strong>209,000원</strong></td>
			         <td class="lns05">
						 <strong class="be">일반상품</strong>
					     <span>3일이내배송</span>
				     </td>
			        </tr>
				   </tbody>
			    </table>
			</div>
			<div id="quickMenu" class="orderRt" style="position: absolute; top: 260px;">
	         <div>
		       <h4><img src="<%=root%>/img/cart/tit_tex06.gif" alt="주문금액 확인 및 결제"></h4>
			   <dl>
			     <dt class="con">상품가격</dt>
				 <dd class="con">209,000원</dd>
				 <dt id="custody_money_dt" style="display:none">고객 예치금</dt>
				 <dd id="custody_money_dd" style="display:none">(-)0원</dd>
				 <dt id="direct_coupon_dt" style="display:none">즉석쿠폰</dt>
				 <dd id="direct_coupon_dd" style="display:none">(-)0원</dd>
				 <dt id="event_coupon_dt" style="display:none">이벤트쿠폰</dt>
				 <dd id="event_coupon_dd" style="display:none">(-)0원</dd>
				 <dt id="cart_coupon_dt" style="display:none">이벤트쿠폰</dt>
				 <dd id="cart_coupon_dd" style="display:none">(-)0원</dd>
				 <dt>배송비</dt>
				 <dd>0원(무료)</dd>
			    </dl>
				<strong class="te01">총 결제 예정금액</strong>
				<strong class="te02"><em id="pay_price_str">209,000원</em></strong>
				<span id="payamount_mean">결제수단: 신용카드</span>
				<div class="bm"></div>
			  </div>
			  <fieldset class="odagree_type01">
					<p>주문할 상품의 상품명, 상품가격, 배송정보를 확인하였으며, 구매에 동의하시겠습니까?
					<strong><input type="checkbox" name="assent" id="assent"><label for="assent">동의합니다.</label></strong>
					(전자상거래법 제8조 제2항)
					</p>
				</fieldset>
				<a href="javascript:goCart();" class="fl"><img src="<%=root%>/img/cart/btn_ne01.gif" alt="장바구니로 돌아가기"></a>
				<a href="javascript:fn_deliveryChkAjax('',3);" class="fr"><img src="<%=root%>/img/cart/btn_ne02.gif" alt="결제하기"></a>
			</div>
			<h2><img src="<%=root%>/img/cart/tit_tex03.gif" alt="2. 이벤트 할인 적용"></h2>
		    <div class="order_no">
				<table>
					<colgroup>
						<col width="110">
						<col>
					</colgroup>
					<tbody id="discountTable">
					  <tr>
					    <th scope="row">
						  <p><strong>이벤트 할인</strong></p>
						  <p class="mt05"><a href="javascript:promotionCode();"><img src="<%=root%>/img/cart//btn_promotion.gif" alt="프로모션 코드 등록"></a></p>
						  <input type="hidden" name="codeNo" maxlength="20"> 
						  
						  
					    </th>
	                    <td>
				          <p>가나다님께서 보유하고 계신 프로모션 코드내역입니다. 사용을 원하실 경우 라디오박스를 선택해 주세요.</p>
					      <p>
					        <label class="hidden" for="couponRadio0">나이키닷컴 웰컴 쿠폰</label>
					        <input type="radio" name="couponPromotionNo" id="couponRadio0" onclick="fn_setCouponPrc('11', '02', '10000', '0', '20615721');" value="485">
							나이키닷컴 웰컴 쿠폰&nbsp;&nbsp;10000원 할인(5만원이상 상품구매시)
						  </p>
					      <p>
					        <label class="hidden" for="couponRadio1">쿠폰사용안함</label>
					        <input type="radio" name="couponPromotionNo" id="couponRadio1" onclick="fn_setCouponPrc('', '0', '');" value=""> 사용안함
					      </p>
					    </td>
					  </tr>
				     </tbody>
				   </table>
			  </div>
			  <h2><img src="<%=root%>/img/cart//tit_tex04.gif" alt="3. 주문고객/배송지 정보"></h2>
              <div class="order_no">
		         <table summary="주문고객/배송지정보를 입력하는 테이블">
				    <caption>주문고객/배송지정보</caption>
					 <colgroup>
					    <col style="width:110px;">
					    <col style="width:*;">
					 </colgroup>
					 <thead class="hidden" style="display:none;">
					   <tr>
					     <th scope="col" colspan="2">주문고객/배송지 정보</th>
				       </tr>
					 </thead>
					 <tbody>
					   <tr>
						 <th scope="row">주문고객 정보</th>
						 <td>
						   <strong>가나다</strong> 고객님  (보내시는분 :<span id="span_ord_man_nm" style="display:">가나다</span>
									<input type="hidden" id="senderName" name="senderName" value="가나다">
									<a href="javascript:fn_orderer_mod();"><img src="<%=root%>/img/cart/btn_ne04.gif" class="vm" alt="수정"></a>
									)  &nbsp;&nbsp; 010-0000-0000&nbsp;&nbsp;|&nbsp;&nbsp;ganada@kh.co.kr
									<input type="hidden" id="mod_type" value="read">
									<input type="hidden" name="ordererName" id="ord_man_nm" value="가나다" class="txt" style="width:87px;">
									<input type="hidden" name="cellSectionNo" value="010">
									<input type="hidden" id="cell_no_2" name="cellTelephoneExchangeNo" value="2594">
									<input type="hidden" name="cellEndNo" value="3879">
									<input type="hidden" name="ordererEmailAddress" value="shancoco@naver.com">
						   </td>
						</tr>
                        <tr id="td_rmit_nm_inpt"  class="bons" style="display:">
						   <th scope="row">받으시는 분</th>
						   <td>
							 <input type="hidden" name="memberDelivery.baseDeliveryYN" id="base_dlvp_yn" value="Y">
							 <input type="hidden" name="memberDelivery.userSortRank" id="usr_sort_rnk" value="1">
							 <label class="hidden" for="rmit_nm">받는사람이름</label><input type="text" id="rmit_nm" name="memberDelivery.remiteeName" maxlength="33" class="txt" value="" style="width:80px;margin-right:195px;">
			                 <label class="head" for="dlvp_nm">배송지명</label><input type="text" id="dlvp_nm" name="memberDelivery.deliveryName" maxlength="33" class="txt" value="" style="width:80px;">
						   </td>
					    </tr>
					    <tr id="td_cbl_tel_inpt" class="bons" style="display:">
						  <th scope="row">연락처</th>
						  <td class="fc01">
						     <label class="hidden" for="cbl_tel_rgn_no">연락처번호첫자리</label><input type="text" id="cbl_tel_rgn_no" name="memberDelivery.cableTelephoneRegionNo" value="" maxlength="3" class="txt" title="연락처번호첫자리" style="width:40px;">
							 <label class="hidden" for="cbl_tel_txno_no">연락처번호중간자리</label><input type="text" id="cbl_tel_txno_no" name="memberDelivery.cableTelephoneExchange" value="" maxlength="4" class="txt" title="연락처번호중간자리" style="width:48px;">
							 <label class="hidden" for="cbl_tel_end_no">연락처번호마지막자리</label><input type="text" id="cbl_tel_end_no" name="memberDelivery.cableTelephoneEndNo" value="" maxlength="4" class="txt" title="연락처번호마지막자리" style="width:48px;">
							 <input type="hidden" id="cbl_tel_exno_no" name="memberDelivery.cableTelephoneExtensionNo" value="" maxlength="4" class="txt" style="width:35px;">
						  </td>
					    </tr>
                        <tr id="td_cell_sct_inpt" class="bons" style="display:">
						   <th scope="row">휴대폰</th>
						   <td>
							 <select name="memberDelivery.cellSectionNo" id="cell_sct_no">
							   <option value="">선택</option><option value="010">010</option>
							   <option value="011">011</option>
							   <option value="016">016</option>
							   <option value="017">017</option>
							   <option value="018">018</option>
							   <option value="019">019</option>
							 </select>
							 <input type="text" id="cell_txno_no" name="memberDelivery.cellTelephoneExchange" value="" maxlength="4" class="txt" title="휴대폰번호중간자리" style="width:48px;">
							 <input type="text" id="cell_end_no" name="memberDelivery.cellEndNo" value="" maxlength="4" class="txt" title="휴대폰번호마지막자리" style="width:48px;">
						    </td>
					     </tr>
						 <tr id="td_addr_jibun" class="bons">
						   <th scope="row">지번주소</th>
						   <td>
							 <label class="hidden" for="">주소</label><input type="text" id="post_addrSum" name="" value="" maxlength="66" class="txt" title="주소" style="width:240px;" readonly="readonly">
							 <a href="#" onclick="fn_rodAddr('0');return false;"><img src="<%=root%>/img/cart/ln_btn_search.gif" alt="검색"></a>
						   </td>
						 </tr>
						 <tr id="td_addr_road" class="bons">
						   <th scope="row">도로명주소</th>
						   <td>
							 <label class="hidden" for="stnm_post_addr">주소</label><input type="text" id="post_addrroadSum" value="" maxlength="66" class="txt" title="주소" style="width:240px;" readonly="readonly">
							  <a href="#" onclick="fn_rodAddr('1');return false;"><img src="<%=root%>/img/cart/ln_btn_search.gif" alt="검색"></a>
						   </td>
						 </tr>	
						 <tr>
						   <th scope="row">배송메시지</th>
						   <td>
						     <label class="hidden" for="dlv_memo_cont">배송메시지</label>
						     <input type="text" name="deliveryPlaceInfo.deliveryMessage" id="dlv_memo_cont" class="txt" placeholder="택배기사님께 전달할 메시지를 20자이내로 입력해주세요." maxlength="60" style="width:495px;margin-bottom:3px" onclick="javascript:fn_initDlvMemoCont(this);"><br>
						   </td>
						 </tr>
				      </tbody>
			       </table>
			    </div>
			    <h2><img src="<%=root%>/img/cart/tit_tex05.gif" alt="4. 결제정보선택"></h2>
			    <div class="order_no">
				  <table summary="결제정보선택 입력테이블입니다">
			      	<caption>결제정보선택</caption>
			        <colgroup>
			          <col style="width:110px;">
			          <col style="width:*;">
			        </colgroup>
			        <thead class="hidden" style="display:none;">
			        	<tr><th scope="col" colspan="2">결제정보선택</th></tr>
			        </thead>
			        <tbody>
					  <tr>
					    <th scope="row">결제수단선택</th>
					    <td>
						  <label class="hidden" for="paysel">결제수단</label><input type="radio" class="chk" name="paysel" id="paysel02" value="02" onclick="javascript:chgPaymentMean()"><label for="paysel02">실시간계좌이체</label>
						  <label class="hidden" for="paysel">결제수단</label><input type="radio" class="chk" name="paysel" id="paysel04" checked="checked" value="04" onclick="javascript:chgPaymentMean()"><label for="paysel04">신용카드</label>
						  <label class="hidden" for="paysel">결제수단</label><input type="radio" class="chk" name="paysel" id="paysel06" value="06" onclick="javascript:chgPaymentMean()"><label for="paysel06">휴대폰결제</label>
					    </td>
					  </tr>
					</tbody>
				  </table>
			   </div>
			   <div id="paySection">
				  <div id="payMeanCreditCard">
					<h3>결제수단정보 : <strong>신용카드</strong></h3>
					<div class="fR" style="text-align:right;height:25px;margin-top:-20px;"><img class="btn_pt_pop" src="<%=root%>/img/cart/btn_ne08.gif" alt="팝업차단 해제방법"></div>
					<div class="order_no btn_pt_hide" style="border-bottom:1px #BABCBB solid;">
				        <table style="width:355px;" summary="신용카드 결제정보">
				       		<caption>신용카드 결제 정보</caption>
				          	<colgroup>
				            	<col style="width:*;">
				            	<col style="width:*;">
				          	</colgroup>
				          	<tbody>
							<tr>
						       <th scope="row">카드종류</th>
							   <td>
								<select name="selectcard" title="카드종류" id="selectcard" style="width:185px;" onchange="javascript:fn_CreditCardSel();">
								  <option value="0">카드선택</option>
								  <option value="1"  >롯데카드</option>
								  <option value="2" >신한카드  </option>
								  <option value="3" >비씨카드</option>
						          <option value="4" >국민카드</option>
							      <option value="5">삼성카드</option>
								  <option value="6" >현대카드</option>
								  <option value="7" >하나카드(구 외환)</option>
								  <option value="8">농협NH카드</option>
								  <option value="9">씨티카드  </option>
							      <option value="10">우리카드</option>
								</select>
							   </td>
							</tr>
							<tr  id="tr_inst_sel" style="display:;">
								<th scope="row">할부선택</th>
								<td id="td_inst_rdo" class="card-install">
									<input type="radio" id="rd_inst_sngl" name="rd_inst" class="chk" onclick="javascript:fn_InstSel();"  value="0"><label for="rd_inst_sngl">일시불</label>
									<input type="radio" id="rd_inst_free" name="rd_inst" class="chk" onclick="javascript:fn_InstSel();"  value="2"><label for="rd_inst_free">무이자할부</label>
									<input type="radio" id="rd_inst_intr" name="rd_inst" class="chk" onclick="javascript:fn_InstSel();"  value="1"><label for="rd_inst_intr">일반할부</label>
								</td>
							</tr>
							<tr id="tr_inst_term" style="display:;" class="bons2">
								<th id="th_inst_mm_cnt"  scope="row">할부기간</th>
								<td id="td_inst_mm_cnt"  style="display:;">
								 <select name="sel_inst_mm_cnt" id="sel_inst_mm_cnt" onchange="javascript:fn_setInstMmCnt();" style="display:;" disabled="disabled" title="개월수 선택">
									 <option value="">개월수 선택</option>
								 </select>
							    </td>
							</tr>
							</tbody>
						</table>
						<div class="texTN credit">
							&lt;공인인증/신용카드 인증서비스 안내&gt;<br><br>
							30만원 이상 결제시 신용카드용 공인인증서가<br> 필요합니다.
						</div>
					</div>
				</div>
				<div id="payMeanWithoutABankbook" style="display:none">
				   <h3>결제수단정보: <strong>인터넷뱅킹/무통장입금</strong></h3>
					 <div class="fR" style="text-align:right;height:25px;margin-top:-20px;"><img class="btn_pt_pop" src="<%=root%>/img/cart/btn_ne08.gif" alt="팝업차단 해제방법"></div>
					 <div class="order_no btn_pt_hide" style="border-bottom:1px #BABCBB solid;">
					   <table style="width:335px;" summary="결제수단정보">
					      	<caption>결제수단정보</caption>
					        <colgroup>
					          <col style="width:80px;">
					          <col style="width:*;">
					        </colgroup>
					        <thead class="hidden" style="display:none;">
					          <tr>
					        	 <th scope="col">인터넷뱅깅/무통장입금</th>
					          </tr>
					         </thead>
					         <tbody>
								<tr>
									<th scope="row">결제은행</th>
									<td>
									  <select name="bankCode" style="width:185px;" title="결제은행">
										<option value="">은행선택</option>
									  </select>
									</td>
								</tr>
								<tr>
								  <th scope="row">예금주</th>
								  <td>(주)나이키</td>
								</tr>
								<tr>
									<th scope="row">입금자명</th>
									<td>
	 					              <label class="hidden" for="remitter">입금자명</label>
	 					              <input type="text" id="remitter" name="remitter" class="txt" value="" style="width:100px; height:18px; line-height:18px;">
									</td>
								</tr>
								<tr class="bons2">
								  <th scope="row">입금기한</th>
								  <td id="depositDeadlineWhole">
									  년 월 일<br><span>미입금시 주문은 자동 취소됩니다.</span>
								   </td>
								    <td id="depositDeadlinePart" style="display:none;">
									   년 월 일<br><span>미입금시 주문은 자동 취소됩니다.</span>
									</td>
								</tr>
						     </tbody>
						  </table>
						  <div class="texTN">
							&lt;가상계좌 안내&gt;<br><br>
							나이키닷컴은 농협, 국민, 우리, 신한, 우체국, 기업, 시티은행에서 고객님만의 고유한 전용계좌를 발급해 드립니다.<br><br>
							※ 무통장입금 이용시 주의사항<br>
							입금계좌번호와 입금예정금액이 주문내역과 일치하지 않을 경우, 입금확인이 지연되며, 주문일 기준으로 다음날까지 입금확인이 되지 않은 경우 주문이 취소됩니다. (토,일,공휴일 제외/ 취소 전 안내메일 발송)
							입금시 은행에서 발생되는 송금수수료는 고객님 부담입니다. [자세히]<br><br>
							&lt;구매안전서비스 안내&gt;<br>
							현금 등으로 결제시 KSNET의 채무지급보증서비스를 이용하실 수 있습니다. [<a href="" onclick="javascript:window.open('http://www.nike.co.kr//dispop/popList.lecs?popUpNo=02', '', 'width=700,hieght=700,scrollbars=Y'); return false">자세히</a>]
						  </div>
					   </div>
				   </div>
				   <div id="payMeanCreditTransfer" style="display:none;">
					 <h3>결제수단정보 : <strong>실시간계좌이체</strong></h3>
					<div class="fR" style="text-align:right;height:25px;margin-top:-20px;"><img class="btn_pt_pop" src="<%=root%>/img/cart/btn_ne08.gif" alt="팝업차단 해제방법"></div>
					<div class="order_no btn_pt_hide" style="border-bottom:1px #BABCBB solid;">
						<table style="width:355px;" summary="실시간계좌이체 결제정보">
					        <colgroup>
					          <col>
					        </colgroup>
					        <tbody>
							<tr class="bons2">
								<td>
			                        <p class="realtime">* [결제하기] 버튼을 클릭하면  KSNet의 계좌이체 결제 창으로 연결되며 결제 창에서 결제정보(은행/계좌번호)를 입력하실 수 있습니다.</p> <!--  20130910 수정 -->
			                    </td>
							</tr>
							</tbody>
						</table>
						<div class="texTN">
							실시간 계좌이체는 고객님 계좌에서 나이키로<br> 결제금액이 바로 입금되는 방식을 말하며, 별도<br> 수수료 부담이 전혀 없습니다.<br>
                  			대금 청구 시 가맹점 란에는 (주)데이콤 가맹점으로 기재됩니다.<br><br>
							&lt;실시간 계좌이체 결제시 안내&gt;<br><br>
                  			실시간 계좌이체는 고객님 계좌에서 나이키닷컴으로 결제금액이 바로 입금되는 방식을 말하며, 별도 수수료 부담이 전혀 없습니다. 대금 청구시 가맹점 란에는 KSNet 가맹점으로 기재됩니다.<br>
                  			[나이키급보증서비스 안내]10만원 이상 결제시 하나은행의 나이키급 보증서비스를 이용하실 수 있습니다.<br><br>
                  			&lt;결제하기&gt;버튼 클릭 시,<br><br>
			                KSNet의 계좌이체 화면으로 연결되어 결제정보를 입력하실 수 있습니다.<br><br>
			                &lt;구매안전서비스 안내&gt;<br><br>
			                    고객님은 안전한 거래를 위해 현금 등으로 결제 시 저희 쇼핑몰에서 가입한 KSNET의 구매안전서비스(채무지급보증)를 이용하실 수 있습니다.
						</div>
					</div>
				</div>
				<!-- 핸드폰 결제 20140415 추가 -->
				<div id="payMeanCellPhone" style="display:none;">
					<h3>결제수단정보 : <strong>휴대폰결제</strong></h3>
					<div class="fR" style="text-align:right;height:25px;margin-top:-20px;"><img class="btn_pt_pop" src="<%=root%>/img/cart/btn_ne08.gif" alt="팝업차단 해제방법"></div>
					<div class="order_no btn_pt_hide" style="border-bottom:1px #BABCBB solid;">
						<table style="width:355px;" summary="휴대폰결제 결제정보">
						  <colgroup>
							<col>
						  </colgroup>
						  <tbody>
						    <tr class="bons2">
						   	 <td>
							   <p class="realtime">[결제하기] 버튼 클릭 시, 휴대폰 결제 화면으로 연결되어 <br> 결제정보를 입력하실 수 있습니다.</p>
							 </td>
							</tr>
						  </tbody>
						</table>
						<div class="texTN">
							<strong>[휴대폰결제 안내]</strong><br>
							휴대폰결제는 부정사용방지를 위해 가입자 명의의 휴대폰인 경우에만 결제가 가능합니다.<br>
							[나이키닷컴]에서는 월 최대 50만원까지 휴대폰결제가 가능합니다.<br>
							[나이키닷컴]의 휴대폰결제 한도와 별도로, 사용하시는 통신사의 가입기간 및 이용요금제 등에 따라 결제 및 한도가 제한될 수 있습니다.<br><br>
	
							<strong>[이용시 주의사항]</strong><br>
							고객님이 사용하시는 이동통신사의 신용등급에 따라 결제한도 및 이용이 제한될 수 있습니다.<br>
							휴대폰 요금 청구시 가맹점 란에는 모빌리언스로 기재되며, 결제상세내역은 모빌리언스 홈페이지에서 조회 가능합니다. (http://mcash.co.kr, 문의:1600-0523)<br><br>
	
							<strong>[증빙발급안내]</strong><br>
							휴대폰결제분에 대한 현금영수증은 휴대폰 요금을 현금으로 납부하는 경우에 한하여 발급되며, 발급문의는 이용하시는 이동통신사로 문의하여 주시기 바랍니다
						</div>
					 </div>
				   </div>
				  <!-- //핸드폰 결제 20140415 추가 -->				
			    </div>
			    <div id="cashInfo1" style="display:none">
				  <h3>현금영수증 신청</h3>
				  <input type="hidden" name="creditRecordedSuggestSectionCode">
				  <input type="hidden" name="creditRecordedApplicationSectionCode">
				  <input type="hidden" name="creditRecordedApplicationMemberNo">
				  <input type="hidden" name="creditRecordedUseSectionCode">
				  <input type="hidden" name="supply" value="0">
				  <input type="hidden" name="vat" value="0">
				  <input type="hidden" name="serviceAmount" value="0">
				  <input type="hidden" name="theTotalAmount" value="0">
				  <input type="hidden" name="creditRecordedIssueMeansNo"> 
				  <input type="hidden" name="creditRecordedIssueMeansSectionCode">
				  <div class="order_no btn_pt_hide">
					<table summary="현금영수증 신청">
				      	<caption>현금영수증 신청</caption>
				        <colgroup>
				          <col style="width:340px;">
				          <col style="width:*;">
				        </colgroup>
				        <thead class="hidden" style="display:none;">
				        	<tr>
				        		<th scope="col">현금영수증 신청</th>
				        	</tr>
				        </thead>
				      	<tbody>
						<tr>
						  <td style="height:150px;">
						    <input type="radio" id="pers" name="cash" value="0" class="chk" onclick="javascript:fn_cachRcptIssuGb();"> <label for="pers">소득공제용</label>  &nbsp;&nbsp;
							<input type="radio" id="co" name="cash" value="1" class="chk" onclick="javascript:fn_cachRcptIssuGb();"> <label for="co">지출증빙용(사업자)</label>  &nbsp;&nbsp;
							<input type="radio" id="not" name="cash" value="" class="chk" onclick="javascript:fn_cachRcptIssuGb();"> <label for="not">신청안함</label>
							<div style="margin-top:10px;" id="cashDisplay">
							  <div id="div_cr_issu_mean_sct_cd" style="display:inline;">
								<select name="cr_issu_mean_sct_cd" id="cr_issu_mean_sct_cd" onchange="fn_cashRcptSel()" title="국번선택">											
									<option value="">선택</option><option value="3">휴대폰번호</option>
								</select>
							   </div>
							 <div id="div_cr_issu_mean_sct_cd_bman" style="display:none;">
								<select name="cr_issu_mean_sct_cd_bman" title="사업자번호선택" id="cr_issu_mean_sct_cd_bman" onchange="fn_cashRcptSel()">
									<option value="">선택</option><option value="1">사업자번호</option>
								</select>
							 </div>
							 <span id="span_cr_issu_0" style="display:none;">
								<label class="hidden" for="cr_issu_mean_no_ssn1">앞자리번호</label><input type="text" id="cr_issu_mean_no_ssn1" name="cr_issu_mean_no_ssn1" onkeyup="javascript:goNextField(cr_issu_mean_no_ssn1,cr_issu_mean_no_ssn2, 6);" maxlength="6" class="txt pdl2" title="주민번호앞자리" style="width:42px; "> -
								<label class="hidden" for="cr_issu_mean_no_ssn2">뒷자리번호</label><input type="password" id="cr_issu_mean_no_ssn2" name="cr_issu_mean_no_ssn2" maxlength="7" class="txt pdl2" title="주민번호뒷자리" style="width:70px; ">
							 </span>
							 <span id="span_cr_issu_1" style="display:none;">
								<label class="hidden" for="cr_issu_mean_no_bman1">사업자번호앞자리</label><input type="text" id="cr_issu_mean_no_bman1" name="cr_issu_mean_no_bman1" maxlength="3" onkeyup="javascript:goNextField(cr_issu_mean_no_bman1,cr_issu_mean_no_bman2, 3);" class="txt pdl2" title="사업자번호앞자리" style="width:32px; height:18px; line-height:18px;"> -
								<label class="hidden" for="cr_issu_mean_no_bman2">사업자번호중간자리</label><input type="text" id="cr_issu_mean_no_bman2" name="cr_issu_mean_no_bman2" maxlength="2" onkeyup="javascript:goNextField(cr_issu_mean_no_bman2,cr_issu_mean_no_bman3, 2);" class="txt pdl2" title="사업자번호중간자리" style="width:24px; height:18px; line-height:18px;"> -
								<label class="hidden" for="cr_issu_mean_no_bman3">사업자번호뒷자리</label><input type="text" id="cr_issu_mean_no_bman3" name="cr_issu_mean_no_bman3" maxlength="5" class="txt pdl2" title="사업자번호뒷자리" style="width:42px; height:18px; line-height:18px;">
							 </span>
							 <span id="span_cr_issu_3" style="display:inline;">
								<select name="cr_issu_mean_no_phone1" id="cr_issu_mean_no_phone1" title="전화번호 앞자리">
									<option value="">선택</option><option value="010">010</option><option value="011">011</option><option value="016">016</option><option value="017">017</option><option value="018">018</option><option value="019">019</option>
								</select> -
								<label class="hidden" for="cr_issu_mean_no_phone2">전화번호앞자리</label><input type="text" id="cr_issu_mean_no_phone2" name="cr_issu_mean_no_phone2" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_phone2,cr_issu_mean_no_phone3, 4);" class="txt pdl2" title="전화번호중간자리" style="width:42px; height:18px; line-height:18px;"> -
								<label class="hidden" for="cr_issu_mean_no_phone3">전화번호뒷자리</label><input type="text" id="cr_issu_mean_no_phone3" name="cr_issu_mean_no_phone3" maxlength="4" class="txt pdl2" title="전화번호뒷자리" style="width:42px;height:18px; line-height:18px;">
							 </span>
							 <span id="span_cr_issu_2" style="display:none;">
								<label class="hidden" for="cr_issu_mean_no_credit_crd1">신용카드번호첫째자리</label><input type="text" id="cr_issu_mean_no_credit_crd1" name="cr_issu_mean_no_credit_crd1" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_credit_crd1,cr_issu_mean_no_credit_crd2, 4);" class="txt pdl2" title="신용카드번호첫째자리" style="width:28px; ">-
								<label class="hidden" for="cr_issu_mean_no_credit_crd2">신용카드번호둘째자리</label><input type="text" id="cr_issu_mean_no_credit_crd2" name="cr_issu_mean_no_credit_crd2" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_credit_crd2,cr_issu_mean_no_credit_crd3, 4);" class="txt pdl2" title="신용카드번호둘째자리" style="width:28px; ">-
								<label class="hidden" for="cr_issu_mean_no_credit_crd3">신용카드번호셋째자리</label><input type="text" id="cr_issu_mean_no_credit_crd3" name="cr_issu_mean_no_credit_crd3" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_credit_crd3,cr_issu_mean_no_credit_crd4, 4);" class="txt pdl2" title="신용카드번호셋째자리" style="width:28px; ">-
								<label class="hidden" for="cr_issu_mean_no_credit_crd4">신용카드번호넷째자리</label><input type="text" id="cr_issu_mean_no_credit_crd4" name="cr_issu_mean_no_credit_crd4" maxlength="4" class="txt pdl2" title="신용카드번호넷째자리" style="width:28px; ">
							 </span>
							 <span id="span_cr_issu_4" style="display:none;">
								<label class="hidden" for="cr_issu_mean_no_rcpt_crd1">신용카드번호넷째자리</label><input type="text" id="cr_issu_mean_no_rcpt_crd1" name="cr_issu_mean_no_rcpt_crd1" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_rcpt_crd1,cr_issu_mean_no_rcpt_crd2, 4);" class="txt pdl2" title="현금영수증카드번호첫째자리" style="width:28px; ">-
								<label class="hidden" for="cr_issu_mean_no_rcpt_crd1">신용카드번호넷째자리</label><input type="text" id="cr_issu_mean_no_rcpt_crd2" name="cr_issu_mean_no_rcpt_crd2" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_rcpt_crd2,cr_issu_mean_no_rcpt_crd3, 4);" class="txt pdl2" title="현금영수증카드번호둘째자리" style="width:28px; ">-
								<label class="hidden" for="cr_issu_mean_no_rcpt_crd1">신용카드번호넷째자리</label><input type="text" id="cr_issu_mean_no_rcpt_crd3" name="cr_issu_mean_no_rcpt_crd3" maxlength="4" onkeyup="javascript:goNextField(cr_issu_mean_no_rcpt_crd3,cr_issu_mean_no_rcpt_crd4, 4);" class="txt pdl2" title="현금영수증카드번호셋째자리" style="width:28px; ">-
								<label class="hidden" for="cr_issu_mean_no_rcpt_crd1">신용카드번호넷째자리</label><input type="text" id="cr_issu_mean_no_rcpt_crd4" name="cr_issu_mean_no_rcpt_crd4" maxlength="4" class="txt pdl2" title="현금영수증카드번호넷째자리" style="width:28px; ">
							 </span>
						   </div>
						 </td>
						</tr>
					 </tbody>
				   </table>
				   <div class="texTN">
						&lt;현금영수증 안내&gt;<br><br>	
						정보통신망 이용촉진 및 정보보호 등에 관한 법률 개정으로 인해 2012년 8월 18일부터 주민등록번호 사용이 제한됩니다.<br>					
						주문 시 신청하신 현금영수증은 배송완료후 10일까지 My 쇼핑정보에서 변경신청이 가능합니다.<br>
						할인금액에 대해서는 현금영수증 발급금액에서 제외됩니다.<br>
						부가세법 시행령에 따라 지출증빙용 현금영수증을 신청하신 경우 세금계산서 발급이 제한됩니다.<br><br>
				   </div>
				 </div>
			  </div>
			 <!-- //카드 무이자 할부 안내 -->
			</div>
			<!-- // orderListBox -->
		  </div>
	   </div>
<jsp:include page='${urlFooter}' flush="false" />
</html>