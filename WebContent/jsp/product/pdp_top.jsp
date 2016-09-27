<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="${pageContext.request.contextPath}/css/detail.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/detail_new.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/css/global_renewal_phase2.css"
	rel="stylesheet" type="text/css">
<div class="Pdp">
	<div class="content" id="goodsContent" style="display: block">
		<div class="loc-box">
			<span> <a href="/display/displayShop.lecs?displayNo=NK1A72">주니어</a>
			</span> <span> &nbsp;&gt;&nbsp; <a
				href="/display/displayShop.lecs?displayNo=NK1A72A01">신발
					(225-250mm)</a>
			</span>
		</div>
		<div class="item-box clx">
			<div class="overlay_wrap">
				<div class="overlay" style="display: none;"></div>
			</div>
			<div class="right">
				<div class="info">
					<div class="tit">나이키 허라치 프린트</div>
					<!-- 카테고리 -->
					<div class="loc">주니어 &nbsp; 신발 (225-250mm)</div>
					<div class="price">
						<span id="itemOriAmtArea" class="ori_price" style="display: none;">
							99,000원 </span> <span id="itemPriceArea">99,000원</span>
					</div>
					<div class="ra">
						<div class="star">
							<a href="#" class="go_review"> <span class="rating"><span
									style="width: 64px;">5.0</span></span>
							</a> <strong>(1)</strong>
						</div>
					</div>
					<div class="line"></div>
					<div class="right_sub_cont">
						<p>추가정보</p>
						<p class="view_more">
							<a href="#" id="btnCardBenefit">더보기</a>
						</p>
					</div>
<style type="text/css">
.right_sub_cont {
	padding: 10px 0;
}

.right_sub_cont>p {
	line-height: 18px;
}

.right_sub_cont .view_more {
	text-align: right;
}

.right_sub_cont .view_more>a {
	text-decoration: underline;
}
</style>
				</div>
				<div class="box">
					<input type="hidden" id="trackingCode" name="trackingCode"
						value="704943_NK1A72A01">
					<div id="selectOptionValue" class="color-code">
						<div class="fll">
							<span>블랙/블랙-메탈릭 골드-화이트</span>
						</div>
						<div class="flr">
							스타일-컬러 #<span>&nbsp;704943-005</span>
						</div>
					</div>
					<div id="colorList" class="item-list">
						<!-- color -->
						<ul class="item clx">
							<li><a href="#" class="on" title="704943-005"
								onclick="fnlayerDefaultColor('704943-005')"> <img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_50.png"
									alt=""
									onerror="this.src='http://image.nike.co.kr/web/no-img/50x50.gif'">
							</a></li>
						</ul>
					</div>
					<div class="box">
						<a href="#" class="btn_storeStock bt_reserve_service"
							onclick="popStoreStock('layerStoreStock'); setTclick('pc_pdp_inventory_01_704943_NK1A72A01'); return false;">
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
				</div>

				<!-- 150430 품절 : str -->

				<!-- //150430 품절 : end -->

				<div class="box">
					<script type="text/javascript">
						function popSizeGuide() {
							window
									.open(
											'http://www.nike.co.kr/display/displayShop.lecs?displayNo=NK1A47A01&nolayout=yes&sizeGuideCode=030303',
											"_blank",
											"toolbar=yes, scrollbars=yes, resizable=yes, top=0, left=0, width=743, height=600");
						}
					</script>
					<div class="btn-group clx" id="itemBtnArea">
						<div class="size-area" id="sizeArea" data-value="240"
							onclick="javascript:fn_catalystSizeList();">
							<a href="#" class="btn-pdp-type1 size"> <span id="selectSize">사이즈</span>
							</a>
							<div class="size-list" style="display: none;">
								<div class="bg">
									<span class="arr"></span>
									<ul id="sizeList" class="clx">
										<li><a href="#" title="225@NK31073268001">225</a></li>
										<li><a href="#" title="230@NK31073268002">230</a></li>
										<li><a href="#" title="235@NK31073268003">235</a></li>
										<li><a href="#" title="235W@NK31073268007">235W</a></li>
										<li><a href="#" title="240@NK31073268004" class="out">240</a></li>
										<li><a href="#" title="245@NK31073268005" class="out">245</a></li>
										<li><a href="#" title="250@NK31073268006" class="out">250</a></li>
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
							</a> <a href="javascript:checkDirectBuy();"
								class="btn-type1 btn-orange"> <span class="right"
								style="width: 56px;">구매하기</span>
							</a>
						</div>
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
					</div>
				</div>
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
			</div>
			<div class="left">
				<div class="nav">
					<span class="dim first">처음</span> <a href="#" class="up"
						style="display: none;">이전상품으로 가기</a>
					<div class="area">
						<ul id="thumbImgList" class="item">
							<li data-index="0"><a href="#" class="on" title=""><img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_1_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="1"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_2_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="2"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_3_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="3"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_4_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="4"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_5_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
							<li data-index="5"><a href="#" class="" title=""><img
									src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_6_50.png"
									alt=""
									onerror="this.src=' http://image.nike.co.kr//web/no-img/50x50.gif'"></a></li>
						</ul>
					</div>
					<a href="#" class="down" style="display: none;">다음상품으로 가기</a> <span
						class="dim last">마지막</span>
				</div>
				<div class="viewer">
					<ul id="detailImgList">
						<li style="display: list-item;"><a
							href="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_1_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_1_750.png"
										alt=""
										onerror="this.src=' http://image.nike.co.kr//web/no-img/400x400.gif'"
										width="520" style="padding: 50px; opacity: 1;" title="">
									<div class="zoomPup"
										style="cursor: -webkit-zoom-in; top: 237px; left: 500px; width: 119px; height: 192px; position: absolute; border-width: 1px; display: block;"></div>
									<div class="zoomWindow"
										style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 620px;">
												<img
													src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_1_2000.png"
													style="position: absolute; border: 0px; display: block; left: -1616.13px; top: -767.742px;">
											</div>
										</div>
									</div>
									<div class="zoomPreload"
										style="visibility: hidden; top: 288.5px; left: 265px; position: absolute;">Loading
										zoom</div>
								</div></a></li>
						<li style="display: none;"><a
							href="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_2_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_2_750.png"
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
							href="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_3_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_3_750.png"
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
							href="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_4_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_4_750.png"
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
							href="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_5_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_5_750.png"
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
							href="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_6_2000.png"
							class="jqzoom" title="" rel="undefined"
							style="outline-style: none; text-decoration: none;"><div
									class="zoomPad">
									<img
										src="http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_6_750.png"
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
				</div>
				<div class="etc">
					<ul class="clx">
						<li><div class="fb-like fb_iframe_widget"
								data-href="http://www.nike.co.kr/goods/facebookShare.lecs?nolayout=yes&amp;goodsNo=NK31073268&amp;goodsNm=나이키 허라치 프린트&amp;imgUrl=http://image.nike.co.kr/goods/31/07/32/68/704943_COL_704943-005_80.png"
								data-send="false" data-width="90" data-show-faces="false"
								data-layout="button_count" fb-xfbml-state="rendered"
								fb-iframe-plugin-query="app_id=&amp;container_width=0&amp;href=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FfacebookShare.lecs%3Fnolayout%3Dyes%26goodsNo%3DNK31073268%26goodsNm%3D%25EB%2582%2598%25EC%259D%25B4%25ED%2582%25A4%2520%25ED%2597%2588%25EB%259D%25BC%25EC%25B9%2598%2520%25ED%2594%2584%25EB%25A6%25B0%25ED%258A%25B8%26imgUrl%3Dhttp%3A%2F%2Fimage.nike.co.kr%2Fgoods%2F31%2F07%2F32%2F68%2F704943_COL_704943-005_80.png&amp;layout=button_count&amp;locale=ko_KR&amp;sdk=joey&amp;send=false&amp;show_faces=false&amp;width=90">
								<span
									style="vertical-align: top; width: 0px; height: 0px; overflow: hidden;"><iframe
										name="f2fe45216f0338" width="90px" height="1000px"
										frameborder="0" allowtransparency="true"
										allowfullscreen="true" scrolling="no"
										title="fb:like Facebook Social Plugin"
										src="https://www.facebook.com/plugins/like.php?app_id=&amp;channel=http%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2FP5DLcu0KGJB.js%3Fversion%3D42%23cb%3Df145e0c8b938fec%26domain%3Dwww.nike.co.kr%26origin%3Dhttp%253A%252F%252Fwww.nike.co.kr%252Ff2b95f86738885%26relation%3Dparent.parent&amp;container_width=0&amp;href=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FfacebookShare.lecs%3Fnolayout%3Dyes%26goodsNo%3DNK31073268%26goodsNm%3D%25EB%2582%2598%25EC%259D%25B4%25ED%2582%25A4%2520%25ED%2597%2588%25EB%259D%25BC%25EC%25B9%2598%2520%25ED%2594%2584%25EB%25A6%25B0%25ED%258A%25B8%26imgUrl%3Dhttp%3A%2F%2Fimage.nike.co.kr%2Fgoods%2F31%2F07%2F32%2F68%2F704943_COL_704943-005_80.png&amp;layout=button_count&amp;locale=ko_KR&amp;sdk=joey&amp;send=false&amp;show_faces=false&amp;width=90"
										style="border: none; visibility: visible; width: 0px; height: 0px; display: none !important;"
										hidden=""></iframe></span>
							</div></li>
						<li><iframe id="twitter-widget-0" scrolling="no"
								frameborder="0" allowtransparency="true"
								class="twitter-share-button twitter-share-button-rendered twitter-tweet-button"
								title="Twitter Tweet Button"
								src="http://platform.twitter.com/widgets/tweet_button.c6def25548e9590b13abaa1b3330b811.ko.html#dnt=false&amp;id=twitter-widget-0&amp;lang=ko&amp;original_referer=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FshowGoodsDetail.lecs%3FgoodsNo%3DNK31073268%26colorOptionValueCode%3D704943-005%26displayNo%3DNK1A51A02A01&amp;size=m&amp;text=%EB%82%98%EC%9D%B4%ED%82%A4%20%ED%97%88%EB%9D%BC%EC%B9%98%20%ED%94%84%EB%A6%B0%ED%8A%B8%C2%A0%C2%A0Nike%20%EB%82%98%EC%9D%B4%ED%82%A4%EB%8B%B7%EC%BB%B4&amp;time=1474967788277&amp;type=share&amp;url=http%3A%2F%2Fwww.nike.co.kr%2Fgoods%2FshowGoodsDetail.lecs%3FgoodsNo%3DNK31073268"
								style="position: static; visibility: visible; width: 53px; height: 20px;"
								data-url="http://www.nike.co.kr/goods/showGoodsDetail.lecs?goodsNo=NK31073268"></iframe></li>
					</ul>
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