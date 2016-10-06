<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="AboutList bgM1_1" id="aboutList" style="">
	<div class="section-title">
		<h2>추천하는 상품</h2>
	</div>
	<div class="listBox">
		<!-- 리스트 한줄 (한개의 ul에 li는 최대 4개)-->
		<ul class="listArea clx">
			<!-- 상품 시작 -->
			<c:forEach begin="1" end="4">
				<li class="fir">
					<div class="unit">
						<ul class="mainImg">
							<li><a href="javascript:null;" class="img" id="{상품코드}">
									<img	src="${pageContext.request.contextPath}/img/{상품_이미지_180}"
											alt="{상품명}" id="{상품코드}" onload="javascript:fn_cleanBG(this.id);"
											onerror="this.src='${pageContext.request.contextPath}/img/no-img/180x180.gif'">
								</a></li>
						</ul>
						<div class="thumb" data-index="0">
							<a href="#" class="prev" style="display: none;">이전 단품</a>
							<div class="thumbList">
								<ul class="clx">
									<li><a href="javascript:null;">
											<img	src="${pageContext.request.contextPath}/img/{상품_이미지_43}"
													onerror="this.src='${pageContext.request.contextPath}/img/no-img/43x43.gif'"
													alt="{상품명}">
										</a></li>
								</ul>
							</div>
							<a href="#" class="next">다음 단품</a>
						</div>
						<div class="star">
							<span class="rating">
								<span style="width: 0.0px;">0.0</span>
							</span>
							{리뷰수}명 평가
						</div>
						<a href="javascript:null;" class="info">
							<span class="color">{색상수} Colors</span>
							<span class="name">{상품명}</span>
							<span class="loca">{간략설명}</span>
							<div id="priceList">
								<div id="price" style="display: block;">
									<span class="price">{가격}</span>
								</div>
							</div>
						</a>
					</div>
				</li>
			</c:forEach>
			<!-- 상품 종료 -->
		</ul>
	</div>
</div>