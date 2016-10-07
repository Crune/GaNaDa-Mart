<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="prd" value="${curProduct.product}"/>
<c:set var="cat1" value="${curProduct.catalogUpUp}"/>
<c:set var="cat2" value="${curProduct.catalogUp}"/>
<c:set var="cat3" value="${curProduct.catalog}"/>
<c:set var="reviews" value="${curProduct.reviews}"/>
<c:set var="colos" value="${curProduct.colos}"/>
<c:set var="images" value="${curProduct.images}"/>
<c:set var="stocks" value="${curProduct.stocks}"/>
<c:set var="infos" value="${curProduct.infos}"/>
<div class="Pdp">
	<div class="content" id="goodsContent" style="display: block">
		<div class="loc-box">
			<span> <a href="/type.gnd?code=${cat1.cat_code}">${cat1.cat_name}</a>
			</span> <span> &nbsp;&gt;&nbsp; <a href="/type.gnd?code=${cat2.cat_code}">${cat2.cat_name}</a>
			</span> <span> &nbsp;&gt;&nbsp; <a href="/type.gnd?code=${cat3.cat_code}">${cat3.cat_name}</a>
			</span>
		</div>
		<div class="item-box clx">
			<div class="overlay_wrap">
				<div class="overlay" style="display: none;"></div>
			</div>
			<div class="right">
				<div class="info">
					<div class="tit">${prd.getPd_name()}</div>
					<!-- 카테고리 -->
					<div class="loc">${curProduct.getTypeText()}</div>
					<div class="price">
						<span id="itemOriAmtArea" class="ori_price" style="display: none;">{원래가격}원</span>
						<span id="itemPriceArea"><fmt:formatNumber value="${prd.getPd_price()}"/>원</span>
					</div>
					<div class="ra">
						<div class="star">
							<a href="#" class="go_review">
								<span class="rating"> <span style="width: 64px;">{평가점수}</span>
								</span>
							</a>
							<strong>(${curProduct.getReviews().size()})</strong>
						</div>
					</div>
					<div class="line"></div>
					<div class="right_sub_cont">
						<p>추가정보</p>
						<p class="view_more"><a href="#" id="btnCardBenefit">더보기</a></p>
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
							<span>${curProduct.getColos().get(0).getC_name()}</span>
						</div>
						<div class="flr">
							${curProduct.getColos().get(0).getC_name()} #<span>&nbsp;${curProduct.getColos().get(0).getC_code()}</span>
						</div>
					</div>
					<div id="colorList" class="item-list">
						<!-- 색상 목록 시작 -->
						<ul class="item clx">
						<c:forEach var="color" items="${curProduct.getColos()}">
							<c:set var="imgUrl" value="/img/product/${curProduct.getImages().get(color.getC_code()).get(0).getIm_name()}"/>
							<li><a href="#" class="on" title="${color.getC_code()}">
									<img src="${imgUrl}" alt="" onerror="this.src='${pageContext.request.contextPath}/img/no-img/50x50.gif'" width="50" height="50">
								</a></li>
						</c:forEach>
						</ul>
						<!-- 색상 목록 종료 -->
					</div>
				</div>
				<div class="box">
					<div class="btn-group clx" id="itemBtnArea">
						<div class="size-area" id="sizeArea" data-value="240" onclick="javascript:fn_catalystSizeList();">
							<a href="#" class="btn-pdp-type1 size">
								<span id="selectSize">사이즈</span>
							</a>
							<div class="size-list" style="display: none;">
								<div class="bg">
									<span class="arr"></span>
									<ul id="sizeList" class="clx">
										<c:forEach var="color" items="${colos}">
											<c:set var="stock" value="${stocks.get(color.c_code)}"/>
											<c:forEach var="curStock" items="${stock}">
												<li><a href="#" title="SZ${curStock.pd_size}@CC${color.c_code}" <c:if test="${curStock.amount<1}"> class="out"</c:if>>${curStock.pd_size}</a></li>
											</c:forEach>
										</c:forEach>
									</ul>
								</div>
							</div>
							<div id="sizeAlertLine" class="alert-line" style="display: none;"></div>
							<div id="sizeAlert" class="alert" style="display: none;">
								<span>사이즈를 선택하세요</span>
							</div>
						</div>
						<div id="qtyArea" class="quantity-area" data-value="240">
							<a href="#" class="btn-pdp-type1 quantity">
								<span id="selectQty">수량</span>
							</a>
							<div class="quantity-list" style="display: none;">
								<div class="bg">
									<ul id="qtyList">
										<c:set var="stock" value="${stocks.get(colos.get(0).c_code)}"/>
										<c:forEach var="curStock" items="${stock}">
											<c:forEach var="curAmount" begin="1" end="10">
												<li><a href="#" title="${curAmount}" <c:if test="${curStock.amount<curAmount}"> class="out"</c:if>>${curAmount}</a></li>
											</c:forEach>
										</c:forEach>
									</ul>
								</div>
							</div>
							<div id="qtyAlertLine" class="alert-line" style="display: none;"></div>
							<div id="qtyAlert" class="alert" style="display: none;">
								<span>수량을 선택하세요</span>
							</div>
						</div>
						<div class="cart-area">
							<a href="javascript:cartSubmit('10');" class="btn-type1 btn-black" id="cartBtn">
								<span class="right" style="width: 56px;">장바구니</span>
							</a>
							<a href="javascript:checkDirectBuy();" class="btn-type1 btn-orange">
								<span class="right" style="width: 56px;">구매하기</span>
							</a>
						</div>
						<div class="g_btn_wish">
							<a href="#">위시리스트담기</a>
						</div>
					</div>
				</div>
				<div class="guide_msg" style="padding: 13px 10px; margin-top: 12px; color: #666; font-size: 12px; line-height: 18px;">
					<!-- h3 style="font-size:12px"-->
					<div class="guide_msg" style="padding: 13px 10px; margin-top: 12px; color: #666; font-size: 12px; line-height: 18px;">
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
								<li data-index="${curImgNum }"><a href="#" class="on" title="">
										<img src="{이미지주소}" alt="{이미지 설명}" onerror="this.src='${pageContext.request.contextPath}/img/no-img/50x50.gif'">
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
							<a href="{원본이미지주소}" class="jqzoom" title="" rel="undefined" style="outline-style: none; text-decoration: none;">
								<div class="zoomPad">
									<img src="{큰이미지주소}" alt="상품 이미지" onerror="this.src='${pageContext.request.contextPath}/img/no-img/400x400.gif'" width="520" style="padding: 50px; opacity: 1;" title="">
									<div class="zoomPup" style="cursor: -webkit-zoom-in; top: 237px; left: 500px; width: 119px; height: 192px; position: absolute; border-width: 1px; display: block;"></div>
									<div class="zoomWindow" style="position: absolute; display: none; z-index: 5001; left: 636px; top: 0px;">
										<div class="zoomWrapper" style="width: 384px;">
											<div class="zoomWrapperTitle" style="width: 100%; position: absolute; display: none;"></div>
											<div class="zoomWrapperImage" style="width: 100%; height: 620px;">
												<img src="{확대한큰이미지주소}" style="position: absolute; border: 0px; display: block; left: -1616.13px; top: -767.742px;">
											</div>
										</div>
									</div>
									<div class="zoomPreload" style="visibility: hidden; top: 288.5px; left: 265px; position: absolute;">Loading zoom</div>
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