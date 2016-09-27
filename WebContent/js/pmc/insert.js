$(document).ready(function(){
	$("#inform").ajaxForm({
	success: function(data, status){
		window.location="./list.gnd";
	}	
	});
	
	
$("#main").click(function(){
	window.location="./index.gnd";
});	

$("#list").click(function(){
	window.location="./list.gnd";
});
	
});