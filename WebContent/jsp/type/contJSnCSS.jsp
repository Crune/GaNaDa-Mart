<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">
body {
	position: relative;
}

.banner-area {
	position: relative;
	max-width: 1000px;
	padding-bottom: 50px !important;
	height: auto;
}

.banner-area:after {
	display: block;
	clear: both;
	content: "";
}

.banner-area .container {
	position: relative;
	width: 100%;
}

.banner-area img.bg {
	width: 100%;
}

.banner-area .bnr_item {
	display: none;
}

.banner-area .container .bnr_item {
	display: none;
}

.banner-area .container .bnr_item:first-child {
	display: block;
}

.banner-area .bnr_item .bnr_item_inner {
	position: relative;
	width: 100%;
}

.banner-area .bnr_item .bg_img {
	position: relative;
	width: 100%;
	text-align: center;
	z-index: 26;
}

.banner-area .bnr_item .bg_video {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
}

.banner-area .bnr_item .bg_video .video_file {
	position: relative;
	width: 100%;
	height: 100%;
	overflow: hidden;
}

.banner-area .bnr_item .bg_video .video_file video {
	width: 100%;
	height: auto;
}

.banner-area .bnr_item .bg_color {
	width: 100%;
	height: 100%;
}

.banner-area .bnr_item .txt_area {
	position: absolute;
	top: 56%;
	z-index: 26;
}

.banner-area .bnr_item .alR {
	text-align: right;
}

.banner-area .bnr_item .txt_area .p1_tit {
	max-width: 100%;
}

.banner-area .bnr_item .txt_area .p1_tit2 {
	margin-top: 10px;
}

.banner-area .bnr_item .txt_area .btn_box {
	margin-top: 20px;
	height: 15px
}

.banner-area .bnr_item .txt_area .btn_box a {
	padding-bottom: 2px
}

.banner-area .bnr_item .txt_area .btn_box a:hover {
	padding-bottom: 1px;
	border-bottom: 1px solid #000
}

/* bra guide */
.nsw_pwh .nsw_tab {
	position: absolute;
	left: 27.5%;
	top: 78.5%;
	width: 70%;
	z-index: 26;
	height: 22.5%;
}

.nsw_pwh .nsw_tab li {
	float: left;
	width: 25%;
	text-align: center;
	position: relative;
	height: 100%;
}

.nsw_pwh .nsw_tab li>a {
	color: #b2b2b2;
}

.nsw_pwh .nsw_tab li.on>a {
	font-size: 12px;
	color: #000;
}

.nsw_pwh .nsw_tab li>a:hover span.fw_600 {
	text-decoration: underline;
}

.nsw_pwh .nsw_tab li>a span.fw_light {
	display: block;
	font-size: 12px;
	font-weight: normal
}

.nsw_pwh .nsw_tab li>a span.fw_600 {
	font-size: 14px;
	font-weight: 600
}

.nsw_pwh .bg-color1 {
	position: absolute;
	right: 50%;
	top: 0;
	width: 50%;
	height: 100%;
	background:
		url(http://image.nike.co.kr/display/corner/882/bg_braGuide_150625.png)
		repeat-x 0 0;
}

.nsw_pwh .bg-color2 {
	position: absolute;
	left: 50%;
	top: 0;
	width: 50%;
	height: 100%;
	background:
		url(http://image.nike.co.kr/display/corner/882/bg_braGuide2_150625.png)
		repeat-x 0 0;
}

.nsw_pwh .nsw_link_tab {
	position: absolute;
	left: 27.5%;
	top: 7.5%;
	width: 70%;
	z-index: 26;
	height: 64.5%;
}

.nsw_pwh .nsw_link_tab li {
	float: left;
	width: 25%;
	text-align: center;
	position: relative;
	height: 100%;
}

.nsw_pwh .nsw_link_tab li a {
	display: block;
	width: 100%;
	height: 100%;
}

.nsw_pwh .nsw_link_tab li>a span.buy_btn {
	display: inline-block;
	padding: 3px 15px;
	height: 35px;
	line-height: 35px;
	background-color: #000;
	color: #fff;
	font-size: 0.5em;
	border-radius: 3px;
	position: absolute;
	left: 50%;
	top: 50%;
	margin-top: -30px;
	margin-left: -50px;
}

.nsw_pwh .txt_01 {
	position: absolute;
	z-index: 26;
}

.nsw_pwh .txt_02 {
	position: absolute;
	z-index: 26;
}

.nsw_pwh .txt_02 .btn-group {
	margin-top: 20px;
	z-index: 26;
}

.banner-area .bnr_item a.nolink {
	cursor: default;
}

.banner-area .bnr_item a.nolink:hover {
	text-decoration: none
}

/* System Font */
.P1 * {
	font-family: '나눔고딕', 'NanumGothic', Malgun Gothic, '맑은고딕', Apple Gothic,
		Dotum, '돋움', sans-serif;
	font-size: 30px;
	letter-spacing: 0 !important
}

.banner-area .bnr_item .txt_area .p1_tit {
	font-size: 1em;
	line-height: 1.1em;
	font-weight: 600
}

.banner-area .bnr_item .txt_area .p1_txt {
	font-size: 0.5em;
	line-height: 1.4em;
	margin-top: 10px
}

.banner-area .bnr_item .txt_area .p1_size {
	font-size: 0.5em;
	line-height: 1.3em;
	margin-top: 20px;
	font-weight: 600
}

.banner-area .bnr_item .txt_area .p1_txt2 {
	font-size: 0.4em;
	line-height: 1.4em;
	margin-top: 10px
}

.nsw_pwh .nsw_tab li.on>a {
	line-height: 0.7em;
	font-size: 28px;
	display: block;
	padding: 0;
	color: #000;
	position: relative;
	width: 100%;
	height: 98.6%;
}

.nsw_pwh .nsw_tab li>a {
	line-height: 0.7em;
	font-size: 28px;
	display: block;
	padding: 0;
	color: #b2b2b2;
	position: relative;
	width: 100%;
	height: 98.6%;
}

.nsw_pwh .nsw_tab li>a {
	line-height: 0.7em;
	font-size: 28px;
	display: block
}

.nsw_pwh .nsw_tab li>a span.fw_600 {
	font-size: 0.55em;
	line-height: 1.8em;
	width: 100%;
}

.nsw_pwh .nsw_tab li>a span.fw_light {
	font-size: 0.42em;
	width: 100%;
	color: #555;
}

.nsw_pwh .nsw_tab li>a span.buy_btn {
	display: inline-block;
	padding: 3px 15px;
	height: 35px;
	line-height: 35px;
	background-color: #000;
	color: #fff;
	font-size: 0.5em;
	border-radius: 3px;
	position: absolute;
	left: 50%;
	top: 50%;
	margin-top: -86px;
	margin-left: -37px;
}

.banner-area .bnr_item .txt_area .p1_txt2:hover, .banner-area .bnr_item .txt_area .p1_txt2:focus
	{
	text-decoration: underline;
}

.banner-area .bnr_item .link_area {
	position: absolute;
	top: 5%;
	left: 38px;
	z-index: 50;
}

.banner-area .bnr_item .link_area .p1_txt2 {
	font-size: 0.4em;
	line-height: 1.4em;
	color: #333;
}

.global_gridwall_top_info {
	position: relative;
}

@media all and (max-width:1450px) {
	.banner-area .bnr_item .txt_area {
		top: 58%
	}
	.P1 * {
		font-size: 28px
	}
	.nsw_pwh .nsw_tab li.on>a {
		font-size: 25px;
		height: 98.6%;
	}
	.nsw_pwh .nsw_tab li>a {
		font-size: 25px;
		height: 98.6%;
	}
}

@media all and (max-width:1300px) {
	.banner-area .bnr_item .txt_area {
		top: 60%
	}
	.P1 * {
		font-size: 26px
	}
	.nsw_pwh .nsw_tab {
		top: 8%;
		height: 92%;
	}
	.nsw_pwh .nsw_tab li.on>a {
		font-size: 23px;
		height: 98.6%;
	}
	.nsw_pwh .nsw_tab li>a {
		font-size: 23px;
		height: 98.6%;
	}
	.nsw_pwh .nsw_tab li>a span.buy_btn {
		margin-top: -84px;
		margin-left: -37px;
	}
}

@media all and (max-width:1100px) {
	.banner-area .bnr_item .txt_area {
		top: 60%
	}
	.P1 * {
		font-size: 20px
	}
	.banner-area .bnr_item .txt_area .p1_txt {
		margin-top: 5px
	}
	.banner-area .bnr_item .txt_area .p1_size {
		margin-top: 10px
	}
	.banner-area .bnr_item .txt_area .p1_txt2 {
		margin-top: 5px
	}
	.banner-area .bnr_item .txt_area .btn_box a {
		margin-top: 0px
	}
	.nsw_pwh .nsw_tab {
		top: 7.8%;
		height: 92.2%;
	}
	.nsw_pwh .nsw_tab li.on>a {
		font-size: 22px;
		height: 98.5%;
	}
	.nsw_pwh .nsw_tab li>a {
		font-size: 22px;
		height: 98.5%;
	}
	.nsw_pwh .nsw_tab li>a span.buy_btn {
		margin-top: -82px;
		margin-left: -39px;
	}
	.p1_tit img {
		width: 75%;
	}
}

@media all and (max-width:980px) {
	.banner-area .bnr_item .txt_area .btn_box {
		margin-top: 5px
	}
	.banner-area .bnr_item .txt_area {
		top: 62%
	}
}

@media all and (max-width:850px) {
	.banner-area .bnr_item .txt_area {
		top: 70%;
	}
	.nsw_pwh .nsw_tab li>a span.buy_btn {
		margin-top: -43px;
		margin-left: -37px;
	}
}

.global_gnb ~ .proList {
	padding-top: 0 !important
}
</style>
<script>
	$(function() {
		$(".nsw_pwh .nsw_link_tab li > a span.buy_btn").hide();
		$(".nsw_pwh .nsw_link_tab li > a").mouseenter(function() {
			$(this).find("span.buy_btn").stop().fadeIn(300);
		}).mouseleave(function() {
			$(this).find("span.buy_btn").stop().fadeOut(300);
		});
	});
</script>


<script>
	var s_account = "nikestorekoreaprod";
</script>
<!-- 운영과 개발용 설정이 달라서 config 이용 -->
<script type="text/javascript" src="/com/js/s_code_nikestorekr.js"></script>
<script>
	function fn_goRecommCategory() {
		var url = '/display/displayShop.lecs?';
		var params = $('#displayNo').serialize();
		var allYn = 'N';
		try {
			allYn = $("#allYn").val(); // 대카만 사용
		} catch (e) {
			//에러나면 무시
			allYn = 'N';
		}
		fn_goPage(url + params + '&listSortCode=15&allYn=' + allYn, '');
		//fn_goPage(url + params + '&sportslnb=&pType=&listSortCode=15&allYn='+allYn, '');
	}

	//카탈리스트 2차 정렬방식 이벤트...2013.12.12...Cesil
	function fn_catalystSort(prop42) {
		s.linkTrackVars = 'prop42';
		s.prop42 = prop42;
		s.tl(true, 'o', 'Product Sort Options');
	}
</script>