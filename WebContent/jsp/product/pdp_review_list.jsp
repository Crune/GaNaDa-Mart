<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="ReviewNew" class="ReviewNew" style="">
	<div class="contentwrap" id="contentwrapList">
		<div class="title">
			전체 리뷰
			<span class="point">(${curProduct.getReviews().size()})</span>
		</div>
		<ul class="Review-list">
			<c:forEach var="review" items="${curProduct.getReviews()}">
				<li>
					<div class="reviewConL">
						<div class="star">
							<span class="rating">
								<span style="width: 71px;">${review._getTotalScore()}</span>
							</span>${review.getRv_reg_date()}
						</div>
						<div class="subj">${review.getRv_subject()}</div>
						<div class="txt">
							<div class="userTxt">
								<span id="contentText">${review.getRv_cont()} </span>
								<span id="contentTextMore" style="display: none;">${review.getRv_cont()} </span>
								<a href="#" class="txtMore">더보기</a>
							</div>
						</div>
						<div class="reportBtn">
							<a href="javascript:assmtLikeDislikeClick('1014403','000000004404953','like');" class="reportUp" id="1014403_like_class">
								<span id="1014403_like">${review.getRv_vote_up()}</span>
							</a>
							<a href="javascript:assmtLikeDislikeClick('1014403','000000004404953','dislike');" class="reportDown" id="1014403_dislike_class">
								<span id="1014403_dislike">${review.getRv_vote_down()}</span>
							</a>
							<!-- 20151021 상품평 추천/비추천 레이어 추가 s -->
							<div class="etc_layer" style="display: none" id="assmtPlusLayer1014403">
								<div class="con_area thank">
									<p>평가에 참여해 주셔서 <br>감사합니다.
									</p>
									<a href="javascript:assmtLayerToggle('assmtPlusLayer', '1014403', 'none');" class="etc_layer close">닫기</a>
								</div>
							</div>
							<div class="etc_layer" style="display: none" id="assmtMinusLayer1014403">
								<div class="con_area cancel">
									<p>평가가 취소 되었습니다.</p>
									<a href="javascript:assmtLayerToggle('assmtMinusLayer', '1014403', 'none');" class="etc_layer close">닫기</a>
								</div>
							</div>
							<!-- 20151021 상품평 추천/비추천 레이어 추가 e -->
						</div>
					</div>
					<div class="reviewConR">
						<p class="userlink"><a href="javascript:memberOtherReviewPopup('${review.getAc_code()}');">
								<span>작성자의 리뷰 더보기</span>
							</a><br>${review.getAc_code()}</p>
						<div class="userinfo">
							<p></p>
						</div>
						<div class="eval">
							<ul class="rate">
								<li>
									<div class="tit">
										사이즈
									</div>
									<div class="gp">
										<span class="active${review.getRv_rate1()}"></span>
									</div>
									<div class="tip">
										<span class="t1">작은</span>
										<span class="t2">큰</span>
									</div>
								</li>
								<li>
									<div class="tit">
										편안함
									</div>
									<div class="gp">
										<span class="active${review.getRv_rate2()}"></span>
									</div>
									<div class="tip">
										<span class="t1">편안하지 않은</span>
										<span class="t2">편안한</span>
									</div>
								</li>
								<li>
									<div class="tit">
										폭
									</div>
									<div class="gp">
										<span class="active${review.getRv_rate3()}"></span>
									</div>
									<div class="tip">
										<span class="t1">좁은</span>
										<span class="t2">넓은</span>
									</div>
								</li>
								<li>
									<div class="tit">
										내구성
									</div>
									<div class="gp">
										<span class="active${review.getRv_rate4()}"></span>
									</div>
									<div class="tip">
										<span class="t1">내구성 없는</span>
										<span class="t2">내구성 있는</span>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</li>
			</c:forEach>
		</ul>
		<div class="paging2">
			<a href="#" class="active">1</a>
		</div>
	</div>
</div>