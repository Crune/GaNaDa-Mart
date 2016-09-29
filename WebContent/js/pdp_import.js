/****************************************/
/*******************************************************************************
 * Name: Nike Store /* Part: detail.js /* Version: 1.0 /* Author: Tommy /
 ******************************************************************************/

var isRun = false;

// PDP 관련 스크립트
var $pdp;
var selected_main_item = 0;
var arrThumb = new Array();
var thumb_Id = 5;
var itemLength;

function initialDetail(displayThumbCnt) {
	if (displayThumbCnt != 'undefined') {
		thumb_Id = displayThumbCnt;
	}

	$pdp = $(".Pdp");
	itemLength = $pdp.find(".left .nav ul li").size();
	// alert('initialDetail '+itemLength);

	/*
	 * $pdp.find(".viewer").on("mouseenter", function(e) {
	 * $(this).find(".expand-btn").show(); }).on("mouseleave", function(e){
	 * $(this).find(".expand-btn").hide(); }).on("click", function(e){
	 * renderZoom(); });
	 */

	// 이메일 버튼 클릭시 나오는 팝업
	// renderPopEmail();
	// 불량글 신고하기 막음 2013-07-10
	// renderPopReport();
	var grade = $pdp.find(".star .rating>span").text();
	$pdp.find(".star .rating>span").width(grade * 12.8);

	if (itemLength < 7) {
		$pdp.find(".left .nav > a.up").hide();
		$pdp.find(".left .nav > a.down").hide();
	} else {
		// 20141201 수정 s
		/* 20141218 새로 추가 */
		$pdp.find(".left .nav > a.up").show();
		$pdp.find(".left .nav > a.down").show();

		var dimFirst = $pdp.find(".left .nav .dim.first");
		var dimLast = $pdp.find(".left .nav .dim.last");

		dimFirst.show();
		dimLast.hide();
		$pdp.find(".left .nav > a.down").on("click", function(e) {
			e.preventDefault();

			dimFirst.hide();
			var id = thumb_Id + 1;
			if (id > itemLength - 2) {
				dimLast.show();
			}
			renderThumb(id, "down");
		});
		$pdp.find(".left .nav > a.up").on("click", function(e) {
			e.preventDefault();

			dimLast.hide();
			var id = thumb_Id - 6;
			if (id <= 0) {
				dimFirst.show();
				id = 0;
			}
			renderThumb(id, "up");
		});
		// 20141201 수정 e
		$pdp.find(".left .nav ul li").each(
				function(n) {
					arrThumb[n] = '<li data-index="' + n + '">'
							+ $(this).html() + '</li>';
					if (n > 5) {
						$pdp.find(".left .nav ul li").eq(-1).remove();
					}
				});
	}
	;

	$pdp.find(".left .viewer ul li").eq(0).show();
	renderInitSize();
	renderInitQuan();

	addClickThumb();

	setDataIndex();
}

function renderThumb(id, direct) {
	if (isRun)
		return;

	isRun = true;
	var target;
	var temp;

	if (direct == "down") {
		target = -61;
		$pdp.find(".left .nav ul").append(arrThumb[id]);
		temp = id;
	} else {
		target = 0;
		$pdp.find(".left .nav ul").prepend(arrThumb[id]).css({
			"margin-top" : -61
		})
		temp = id + 5;
	}

	$pdp.find(".left .nav ul").animate(
			{
				"margin-top" : target
			},
			{
				duration : 300,
				easing : "easeOutQuint",
				queue : false,
				complete : function() {
					isRun = false;
					$pdp.find(".left .nav ul li")
							.eq((direct == "down" ? 0 : 6)).remove()
					$pdp.find(".left .nav ul").css({
						"margin-top" : 0
					})
					addClickThumb();
					thumb_Id = temp;
				}
			});
}

function setDataIndex() {
	$pdp.find(".left .nav ul li").each(function(n) {
		$(this).attr("data-index", n);
	})
}

function addClickThumb() {
	$pdp.find(".left .nav ul li:first-child a").trigger('click');
	$pdp.find(".left .nav ul li a").on("click", function(e) {
		e.preventDefault();
		var id = $(this).parent().attr("data-index");
		$pdp.find(".left .nav ul li a").removeClass('on');
		$(this).addClass('on');
		renderImg(id);
	})
}

function renderImg(id) {
	$pdp.find(".left .viewer ul li").hide();
	$pdp.find(".left .viewer ul li").eq(id).show();

	selected_main_item = id;
}

/* 150817 상품사이즈 영역 추가로 인한 선택자 수정 : str */
function renderInitSize() {
	$pdp.find(".size-area").on("click", function(e) {
		e.preventDefault();
		renderSize();
	}).on("mouseleave", function(e) {
		$pdp.find(".size-area .size-list").hide();
	})

	$pdp.find(".item-box .size-area .size-list ul li a").on("click",
			function(e) {
				e.preventDefault();
				e.stopPropagation();

				if ($(this).hasClass("out")) {
					return;
				}

				var size_num = $(this).text();
				$pdp.find(".item-box .size-area strong").text(size_num);
				$pdp.find(".item-box .size-area").attr("data-value", size_num)
				$pdp.find(".item-box .size-area .size-list").hide();
			})
}
/* 150817 상품사이즈 영역 추가로 인한 선택자 수정 : end */

function renderInitQuan() {
	$pdp.find(".quantity-area").on("mouseleave", function(e) {
		$pdp.find(".quantity-area .quantity-list").hide();
	})

	$pdp.find(".quantity-area .quantity-list ul li a").on("click", function(e) {

		e.preventDefault();

		if ($(this).hasClass("out")) {
			return;
		}

		var size_num = $(this).text();
		$pdp.find(".quantity-area strong").text(size_num);
		$pdp.find(".quantity-area").attr("data-value", size_num)
		$pdp.find(".quantity-area .quantity-list").hide();
	})
}

function renderSize() {
	$pdp.find(".size-area .size-list").show();
}

function renderQuantity() {
	$pdp.find(".quantity-area .quantity-list").show();
}

/* Zoom 보기 */
var $zoomCon;
var zoomId = 0;
var step = 0;
var rotId = 0;
var flag = 0;
var isRun = false;
var arrZoomPer = [ {
	size : "100%",
	left : 0,
	top : 0
}, {
	size : "200%",
	left : -500,
	top : -500
}, {
	size : "300%",
	left : -1000,
	top : -1000
}

];

var zoomStatus = false;

function renderZoom() {
	launchFullScreen(document.documentElement);

	var hei = screen.availHeight + 50;
	var imgBoard_area = screen.availWidth - 247;

	$zoomCon.height(hei);
	var len = (screen.availHeight > screen.availWidth ? screen.availWidth
			: screen.availHeight);

	$zoomCon.find(".imgBoard").width(imgBoard_area);
	$zoomCon.find(".imgBoard").height(hei);

	$zoomCon.find(".img-area").height(len);
	$zoomCon.find(".img-area").width(imgBoard_area - 160);

	$zoomCon.find(".image").width(len);
	$zoomCon.find(".image").height(len);

	$zoomCon.find(".image li").width(len);
	$zoomCon.find(".image li").height(len);

	$zoomCon.find(".imgBoard .img-area").on("click", function(e) {
		e.preventDefault();

		var pos = new Object();
		var winWid = ($(window).width() / 2);
		var winHei = ($(window).height() / 2);

		pos.x = winWid - e.pageX
		pos.y = winHei - e.pageY

		if (step == 0) {
			flag = 0;
			zoomImg(1, "r", pos);
		} else if (step == 1) {
			if (flag == 1) {
				zoomImg(0, "l", null);
			} else {
				zoomImg(2, "r", pos);
			}
		} else {
			zoomImg(1, "l", pos);
			flag = 1;
		}
	});
	renderRotate(0);
	$zoomCon.fadeIn(100);
	initZoom();

	document.body.style.overflow = 'hidden';

	zoomStatus = true;
}

$(function() {
	$zoomCon = $(".zoom-Layer");
	$zoomCon.find(".close").on("click", function(e) {
		initZoom();
		$zoomCon.fadeOut(100);
		cancelFullscreen();

		document.body.style.overflow = 'visible';
		renderGNBResize();

		zoomStatus = false;
	})

	var grade = $zoomCon.find(".star .rating>span").text();
	$zoomCon.find(".star .rating>span").width(grade * 12.8);

	$zoomCon.find(".control .item ul li a").on("click", function(e) {
		var id = $(this).parent().index();
		renderDetailThumb(id);
	})

	$zoomCon.find(".control .detail ul li a").on("click", function(e) {
		var id = $(this).parent().index();
		renderDetailImg(id)
	})

	$(window).resize(function() {
		var wid = $(this).width() - 237;
		var hei = $(this).height();

		var len = (wid > hei ? hei : wid);

		$zoomCon.find(".img-area").width(wid);
		$zoomCon.find(".img-area .image").width(wid);
		$zoomCon.find(".image li").width(len);
		$zoomCon.find(".image li").height(len);

	});

	$zoomCon.find(".max").on("click", function(e) {
		e.preventDefault();

		if (step > 1)
			return;

		var id = step + 1;
		zoomImg(id, "r", null);
	})

	$zoomCon.find(".min").on("click", function(e) {
		e.preventDefault();

		if (step < 1)
			return;

		var id = step - 1;
		zoomImg(id, "l", null);
	})

});

function renderDetailThumb(id) {
	$zoomCon.find(".control .item-area.detail ul").hide();
	$zoomCon.find(".control .item-area.detail ul").eq(id).show();

	$zoomCon.find(".control .item-area.item>ul>li").removeClass("active");
	$zoomCon.find(".control .item-area.item>ul>li").eq(id).addClass("active");

	$zoomCon.find(".imgBoard .img-area .image").hide();
	$zoomCon.find(".imgBoard .img-area .image").eq(id).show();

	$zoomCon.find(".imgBoard .img-area .image").eq(id).find(">li").hide();

	// var imgTmp = $zoomCon.find(".imgBoard .img-area
	// .image").eq(id).find(">li").eq(0).find("img");
	// imgTmp.attr("src", imgTmp.attr("src").replace("_50.","_2000."));

	$zoomCon.find(".imgBoard .img-area .image").eq(id).find(">li").eq(0).show();

	initZoom();
	zoomId = id;

	renderRotate(0);
}

function renderDetailImg(id) {
	initZoom();

	$zoomCon.find(".control .detail ul").eq(zoomId).find(">li>a").removeClass(
			"on");
	$zoomCon.find(".control .detail ul").eq(zoomId).find(">li>a").eq(id)
			.addClass("on");

	$zoomCon.find(".imgBoard .img-area .image").eq(zoomId).find(">li").hide();

	// var imgTmpD = $zoomCon.find(".imgBoard .img-area
	// .image").eq(zoomId).find(">li").eq(id).find("img");
	// imgTmpD.attr("src", imgTmpD.attr("src").replace("_50.","_2000."));

	$zoomCon.find(".imgBoard .img-area .image").eq(zoomId).find(">li").eq(id)
			.show();

	renderRotate(id);
}

function renderRotate(id) {
	var size = $zoomCon.find(".imgBoard .img-area .image").eq(zoomId).find(
			">li").eq(id).find("img").size();

	if (size > 1) {
		$zoomCon.find(".rBtn .rot").show();
		$zoomCon.find(".rBtn .rot").off("click").on(
				"click",
				function(e) {
					e.preventDefault();

					// 초기화 시키고(최초크기로 셋팅)
					initZoom();
					var zId = rotId + 1;

					if (zId > size - 1) {
						zId = 0;
					}

					$zoomCon.find(".imgBoard .img-area .image").eq(zoomId)
							.find(">li").eq(id).find("img").hide();
					$zoomCon.find(".imgBoard .img-area .image").eq(zoomId)
							.find(">li").eq(id).find("img").eq(zId).show();

					rotId = zId;
				})

	} else {
		$zoomCon.find(".rBtn .rot").hide();
	}
}

function initZoom() {
	$zoomCon.find(".img-area .image img").css({
		width : arrZoomPer[0].size,
		height : arrZoomPer[0].size,
		left : arrZoomPer[0].left,
		top : arrZoomPer[0].top
	})

	$zoomCon.find(".rBtn .min").removeClass("enable");
	$zoomCon.find(".rBtn .min").addClass("disable");
	$zoomCon.find(".rBtn .max").removeClass("disable");
	$zoomCon.find(".rBtn .max").addClass("enable");

	$zoomCon.find(".imgBoard .img-area").css({
		cursor : "url(http://image.nike.co.kr/web/ico/ico_point1.cur), auto"
	});

	step = 0;
	flag = 0;
}

function zoomImg(id, direct, pos) {
	if (isRun)
		return;

	isRun = true;

	if (pos != null) {
		$zoomCon.find(".img-area .image img").animate({
			width : arrZoomPer[id].size,
			height : arrZoomPer[id].size,
			left : arrZoomPer[id].left + pos.x,
			top : arrZoomPer[id].top + pos.y
		}, {
			duration : 1000,
			easing : "easeOutQuint",
			queue : false,
			complete : function() {
				isRun = false;
			}
		});
	} else {

		$zoomCon.find(".img-area .image img").animate({
			width : arrZoomPer[id].size,
			height : arrZoomPer[id].size,
			left : arrZoomPer[id].left,
			top : arrZoomPer[id].top
		}, {
			duration : 1000,
			easing : "easeOutQuint",
			queue : false,
			complete : function() {
				isRun = false;
			}
		});
	}
	if (id == 0) {
		$zoomCon.find(".rBtn .min").removeClass("enable");
		$zoomCon.find(".rBtn .min").addClass("disable");
		$zoomCon.find(".rBtn .max").removeClass("disable");
		$zoomCon.find(".rBtn .max").addClass("enable");

		$zoomCon.find(".imgBoard .img-area img").draggable({
			disabled : true
		});

		$zoomCon
				.find(".imgBoard .img-area")
				.css(
						{
							cursor : "url(http://image.nike.co.kr/web/ico/ico_point1.cur), auto"
						});
	} else if (id == 1) {
		if (direct == "r") {
			$zoomCon.find(".rBtn .min").removeClass("disable");
			$zoomCon.find(".rBtn .min").removeClass("enable");
		} else {
			$zoomCon.find(".rBtn .max").removeClass("disable");
			$zoomCon.find(".rBtn .max").removeClass("enable");
		}

		$zoomCon.find(".imgBoard .img-area img").draggable({
			cursor : "move",
			containment : [ -500, -1000, 500, 0 ],
			drag : function(e) {
				var pleft = $(this).css("left").replace("px", "");
				var pTop = $(this).css("top").replace("px", "");
			},
			stop : function(e) {
				var pleft = $(this).css("left").replace("px", "");
				var pTop = $(this).css("top").replace("px", "");
			}
		});
		$zoomCon.find(".imgBoard .img-area img").draggable({
			disabled : false
		});
	} else {
		$zoomCon.find(".rBtn .min").removeClass("disable");
		$zoomCon.find(".rBtn .min").addClass("enable");
		$zoomCon.find(".rBtn .max").removeClass("enable");
		$zoomCon.find(".rBtn .max").addClass("disable");

		$zoomCon.find(".imgBoard .img-area").css({
			cursor : "url(../../image/web/ico/ico_point2.cur), auto"
		});

		$zoomCon.find(".imgBoard .img-area img").draggable({
			cursor : "move",
			containment : [ -2000, -2000, 300, 0 ],
			drag : function(e) {
				var pleft = $(this).css("left").replace("px", "");
				var pTop = $(this).css("top").replace("px", "");
			},
			stop : function(e) {
				var pleft = $(this).css("left").replace("px", "");
				var pTop = $(this).css("top").replace("px", "");
			}
		});
		$zoomCon.find(".imgBoard .img-area img").draggable({
			disabled : false
		});
	}
	step = id;
}

function launchFullScreen(element) {
	if (element.requestFullScreen) {
		element.requestFullScreen();
	} else if (element.mozRequestFullScreen) {
		element.mozRequestFullScreen();
	} else if (element.webkitRequestFullScreen) {
		element.webkitRequestFullScreen();
	}

}

function cancelFullscreen() {
	if (document.cancelFullScreen) {
		document.cancelFullScreen();
	} else if (document.mozCancelFullScreen) {
		document.mozCancelFullScreen();
	} else if (document.webkitCancelFullScreen) {
		document.webkitCancelFullScreen();
	}
}

function renderPopEmail() {
	showDim();
	$(".email-pop").slideDown(200);
	$(".email-pop .close").on("click", function(e) {
		e.preventDefault();
		$(".email-pop").slideUp(200);
		hideDim();
	})
}

document.onkeypress = function(evt) {

	evt = evt || window.event;
	if (evt.keyCode == 27) {
		initZoom();
		$zoomCon.fadeOut(100);
		cancelFullscreen();

		document.body.style.overflow = 'visible';
		renderGNBResize();
	}
};

/* 20150818 리뷰 기능 개선 :str */
var $review;
var $reviewWrite;
var $reviewList;
var $bestReview;
// 리뷰 관련 스크립트
$(function() {
	$review = $(".Review");
	/*
	 * $reviewWrite = $(".Review-write"); $reviewList = $(".Review-list");
	 */
	$reviewWrite = $(".reviewWrite");
	$reviewList = $(".ReviewNew");
	$bestReview = $('.bestReview');

	// 리뷰작성하기 막음 2013-07-10
	/*
	 * $review.find(".t-box>a").on("click", function(e){
	 * 
	 * renderReviewWrite();
	 *  })
	 */

	$review.find(".review-info ul li").each(function(n) {
		var per = $(this).find(".light").text();
		$(this).find(".light").width(parseInt(94 * per) / 100);
	})

	$reviewWrite.find(".review-confirm .cancel").on("click", function(e) {

		$reviewWrite.hide();
		var position = $review.offset();

		$('html, body').animate({
			scrollTop : position.top
		}, {
			duration : 1000,
			easing : "easeOutQuint",
			queue : false,
			complete : function() {
				isRun = false;
			}
		});

	});

	// 리뷰이미지보기
	reveiwImage();

	// 리뷰 탑 관련 스크립트 실행
	renderReviewTop();

	// 리뷰 리스트 별점 실행
	renderReviewListStar();

	// 리뷰 공유하기
	reviewSnsShare();
	layerYoutube();
});

function renderReviewTop() {
	$review = $(".Review");

	$review.find(".review-info ul li").each(function(n) {
		var per = $(this).find(".light").text();
		$(this).find(".light").width(parseInt(94 * per) / 100);
	})

	var info_interval;
	$review.find(".tit").on("mouseenter", function(e) {
		clearInterval(info_interval);
		$review.find(".review-info").fadeIn(200);
	}).on("mouseleave", function(e) {
		info_interval = setInterval(function() {
			$review.find(".review-info").fadeOut(100);
		}, 2000);
	})

	// 리뷰 별점(B)
	var grade = $review.find(".star .rating>span").text();
	$review.find(".star .rating>span").width(grade * 24.2); // 20150907 수정
	$review.find(".noreview .star .rating>span").width(grade * 0);

}

function reveiwImage() {
	// 리뷰 이미지 레이어
	$reviewList.find(".box .img>li>a").on("click", function(e) {
		e.preventDefault();
		showDim();
		$(this).next().show();
	})

	$reviewList.find(".box .img-layer .close").on("click", function(e) {
		e.preventDefault();
		$reviewList.find(".box .img-layer").hide();
		hideDim();
	})

	// 이미지 확대보기 레이어
	$bestReview.find('.attachedlist .thumb').on("click", function(e) {
		e.preventDefault();
		if ($(this).parent().hasClass('vod')) {
		} else {
			$(this).next('.img-layer').show();
			showDim();
		}
		;
		return false;
	});
	$bestReview.find('.attachedlist .img-layer a.close').on("click",
			function(e) {
				e.preventDefault();
				$(this).parent().hide();
				hideDim();
				return false;
			});

	// VOD 말풍선 노출
	$bestReview.find('.list li.vod .thumb').hover(function() {
		$(this).next('.vod-caption').stop().fadeIn(100);
	}, function() {
		$(this).next('.vod-caption').stop().fadeOut(100);
	});
}

// SNS 공유하기 레이어 띄우기
function reviewSnsShare() {
	$('.bestReview .btnarea .sns-btn').click(function() {
		$(this).parent().find('.sns_layer').show();
		return false;
	});
	$('.bestReview .sns_layer .btn-closeLayer').click(function() {
		$(this).parent('.sns_layer').hide();
		return false;
	});
}
function layerYoutube() {
	$('.youtubeinfo a').hover(function() {
		$(this).next('.layer_youtube').stop().fadeIn(100);
	}, function() {
		$(this).next('.layer_youtube').stop().fadeOut(100);
	});
}
/* 20150818 리뷰 기능 개선 : end */

/* 20150907 수정 str */
function renderReviewListStar() {

	$review = $(".Review");
	$reviewList = $(".Review-list");

	// 리뷰리스트 별점
	$reviewList.find(".star").each(function(n) {
		var grade_list = $reviewList.find(".star .rating>span").eq(n).text();
		$reviewList.find(".star .rating>span").eq(n).width(grade_list * 14.2);
	});
}
/* 20150907 수정 end */

function renderPopReport() {
	showDim();
	$(".report-pop").slideDown(200);
	$(".report-pop .close").on("click", function(e) {
		e.preventDefault();
		$(".report-pop").slideUp(200);
		hideDim();
	})
	$(".report-pop .cancel").on("click", function(e) {
		e.preventDefault();
		$(".report-pop").slideUp(200);
		hideDim();
	})
}

function renderReviewWrite() {

	$reviewWrite.animate({
	/* height:1200 */
	}, {
		duration : 1000,
		easing : "easeOutQuint",
		queue : false,
		complete : function() {
			isRun = false;
		}
	});

	$reviewWrite.show();
	var position = $reviewWrite.offset();

	$('html, body').animate({
		scrollTop : position.top - 45
	}, {
		duration : 1000,
		easing : "easeOutQuint",
		queue : false,
		complete : function() {
			isRun = false;
		}
	});
}

$(function() {
	var obj = $(".AboutList");

	obj.find(".listArea li").each(
			function(n) {
				var grade_list = obj.find(".listArea li .star .rating>span")
						.eq(n).text();
				obj.find(".listArea li .star .rating>span").eq(n).width(
						grade_list * 12.8);
			})

});

var $reviewWrite;

// 리뷰작성(별점/상세) 관련 스크립트
/* 20150907 수정 str */
$(function() {

	var interval;
	$reviewWrite = $("#writeReview");

	renderReviewWriteStar();

	var grade = $reviewWrite.find(".star .rating>span").text();
	$reviewWrite.find(".star .rating>span").width(grade * 25);
});

function renderReviewWriteStar() {
	$reviewWrite.find(".review-check .star .rating").on("mousemove",
			function(e) {
				var position = e.pageX - $(this).offset().left;
				updateStar(position);
			});
}

function updateStar(position) {

	if (position < 25) {
		$reviewWrite.find(".review-check .star .rating .active").width(25);
		$reviewWrite.find(".star .rating>span").text(parseInt(1));
		$reviewWrite.find(".review-check .txt").html("부족해요");
	} else if (position < 50) {
		$reviewWrite.find(".review-check .star .rating .active").width(50);
		$reviewWrite.find(".star .rating>span").text(parseInt(2));
		$reviewWrite.find(".review-check .txt").html("그럭저럭");
	} else if (position < 75) {
		$reviewWrite.find(".review-check .star .rating .active").width(75);
		$reviewWrite.find(".star .rating>span").text(parseInt(3));
		$reviewWrite.find(".review-check .txt").html("평균");
	} else if (position < 100) {
		$reviewWrite.find(".review-check .star .rating .active").width(100);
		$reviewWrite.find(".star .rating>span").text(parseInt(4));
		$reviewWrite.find(".review-check .txt").html("좋아요");
	} else {
		$reviewWrite.find(".review-check .star .rating .active").width(125);
		$reviewWrite.find(".star .rating>span").text(parseInt(5));
		$reviewWrite.find(".review-check .txt").html("완전 좋아요");
	}
}
/* 20150907 수정 end */

/* 2013-07-8 추가 s */

$(function() {
	var arrPosX = new Array(0, 130, 278, 406); // 2014-04-08 탭 버튼 추가
	$localTab = $(".Local-tab");

	$localTab.find(".menu").on("click", function(e) {
		e.preventDefault();

		if (isRun)
			return;
		isRun = true;

		var id = $(this).attr("data-index");
		var txt = $(this).text();
		$localTab.find(".active-tab").text(txt);

		// 컨텐츠의 높이를 구한다.
		var hei = $(this).next().height() + 80;
		$localTab.find(".conTab").height(hei); // 20140513 클래스명 수정

		// 컨텐츠 셋팅
		$localTab.find(".conArea").hide();
		$localTab.find(".conArea").eq(id).fadeIn(300);

		var target = arrPosX[id]
		$localTab.find(".active-tab").animate({
			left : target
		}, {
			duration : 1000,
			easing : "easeOutQuint",
			queue : false,
			complete : function() {
				isRun = false;
			}
		});
	});

	/* 2014-04-08 start */
	var hei = $localTab.find(".menu").eq(0).next().height() + 80;
	$localTab.find(".conTab").height(hei); // 20140513 클래스명 수정
	/* 2014-04-08 end */

});
/* 2013-07-8 추가 e */

/* 2013-07-12추가 s */
$(function() {
	/*
	 * $(".layer-cart").on("mouseleave", function(e){ $(".layer-cart").animate({
	 * height:0 }, { duration : 1000, easing : "easeOutQuint", queue : false,
	 * complete : function(){
	 *  } }); });
	 */

	$(".layer-cart").find(".close").on("click", function(e) {
		closeLayerCart();
	});

	// renderLocker();

});

function closeLayerCart() {
	$(".layer-cart").animate({
		height : 0
	}, {
		duration : 1000,
		easing : "easeOutQuint",
		queue : false,
		complete : function() {

		}
	});
}

function renderLocker() {
	$(".layer-cart").animate({
		height : 270
	}, {
		duration : 1000,
		easing : "easeOutQuint",
		queue : false,
		complete : function() {

		}
	});

	var interval_myLockerId = setInterval(function() {
		closeLayerCart();
		clearInterval(interval_myLockerId);
	}, 3000);
}

$(function() {
	$(".table-type2 tbody tr:even").addClass("even");

	$(".sizeFeet-btn").on("click", function(e) {
		e.preventDefault();

		showDim();
		$(".sizeGuide").show();
		$(".sizeGuide").find(".close").on("click", function(e) {
			e.preventDefault();
			hideDim();
			$(".sizeGuide").hide();
		});
	})
});

/* 2014-04-08 start 상품상세 리뷰 점수 */
/* 150907 리뷰개선 str */
$(function() {
	$(".pdtevaluation .review-avg .gp").on(
			"click",
			function(e) {
				var id = $(this).parents("li").index();
				var posY = e.pageX - $(this).offset().left;
				var cnt = parseInt(7 * posY / 253);
				var target = (cnt * 36);
				var avgTxt = $('.avgTxt');
				$(".pdtevaluation .review-avg li .handle").eq(id).css({
					left : target
				});
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active1");
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active2");
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active3");
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active4");
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active5");
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active6");
				$(".pdtevaluation .review-avg li .gp").eq(id).removeClass(
						"active7");
				$(".pdtevaluation .review-avg li .gp").eq(id).addClass(
						"active" + (cnt + 1));
				if (cnt == 0) {
				}

				// 상세평가 7점척도를 100점으로 환산 2014.05. 메딕
				var kind = $(this).attr('clickKind');
				var values = new Array(0, 3, 19, 35, 50, 65, 81, 97);
				// alert(kind+' 몇점 ? '+values[cnt+1]);
				$("#" + kind + "StfdValue").val(values[cnt + 1]);
			});

	$(".pdtevaluation  .review-avg li").each(function(n) {
		$(this).find(".gp").addClass("active4");
		$(this).find(".handle").css({
			left : 108
		});
	});
});
/* 150907 리뷰개선 end */

$(function() {
	$(".Pdp .ex .add").on("click", function(e) {
		e.preventDefault();

		$(".tab > ul > li > a").eq(0).trigger("click");

		$('html, body').animate({
			scrollTop : $(".Local-tab").offset().top - 80
		}, {
			duration : 600,
			easing : "easeOutQuint",
			queue : false
		});

	});
})
/* 2014-04-08 end 상품상세 리뷰점수 */

$(function() {
	$('.go_review').on('click', function() {

		var position = $('#reviewAve').offset();

		$('html, body').animate({
			scrollTop : position.top - 85
		}, 1000);

	});
})

/* 150817 상품상세설명 사이즈 선택 수정: str */
$(function() {

	$(".product_size .size-area").on({

		click : function(e) {
			e.preventDefault(e);
			$(this).find('.size-list').show();
		},
		mouseleave : function() {
			$(this).find('.size-list').hide();
		}

	});

	$(".product_size .size-area .size-list ul li a").on('click', function(e) {
		e.preventDefault(e);
		e.stopPropagation();

		if ($(this).hasClass("out")) {
			return;
		}

		var size_num = $(this).text();
		$(this).closest('.size-area').find(".selectedSize").html(size_num);
		$(this).closest('.size-area').attr("data-value", size_num);
		$(this).closest('.size-area').find(".size-list").hide();
	});

	$(".product_size .size-area .size-list ul li:first-child a").trigger(
			'click');
})
/* 150817 상품상세설명 사이즈 선택 수정 : end */

/* 150907 리뷰개선 str */
$(function() {
	var viewportH;
	reivewImgNum = 0;

	/* 150921 수정 str */
	// 베스트리뷰 더보기
	$('#bestReview .txtMore')
			.live(
					'click',
					function() {
						viewportH = $('#bestReview .bx-viewport').height();
						if ($(this).parent('.userTxt').attr('class').indexOf(
								'on') >= 0) {
							// $(this).parent('.userTxt').find('br').css({display:'none'});
							$(this).parent('.userTxt').removeClass('on');
							$(this).parent('.userTxt').find("#contentBestText")
									.css('display', '');
							$(this).parent('.userTxt').find(
									"#contentBestTextMore").css('display',
									'none');
							$(this).text('더보기');
							viewportH = $(
									'#bestReviewList .Review-list >li.active')
									.outerHeight();
							// alert(viewportH)
							$('#bestReview .bx-viewport').css({
								height : viewportH
							});
						} else {
							// $(this).parent('.userTxt').find('br').css({display:'block'});
							$(this).parent('.userTxt').addClass('on');
							$(this).parent('.userTxt').find(
									"#contentBestTextMore").css('display', '');
							$(this).parent('.userTxt').find("#contentBestText")
									.css('display', 'none');
							$(this).text('닫기');
							viewportH = $(
									'#bestReviewList .Review-list >li.active')
									.outerHeight();
							// alert(viewportH)
							$('#bestReview .bx-viewport').css({
								height : viewportH
							});
						}
						return false;
					});
	/* 150921 수정 end */

	// 베스트리뷰 이미지 교체
	$('#bestReview .img_l ul li a')
			.live(
					"click",
					function() {
						reivewImgNum = $(this).parent().index();
						if ($(this).parent().parent('ul').find('li').eq(0)
								.attr('class') == 'youtube') {
							reivewImgNum = $(this).parent().index() - 1;
						}
						// alert(reivewImgNum);
						if ($(this).parent().parent().parent().parent().index() == 1) {
							if ($(this).parent().attr('class') == 'youtube') {
								$('#bestReview .Review-list > li')
										.last()
										.find('.bigImg')
										.html(
												'<iframe width="460" height="335" src="'
														+ $(this).attr('href')
														+ '?wmode=opaque" frameborder="0" allowfullscreen></iframe>');
							} else {
								$('#bestReview .Review-list > li')
										.last()
										.find('.bigImg')
										.html(
												'<a href="#" class="bigImgCon" style="background:url('
														+ $(this).find('img')
																.attr('src')
														+ ') center center no-repeat;background-size:contain;"></a>');
							}
							$('#bestReview .Review-list > li').last().find(
									'span').removeClass('on');
							$('#bestReview .Review-list > li').last().find(
									'span').eq($(this).index()).addClass('on');
						} else if ($(this).parent().parent().parent().parent()
								.index() == $('.Review-list .conBox').length - 2) {
							if ($(this).parent().attr('class') == 'youtube') {
								$('#bestReview .Review-list > li')
										.first()
										.find('.bigImg')
										.html(
												'<iframe width="460" height="335" src="'
														+ $(this).attr('href')
														+ '?wmode=opaque" frameborder="0" allowfullscreen></iframe>');
							} else {
								$('#bestReview .Review-list > li')
										.first()
										.find('.bigImg')
										.html(
												'<a href="#" class="bigImgCon" style="background:url('
														+ $(this).find('img')
																.attr('src')
														+ ') center center no-repeat;background-size:contain;"></a>');
							}
							$('#bestReview .Review-list > li').first().find(
									'span').removeClass('on');
							$('#bestReview .Review-list > li').first().find(
									'span').eq($(this).index()).addClass('on');
						}

						if ($(this).parent().attr('class') == 'youtube') {
							$(this)
									.parent()
									.parent()
									.parent()
									.find('.bigImg')
									.html(
											'<iframe width="460" height="335" src="'
													+ $(this).attr('href')
													+ '?wmode=opaque" frameborder="0" allowfullscreen></iframe>');
						} else {
							// alert('a');
							$(this)
									.parent()
									.parent()
									.parent()
									.find('.bigImg')
									.html(
											'<a href="#" class="bigImgCon" style="background:url('
													+ $(this).find('img').attr(
															'src')
													+ ') center center no-repeat;background-size:contain;"></a>');
						}

						$(this).parent().parent('ul').find('span').removeClass(
								'on');
						$(this).parent().find('span').addClass('on');

						return false;
					});

	var bestReviewImgLegnth;

	function setBestReviewImg() {
		bestReviewImgLegnth = $('#bestReview .Review-list li.active .imglist')
				.find('li').length;
		var imgPath = $('#bestReview .Review-list li.active').find('.imglist')
				.html();
		imgPath = imgPath + '<a href="#" class="close">닫기</a>'
		$('#reivewImg .viewImg').html(imgPath);
	}

	// 베스트리뷰 롤링버튼
	/*
	 * $('.bestReview #bestReviewList .bx-controls-direction
	 * a').live('click',function(){ $('#bestReviewList
	 * .userTxt').removeClass('on'); $('#bestReviewList .userTxt
	 * .txtMore').text('더보기'); $('#bestReview
	 * .bx-viewport').css({height:viewportH}); $('#bestReview .bx-viewport
	 * .conBox').css({height:viewportH - 20}); });
	 */

	$('#bestReview .img_l .bigImgCon')
			.live(
					'click',
					function() {
						setBestReviewImg();
						$('#reivewImg').show();
						// if ($('#reivewImg .viewImg ul>li').length != 1){
						$('#reivewImg .viewImg ul')
								.bxSlider(
										{
											responsive : false,
											speed : 400,
											startSlide : reivewImgNum,
											onSliderLoad : function(
													currentIndex) {
												$('#reivewImg .bx-pager a')
														.each(
																function() {
																	$(this)
																			.html(
																					(currentIndex + 1)
																							+ '/'
																							+ bestReviewImgLegnth)
																});
											},
											onSlideAfter : function(
													$slideElement, oldIndex,
													newIndex) {
												$('#reivewImg .bx-pager a')
														.each(
																function() {
																	$(this)
																			.html(
																					(newIndex + 1)
																							+ '/'
																							+ bestReviewImgLegnth)
																});
											}
										});
						// }
						return false;
					});

	$('#ReviewNew .imgUl li a')
			.live(
					'click',
					function() {
						if ($(this).parent().attr('class') != 'youtube') {
							reivewImgNum2 = $(this).parent().index();
							if ($(this).parent().parent('ul').find('li').eq(0)
									.attr('class') == 'youtube') {
								reivewImgNum2 = $(this).parent().index() - 1;
							}
							// alert(reivewImgNum2);
							var imgPath = $(this).parent().parent().parent()
									.parent().find('.imglist').html();
							imgPath = imgPath
									+ '<a href="#" class="close">닫기</a>'
							$('#reivewImg .viewImg').html(imgPath);

							$('#reivewImg').show();
							if ($('#reivewImg .viewImg ul>li').length != 1) {
								$('#reivewImg .viewImg ul')
										.bxSlider(
												{
													responsive : false,
													speed : 400,
													startSlide : reivewImgNum2,
													onSliderLoad : function() {
														$(
																'#reivewImg .bx-pager a')
																.each(
																		function() {
																			$(
																					this)
																					.append(
																							'/'
																									+ $('#reivewImg .bx-pager a').length)
																		});
													}
												});
							}
							return false; // 151013
						}
					});

	$('#reivewImg .close').live('click', function() {
		$('#reivewImg').hide();
		return false;
	});

	// SORT
	$('.sortCon p').live('mouseenter', function() {
		$(this).parent().find('ul').show();
	});
	$('.sortCon').live('mouseleave', function() {
		$(this).parent().find('ul').hide();
	});
	$('.sortCon li').live(
			'click',
			function() {
				$(this).parent().find('li').removeClass('on');
				$(this).addClass('on');
				$(this).find('input').attr('checked', 'checked');
				$(this).parent().parent().find('.sortTxt').html(
						$(this).find('span').html());
				$(this).parent('ul').hide();
			});

	/* 20151013 추가 str */
	// 전체리뷰 더보기
	$('#ReviewNew .txtMore')
			.live(
					'click',
					function() {
						if ($(this).parent('.userTxt').attr('class').indexOf(
								'on') >= 0) {
							// $(this).parent('.userTxt').find('br').css({display:'none'});
							$(this).parent('.userTxt').removeClass('on');
							$(this).parent('.userTxt').find("#contentText")
									.css('display', '');
							$(this).parent('.userTxt').find("#contentTextMore")
									.css('display', 'none');
							$(this).text('더보기');
						} else {
							// $(this).parent('.userTxt').find('br').css({display:'block'});
							$(this).parent('.userTxt').addClass('on');
							$(this).parent('.userTxt').find("#contentText")
									.css('display', 'none');
							$(this).parent('.userTxt').find("#contentTextMore")
									.css('display', '');
							$(this).text('닫기');
						}
						return false;
					});
	/* 20151013 추가 end */
});
/* 150907 리뷰개선 end */