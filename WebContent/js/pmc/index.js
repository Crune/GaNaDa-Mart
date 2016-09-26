var status = true;
$(document).ready(function(){
	$("#inProduct").click(function(){//상품등록 도메인으로 수정해야됨
		window.location = "./mc/insert.gnd";
	});
	
	$("#upProduct").click(function(){
		window.location = "./mc/update.gnd";
	});
	$("#review").click(function(){
		window.location = "./mc/delete.gnd.jsp";
	});
});