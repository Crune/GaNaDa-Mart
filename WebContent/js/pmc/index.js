var status = true;
$(document).ready(function(){
	$("#inProduct").click(function(){//상품등록 도메인으로 수정해야됨
		window.location = "./insert.gnd";
	});
	
	$("#upProduct").click(function(){
		window.location = "./update.gnd";
	});
	$("#productInfo").click(function(){
		window.location = "./infoInsert.gnd";
	});
	$("#review").click(function(){
		window.location = "./delete.gnd";
	});
});