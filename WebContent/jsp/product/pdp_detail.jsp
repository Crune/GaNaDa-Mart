<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="Local-tab bgM1_1" id="localTab" style="">
	<div class="section-title">
		<!--<h2>상품부가정보</h2>-->
	</div>
	<div class="conTab" style="height: 1069px;">
		<div class="tab">
			<div class="active-tab">상세정보</div>
			<ul class="clx">
				<li><a href="#" class="menu" data-index="0" id="conTabSub1">상세정보</a>
					<!-- 제품 특장점 -->
					<div class="conArea" style="display: block;">
						<!--BO 상품 상세설명 영역에 등록한 데이터 출력 영역 start-->
						{상품설명1}
						<!--BO 상품 상세설명 영역에 등록한 데이터 출력 영역 end-->
						<div class="bgM1_1 botm"></div>
						<!-- bgM1_1추가 201406 -->

						<!-- 상품정보고시 -->
						<div class="proInfo">
							<div class="infoArea">
								<dl>
									<dt>제품 주소재</dt>
									<dd>갑피: 합성플라스틱 / 중창: 인젝티드 파일론 / 밑창: 플라스틱 80% 고무20%</dd>

									<dt>색상</dt>
									<dd>상단표시</dd>

									<dt>치수</dt>
									<dd>225-320</dd>

									<dt>제조국</dt>
									<dd>중국</dd>

									<dt>품질보증기준</dt>
									<dd>
										품질보증기간:구입후 6개월<br>유통중 손상되었거나 품질에 이상이 있는 제품에 한하여 소비자피해보상규정
										에 의거 보상하여 드립니다.<br>단, 제품에 부착되어 있는 사용방법 및 취급시주의사항에 따라 제품을
										관리해 주시고, 소비자 부주의로 인한 품질 이상 및 변형에 대해서는 책임을 지지 않습니다.
									</dd>

									<dt>수입자(수입업체명)</dt>
									<dd>(유)나이키코리아</dd>

									<dt>고객센터 전화번호</dt>
									<dd>080-022-0182</dd>
								</dl>
							</div>
						</div>
						<!-- // 상품정보고시 -->
					</div> <!-- // 제품 특장점 --></li>
				<script type="text/javascript">

				/* 2013-07-8 추가 s */


				$(function() {
					var arrPosX = new Array(0, 130, 278, 406);  // 2014-04-08 탭 버튼 추가
					$localTab = $(".Local-tab");
					
					$localTab.find(".menu").on("click", function(e){
						alert("꺼졍");
						e.preventDefault();
						
						if(isRun) return;
						isRun = true;
						
						var id = $(this).attr("data-index");
						var txt = $(this).text();
						$localTab.find(".active-tab").text(txt);
						
						//컨텐츠의 높이를 구한다.
						var hei = $(this).next().height()+80;
						$localTab.find(".conTab").height(hei); //20140513 클래스명 수정
						
						//컨텐츠 셋팅
						$localTab.find(".conArea").hide();
						$localTab.find(".conArea").eq(id).fadeIn(300);
						
						var target = arrPosX[id]
						$localTab.find(".active-tab").animate({
							left:target
						}, 
						{
							duration : 1000,
							easing : "easeOutQuint",
							queue : false,
							complete : function(){
								isRun = false;
							}
						});
					});
					
					/* 2014-04-08 start */
					var hei = $localTab.find(".menu").eq(0).next().height()+80;
					$localTab.find(".conTab").height(hei); //20140513 클래스명 수정
					/* 2014-04-08 end */
					
				});
				/* 2013-07-8 추가 e */
				
					$(document).ready(function() {
						/*
							신발(01), 의류(02),  용품(03), 가방(04), 모자(05),양발(06), 나이키+(07), 
							글러브(08), 헤드/리스트 밴드(09), 보호대(10), 공(11), 드라이버(12)
						 */
						showLaundryTab('1');
					});

					function showLaundryTab(num) {
						$("#laundryTab" + num).show();
					}
				</script>
				<li><a href="#" class="menu" data-index="1">배송/결제 정보</a>
					<div class="conArea" style="display: none;">{상품정보2}</div></li>
				<li><a href="#" class="menu" data-index="2">유의사항</a>
					<div class="conArea" style="display: none;">{상품정보3}</div></li>
				<li><a href="#" class="menu" data-index="3">교환/반품/AS</a>
					<div class="conArea" style="display: none;">{상품정보4}</div></li>
			</ul>
		</div>
	</div>
</div>