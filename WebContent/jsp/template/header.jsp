<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="menu" uri="/WEB-INF/tld/menu.tld"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${sessionScope.pageTitle }</title>

<link href="${pageContext.request.contextPath}/css/default.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/nike.css" rel="stylesheet" type="text/css">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.2.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-ui-1.10.2.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.jqzoom-core.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.2.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.word-break-keep-all.min.js"></script>

<link href="${pageContext.request.contextPath}/css/jquery.jqzoom.css" rel="stylesheet" type="text/css">

<!-- CP Javascript -->
<script src="${pageContext.request.contextPath}/js/global_renewal.js"></script>
<script src="${pageContext.request.contextPath}/js/LogInOut.js"></script>

<!-- Custom Javascript -->
<script src="${pageContext.request.contextPath}/js/default.js"></script>

</head>
<body>

	<!-- global_gnb -->
	<nav class="global_gnb">
		<!-- global_typ_gnb_top -->
		<div class="global_gnb_top">
			<div class="global_left_nav">
				<a href="page.gnd?code=MAIN"><em>가나다 마트</em></a> <a
					href="http://www.iei.or.kr/"><span>KH</span></a>
			</div>
			<div class="global_right_nav">
				<ul>
                    <li class="global_login">
                        <a href="#"><span>회원가입 / 로그인</span></a>
                    </li>
					<li class="global_help"><a href="mainCustomer.gnd"><span>고객센터</span></a>
						<ul class="global_help_menu" style="display: none;">
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
					<li class="cart"><a href="./cart.gnd"> <span>장바구니</span>
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
					<a href="javascript:goMain();"> <span>가나다</span>
					</a>
				</h1>

				<div class="global_gnb_menu">
<menu:getChild code="0" type="0">
<c:forEach var="d1" items="${ChildMenu}">
                    <div class="global_depth1 men">
                        <span></span> <a href="./page.gnd?code=${d1.target}"><span>${d1.name}</span></a>
                    </div>
                    <div class="global_depth2 men"><div>
                            <div class="global_sub_box">
                                <div class="global_sub_menu">
                                    <div class="global_category_h2"><div><ul>                                   
<!-- 2단계 이벤트 반복 시작 -->
<menu:getChild code="${d1.code}" type="1">
 <c:forEach var="d2e" items="${ChildMenu}">
                                                <li><a href="./page.gnd?code=${d2e.target}">${d2e.name}</a></li>
 </c:forEach>
</menu:getChild>
<!-- 2단계 이벤트 반복 종료 -->                        
                                    </ul></div></div>
<!-- 2단계 반복 시작 -->
<menu:getChild code="${d1.code}" type="0">
 <c:forEach var="d2" items="${ChildMenu}">
                                    <div class="global_category_h3"><div>
                                            <div class="global_category_stit">
                                                <a href="./type.gnd?code=${d2.target}">${d2.name}</a> <span class="ico"></span>
                                            </div>
                                            <ul>
<!-- 3단계 반복 시작 -->
  <menu:getChild code="${d2.code}" type="0">
   <c:forEach var="d3" items="${ChildMenu}">
                                                <li><a href="./type.gnd?code=${d3.target}">${d3.name}</a></li>
   </c:forEach>
  </menu:getChild>
<!-- 3단계 반복 종료 -->
                                            </ul>                                        
                                    </div></div>
 </c:forEach>
</menu:getChild>
                                            <!-- 2단계 반복 종료 -->
                                </div>
                            </div>
                    </div></div>
<!-- 1단계 종료 -->
</c:forEach>
</menu:getChild>
				</div>
			</div>
		</div>
		<!-- global_gnb_main -->
	</nav>
<jsp:include page="/jsp/member/popup_login.jsp" flush="false" />