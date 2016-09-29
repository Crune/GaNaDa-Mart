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