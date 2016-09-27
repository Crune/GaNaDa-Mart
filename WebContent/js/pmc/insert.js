$(document).ready(function(){
	$("#inform").ajaxForm({
	success: function(data, status){
		window.location.href("./list.gnd");
	}	
	});
	
	
$("#main").click(function(){
	window.location.href("./index.gnd");
});	

$("#list").click(function(){
	window.location.href("./list.gnd");
})
	
})