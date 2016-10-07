<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page='/jsp/type/contJSnCSS.jsp' flush="false" />
<form method="get" name="listForm" id="listForm" action="/display/displayShop.lecs">
	<input type="hidden" name="displayNo" id="displayNo" value="NK1A50A02A03">
	<input type="hidden" name="listSortCode" id="listSortCode" value="15">
	<input type="hidden" name="currentPage" id="currentPage" value="1">
	<input type="hidden" name="lastPage" id="lastPage" value="2">
	<input type="hidden" name="autoPageIndex" id="autoPageIndex" value="0">
	<input type="hidden" name="imgSize" id="imgSize" value="180">
	<input type="hidden" name="allYn" id="allYn" value="">
	<div class="global_gridwall_top_info">
		<h2 class="global_sec_tit">
			WOMEN 트레이닝 &amp; 짐 신발
			<span>55</span>
		</h2>
		<div class="global_list_item">
			<div class="global_heading_sort">
				<div class="global_sect_menu">
					<a href="#" class="global_sect_field">
						<span class="">추천순</span>
					</a>
					<ul class="global_sect_menu_list">
						<li class="active"><a href="javascript:fn_changeSort('15');fn_catalystSort('priority');">추천순</a></li>
						<li><a href="javascript:fn_changeSort('10');fn_catalystSort('newest');">최신순</a></li>
						<li><a href="javascript:fn_changeSort('11');fn_catalystSort('highest selling');">판매순</a></li>
						<li><a href="javascript:fn_changeSort('12');fn_catalystSort('price low-high');">낮은가격순</a></li>
						<li><a href="javascript:fn_changeSort('13');fn_catalystSort('price high-low');">높은가격순</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="global_gridwall">
		<ul class="global_gridwall_list" id="add_goods_list">
			<script>
				function fn_showGoodsDetail(code) {
					window.location.href = "/pdp.gnd?code=" + code;
				}
			</script>
<c:forEach var="curProduct" items="prdList">
	<c:set var="prd" value="${curProduct.product}"/>
	<c:set var="cat1" value="${curProduct.catalogUpUp}"/>
	<c:set var="cat2" value="${curProduct.catalogUp}"/>
	<c:set var="cat3" value="${curProduct.catalog}"/>
	<c:set var="reviews" value="${curProduct.reviews}"/>
	<c:set var="colos" value="${curProduct.colos}"/>
	<c:set var="images" value="${curProduct.images}"/>
	<c:set var="stocks" value="${curProduct.stocks}"/>
	<c:set var="infos" value="${curProduct.infos}"/>

	<li class="global_gridwall_col">
				<div class="global_gridwall_container">
					<a href="#" onclick="javascript:fn_showGoodsDetail(${prd.pd_code}); return false;" class="global_gridwall_img" id="A_NK31073834_843975-001_A">
						<img id="_NK31073834_843975-001_" src="http://image.nike.co.kr/goods/31/07/38/34/843975_COL_843975-001_180.png" alt="나이키 에어 줌 스트롱">
					</a>
					<div class="global_gridwall_item">
						<div class="gridwall_customization_opt">
							<div class="gridwall_item_soldout">
								${colos.size()}
								<span>컬러</span>
							</div>
						</div>
						<span class="gridwall_item_title">${prd.pd_name}</span>
						<span class="gridwall-item__subtitle">${curProduct.getTypeText()}</span>
						<span class="gridwall-item__price"> <fmt:formatNumber value="${prd.getPd_price()}"/>원 </span>
					</div>
				</div>
			</li>
</c:forEach>
		</ul>
		<!-- LIST PAGE 이미지 로딩 부분 추가 Start -->
		<ul id="goodsListLoadingImg" class="goodsListLoadingImg" style="display: none;">
			<li><img src="http://image.nike.co.kr/web/ico/loading.gif" title="loading" alt="loading"></li>
		</ul>
		<!--// LIST PAGE 이미지 로딩 부분 추가 End -->
	</div>
</form>