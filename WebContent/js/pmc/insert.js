$(document).ready(function(){
	$("#inform").ajaxForm({
	success: function(data, status){
		window.location.href("/jsp/mc/pmc/list.jsp");
	}	
	});
	
	
$("#main").click(function(){
	window.location.href("/jsp/mc/mc.jsp");
});	

$("#list").click(function(){
	window.location.href("/jsp/mc/pmc/list.jsp");
})
	
})