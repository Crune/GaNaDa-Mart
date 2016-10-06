<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="Local-tab bgM1_1" id="localTab" style="">
	<div class="section-title">
		<!--<h2>상품부가정보</h2>-->
	</div>
	<div class="conTab" style="height: 1069px;">
		<div class="tab">
			<div class="active-tab">상세정보</div>
			<ul class="clx">
				<li><a href="#" class="menu" data-index="0" id="conTabSub1">상세정보</a>
					<div class="conArea" style="display: block;">${curProduct.getInfos().get(0).getPd_infocontent()}</div></li>
				<li><a href="#" class="menu" data-index="1">배송/결제 정보</a>
					<div class="conArea" style="display: none;">${curProduct.getInfos().get(1).getPd_infocontent()}</div></li>
				<li><a href="#" class="menu" data-index="2">유의사항</a>
					<div class="conArea" style="display: none;">${curProduct.getInfos().get(2).getPd_infocontent()}</div></li>
				<li><a href="#" class="menu" data-index="3">교환/반품/AS</a>
					<div class="conArea" style="display: none;">${curProduct.getInfos().get(3).getPd_infocontent()}</div></li>
			</ul>
		</div>
	</div>
</div>