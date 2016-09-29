$(function() {
	$('.g_btn_wish').find('a').click(function() {
		insertMyLocker();
		return false;
	});
	$('.layer-cart').find('.close').click(function() {
		$(".layer-cart").stop(true, false).animate({
			top : "-187px"
		}, 1000);
		return false;
	});
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


// 컬러선택
$(function() {
	$('.layerStoreStock .select_color a.btn_option').on("click", function() {
		$('#chooseSize').html('<span class="default" >사이즈 선택</span>');
		if ($(this).hasClass('open')) {
			$(this).removeClass('open');
			$(this).next('.opt_list').stop().slideUp(200);
		} else if ($(this).hasClass('default')) {
			$(this).removeClass('open');
			$(this).next('.opt_list').stop().slideUp(200);
		} else {
			$('.layerStoreStock .selectarea a.btn_option').removeClass('open');
			$('.layerStoreStock .select_size .opt_list').stop().slideUp(200);
			$(this).addClass('open');
			$(this).next('.opt_list').stop().slideDown(200);
		}
		return false;
	});
});

// 사이즈 선택
$(function() {
	$('.layerStoreStock .select_size a.btn_option')
			.live(
					"click",
					function() {
						alert("동작은 함");
						if ($("#colorDefault").text() == "컬러 선택") {
							alert("컬러를 먼저 선택해 주세요.");
							return;
						}
						var chooseSize = $.trim($('#chooseSize').val());


						$("#sizeValue1 ul li").on(
								"click",
								function() {
									$(".btn_option .default").text(
											$(this).find("a").text());
									$('#chooseSize').val(
											$(this).find("a").text());
									$('#chooseStocksize').val(
											$(this).find("a").attr('title'));

								});

						if ($(this).hasClass('open')) {
							$(this).removeClass('open');
							$(this).next('.opt_list').stop().slideUp(200);
						} else if ($(this).hasClass('default')) {
							$(this).removeClass('open');
							$(this).next('.opt_list').stop().slideUp(200);
						} else {
							$('.layerStoreStock .selectarea a.btn_option')
									.removeClass('open');
							$('.layerStoreStock .select_color .opt_list')
									.stop().slideUp(200);
							$(this).addClass('open');
							$(this).next('.opt_list').stop().slideDown(200);
						}

						return false;
					});
});

// 컬러 옵션 선택
$(function() {
	$('.layerStoreStock .select_color .opt_list a').on(
			"click",
			function() {
				var optvalue = $(this).html();

				$(this).closest('.selectarea').find('a.btn_option')
						.removeClass('open');
				$(this).closest('.selectarea').find('a.btn_option').html(
						optvalue);
				$(this).closest('.selectarea').find('.opt_list a').removeClass(
						'selected');
				$(this).addClass('selected');
				$(this).closest('.opt_list').stop().slideUp(100);
				return false;
			});
});

// 사이즈 옵션 선택
$(function() {
	$("#sizeValue1").on(
			"click",
			function() {
				$(this).closest('.selectarea').find('a.btn_option')
						.removeClass('open');
				$(this).closest('.selectarea').find('.opt_list a').removeClass(
						'selected');
				$(this).addClass('selected');
				$(this).closest('.opt_list').stop().slideUp(100);

				return false;
			});
});