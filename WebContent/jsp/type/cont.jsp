<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="P1 banner-area">
	<div class="container">
		<div class="bnr_item nsw_pwh">
			<div class="bnr_item_inner">
				<div class="bg_img">
					<img alt="bg" class="bg"
						src="http://image.nike.co.kr/display/corner/882/160705_women_shoes_pwh_bg1.png">
				</div>
				${topBannerHTML}
			</div>
		</div>
	</div>
</div>
<jsp:include page='/jsp/type/contJSnCSS.jsp' flush="false" />

<!-- 필터 전용 Form -->
<form method="get" name="filterListForm" id="filterListForm"
	action="/display/displayShop.lecs">
	<input type="hidden" name="displayNo" id="filterDisplayNo"
		value="NK1A50A02A03"> <input type="hidden" name="listSortCode"
		id="filterListSortCode" value="15"> <input type="hidden"
		name="currentPage" id="filterCurrentPage" value="1"> <input
		type="hidden" name="lastPage" id="filterLastPage" value="2"> <input
		type="hidden" name="autoPageIndex" id="filterAutoPageIndex" value="0">
	<input type="hidden" name="imgSize" id="filterImgSize" value="180">
	<input type="hidden" name="allYn" id="filterAllYn" value="">
	<!-- 적용 필터 목록 -->
</form>
<!-- 필터 전용 Form -->

<form method="get" name="listForm" id="listForm"
	action="/display/displayShop.lecs">
	<input type="hidden" name="displayNo" id="displayNo"
		value="NK1A50A02A03"> <input type="hidden" name="listSortCode"
		id="listSortCode" value="15"> <input type="hidden"
		name="currentPage" id="currentPage" value="1"> <input
		type="hidden" name="lastPage" id="lastPage" value="2"> <input
		type="hidden" name="autoPageIndex" id="autoPageIndex" value="0">
	<input type="hidden" name="imgSize" id="imgSize" value="180"> <input
		type="hidden" name="allYn" id="allYn" value="">

	<div class="global_gridwall_top_info">
		<h2 class="global_sec_tit">
			WOMEN 트레이닝 &amp; 짐 신발 <span>55</span>
		</h2>

		<div class="global_list_item">
			<div class="global_heading_sort">
				<div class="global_sect_menu">

					<a href="#" class="global_sect_field">
						<span class="">추천순</span>
					</a>
					<ul class="global_sect_menu_list">
						<li class="active"><a
							href="javascript:fn_changeSort('15');fn_catalystSort('priority');">추천순</a>
						</li>
						<li><a
							href="javascript:fn_changeSort('10');fn_catalystSort('newest');">최신순</a>
						</li>
						<li><a
							href="javascript:fn_changeSort('11');fn_catalystSort('highest selling');">판매순</a>
						</li>
						<li><a
							href="javascript:fn_changeSort('12');fn_catalystSort('price low-high');">낮은가격순</a>
						</li>
						<li><a
							href="javascript:fn_changeSort('13');fn_catalystSort('price high-low');">높은가격순</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="global_gridwall">
		<ul class="global_gridwall_list" id="add_goods_list">
		
			<li class="global_gridwall_col">
				<div class="global_gridwall_container">
					<a href="#"
						onclick="javascript:fn_showGoodsDetail({goodsNo:'NK31073834', colorOptionValueCode:'843975-001', displayNo:'NK1A50A02A03'}); return false;"
						class="global_gridwall_img" id="A_NK31073834_843975-001_A"> <img
						id="_NK31073834_843975-001_"
						src="http://image.nike.co.kr/goods/31/07/38/34/843975_COL_843975-001_180.png"
						alt="나이키 에어 줌 스트롱">
					</a>
					<div class="global_gridwall_item">
						<div class="gridwall_customization_opt">
							<div class="gridwall_item_soldout">
								3 <span>컬러</span>
							</div>
						</div>
						<span class="gridwall_item_title">나이키 에어 줌 스트롱</span> <span
							class="gridwall-item__subtitle">WOMEN 신발 트레이닝 &amp; 짐</span> <span
							class="gridwall-item__price"> 139,000원 </span>
					</div>
				</div>
			</li>
			
			<li class="global_gridwall_col">
				<div class="global_gridwall_container">
					<a href="#"
						onclick="javascript:fn_showGoodsDetail({goodsNo:'NK31073834', colorOptionValueCode:'843975-400', displayNo:'NK1A50A02A03'}); return false;"
						class="global_gridwall_img" id="A_NK31073834_843975-400_A"> <img
						id="_NK31073834_843975-400_"
						src="http://image.nike.co.kr/goods/31/07/38/34/843975_COL_843975-400_180.png"
						alt="나이키 에어 줌 스트롱">
					</a>
					<div class="global_gridwall_item">
						<div class="gridwall_customization_opt">
							<div class="gridwall_item_soldout">
								3 <span>컬러</span>
							</div>
						</div>
						<span class="gridwall_item_title">나이키 에어 줌 스트롱</span> <span
							class="gridwall-item__subtitle">WOMEN 신발 트레이닝 &amp; 짐</span> <span
							class="gridwall-item__price"> 139,000원 </span>
					</div>
				</div>
			</li>			

		</ul>
				
		<!-- LIST PAGE 이미지 로딩 부분 추가 Start -->
		<ul id="goodsListLoadingImg" class="goodsListLoadingImg"
			style="display: none;">
			<li><img src="http://image.nike.co.kr/web/ico/loading.gif"
				title="loading" alt="loading"></li>
		</ul>
		<!--// LIST PAGE 이미지 로딩 부분 추가 End -->
	</div>
</form>