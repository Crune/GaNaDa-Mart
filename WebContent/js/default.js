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
});