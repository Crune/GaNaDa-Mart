<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="Pdp">
	<div class="content" id="goodsContent" style="display: block">
		<div class="loc-box">
			<span> <a href="/type.gnd?code={분류코드명}">{상위분류}</a>
			</span> <span> &nbsp;&gt;&nbsp; <a href="/type.gnd?code={분류코드명}">${pdp_catalog.cat_name}</a>
			</span>
		</div>
		<div class="item-box clx">
			<div class="overlay_wrap">
				<div class="overlay" style="display: none;"></div>
			</div>
			<div class="right">
				<div class="info">
					<div class="tit">${pdp_product.pd_name}</div>
					<!-- 카테고리 -->
					<div class="loc">{한줄설명}</div>
					<div class="price">
						<span id="itemOriAmtArea" class="ori_price" style="display: none;">{원래가격}원</span>
						<span id="itemPriceArea">${pdp_product.pd_price}원</span>
					</div>
					<div class="ra">
						<div class="star">
							<a href="#" class="go_review"> <span class="rating"> <span
									style="width: 64px;">{평가점수}</span>
							</span>
							</a> <strong>({평가갯수})</strong>
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
					<div id="selectOptionValue" class="color-code">
						<div class="fll">
							<span>{현재색상명}</span>
						</div>
						<div class="flr">
							{현재색상코드_한글} #<span>&nbsp;{현재색상코드}</span>
						</div>
					</div>
					<div id="colorList" class="item-list">
						<!-- 색상 목록 시작 -->
						<ul class="item clx">
							<li><a href="#" class="on" title="704943-005"> <img
									src="{이미지주소}" alt=""
									onerror="this.src='${pageContext.request.contextPath}/img/no-img/50x50.gif'">
							</a></li>
						</ul>
						<!-- 색상 목록 종료 -->
					</div>
				</div>

				<div class="box">
					<div class="btn-group clx" id="itemBtnArea">
						<div class="size-area" id="sizeArea" data-value="240"
							onclick="javascript:fn_catalystSizeList();">
							<a href="#" class="btn-pdp-type1 size"> <span id="selectSize">사이즈</span>
							</a>
							<div class="size-list" style="display: none;">
								<div class="bg">
									<span class="arr"></span>
									<ul id="sizeList" class="clx">
										<li><a href="#" title="240@NK31068567120" class="out">240</a></li>
										<li><a href="#" title="245@NK31068567121" class="out">245</a></li>
										<li><a href="#" title="250@NK31068567122">250</a></li>
										<li><a href="#" title="255@NK31068567123">255</a></li>
										<li><a href="#" title="260@NK31068567124">260</a></li>
										<li><a href="#" title="265@NK31068567125">265</a></li>
										<li><a href="#" title="270@NK31068567126">270</a></li>
										<li><a href="#" title="275@NK31068567127">275</a></li>
										<li><a href="#" title="280@NK31068567128">280</a></li>
										<li><a href="#" title="285@NK31068567129">285</a></li>
										<li><a href="#" title="290@NK31068567130">290</a></li>
										<li><a href="#" title="295@NK31068567131">295</a></li>
										<li><a href="#" title="300@NK31068567132">300</a></li>
										<li><a href="#" title="305@NK31068567133" class="out">305</a></li>
										<li><a href="#" title="310@NK31068567134" class="out">310</a></li>
										<li><a href="#" title="320@NK31068567135" class="out">320</a></li>
										<li><a href="#" title="330@NK31068567136" class="out">330</a></li>
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
					</div>
				</div>

				<div class="guide_msg"
					style="padding: 13px 10px; margin-top: 12px; color: #666; font-size: 12px; line-height: 18px;">
					<!-- h3 style="font-size:12px"-->
					<div class="guide_msg"
						style="padding: 13px 10px; margin-top: 12px; color: #666; font-size: 12px; line-height: 18px;">
						<h3 style="font-size: 12px; font-weight: normal;">
							{가이드}<br>
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

			</div>
			<div class="left">
				<div class="nav">
					<div class="area">
						<ul id="thumbImgList" class="item">
							<c:forEach begin="0" end="5" var="curImgNum">
								<li data-index="${curImgNum }"><a href="#" class="on"
									title=""> <img src="{이미지주소}" alt="{이미지 설명}"
										onerror="this.src='${pageContext.request.contextPath}/img/no-img/50x50.gif'">
								</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>
				<div class="viewer">
					<ul id="detailImgList">
						<c:forEach begin="0" end="5" var="curBigImgNum">
							<c:if test="${curBigImgNum == 0 }">
								<li style="display: list-item;">
							</c:if>
							<c:if test="${curBigImgNum != 0 }">
								<li style="display: none;">
							</c:if>
							<a href="{원본이미지주소}" class="jqzoom" title="" rel="undefined"
								style="outline-style: none; text-decoration: none;">
								<div class="zoomPad">
									<img src="{큰이미지주소}" alt="상품 이미지"
										onerror="this.src='${pageContext.request.contextPath}/img/no-img/400x400.gif'"
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
												<img src="{확대한큰이미지주소}"
													style="position: absolute; border: 0px; display: block; left: -1616.13px; top: -767.742px;">
											</div>
										</div>
									</div>
									<div class="zoomPreload"
										style="visibility: hidden; top: 288.5px; left: 265px; position: absolute;">Loading
										zoom</div>
								</div>
							</a>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>