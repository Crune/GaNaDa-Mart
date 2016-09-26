var status = true;
$(document).ready(function(){
	$("#inProduct").click(function(){//상품등록 도메인으로 수정해야됨
		window.location = "./insert.gnd";
	});
	
	$("#upProduct").click(function(){
		window.location = "./update.gnd";
	});
	$("#review").click(function(){
		window.location = "./delete.gnd.jsp";
	});
});