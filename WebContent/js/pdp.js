$(function() {
	$('.g_btn_wish').find('a').click(function() {
		alert("위시리스트 추가!");
		return false;
	});
});

$(function() {
	$('.size-area').find('a').click(function() {
		$('.size-list').show().on("mouseleave", function(e){
			$(".size-list").hide();
		});
		return false;
	});

	$('#sizeList li').find('a').click(function() {
		alert($(this).attr("title"));
		return false;
	});
});


$(function() {
	$('.quantity-area').find('a').click(function() {
		$('.quantity-list').show().on("mouseleave", function(e){
			$(".quantity-list").hide();
		})
		return false;
	})
});

$(function() {
	var arrPosX = new Array(0, 130, 278, 406);
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
		$localTab.find(".conTab").height(hei);

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

	var hei = $localTab.find(".menu").eq(0).next().height() + 80;
	$localTab.find(".conTab").height(hei);
});


/*************************************************************************************/
/* 리뷰란 */


function scrollToDiv(element,navheight){
    var offset = element.offset();
    var offsetTop = offset.top;
    var totalScroll = offsetTop-navheight;
    
    $('body,html').animate({
            scrollTop: totalScroll
    }, 500);
}

var isLogined = false;
$('.btn-review-write').click(function(){
    var el = $(this).attr('href');
    var elWrapped = $('.reviewWrite');
        
    if (elWrapped.length>0) {
        elWrapped.show();
        scrollToDiv(elWrapped,40);
    } else {
    	alert("리뷰 작성에는 회원 로그인이 필요합니다!");
    }
    
    return false;
});

function scrollToDiv(element,navheight){
    var offset = element.offset();
    var offsetTop = offset.top;
    var totalScroll = offsetTop-navheight;
    
    $('body,html').animate({
            scrollTop: totalScroll
    }, 500);
}

function cancelAssessment(){
	$('.reviewWrite').hide();
	scrollToDiv($('#reviewInfo'), 40)
}

function createAssessment(){
	$('#assessmentForm').submit();
}

function clearText(element) {
	element.value = "";
}

function textCounter(element, maxlen) {
	if (element.length > maxlen) {
		alert("불가능");
		element.value = element.substring(0,maxlen);
	}
}

$(function() {
	$('#reviewSize').click(function() {
		$('#reviewSize >ul').show().on("mouseleave", function(e){
			$("#reviewSize >ul").hide();
		});
		return false;
	});
});


$(function(){
	$(".pdtevaluation .review-avg .gp").on("click", function(e){
		var id = $(this).parents("li").index();
		var posY  = e.pageX -$(this).offset().left;
		var cnt = parseInt(7 * posY / 253);
		var target = (cnt * 36);
		var avgTxt = $('.avgTxt');
		$(".pdtevaluation .review-avg li .handle").eq(id).css({
			left:target
		});
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active1");
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active2");
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active3");
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active4");
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active5");
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active6");
		$(".pdtevaluation .review-avg li .gp").eq(id).removeClass("active7");
		$(".pdtevaluation .review-avg li .gp").eq(id).addClass("active"+(cnt+1));
		if (cnt==0){}
		
		//상세평가 7점척도를 100점으로 환산 2014.05. 메딕
	   var kind = $(this).attr('clickKind');
	   var values = new Array(0,3,19,35,50,65,81,97);
	   //alert(kind+' 몇점 ?  '+values[cnt+1]);
		$("#RV_RATE"+kind).val(values[cnt+1]);
	});
	
	$(".pdtevaluation  .review-avg li").each(function(n){
		$(this).find(".gp").addClass("active4");
		$(this).find(".handle").css({
			left:108
		});
	});
});