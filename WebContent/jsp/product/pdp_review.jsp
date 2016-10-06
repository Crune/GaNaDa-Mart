<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${curProduct.getReviews().size() == 0}">
	<div id="reviewInfo" style="">
		<div class="Review bgM1_1" id="ReviewStarAve">
			<div class="content noreview">
				<div class="t-box">
					<div class="title">의견이 있나요?${sessionScope.userAccount.getCode()}</div>
					<p class="sub-tit">이 상품의 첫 리뷰를 남겨 보세요.</p>
					<div class="star">
						<span class="rating"> <span style="width: 0px;">0</span>
						</span>
					</div>
					<a href="#" class="btn-review-write">
						<span class="right">상품리뷰 작성하기</span>
					</a>
				</div>
			</div>
		</div>
	</div>
</c:if>
<c:if test="${curProduct.getReviews().size() > 0}">
	<div id="reviewInfo" style="">
		<div class="Review bgM1_1" id="ReviewStarAve">
			<div class="content">
				<div id="reviewAve" class="t-box">
					<div class="star">
						<span class="rating"> <span style="width: 116.16px;">4.8</span>
						</span> <span class="grade">4.8</span>
					</div>
					<div class="tit">
						리뷰 <span class="point">(${curProduct.getReviews().size()})</span>
					</div>
					<a href="#" class="btn-review-write">
						<span class="right">상품리뷰 작성하기</span>
					</a>
					<div class="review-info" style="display: none;">
						<ul>
							<li>
								<span class="sTit"> 5&nbsp;&nbsp; <img src="http://image.nike.co.kr/web/ico/ico-review-star.png" alt="">
								</span> <span class="bar"> <span class="light" style="width: 77.08px;"> 100 </span>
								</span> <span class="person">14</span>
							</li>
							<li>
								<span class="sTit"> 4&nbsp;&nbsp; <img src="http://image.nike.co.kr/web/ico/ico-review-star.png" alt="">
								</span> <span class="bar"> <span class="light" style="width: 11.28px;"> 90 </span>
								</span> <span class="person">2</span>
							</li>
							<li>
								<span class="sTit"> 3&nbsp;&nbsp; <img src="http://image.nike.co.kr/web/ico/ico-review-star.png" alt="">
								</span> <span class="bar"> <span class="light" style="width: 5.64px;"> 80 </span>
								</span> <span class="person">1</span>
							</li>
							<li>
								<span class="sTit"> 2&nbsp;&nbsp; <img src="http://image.nike.co.kr/web/ico/ico-review-star.png" alt="">
								</span> <span class="bar"> <span class="light" style="width: 0px;"> 70 </span>
								</span> <span class="person">0</span>
							</li>
							<li>
								<span class="sTit"> 1&nbsp;&nbsp; <img src="http://image.nike.co.kr/web/ico/ico-review-star.png" alt="">
								</span> <span class="bar"> <span class="light" style="width: 0px;"> 60 </span>
								</span> <span class="person">0</span>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page='/jsp/product/pdp_review_list.jsp' flush="false" />
</c:if>
<c:if test="${sessionScope.userAccount.getCode().length() > 0}">
	<jsp:include page='/jsp/product/pdp_review_insert.jsp' flush="false" />
</c:if>
