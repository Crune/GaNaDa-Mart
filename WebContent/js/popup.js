/*
 * Backoffice Layer Popup
 * Version 0.1 (09/29/2009)
 * @requires jQuery v1.2.1 or later
 *


USAGE:
	showPopup('/system/menu/menuList.do');
	
	//params : action 호출시 parameter 들.
	showPopup('/system/menu/menuList.do', params);
	
	// 팝업창을 닫을때
	closePopup();
*/

var IS_IE6 = ($.browser.msie && $.browser.version=="6.0") ? true : false;

function _elbox_center(obj) {
    var viewleft = $(document).scrollLeft() + (($(window).width()-obj.width())/2);
    var viewtop = $(document).scrollTop() + (($(window).height()-obj.height())/2);
    viewleft = parseInt(viewleft);
    viewtop = parseInt(viewtop);
    if(obj.width() >= $(window).width()) { viewleft = 0; }
    if(obj.height() >= $(window).height()) { viewtop = $(document).scrollTop(); }
    obj.css({"top":viewtop,"left":viewleft});
}

//스타일용 함수
function _elbox_style() {
	if(IS_IE6) {
	  $('#backgroundLayer').css({
	    'position':'absolute'
	    ,top:$(document).scrollTop()
	    ,left:$(document).scrollLeft()
	  });
	}
}

(function($){
$.fn.bgIframe = $.fn.bgiframe = function(s) {
	// This is only for IE6
	if ( IS_IE6 ) {
		s = $.extend({
			top     : 'auto', // auto == .currentStyle.borderTopWidth
			left    : 'auto', // auto == .currentStyle.borderLeftWidth
			width   : 'auto', // auto == offsetWidth
			height  : 'auto', // auto == offsetHeight
			opacity : true,
			src     : 'javascript:false;'
		}, s || {});
		var prop = function(n){return n&&n.constructor==Number?n+'px':n;},
		    html = '<iframe class="bgiframe"frameborder="0"tabindex="-1"src="'+s.src+'"'+
		               'style="display:block;position:absolute;z-index:-1;'+
			               (s.opacity !== false?'filter:Alpha(Opacity=\'0\');':'')+
					       'top:'+(s.top=='auto'?'expression(((parseInt(this.parentNode.currentStyle.borderTopWidth)||0)*-1)+\'px\')':prop(s.top))+';'+
					       'left:'+(s.left=='auto'?'expression(((parseInt(this.parentNode.currentStyle.borderLeftWidth)||0)*-1)+\'px\')':prop(s.left))+';'+
					       'width:'+(s.width=='auto'?'expression(this.parentNode.offsetWidth+\'px\')':prop(s.width))+';'+
					       'height:'+(s.height=='auto'?'expression(this.parentNode.offsetHeight+\'px\')':prop(s.height))+';'+
					'"/>';
		return this.each(function() {
			if ( $('> iframe.bgiframe', this).length == 0 )
				this.insertBefore( document.createElement(html), this.firstChild );
		});
	}
	return this;
};

var oldWindowWidth = 0;
var oldWindowHeight = 0;
//스크롤시 중앙정렬
$(window).scroll(function(){
	if(IS_IE6) {
		if ($(window).width() != oldWindowWidth || $(window).height() != oldWindowHeight) {
			oldWindowWidth = $(window).width();
			oldWindowHeight = $(window).height();
			if($(window).width() >= $('#contentPopup').width() && $(window).height() >= $('#contentPopup').height()) {
				_elbox_center($('#contentPopup'));
				_elbox_style(); 
			}
		}
	}
});

//브라우저 리사이즈시 중앙정렬
$(window).resize(function(){
	if(IS_IE6) {
		if ($(window).width() != oldWindowWidth || $(window).height() != oldWindowHeight) {
			oldWindowWidth = $(window).width();
			oldWindowHeight = $(window).height();
			if($(window).width() >= $('#contentPopup').width() && $(window).height() >= $('#contentPopup').height()) {
				_elbox_center($('#contentPopup'));
				_elbox_style();
			}
		}
	}
});

})(jQuery);

function showBackgroundLayer() {
	if (IS_IE6) {
		$("#backgroundLayer").bgiframe();
		$('#backgroundLayer').css({
			'position':'absolute'
			, top:$(document).scrollTop()
			, left:$(document).scrollLeft()
		});
	}
	$("#backgroundLayer").show();
	$("#backgroundLayer").fadeTo("fast", 0.8);
}

function hideBackgroundLayer() {
	$("#backgroundLayer").fadeOut("fast");
}

function showLoadingImage() {
	if (IS_IE6) {
		$("#loadingPopup").bgiframe();
		$('#loadingPopup').css({
			'position':'absolute'
			, top:$(document).scrollTop() / 2
			, left:$(document).scrollLeft() / 2
		});
	}
	$("#loadingPopup").fadeIn("fast");
}

function hideLoadingImage(callback) {
	$("#loadingPopup").fadeOut("fast", callback);
}

/**
 * 모래시계를 보인다
 */
function showLoadingPopup() {
	showBackgroundLayer();
	showLoadingImage();
}

/**
 * 모래시계를 숨긴다
 */
function closeLoadingPopup() {
	hideBackgroundLayer();
	hideLoadingImage();
}
 
function showPopup(action, params, w, h, toShowLoadingImage) {
	if (toShowLoadingImage) {
		showLoadingImage();
	}
	
	$.ajax({
		url: action,
		type: "POST",
		data: params,
		cache: false,
		success: function(html){
			showBackgroundLayer();
			
			$('#contentPopup').html(html);

			if(w != null){
				$('#contentPopup').width(w);
			}
			
			if(h != null){
				$('.popupContent').height(h);
			}

			if (IS_IE6) {
				var popup = $('#contentPopup');
				popup.css({
				    'position':'absolute',
				    'margin-left': 0,
				    'margin-top': 0
				  });
				_elbox_center(popup);
			}
			else {
				$('#contentPopup').css('margin-left', '-' + $('#contentPopup').width() / 2 + 'px');
				$('#contentPopup').css('margin-top', '-' + $('#contentPopup').height() / 2 + 'px');
			}
			
			$('#contentPopup').fadeIn('fast');
			
			hideLoadingImage();
		},
		error: function(){
			alert('Ajax popup open fail.');
		}
	});
}

function closePopup() {
	hideBackgroundLayer();
	hideLoadingImage();
	
	$('#contentPopup').fadeOut('fast');
	$('#contentPopup').html('');
}

function showPopupEx(target, action, params, w, h, toShowLoadingImage) {
	if (toShowLoadingImage) {
		showLoadingImage();
	}
	
	$.ajax({
		url: action,
		type: "POST",
		data: params,
		cache: false,
		success: function(html){
		showBackgroundLayer();
		
		target.html(html);
		
		if(w != null){
			target.width(w);
		}
		
		if(h != null){
			target.find(".popupContent").height(h);
		}
		
		if (IS_IE6) {
			target.css({
				'position':'absolute',
				'margin-left': 0,
				'margin-top': 0
			});
			_elbox_center(target);
		}
		else {
			target.css('margin-left', '-' + target.width()  / 2 + 'px');
			target.css('margin-top' , '-' + target.height() / 2 + 'px');
		}
		
		hideLoadingImage(function() {
			target.fadeIn('fast');
		});
	},
	error: function(){
		alert("Popup fail!!!");
		hideLoadingImage();
	}
	});
}

function hidePopupEx(target) {
	target.fadeOut("fast", function() {
		hideBackgroundLayer();
		hideLoadingImage();
	});
}

function viewPopupEx(target) {
	showBackgroundLayer();
	showLoadingImage();
	
	target.fadeIn("fast");
}

function closePopupEx(target) {
	target.fadeOut("fast", function() {
		hideBackgroundLayer();
		hideLoadingImage();
		
		target.html("");
	});
}

function showLayer(id, withBackground) {
	var target = $("#" + id);
	if (IS_IE6) {
		target.css({
			'position':'absolute',
			'margin-left': 0,
			'margin-top': 0
		});
		_elbox_center(target);
	}
	else {
		target.css('margin-left', '-' + target.width()  / 2 + 'px');
		target.css('margin-top' , '-' + target.height() / 2 + 'px');
	}
	
	if (withBackground) {
		showBackgroundLayer();
		target.css("z-index", $("#backgroundLayer").css("z-index") + 1);
	}
	
	target.show();
}

function hideLayer(id, withBackground) {
	$("#" + id).hide();
	
	if (withBackground) {
		hideBackgroundLayer();
	}
}

/**
 * form 안의 data 를 "key=value" 형태의 parameter로 만든다.
 * input, textarea, select, button element의 값.
 * 
 * @param formId
 * @return params "key=value&key=value&..."
 */
function makeParameterKeyValues(formId) {
    var formData = $("form#" + formId + " :input ");
    var parameters = "";
    for (var i=0; i<formData.size(); i++) {
        var inputObj = formData.get(i);
        parameters += inputObj.name + "=" + inputObj.value;
        /* 마지막 parameter 에는 '&' 를 붙이지 않는다. */
        if (i != formData.size() - 1) {
            parameters += "&";
        }
    }
    return parameters;
}

/**
 * form 을 ajax submit 한다.
 * 
 * @param formId
 * @return json object
 * 			success : true/ false.
 *          message : 성공 또는 실패시 메세지.
 *          location : 성공시 이동할 주소.
 */
function ajaxFormSubmit(formId, callback) {
	var action = $("#"+formId).attr("action");
	var params = makeParameterKeyValues(formId);
	
	$.ajax({
		url: action,
		type: "POST",
		data: params,
		cache: false,
		dataType: "json",
		success: function(result){
			if(result.success) {
				if(result.message) {
					alert(result.message);
				}
				closePopup();
				if (callback) {
					callback(result);
				}
				else {
					location.href=result.location;
				}
			}
			else {
				alert(result.message);
			}
		},
		error: function(){
			alert('Request failed.');
		}
	});
}

//windows popup open
/**
 * window open 을 이용한 팝업창 열기
 * 
 * @param url 요청 url
 * @param width
 * @param height
 * @param option popup 옵션
 * @param paramsFormId 요청URL 에 보낼 parameter 를 가지고 있는 form id. 
 */
function showWindowsPopup(url, width, height, option, paramsFormId) {
	
	var condition = "width="+width+", height="+height;
	if (option) {
		condition += "," + option;
	}
	else {
		condition += ",scrollbars=no, toolbar=no, menubar=no, location=no";
	}
	
	if (paramsFormId) {
		var params = makeParameterKeyValues(paramsFormId);
		url += "?"+params;
	}
	window.open(url, "_blank", condition);
}

//   Modal Popup  Window를 띄우고자 할때
function showModalWindowsPopup(url, width, height, option) {
	
	var condition = "width="+width+", height="+height+",modal=yes";
	if (option) {
		condition += "," + option;
	}
	else {
		condition += ",scrollbars=no, toolbar=no, menubar=no, location=no";
	}
	
	window.open(url, "_blank", condition);
}

var LOGIN_POPUP_CALLBACK = null;
function showLoginPopup(callback) {
	
	LOGIN_POPUP_CALLBACK = function() {
		//
		// 화면 상단 로그인 UI 처리
		//
		var loginBtnLink = document.getElementById("headerLoginBtnLink");
		var loginBtnImg = document.getElementById("headerLoginBtnImg");
		var joinBtn = document.getElementById("headerJoinBtnLi");
		
		if (loginBtnLink) loginBtnLink.href = "/login.do?action=show";
		if (loginBtnImg) loginBtnImg.src = "/design/image/bt_logout.gif";
		if (joinBtn) joinBtn.style.display = "none";
		
		callback();
	};
	
	showWindowsPopup("/login.do?action=popup&method=popup", 420, 447);
}


function showShoppingGuide() {
	showWindowsPopup('/design/template/shopping_guide.html', 670, 640, "scrollbars=yes toolbar=no, menubar=no, location=no");
}

function showAuctionGuide() {
	showWindowsPopup('/design/template/auction_guide.html', 670, 640, "scrollbars=yes toolbar=no, menubar=no, location=no");
}

var ZIPCODE_POPUP_CALLBACK = null;
function showZipcodePopup(callback) {
	ZIPCODE_POPUP_CALLBACK = function(result) {
		callback(result);
	};
	
	showWindowsPopup("/zipcode.do?action=findZipcode&method=popup", 420, 380);
}

function reloadMinibox() {
	var recentProductVisible = $("#wingRecentProductDiv").is(":visible") ? "Y" : "N";
	var favoritCategoryVisible = $("#wingFavoritCategoryDiv").is(":visible") ? "Y" : "N";
		
	$.ajax({
		url: "/mypage.do?action=minibox&method=ajax",
		type: "POST",
		data: {recentProductVisible: recentProductVisible, favoritCategoryVisible: favoritCategoryVisible},
		cache: false,
		dataType: "html",
		success: function(html) {
			$("#mini_wing").html(html);
		},
		error: function() {
		}
	});
}