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
				<a href="main.gnd"><em>������ ��Ʈ</em></a>
				<a href="http://www.iei.or.kr/"><span>KH</span></a>
			</div>
			<div class="global_right_nav">
				<ul>
					<li class="global_login"><a href="#"><span>ȸ������ /
								�α���</span></a></li>
					<li class="global_help"><a href="mainCustomer.lecs"><span>������</span></a>
						<ul class="global_help_menu">
							<li><a href="./helpdesk/listFaq.gnd?fid=1">�ֹ�����</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=2">���</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=3">���/��ȯ/��ǰ</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=4">ȸ������/����</a></li>
							<li><a href="./helpdesk/listFaq.gnd?fid=5">��������</a></li>
							<li><a href="javascript:assmtEmailLayerPop();">1:1 �̸��Ϲ���</a></li>
							<li><a href="./display/rules.gnd?tach=2">�����������(ó��)��ħ</a></li>
							<li><a href="./display/rules.gnd?tach=1">�̿���</a></li>
							<li class="gb_help_list_all"><a
								href="./helpdesk/mainCustomer.gnd">��ü����</a></li>
						</ul></li>
					<li class="cart"><a href="./cart/list.gnd"> <span>��ٱ���</span>
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
													href="./display/displayShop.lecs?displayNo=NK1A49A02A01">�Ż�ǰ</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A02A21">2016
														���� �Ż�</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 All Shoes:RN_NSW:PWH">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A01">�Ź�</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A10">�Ź�
														��ü</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A01">��������Ÿ��</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A02">����</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A01A03">Ʈ���̴�
														& ��</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 All Clothing:NSW">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A03">�Ƿ�</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A03A09">�Ƿ�
														��ü</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A03A03">�ĵ�
														�� Ǯ����</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A03A04">��Ŷ
														�� ����Ʈ</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 sports">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A04">������</a>
												<span class="ico"></span>
											</div>
											<ul>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A09">����</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A05">Ʈ���̴�
														& ��</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A02">��</a></li>
												<li><a
													href="./display/displayShop.lecs?displayNo=NK1A49A04A03">�౸</a></li>
											</ul>
										</div>
									</div>

									<div class="global_category_h3 bland">
										<div>
											<div class="global_category_stit">
												<a href="./display/displayShop.lecs?displayNo=NK1A49A04">�귣��</a>
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
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A02A01">�Ż�ǰ</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A02A21">2016
                                                        ���� �Ż�</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 All Shoes:RN_NSW:PWH">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A01">�Ź�</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A10">�Ź�
                                                        ��ü</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A01">��������Ÿ��</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A02">����</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A01A03">Ʈ���̴�
                                                        & ��</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 All Clothing:NSW">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A03">�Ƿ�</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A03A09">�Ƿ�
                                                        ��ü</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A03A03">�ĵ�
                                                        �� Ǯ����</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A03A04">��Ŷ
                                                        �� ����Ʈ</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 sports">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A04">������</a>
                                                <span class="ico"></span>
                                            </div>
                                            <ul>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A09">����</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A05">Ʈ���̴�
                                                        & ��</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A02">��</a></li>
                                                <li><a
                                                    href="./display/displayShop.lecs?displayNo=NK1A49A04A03">�౸</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="global_category_h3 bland">
                                        <div>
                                            <div class="global_category_stit">
                                                <a href="./display/displayShop.lecs?displayNo=NK1A49A04">�귣��</a>
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
	