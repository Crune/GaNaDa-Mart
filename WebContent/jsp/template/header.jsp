<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="EUC-KR">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${sessionScope.pageTitle }</title>

<link href="./css/nike.css" rel="stylesheet" type="text/css">
<link href="./css/base.css" rel="stylesheet" type="text/css">
<link href="./css/default.css" rel="stylesheet" type="text/css">

</head>
<body>

	<!-- global_gnb -->
	<nav class="global_gnb">
		<!-- global_typ_gnb_top -->
		<div class="global_gnb_top">
			<div class="global_left_nav">
				<a href="main.gnd"><em>가나다 마트</em></a>
				<a href="http://www.iei.or.kr/"><span>KH</span></a>
			</div>
			<div class="global_right_nav">
				<ul>
					<li class="global_login"><a href="#"><span>회원가입 /
								로그인</span></a></li>
					<li class="global_help"><a href="mainCustomer.lecs"><span>고객센터</span></a>
						<ul class="global_help_menu">
							<li><a href="./helpdesk/listFaq.gnd?fid=1">주문결제</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=2">배송</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=3">취소/교환/반품</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=4">회원혜택/서비스</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=5">공지사항</a></li>
							<li><a href="javascript:assmtEmailLayerPop();">1:1 이메일문의</a></li>
							<li><a href="./display/rules.gnd?tach=2">개인정보취급(처리)방침</a></li>
							<li><a href="./display/rules.gnd?tach=1">이용약관</a></li>
							<li class="gb_help_list_all"><a
								href="./helpdesk/mainCustomer.gnd">전체보기</a></li>
						</ul></li>
					<li class="cart"><a href="./cart/list.gnd"> <span>장바구니</span>
							<span class="count" id="cartBubble" style="display: none;">0</span>
					</a></li>
				</ul>
			</div>
		</div>
		<!-- //global_typ_gnb_top -->

		<!-- global_gnb_middle -->
		<div class="global_gnb_middle">
			<!-- global_gnb_main -->
			<div class="global_gnb_main">
				<h1 class="global_gnb_logo">
					<a href="javascript:goMain();"> <span>Nike. Shoes,
							Clothing &amp; Gear.</span>
					</a>
				</h1>
				<div class="global_gnb_menu">
					<div class="global_depth1 men">
						<span></span> <a
							href="./display/displayShop.lecs?displayNo=NK1A49"> <span>MEN</span>
						</a>
					</div>
					<div class="global_depth2 men">
						<div>
							<div class="global_sub_box">
								<div class="global_sub_menu">
									<div class="global_category_h2">
										<div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A02A01">신상품</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A02A21">2016
														가을 신상</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 All Shoes:RN_NSW:PWH">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A01">신발</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A10">신발
														전체</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A01">라이프스타일</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A02">러닝</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A03">트레이닝
														& 짐</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 All Clothing:NSW">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A03">의류</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A03A09">의류
														전체</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A03A03">후디
														＆ 풀오버</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A03A04">재킷
														＆ 베스트</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 sports">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A04">스포츠</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A09">러닝</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A05">트레이닝
														& 짐</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A02">농구</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A03">축구</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 bland">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A04">브랜드</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A05A01">Nike
														Sportswear</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A05A03">NikeLab</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A05A02">Jordan</a></li>
											</ul>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
					
                    <div class="global_depth1 men">
                        <span></span> <a
                            href="./display/displayShop.lecs?displayNo=NK1A49"> <span>WOMEN</span>
                        </a>
                    </div>
                    <div class="global_depth2 men">
                        <div>
                            <div class="global_sub_box">
                                <div class="global_sub_menu">
                                    <div class="global_category_h2">
                                        <div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A02A01">신상품</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A02A21">2016
                                                        가을 신상</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 All Shoes:RN_NSW:PWH">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A01">신발</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A10">신발
                                                        전체</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A01">라이프스타일</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A02">러닝</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A03">트레이닝
                                                        & 짐</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 All Clothing:NSW">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A03">의류</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A03A09">의류
                                                        전체</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A03A03">후디
                                                        ＆ 풀오버</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A03A04">재킷
                                                        ＆ 베스트</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 sports">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A04">스포츠</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A09">러닝</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A05">트레이닝
                                                        & 짐</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A02">농구</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A03">축구</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 bland">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A04">브랜드</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A05A01">Nike
                                                        Sportswear</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A05A03">NikeLab</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A05A02">Jordan</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            
			</div>
		</div>	
        <!-- global_gnb_main -->    
	</nav>
	