$(function(){

	$(window).load(function(){
		$('.global_gnb_menu').find('.global_depth2').css('opacity','0');
	});

	// 1depth 호버
	$('.global_gnb_menu').find('.global_depth1 a').on('mouseenter', function() {
		
		var $self = $(this).parent().next();
		
		$(this).parent().addClass('on').siblings().removeClass('on');

		if ($self.css('opacity') == '0') {
			$('.global_depth2').stop().animate({'opacity':'1'}, 200);
			$self.show();
		} else {
			$self.show().siblings('.global_depth2').hide();
		}
		
	});
	
	$('.global_gnb_menu').on('mouseleave', function(){
		$('.global_depth2').stop().animate({'opacity':'0'},200 , function() {
			$('.global_depth2').hide();
		});
	});

	$('.global_gnb_middle').on('mouseleave', function(){
		$(this).find('.global_depth1').removeClass('on');
	});



	// 고객센터 호버
	/*$('.global_right_nav').find('> ul > li > a').on('mouseenter', function(){
		var $self = $(this)

		if ($('.global_login_modal').css('display') == 'block') {
			$self.parent().addClass('on')
		}
		else {
			$self.next().stop().fadeIn(200);
			$self.parent().addClass('on')
		}
	})
	$('.global_right_nav').find('> ul > li').on('mouseleave', function(){
		$(this).removeClass('on')
	})
	$('.global_right_nav').find('li').on('mouseleave', function(){
		$(this).removeClass('on')
		$(this).find('ul').stop().fadeOut(200);
	})*/

	// GNB 검색 클릭
	$('.global_search_box').find('input').on({
		focus : function() {
			$(this).addClass('select_is_open');
		},
		focusout : function() {
			$(this).removeClass('select_is_open');
		}
	});

	// 로그인 레이어
	$('.global_right_nav').find('.global_login a').on('click', function(e){
		
		$(this).toggleClass('active');

		if ($(this).hasClass('active')) {
			$('.global_login_modal').show();
		}
		else {
			$('.global_login_modal').hide();
		}
		e.preventDefault();
	});

	$('.global_login_modal').find('.global_modal_close').on('click', function(){
		$(this).parent().hide();
		$('.global_right_nav').find('.global_login a').removeClass('active');
	});

	/* 로그인 레이어 높이값 자동 */
	if ($('.global_login_modal').length) {
		var bodyHeight = $('body').outerHeight();
		var footerHeight = $('.global_footer').outerHeight();
		var bodyFootH = bodyHeight - footerHeight;
		
		if ($('.global_p1_banner').length) {
			$('.global_login_modal').css('height', bodyFootH - 158);
		}
		
		else {
			$('.global_login_modal').css('height', bodyFootH - 11);
		}
		
	}

	/* 푸터 콘텐츠사업발전법 레이어 */
	$('.global_content_guide_list').find('> a').on('click', function(e){
		$(this).next().show();
		e.preventDefault();
	});
	$('.global_content_guide_list').find('.global_ly_close').on('click', function(e){
		$(this).parents('.global_content_guide_box').hide();
		e.preventDefault();
	});

	/* lnb 3depth 더보기 */
	$('.global_lnb_pdt_list, .global_lnb_filter_check').find('.global_lnb_more').on('click', function(e){
		
		/* 2015-12-23 시작 */
		$(this).next(".more-flag").val("true");
		/* 2015-12-23 끝 */
		
		$(this).hide().parent().siblings('.global_opt_more').show();

		e.preventDefault();
	});
	
	/* 2015-12-28 문요한 추가 : 시작*/
	$(".global_opt_more").each(function(){
		if($(this).find('> a').hasClass("active")){ //전시 카테고리 영역
			
			$(this).parent().find("> .lnb_more").find("> input").val("true");
			
		}else if($(this).find('> input').is(':checked') == true){ //필터 영역
			
			$(this).parent().find("> .lnb_more").find("> input").val("true");
			
		}
	});
	/* 2015-12-28 문요한 추가 : 끝*/
	
	/* 2015-12-23 시작 */
	$(".more-flag").each(function(){
		if($(this).val() == "true"){
			$(this).parent().find(".global_lnb_more").hide();
			$(this).parent().siblings('.global_opt_more').show();	
		} else {
			$(this).parent().find(".global_lnb_more").show();
			$(this).parent().siblings('.global_opt_more').hide();	
		}
	});
	/* 2015-12-23 끝 */


	$('.global_accordian').find('> a').on('click', function(e){
		$(this).toggleClass('is_open');
		$(this).next().slideToggle(300);
		e.preventDefault();
	});

	/* lnb filter color  20151203 수정
	$('.global_color_list li a').on('click', function(e){
		$(this).toggleClass('on');
		//e.preventDefault();
	}) */ 
	/* lnb filter color  20151203 수정 */ 
	
	/* lnb filter size 20151203 추가 
	$('.global_size_list li a').on('click', function(e){
		$(this).toggleClass('on');
	}) */ 
	/* lnb filter size 20151203 추가 */ 
	

	/* 셀렉트박스 */
	/* 151117 추가 및 수정 */
	var globalSel = $('.global_sect_field');
	var globalAct = 'gb_active';
	globalSel.on('click', function(e){
		if ($(this).hasClass(globalAct)) {
			$(this).removeClass(globalAct).next().hide();
		}else {
			$(this).addClass(globalAct).next().show();
		}
		e.preventDefault();
		e.stopPropagation();

	});

	$('.global_sect_menu_list a').on('click', function(e){
		$(this).parent().addClass('active').siblings().removeClass('active');
		globalSel.find('span').text($(this).text());
		//e.stopPropagation();
	});

	$('body').click('on',function(){
		if (globalSel.hasClass(globalAct) && globalSel.length) {
			globalSel.removeClass(globalAct).next().hide();
		}
	});


	/* 151117 추가 및 수정 */	
	/*
	151117 삭제
	$('.global_sect_field').on('focusout', function(){
		$('.global_sect_menu_list').hide();
		$('.global_sect_field').removeClass('gb_active')
	})
	*/

	/*$('.global_login_btn').on({
		click : function (e) {
			$('.global_login').hide();
			$('.global_user_menu').removeClass('active').hide();
			$('.global_login_window').show();
			$('.global_login_modal').hide()
			e.preventDefault();
		}
	})
	$('.global_logout_btn').on({
		click : function(e) {
			$(this).parents('.global_login_window').hide().siblings('.global_login').show();
			$('.global_login').find('> a').removeClass('on')
			e.preventDefault();
		}
	})*/

	/*if ($('.global_login_window').hasClass('active')) {
		$('.global_login').hide();
		$('.global_login_window').show();
	}
	else {
		$('.global_login').show();
		$('.global_login_window').removeClass('active').hide();
	}*/


/*	$('.global_gridwall_container').on({
		mouseenter : function() {
			$(this).parent().addClass('on');
			if ($(this).find('.gridwall_item_exp_inner').length) {
				$(this).find('.gridwall_item_soldout').hide();
			}
		}
	})
	$('.global_gridwall_container').on({
		mouseleave : function() {
			$(this).parent().removeClass('on')
			if ($(this).find('.gridwall_item_exp_inner').length) {
				$(this).find('.gridwall_item_soldout').show();
			}
		}
	})*/
});


//2016-01-04 - 검색결과 섬네일 롤링 수정 시작
$(function(){
	
	function miniSlide (self) {
		var _self 			= self;
		var _wrapper 		= _self.find('.gridwall_item_exp_inner');
		var _slideItem 		= _self.find('.gridwall_item_exp_inner .slide');
		var _slideItemWidth = _self.find('.gridwall_item_exp_inner .slide').width();
		var _itemLeng 		= _slideItem.length;
		var prev 			= _self.find('.global_exp_prev');
		var next 			= _self.find('.global_exp_next');
		
		var sPos = _wrapper.position();

		_wrapper.css({'width':_slideItemWidth * _itemLeng});
		
		if (sPos.left >= 0) {
			prev.hide();
		} else {
			prev.show();
		}
		
		prev.on('click', function(){
			prevAction();
		});

		next.on('click', function(){
			nextAction();
		});

		var idx = Math.abs(sPos.left / _slideItemWidth);

		function nextAction() {
			idx ++;
			_wrapper.stop().animate({'left':-_slideItemWidth * idx});
			prev.show();
			if (_itemLeng-1 == idx) {
				next.hide();
			}else if (idx > 0) {
				next.show();
			}
		}

		function prevAction() {
			idx--;
			_wrapper.stop().animate({'left':-_slideItemWidth * idx});
			if (idx == 0) {
				prev.hide();
				next.show();
			} else if (idx > 0) {
				prev.show();
				next.show();
			}
		}

	};
	
	function prdAjaxCallbackMiniSlideBinder(){
		var $list = $('.global_gridwall_list');

		$list.find('> li').each(function(idx) {
			var $this = $(this);
			
			if( !$this.data('slideinit') ){		  
			  
			  $this.data('slideinit',true);
			  
			  if ($this.find('.gridwall_item_exp_inner > .slide').length >= 2) {
				  miniSlide($this);
			  } else {
				  $this.find(".global_exp_next").hide();
			  }

			  $this.find('.global_gridwall_container').off().on({
				 'mouseenter' : function(){
					var $this = $(this);
					$this.closest('.global_gridwall_col').addClass('on');
					if ($this.find('.gridwall_item_exp_inner').length) {
						$this.find('.gridwall_item_soldout').hide();
					}
				 },
				 'mouseleave' : function(){
					var $this = $(this);
					$this.closest('.global_gridwall_col').removeClass('on');
					if ($this.find('.gridwall_item_exp_inner').length) {
						$this.find('.gridwall_item_soldout').show();
					}
				 }
			  });
		  }
	   });
	}
	
	window.prdAjaxCallbackMiniSlideBinder = prdAjaxCallbackMiniSlideBinder;
	
	$(function(){
		prdAjaxCallbackMiniSlideBinder();
	});

	 /*$('.global_gridwall_list').find('> li').each(function(){
	 	if ($(this).find('.gridwall_item_exp_inner > .slide').length >= 2) {
	 		miniSlide($(this));
	 	}else{
			$(this).find(".global_exp_next").hide();
		}
	 })
	*/
	//2016-01-04 - 검색결과 섬네일 롤링 수정 끝

	 /*
	 $('.global_gridwall_list').find('.slide').on('mouseenter', function(){
	 	var thisImg = $(this).find('img').attr('src');
	 	$(this).parents('.global_gridwall_container').find(' > a > img').attr('src', thisImg);
	 		
	 })
	  $('.global_gridwall_list').find('.slide').on('mouseleave', function(){
		var firstImg = $(this).siblings(".slide").eq(0).find("> a:first-child > img").attr('src');
		  $(this).parents('.global_gridwall_container').find(' > a > img').attr('src', firstImg);
		 	
	  })
	 */
});

/*
$(function(){
		$('.global_nav_sec > section:first-child').find('.global_lnb_pdt_tit').on('click', function(e){  //2015-12-07 수정
		$(this).addClass('global_selected').siblings().removeClass('global_selected');
		$(this).next('.global_lnb_pdt_list').show().siblings('.global_lnb_pdt_list').hide();
		e.preventDefault();
	})
})
*/
/* 2015-12-10 수정 */
$(function(){

	/*$('.global_nav_sec .global_lnb_pdt_tit').on('click', function(){
		var subMenuLength = $(this).next('div').length;
		if ( subMenuLength > false)
		{
			$(this).addClass('global_selected').siblings().removeClass('global_selected');
			$(this).next('.global_lnb_pdt_list').show().siblings('.global_lnb_pdt_list').hide();
			//e.preventDefault();
		}
	})*/

});
/*
$(function(){
	
	var _this = $(this);
	var liWidth = _this.find('.gridwall_item_exp_inner > li').width();
	var liLength = _this.find('.gridwall_item_exp_inner > li').length;
	var ulWidth = liWidth * liLength;

	var _liItem = _this.find('.gridwall_item_exp_inner')
	var _prevBtn = _this.find('.global_exp_prev');
	var _nextBtn = _this.find('.global_exp_next');
	var _btnIdx = 0;

	function gridwallExp() {
		
		function prevBtn() {
			
			if (_btnIdx > 1) {
				_btnIdx--
				_liItem.animate({'left': -liWidth * _btnIdx})
				_nextBtn.show()
			}
			else {
				_btnIdx--
				_liItem.animate({'left': -liWidth * _btnIdx})
				_prevBtn.hide()
				_nextBtn.show()
			}
		}

		function nextBtn() {
			if (_btnIdx < liLength-4) {
				_btnIdx++
				console.log(_btnIdx)
				console.log(liLength-3)
				_liItem.animate({'left': -liWidth * _btnIdx})
				_prevBtn.show()
			}
			else if (_btnIdx == liLength-4) {
				_btnIdx++
				_liItem.animate({'left': -liWidth * _btnIdx})
				_nextBtn.hide();
			}
		}

		function expWidth() {
			_liItem.css('width', ulWidth)
		}

		expWidth()

		_prevBtn.on('click', function(){
			prevBtn()
		})

		_nextBtn.on('click', function(){
			nextBtn()
		})
	}

	if ($('.gridwall_hover_sec').length) {
		gridwallExp()
	}
		
})
*/



//Define Var.
var isRun = false;

//Notification

$(function() {
	var obj = $(".Notification .content .area ul");
	var size = $(".Notification .area ul li").size();
	var rightEventBtn = $(".Notification .right");
	var leftEventBtn =  $(".Notification .left");
	var m_id = 0;
	var intervalId;
	
	if(size <= 1) {
		rightEventBtn.hide();
		leftEventBtn.hide();
		return;
	}

	if(size < 2) {
		rightEventBtn.hide();
		return;
	} else {
		leftEventBtn.hide();
	}

	leftEventBtn.on("click", function(e){
		e.preventDefault();

		stopInterval();
		var id = m_id - 1;
		fn_renderSlide(obj, id, showEventBtn);
	});

	rightEventBtn.on("click", function(e){
		e.preventDefault();

		stopInterval();
		var id = m_id + 1;
		fn_renderSlide(obj, id, showEventBtn);
	});

	function fn_renderSlide(_obj, _id, _fnc) {
		if(isRun)
			return;

		isRun = true;

		_fnc(_id);
		var target = -(_obj.find("li").width() * _id);
		_obj.animate({
			marginLeft:target+"px"
		},
		{
			duration : 1000,
			queue : false,
			complete : function(){
				isRun = false;
			}
		});
	}
	function showEventBtn(_id) {
		var id = _id;

		if(id == size-1) {
			leftEventBtn.show();
			rightEventBtn.hide();
		} else if(id == 0) {
			leftEventBtn.hide();
			rightEventBtn.show();
		} else {
			leftEventBtn.show();
			rightEventBtn.show();
		}
		m_id = id;
	}

	function startInterval() {
		intervalId = setInterval(function(){
			var id = m_id + 1;
			if(id < size) {
				fn_renderSlide(obj, id, showEventBtn);
			} else {
				stopInterval();
			}
		}, 4500);
	}

	function stopInterval() {
		clearInterval(intervalId);
	}

	startInterval();

});


/* 공통 - placeholder */
$(function() {
	$('.place_input input').on({
	     focusin : function() {
	          var $target = $(this);
			  $(this).siblings('label').hide();
	          $target.keydown(function( event ) {
	               $(this).siblings('label').hide();
	               if( $(this).val().length <= -1 ) {
	                    $(this).siblings('label').show();
	               }
	          });
	     },
	     focusout : function() {    
	          if( $(this).val().length <= 0 ) {
	               $(this).siblings('label').show();
	          }
	     }
	});
});

/* 2016-01-05 장바구니 레이어 */
/*$(function() {
	function globalNewCart ()  {
		$(".global_newCartArea").animate({ top : "100px"}, 1300).delay(2000).animate({top:'-187px'},1000);
	}
	globalNewCart() // 함수사용
});*/
/* 2016-01-05 장바구니 레이어 */