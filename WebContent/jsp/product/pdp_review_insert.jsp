<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div id="writeReview" class="reviewWrite" style="display: none;">
		







<form id="assessmentForm" name="assessmentForm" enctype="multipart/form-data" method="post">
	<input type="hidden" id="goodsNo" name="goodsNo" value="NK31073368">
	<input type="hidden" id="assessmentNo" name="assessmentNo" value="">
	<input type="hidden" id="assessmentStfdValue" name="assessmentStfdValue" value="">
	<input type="hidden" id="assessmentWriter" name="assessmentWriter" value="">
	<input type="hidden" id="imageFilePath" name="imageFilePath">
	
	<input type="hidden" id="priceStfdValue" name="priceStfdValue" value="19"> <!-- 사이즈 -->
	<input type="hidden" id="qualityStfdValue" name="qualityStfdValue" value=""><!-- 폭 -->
	<input type="hidden" id="designStfdValue" name="designStfdValue" value=""><!-- 편안함 -->
	<input type="hidden" id="deliveryStfdValue" name="deliveryStfdValue" value=""><!-- 내구성 -->
	<input type="hidden" id="purSizeValue" name="purSizeValue" value=""><!-- 구매사이즈 -->
	
	<div class="contentwrap">
			<h2 class="title">상품리뷰 작성</h2>
			<p class="chk"><span>*</span> 필수입력 항목</p>
			<div class="section">
				<div class="pdtevaluation">
					<h3>상품 평가</h3>
					<div class="review-check">
						<div class="tit">별점주기 <span class="required">*</span></div>
						<div class="con">
							<div class="star">
								<span id="writeRating" class="rating"><span id="writeRatingValue" class="active" style="width: 0px;"></span></span>
							</div>
							<span class="txt">
								
								
								
								
								
							</span>
						</div>
					</div>
					<div class="review-test">
						<div class="review-avg" id="writeRatingDetail">
							<ul>
								<li>
									<div class="box">
										<div class="tit">
											<span>사이즈</span>
										</div>
										<div class="con">
											<div id="priceUpdate" class="gp active2" clickkind="price">
												<div class="handle" style="left: 36px;">
													&nbsp;
												</div>
											</div>
											<div class="tip">
												<span class="t1">작은</span>
												<span class="t2">큰</span>
											</div>
										</div>
									</div>
								</li>
								<li>
									<div class="box">
										<div class="tit">
											<span>편안함</span>
										</div>
										<div class="con">
											<div id="designUpdate" class="gp active4" clickkind="design">
												<div class="handle" style="left: 108px;">
													&nbsp;
												</div>
											</div>
											<div class="tip">
												<span class="t1">편안하지 않은</span>
												<span class="t2">편안한</span>
											</div>
										</div>
									</div>
								</li>
								<li>
									<div class="box">
										<div class="tit">
											<span>폭</span>
										</div>
										<div class="con">
											<div id="qualityUpdate" class="gp active4" clickkind="quality">
												<div class="handle" style="left: 108px;">
													&nbsp;
												</div>
											</div>
											<div class="tip">
												<span class="t1">좁은</span>
												<span class="t2">넓은</span>
											</div>
										</div>
									</div>
								</li>
								<li>
									<div class="box">
										<div class="tit">
											<span>내구성</span>
										</div>
										<div class="con">
											<div id="deliveryUpdate" class="gp active4" clickkind="delivery">
												<div class="handle" style="left: 108px;">
													&nbsp;
												</div>
											</div>
											<div class="tip">
												<span class="t1">내구성 없는</span>
												<span class="t2">내구성 있는</span>
											</div>
										</div>
									</div>
								</li>
							</ul>
						</div>
					</div>	
				</div>
				<div class="userinfo">
					<h3>작성자 정보</h3>
					<div class="size">
						<div class="tit">구매<br>사이즈</div>
						<div class="con">
							<div class="sortCon" id="reviewSize"> <p class="sortTxt">선택</p> <ul style="display: none;"> <li><input type="radio" name="purSizeVal" id="purSizeVal" value="65(S)"> <span>65(S)</span></li> <li><input type="radio" name="purSizeVal" id="purSizeVal" value="70(M)"> <span>70(M)</span></li> <li><input type="radio" name="purSizeVal" id="purSizeVal" value="75(L)"> <span>75(L)</span></li></ul></div>
						</div>
					</div>
					<div class="weight">
						<div class="tit"><label for="">체중</label></div>
						<div class="con">
							<input type="text" class="textbox" name="wgtVal" id="wgtVal" maxlength="3" onkeydown="javascript:checkNumberType('wgtVal',this);" onkeyup="javascript:checkNumberType('wgtVal',this);" value="예) 60 " onfocus="clearText(this);">
							<span class="txt">kg</span>
							
								
								
							
							<input type="hidden" id="wgtVal_yn" name="wgtVal_yn" value="N">
						</div>
					</div>
					<div class="height">
						<div class="tit"><label for="">키</label></div>
						<div class="con">
							<input type="text" class="textbox" name="hgtVal" id="hgtVal" maxlength="3" onkeydown="javascript:checkNumberType('hgtVal',this);" onkeyup="javascript:checkNumberType('hgtVal',this);" value="예) 178" onfocus="clearText(this);">
							<span class="txt">cm</span>
							
								
								
							
							<input type="hidden" id="hgtVal_yn" name="hgtVal_yn" value="N">
						</div>
					</div>
					<div class="age">
						<div class="tit"><label for="">나이</label></div>
						<div class="con">
							<input type="text" class="textbox" name="ageVal" id="ageVal" maxlength="3" onkeydown="javascript:checkNumberType('ageVal',this);" onkeyup="javascript:checkNumberType('ageVal',this);" value="예) 25" onfocus="clearText(this);">
							<span class="txt">세</span>
							
								
								
							
							<input type="hidden" id="ageVal_yn" name="ageVal_yn" value="N">
						</div>
					</div>
				</div>
			</div>
			<div class="section">
				<h3 style="margin-bottom:30px;">리뷰내용</h3>
				<div class="conbox">
					<div class="writeform">
						<ul>
							<li>
								<div class="tit"><label for="">제목 <span class="required">*</span></label></div>
								<div class="con">
									<input type="text" id="assmtTitle" name="title" onkeydown="javascript:textCounter(this,50);" onkeyup="javascript:textCounter(this,50);" class="textbox" value="">
								</div>
							</li>
							<li>
								<div class="tit"><label for="">내용 <span class="required">*</span></label></div>
								<div class="con">
									<textarea id="assmtContent" name="assmtContent" onkeydown="javascript:textCounter(this,2000);" onkeyup="javascript:textCounter(this,2000);" cols="30" rows="10" class="textarea"></textarea>
									<p id="assmtContentLength" class="byteChk"><span>0</span>/2000자</p>
								</div>
							</li>
						</ul>
					</div>
					<div class="guide">
						<h4>리뷰 작성 가이드</h4>
						<ol>
							<li class="li"><span class="n">1.&nbsp;</span>
								제품을 사용하신 후 느낀 점 또는 구매를 선택하신 동기에 초점을 두고 작성하시면 됩니다.
							</li>
							<li class="li"><span class="n">2.&nbsp;</span>
								제품에 대한 요청이나 아이디어를 적어주셔도 좋습니다.
							</li>
							<li class="li"><span class="n">3.&nbsp;</span>
								리뷰를 보는 고객들이 제품구매에 도움이 될 수 있도록 작성합니다.
							</li>
							<li class="li"><span class="n">4.&nbsp;</span>
								E-Mail, 전화번호 등 개인정보 표기는 되도록이면 피해주세요.
							</li>
							<li class="li"><span class="n">5.&nbsp;</span>
								상품 또는 나이키닷컴에 대한 문의는 1:1문의하기를 이용해주세요.
								<a href="javascript:assmtEmailLayerPop();" class="btn">1:1 E-Mail 문의 ▶</a>
							</li>
						</ol>
					</div>
				</div>
				<div class="conbox">
					<div class="writeform">
						<ul>
							<li>
								<div class="tit"><label for="">이미지</label></div>
								<div class="con">
									<input type="text" id="file_location" class="textbox" readonly="readonly" title="첨부된 파일경로" style="width:370px;">
									<span class="file_wrap">
										<input type="button" class="file_btn" value="파일찾기">
										<input type="file" id="imgFileData" name="imgFileData" class="file_add" onchange="javascript:document.getElementById('file_location').value= this.value; fileUpload();">
									</span>
									<ul id="reviewImgList" class="attachedlist">
										
										
										
										
									</ul>
								</div>
							</li>
						</ul>
					</div>
					<div class="guide">
						<h4>이미지 첨부 가이드</h4>
						<ol>
							<li class="li"><span class="n">1.&nbsp;</span>
								첨부가능 파일형식: JPG(JPEG), GIF
							</li>
							<li class="li"><span class="n">2.&nbsp;</span>
								이미지 첨부 가능 개수: 4개(동영상 포함 시 3개)
							</li>
							<li class="li"><span class="n">3.&nbsp;</span>
								파일명은 영문만 가능합니다.
							</li>
							<li class="li"><span class="n">4.&nbsp;</span>
								사이즈는 이미지당 500KB 미만입니다.
							</li>
						</ol>
					</div>
				</div>
				<div class="conbox">
					<div class="writeform">
						<ul>
							<li>
								<div class="tit"><label for="">동영상</label></div>
								<div class="con">
									<input type="text" name="mpicUrlAddr" id="mpicUrlAddr" class="textbox" value="" onclick="javascript:mpicAddrChk();">
									<div class="youtubeinfo">
										<a href="#none">YouTube</a> 에 있는 동영상 주소를 붙여 넣으세요.
										<div class="layer_youtube"><img src="http://image.nike.co.kr/web/newReview/layer_youtube_help.png" alt=""></div>
									</div>

								</div>
							</li>
						</ul>
					</div>
					<div class="guide">
						<h4>동영상 링크 가이드</h4>
						<ol>
							<li class="li"><span class="n">1.&nbsp;</span>
								이 제품에 관련된 동영상이어야 합니다.
							</li>
							<li class="li"><span class="n">2.&nbsp;</span>
								제품을 사용하는 동영상을 올려주세요.
							</li>
							<li class="li"><span class="n">3.&nbsp;</span>
								부적절한 동영상은 게시 후 삭제될 수 있습니다.
							</li>
							<li class="li"><span class="n">4.&nbsp;</span>
								반드시 자신이 저작권을 가진 동영상이어야 합니다.
							</li>
						</ol>
					</div>
				</div>
			</div>
			<div class="review-confirm">
				<span class="note">모든 리뷰 정보는 나이키에 귀속됩니다. 부적절한 리뷰는 삭제될 수 있습니다.</span>
				<input id="assessmentChk" type="checkbox">
				<label for="assessmentChk">동의합니다.</label>
				<div class="btn-area">
					<a class="register" href="javascript:createAssessment();">
						<span style="width:100px;" class="right">
								
								등록하기
							
							
						</span>
					</a>
					<a class="cancel" href="javascript:cancelAssessment();"><span class="right">취소</span></a>
				</div>
			</div>
		</div>
	</form>

	</div>