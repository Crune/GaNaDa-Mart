﻿try{
	$.ajax({
		type: "POST",
		dataType : "html",
		url: "/display/chkLoginAjax.lecs", 
		success: function(data){	
			//alert(data);
			if(data != 'N'){ //html은 항상 로그인 하지 않은 상태이므로, 로그인 됐을때만 교체작업을 호출.
				// 20150320 비회원의 경우도 장바구니 개수는 가져와야 하므로 "guest"로 구분처리 하도록 수정 (따라서 위 if절은 의미 없는게 맞지만 그냥 둠)
				
				var eData = data.split("짤");
				var loginId = eData[0];
				var cartCount = eData[1];
				var memberName = eData[4];					
				
				// GNB 카트 처리
				if(cartCount != '' && cartCount != '0' && cartCount != null){
					$("#cartBubble").html(cartCount);
			  	    $("#cartBubble").css("display","block");
				}else{
					$('#cartBubble').css("display","none");
				}
				
				if (loginId != "guest") {	// 비회원이 아닐경우
					var mile = eData[2];
					var memberNo = eData[3];				
					$("#memberIdForGen").val(loginId);
					$("#memberNoForGen").val(memberNo); //상품평에서 사용
					
					// GNB 회원가입/로그인 영역
					/*$(".right-area>div").each(function(i){
						if(i >0){
							$(this).remove();
						}
					});*/
					$(".global_login").remove();
															
					var aStr2 = '<li class="global_login_window">'
						+'<a href="#" class="user">'
						+'<span>'+memberName+'님</span></a>'
						+'<ul class="global_user_menu"><li><a href="javascript:goInfoShop();">마이페이지</a></li>'
						+'<li><a href="javascript:goModify();">회원정보관리</a></li><li><a href="javascript:goMyLocker();">위시리스트</a></li>'
						+'<li><a href="javascript:goLogOut();">로그아웃</a></li></ul>'
						+'</li>';
					
					$(".global_help").before(aStr2);
					
					$('.global_user_menu').removeClass('active').hide();
					$('.global_login_window').show();
					$('.global_login_modal').hide();
					
					// 고객센터 호버
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
					    
				    var aStr1 = '<li><a href="javascript:goLogOut();">로그아웃</a></li>'
				    	+ '<li><a href="http://lecs.nike.co.kr/findstore/findStoreView.lecs">매장안내</a></li>';
										
					$("#forGenFooter").html(aStr1);
				} else {	// 비회원 처리
					
					/**
					 * ID 저장 쿠키값 조회
					 * 기존 공통 cookie함수가 전체 페이지에 로딩되지 않아서 따로 구현함.
					 */
					var savingLoginId = "";
					
					var nameOfCookie = "BO_ID_SAVE=";
					var x = 0;
					while ( x <= document.cookie.length ){
						var y = (x+nameOfCookie.length);
						if ( document.cookie.substring( x, y ) == nameOfCookie ) {
							if ( (endOfCookie=document.cookie.indexOf( ";", y )) == -1 )
								endOfCookie = document.cookie.length;
							savingLoginId = unescape( document.cookie.substring( y, endOfCookie ) );
						}
						x = document.cookie.indexOf( " ", x ) + 1;
						if ( x == 0 )
							break;
					}
					
					// ID가 저장되어있을 경우 처리
					 
					if (savingLoginId != "" && savingLoginId.length > 4) {
						$("#loginForm_1 input[name=loginId]").val(savingLoginId);
						$("#loginForm_1 input[name=idSave]").prop("checked", true);
						$("#id_text").hide();
					}
					
					openLoginPop();   // 외부에서 호출시 로그인창을 보여준다.
					
					// 고객센터 호버
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
				}
			}
		}
	});	
}catch(e){
	//에러나도 무시
};

/*	20150422 - 푸터 변경으로 인한 주석처리
$(document).ready(function(){	
	try{	
		// 1초 후 한번 실행
		setTimeout(function() {
			if($("#memberIdForGen").val() != ''){
				// footer 처리
				var aStr1 = '<li class="foot_menu last"><dl><dt>MVP회원 혜택 <img src="http://image.nike.co.kr/web/ico/footer_arr.png"  alt="MVP회원 혜택" class="arr" /></dt>'
								+'<dd><a href="/display/benefitMain.lecs" title="MVP 혜택 보기"><span>MVP 혜택 보기</span></a></dd></dl></li>';
									
				$("#forGenFooter>li").last().remove();
				$("#forGenFooter>li").last().after(aStr1);
			}
		}, 1000);
	}catch(e){
		//에러나도 무시
	};	
});
*/