// JavaScript Document
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
	
	// 고객센터
	$('.global_right_nav').find('> ul > li > a').on('mouseenter', function(){
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
	})
});