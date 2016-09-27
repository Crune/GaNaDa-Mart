<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="Pdp">
	<div class="content" id="goodsContent" style="display: block">
		<div class="loc-box">
			<span> <a href="/display/displayShop.lecs?displayNo=NK1A49">MEN</a>
			</span> <span> &nbsp;&gt;&nbsp; <a
				href="/display/displayShop.lecs?displayNo=NK1A49A01">신발</a>
			</span> <span> &nbsp;&gt;&nbsp; <a
				href="/display/displayShop.lecs?displayNo=NK1A49A01A01">라이프스타일</a>
			</span> <span> </span>
		</div>
		<div class="item-box clx">
			<div class="overlay_wrap">
				<div class="overlay" style="display: none;"></div>
			</div>
			<div class="right">
				<div class="info">
					<div class="tit">나이키 에어맥스 1 울트라 플라이니트</div>
					<!-- 카테고리 -->
					<div class="loc">MEN &nbsp; 신발 &nbsp; 라이프스타일</div>
					<div class="price">						<!-- 세일 or 가격인하 - 2015.07.23 세일 또는 가격인하가 아닌 옵션할인인 경우에도 비교가격 표기 필요 -->
						<span id="itemOriAmtArea" class="ori_price" style="display: none;">
							209,000원 </span> <span id="itemPriceArea">209,000원</span>
					</div>
					<div class="ra">
						<!-- <a href="javascript:viewCreateAssessmentArea();">상품리뷰작성</a> -->
						<div class="star">
							<a href="#" class="go_review"> <span class="rating"><span
									style="width: 60.16px;">4.7</span></span>
							</a> <strong>(51)</strong>
						</div>
					</div>
					<div class="line"></div>
					<!-- 150416 신용카드 혜택 : str (HTML1-안내문구)-->
					<div class="card_benefit">
						<p>카드사별 무이자 할부 안내</p>
						<p class="view_more">
							<a href="#" id="btnCardBenefit">혜택 자세히 보기 </a>
						</p>
					</div>
					<style type="text/css">
/* 150416 카드 할부 혜택 : str */
.card_benefit {
	padding: 10px 0;
}

.card_benefit>p {
	line-height: 18px;
}

.card_benefit .view_more {
	text-align: right;
}

.card_benefit .view_more>a {
	text-decoration: underline;
}

.pop_card_benefit {
	display: none;
	position: absolute;
	top: 100px;
	left: 50%;
	width: 840px;
	margin-left: -420px;
	background: #fff;
	border-radius: 5px;
	z-index: 1002;
}

.pop_card_benefit .pop_inner {
	position: relative;
	padding: 40px;
}

.pop_card_benefit .close {
	display: block;
	position: absolute;
	top: 20px;
	right: 20px;
	background: url(http://image.nike.co.kr/web/btn/btn_close_guide.png) 0 0
		no-repeat;
	width: 13px;
	height: 13px;
	text-indent: -10000px;
}

.pop_card_benefit .tit {
	display: block;
	padding-bottom: 20px;
	font-size: 20px;
	font-weight: bold;
	border-bottom: 1px solid #ccc;
}

.pop_card_benefit .pop_content {
	width: 100%;
	padding-top: 20px;
}

.pop_card_benefit .pop_content:after {
	content: "";
	clear: both;
	display: block;
}

.pop_card_benefit .pop_content .pop_left {
	float: left;
	width: 390px;
}

.pop_card_benefit .pop_content .pop_right {
	float: left;
	width: 330px;
	padding-left: 30px;
}

.pop_card_benefit .pop_content .tbl_box {
	width: 100%;
}

.pop_card_benefit .pop_content .tbl_box .table-type1 {
	width: 100%;
	table-layout: fixed;
}

.pop_card_benefit .pop_content .tbl_box .table-type1 th {
	padding: 7px 0 5px;
	font-size: 11px;
}

.pop_card_benefit .pop_content .tbl_box .table-type1 tbody th,
	.pop_card_benefit .pop_content .tbl_box .table-type1 tbody td {
	padding: 6px 0 3px;
	background: #fff;
	font-size: 11px;
	font-weight: normal;
	color: #666;
	text-align: center;
	line-height: 18px;
}

.pop_card_benefit .pop_content .pop_right .desc li {
	position: relative;
	margin-top: 25px;
	padding-left: 8px;
	background: url(http://image.nike.co.kr/web/ico/ico-list-dot.png) 0 7px
		no-repeat;
	font-size: 11px;
	line-height: 19px;
	font-family: "돋움";
	color: #666;
	letter-spacing: -0.08em;
}

.pop_card_benefit .pop_content .pop_right .desc li:first-child {
	margin-top: 0;
}

.pop_card_benefit .pop_content .pop_right .desc li.no_dot {
	background: none;
	color: #000;
}

.pop_card_benefit .pop_content .pop_right .desc li.no_dot span {
	position: absolute;
	left: 0;
	top: 0;
}

.pop_card_benefit .pop_content .pop_right .desc li strong {
	color: #333;
}
/* 150416 카드 할부 혜택 : end */
</style>
					<script type="text/javascript">
						$(
								function() {

									$('#btnCardBenefit')
											.on(
													"click",
													function(e) {
														e.preventDefault();

														showDim();
														$("#popCardBenefit")
																.show();
														$("#popCardBenefit")
																.find(".close")
																.on(
																		"click",
																		function(
																				e) {
																			e
																					.preventDefault();
																			hideDim();
																			$(
																					"#popCardBenefit")
																					.hide();
																		});
													})

								})
					</script>




					<!--  //150416 신용카드 혜택 : end -->



				</div>

				<div class="box">

					<!-- 2016.04.21. [smartchecker-1665] PDP 매장재고영역 클릭수 트래킹 추가 -->






					<input type="hidden" id="trackingCode" name="trackingCode"
						value="843384_NK1A49A01A01A05">




					<!-- 150925 -->
					<div id="selectOptionValue" class="color-code">
						<div class="fll">
							<span>브라이트 크림슨/화이트-유니바시티 레드</span>
						</div>
						<div class="flr">
							스타일-컬러 #<span>&nbsp;843384-601</span>
						</div>
					</div>
					<div id="colorList" class="item-list">
						<!-- color -->
						<ul class="item clx">



							<li><a href="#" class="" title="843384-701"
								onclick="fnlayerDefaultColor('843384-701')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-701_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>






							<li><a href="#" class="" title="843384-001"
								onclick="fnlayerDefaultColor('843384-001')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-001_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>






							<li><a href="#" class="" title="843384-100"
								onclick="fnlayerDefaultColor('843384-100')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-100_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>






							<li><a href="#" class="" title="843384-101"
								onclick="fnlayerDefaultColor('843384-101')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-101_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>






							<li><a href="#" class="" title="843384-301"
								onclick="fnlayerDefaultColor('843384-301')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-301_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>






							<li><a href="#" class="" title="843384-401"
								onclick="fnlayerDefaultColor('843384-401')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-401_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>






							<li><a href="#" class="on" title="843384-601"
								onclick="fnlayerDefaultColor('843384-601')"> <img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>










						</ul>


					</div>



					<div class="box">
						<a href="#" class="btn_storeStock bt_reserve_service"
							onclick="popStoreStock('layerStoreStock'); setTclick('pc_pdp_inventory_01'); return false;">
							<span>매장재고 예약 서비스</span>
						</a>&nbsp;
						<!-- 매장재고확인 20151016 -->
						<a
							href="http://www.nike.co.kr/display/displayShop.lecs?displayNo=NK1A66"><img
							src="http://image.nike.co.kr/web/global/g_ico_q2.png" alt=""></a>
						<p class="mt5" style="padding-bottom: 18px">
							NIKE.COM에서 예약하시고, 매장에서 찾아가세요. 매장상품 재고 확인 후, <br>구매 예약이
							가능합니다.
						</p>
					</div>



					<!-- 20140821 옵션할인제품 s -->

					<!-- 20140821 옵션할인제품 e -->
				</div>

				<!-- 150430 품절 : str -->

				<!-- //150430 품절 : end -->

				<div class="box">
					<!-- 150608 구매 가이드 : str -->
					<!-- 구매가이드가 두번 나와서 주석 처리 함
					
						
							<div class="guide_msg" style="padding:13px 10px;margin-top:12px;color:#666;font-size:12px;line-height:18px;">
    

<h3 style="font-size:12px;font-weight:normal;">
Air Max에는 최초로 적용된 플라이니트 갑피에 울트라 미드솔, 그리고 Air Max 고유의 쿠셔닝이 만나 하루 종일 편안한 착화감을 느낄 수 있습니다.  <BR> <a href="http://www.nike.co.kr/display/displayShop.lecs?displayNo=NK1A56A02A10" class="store-btn">Nike.com/AirMax </a>에서 더 자세한 내용을 확인해보세요. 

<BR>


</h3>
</div>
<style type="text/css">
    .store-btn{text-decoration:underline;font-weight:600;}
    .store-btn:hover{text-decoration:underline}
    .m-store-btn{display:none !important}
    .goods_view_new .m-store-btn{display:inline !important; margin-top:0; font-weight:600; cursor:pointer}
</style>


							
								<div class="btn_sizechart_store"><a href="#" onclick="popSizeGuide()">사이즈 가이드</a></div>
							
						
						
					
					-->

					<script type="text/javascript">
						function popSizeGuide() {
							window
									.open(
											'http://www.nike.co.kr/display/displayShop.lecs?displayNo=NK1A47A01&nolayout=yes&sizeGuideCode=010300',
											"_blank",
											"toolbar=yes, scrollbars=yes, resizable=yes, top=0, left=0, width=743, height=600");
						}
					</script>
					<!-- //150608 구매 가이드 : end -->

					<div class="btn-group clx" id="itemBtnArea">
						<div class="size-area" id="sizeArea" data-value="240"
							onclick="javascript:fn_catalystSizeList();">
							<a href="#" class="btn-pdp-type1 size"> <span id="selectSize">사이즈</span>
							</a>
							<div class="size-list" style="display: none;">
								<div class="bg">
									<span class="arr"></span>
									<ul id="sizeList" class="clx">
										<li><a href="#" title="240@NK31073701103" class="out">240</a></li>
										<li><a href="#" title="245@NK31073701104" class="out">245</a></li>
										<li><a href="#" title="250@NK31073701105">250</a></li>
										<li><a href="#" title="255@NK31073701106">255</a></li>
										<li><a href="#" title="260@NK31073701107">260</a></li>
										<li><a href="#" title="265@NK31073701108">265</a></li>
										<li><a href="#" title="270@NK31073701109">270</a></li>
										<li><a href="#" title="275@NK31073701110">275</a></li>
										<li><a href="#" title="280@NK31073701111">280</a></li>
										<li><a href="#" title="285@NK31073701112">285</a></li>
										<li><a href="#" title="290@NK31073701113">290</a></li>
										<li><a href="#" title="295@NK31073701114">295</a></li>
										<li><a href="#" title="300@NK31073701115" class="out">300</a></li>
										<li><a href="#" title="305@NK31073701116" class="out">305</a></li>
										<li><a href="#" title="310@NK31073701117" class="out">310</a></li>
										<li><a href="#" title="320@NK31073701118" class="out">320</a></li>
										<li><a href="#" title="330@NK31073701119" class="out">330</a></li>
									</ul>
								</div>
							</div>
							<div id="sizeAlertLine" class="alert-line" style="display: none;"></div>
							<div id="sizeAlert" class="alert" style="display: none;">
								<span>사이즈를 선택하세요</span>
							</div>
						</div>


						<div id="qtyArea" class="quantity-area" data-value="240">
							<a href="#" class="btn-pdp-type1 quantity"> <span
								id="selectQty">수량</span>
							</a>
							<div class="quantity-list" style="display: none;">
								<div class="bg">
									<ul id="qtyList">
										<li><a href="#" title="1" class="out">1</a></li>
										<li><a href="#" title="2" class="out">2</a></li>
										<li><a href="#" title="3" class="out">3</a></li>
										<li><a href="#" title="4" class="out">4</a></li>
										<li><a href="#" title="5" class="out">5</a></li>
										<li><a href="#" title="6" class="out">6</a></li>
										<li><a href="#" title="7" class="out">7</a></li>
										<li><a href="#" title="8" class="out">8</a></li>
										<li><a href="#" title="9" class="out">9</a></li>
										<li><a href="#" title="10" class="out">10</a></li>
									</ul>
								</div>
							</div>
							<div id="qtyAlertLine" class="alert-line" style="display: none;"></div>
							<div id="qtyAlert" class="alert" style="display: none;">
								<span>수량을 선택하세요</span>
							</div>
						</div>
						<div class="cart-area">
							<a href="javascript:cartSubmit('10');"
								class="btn-type1 btn-black" id="cartBtn"> <span
								class="right" style="width: 56px;">장바구니</span>
							</a>
							<!-- <a href="javascript:cartSubmit('20');" class="btn-type1 btn-orange"> -->

							<a href="javascript:checkDirectBuy();"
								class="btn-type1 btn-orange"> <span class="right"
								style="width: 56px;">구매하기</span>
							</a>
						</div>

						<!-- 20160425 wishlist담기 추가 -->
						<div class="g_btn_wish">
							<a href="#">위시리스트담기</a>
						</div>

						<script type="text/javascript">
							$(function() {
								$('.g_btn_wish').find('a').click(function() {
									insertMyLocker();
									return false;
								});
								$('.layer-cart').find('.close').click(
										function() {
											$(".layer-cart").stop(true, false)
													.animate({
														top : "-187px"
													}, 1000);
											return false;
										});
							});
						</script>
						<!--// 20160425 wishlist담기 추가 -->
					</div>
				</div>

				<!-- 20160614 guide_msg / btn_sizechart_store 위치변경 -->


				<div class="guide_msg"
					style="padding: 13px 10px; margin-top: 12px; color: #666; font-size: 12px; line-height: 18px;">
					<!-- h3 style="font-size:12px"-->
					<div class="guide_msg"
						style="padding: 13px 10px; margin-top: 12px; color: #666; font-size: 12px; line-height: 18px;">


						<h3 style="font-size: 12px; font-weight: normal;">
							Air Max에는 최초로 적용된 플라이니트 갑피에 울트라 미드솔, 그리고 Air Max 고유의 쿠셔닝이 만나 하루
							종일 편안한 착화감을 느낄 수 있습니다. <br> <a
								href="http://www.nike.co.kr/display/displayShop.lecs?displayNo=NK1A56A02A10"
								class="store-btn">Nike.com/AirMax </a>에서 더 자세한 내용을 확인해보세요. <br>


						</h3>
					</div>
					<style type="text/css">
.store-btn {
	text-decoration: underline;
	font-weight: 600;
}

.store-btn:hover {
	text-decoration: underline
}

.m-store-btn {
	display: none !important
}

.goods_view_new .m-store-btn {
	display: inline !important;
	margin-top: 0;
	font-weight: 600;
	cursor: pointer
}
</style>


					<!--/h3-->
				</div>



				<!-- //20160614 guide_msg / btn_sizechart_store 위치변경 -->

				<div class="btn_sizechart_store clear">
					<a href="#" class="fr" onclick="popSizeGuide()">사이즈 가이드</a>
				</div>







				<div class="item-noti">
					<div class="des">
						<a
							href="http://www.nike.co.kr/display/displayShop.lecs?displayNo=NK1A29A21"
							target="_blank" class="btn-detail">직접 입어보고 신어본 후 결정하세요!<br>NIKE.COM
							전 제품 무료 배송/반품 서비스
						</a>
					</div>
				</div>
				<!-- 150904 span -> div로 태그 변경 -->


				<!-- 예약상품일 경우  -->







			</div>

			<script type="text/javascript">
				
			</script>
			<div class="left">
				<div class="nav">
					<span class="dim first">처음</span>
					<!-- 20141201 추가 -->
					<a href="#" class="up" style="display: none;">이전상품으로 가기</a>
					<div class="area">
						<ul id="thumbImgList" class="item">
							<li data-index="0"><a href="#" class="on" title=""><img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_1_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="1"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_2_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="2"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_3_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="3"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_4_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="4"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_5_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="5"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_6_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
						</ul>
					</div>
					<a href="#" class="down" style="display: none;">다음상품으로 가기</a> <span
						class="dim last">마지막</span>
					<!-- 20141201 추가 -->
				</div>
				<div class="viewer">
					<ul id="detailImgList">
						<li style="display: list-item;"><a
							href="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_1_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_1_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px; opacity: 1;" title="">
									<div class="zoomPup"
										style="cursor: -webkit-zoom-in; top: 46px; left: 140.5px; width: 119px; height: 192px; position: absolute; border-width: 1px; display: none;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;">
												<img
													src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_1_2000.png"
													style="position: absolute; border: 0px; display: block; left: -456.452px; top: -151.613px;">
											</div>
										</div>
									</div>
									<div class="zoomPreload"
										style="visibility: hidden; top: 288.5px; left: 265px; position: absolute;">Loading
										zoom</div>
								</div></a></li>
						<li style="display: none;"><a
							href="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_2_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_2_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px">
									<div class="zoomPup"
										style="display: none; cursor: -webkit-zoom-in;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;"></div>
										</div>
									</div>
									<div class="zoomPreload" style="visibility: hidden;">Loading
										zoom</div>
								</div></a></li>
						<li style="display: none;"><a
							href="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_3_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_3_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px">
									<div class="zoomPup"
										style="display: none; cursor: -webkit-zoom-in;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;"></div>
										</div>
									</div>
									<div class="zoomPreload" style="visibility: hidden;">Loading
										zoom</div>
								</div></a></li>
						<li style="display: none;"><a
							href="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_4_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_4_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px">
									<div class="zoomPup"
										style="display: none; cursor: -webkit-zoom-in;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;"></div>
										</div>
									</div>
									<div class="zoomPreload" style="visibility: hidden;">Loading
										zoom</div>
								</div></a></li>
						<li style="display: none;"><a
							href="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_5_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_5_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px">
									<div class="zoomPup"
										style="display: none; cursor: -webkit-zoom-in;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;"></div>
										</div>
									</div>
									<div class="zoomPreload" style="visibility: hidden;">Loading
										zoom</div>
								</div></a></li>
						<li style="display: none;"><a
							href="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_6_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-601_6_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px">
									<div class="zoomPup"
										style="display: none; cursor: -webkit-zoom-in;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;"></div>
										</div>
									</div>
									<div class="zoomPreload" style="visibility: hidden;">Loading
										zoom</div>
								</div></a></li>
					</ul>
					<!-- <a href="#" class="expand-btn">확대하기</a> -->
				</div>

				<div class="etc">
					<ul class="clx">






						<!-- 2016.03.24 전시안함,판매종료 조건추가 -->


						<li><div class="fb-like fb_iframe_widget"
								data-href="http://www.nike.co.kr/goods/facebookShare.lecs?nolayout=yes&amp;goodsNo=NK31073701&amp;goodsNm=나이키 에어맥스 1 울트라 플라이니트&amp;imgUrl=http://image.nike.co.kr/goods/31/07/37/01/843384_COL_843384-401_80.png"
								data-send="false" data-width="90" data-show-faces="false"
								data-layout="button_count" fb-xfbml-state="rendered"
								fb-iframe-plugin-query="app_id=&amp;container_width=0&amp;href=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FfacebookShare.lecs%3Fnolayout%3Dyes%26goodsNo%3DNK31073701%26goodsNm%3D%25EB%2582%2598%25EC%259D%25B4%25ED%2582%25A4%2520%25EC%2597%2590%25EC%2596%25B4%25EB%25A7%25A5%25EC%258A%25A4%25201%2520%25EC%259A%25B8%25ED%258A%25B8%25EB%259D%25BC%2520%25ED%2594%258C%25EB%259D%25BC%25EC%259D%25B4%25EB%258B%2588%25ED%258A%25B8%26imgUrl%3Dhttp%3A%2F%2Fimage.nike.co.kr%2Fgoods%2F31%2F07%2F37%2F01%2F843384_COL_843384-401_80.png&amp;layout=button_count&amp;locale=ko_KR&amp;sdk=joey&amp;send=false&amp;show_faces=false&amp;width=90">
								<span style="vertical-align: bottom; width: 89px; height: 20px;"><iframe
										name="f2f86278d1f9c68" width="90px" height="1000px"
										frameborder="0" allowtransparency="true"
										allowfullscreen="true" scrolling="no"
										title="fb:like Facebook Social Plugin"
										src="https://www.facebook.com/plugins/like.php?app_id=&amp;channel=http%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2FP5DLcu0KGJB.js%3Fversion%3D42%23cb%3Dffdd43bce21cc8%26domain%3Dwww.nike.co.kr%26origin%3Dhttp%253A%252F%252Fwww.nike.co.kr%252Ff1a1679969d31b4%26relation%3Dparent.parent&amp;container_width=0&amp;href=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FfacebookShare.lecs%3Fnolayout%3Dyes%26goodsNo%3DNK31073701%26goodsNm%3D%25EB%2582%2598%25EC%259D%25B4%25ED%2582%25A4%2520%25EC%2597%2590%25EC%2596%25B4%25EB%25A7%25A5%25EC%258A%25A4%25201%2520%25EC%259A%25B8%25ED%258A%25B8%25EB%259D%25BC%2520%25ED%2594%258C%25EB%259D%25BC%25EC%259D%25B4%25EB%258B%2588%25ED%258A%25B8%26imgUrl%3Dhttp%3A%2F%2Fimage.nike.co.kr%2Fgoods%2F31%2F07%2F37%2F01%2F843384_COL_843384-401_80.png&amp;layout=button_count&amp;locale=ko_KR&amp;sdk=joey&amp;send=false&amp;show_faces=false&amp;width=90"
										style="border: none; visibility: visible; width: 89px; height: 20px;"
										class=""></iframe></span>
							</div></li>
						<li><iframe id="twitter-widget-0" scrolling="no"
								frameborder="0" allowtransparency="true"
								class="twitter-share-button twitter-share-button-rendered twitter-tweet-button"
								title="Twitter Tweet Button"
								src="http://platform.twitter.com/widgets/tweet_button.289140617d6d66fbee36bb5f0535b846.ko.html#dnt=false&amp;id=twitter-widget-0&amp;lang=ko&amp;original_referer=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FshowGoodsDetail.lecs%3FgoodsNo%3DNK31073701%26colorOptionValueCode%3D843384-401%26displayNo%3DNK1A49A01&amp;size=m&amp;text=%EB%82%98%EC%9D%B4%ED%82%A4%20%EC%97%90%EC%96%B4%EB%A7%A5%EC%8A%A4%201%20%EC%9A%B8%ED%8A%B8%EB%9D%BC%20%ED%94%8C%EB%9D%BC%EC%9D%B4%EB%8B%88%ED%8A%B8%C2%A0%C2%A0Nike%20%EB%82%98%EC%9D%B4%ED%82%A4%EB%8B%B7%EC%BB%B4&amp;time=1474615188945&amp;type=share&amp;url=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FshowGoodsDetail.lecs%3FgoodsNo%3DNK31073701"
								style="position: static; visibility: visible; width: 53px; height: 20px;"
								data-url="http://www.nike.co.kr/goods/showGoodsDetail.lecs?goodsNo=NK31073701"></iframe></li>




					</ul>
					<!-- <div id="selectOptionValue" class="color-code"></div> -->
					<!-- 150925 위치변경으로 제거 -->
				</div>

				<!-- S - twitter button -->
				<script>
					!function(d, s, id) {
						var js, fjs = d.getElementsByTagName(s)[0];
						if (!d.getElementById(id)) {
							js = d.createElement(s);
							js.id = id;
							js.src = "//platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js, fjs);
						}
					}(document, "script", "twitter-wjs");
				</script>
				<!-- E - twitter button -->

				<!-- S - facebook like button-->
				<div id="fb-root"></div>
				<script>
					(function(d, s, id) {
						var js, fjs = d.getElementsByTagName(s)[0];
						if (d.getElementById(id))
							return;
						js = d.createElement(s);
						js.id = id;
						js.src = "//connect.facebook.net/ko_KR/all.js#xfbml=1";
						fjs.parentNode.insertBefore(js, fjs);
					}(document, 'script', 'facebook-jssdk'));
				</script>
				<!-- E - facebook like button -->
			</div>
		</div>
	</div>
</div>