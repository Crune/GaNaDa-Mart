var status = true;
$(document).ready(function(){
	$("#inProduct").click(function(){//상품등록 도메인으로 수정해야됨
		window.location.href("/jsp/mc/pmc/insert.jsp");
	});
	
	$("#upProduct").click(function(){
		window.location.href("/jsp/mc/pmc/update.jsp");
	});
	$("#review").click(function(){
		window.location.href("/jsp/review/delete.jsp");
	});
});