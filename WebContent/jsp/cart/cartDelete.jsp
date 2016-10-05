<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html  >
<html>
<head>
<%
  String root = request.getContextPath();
%>
<title>cart</title>
<script src="<%=root%>/js/jquery-1.11.3.min.js"></script>
<body>
<script type="text/javascript">

	function  resultProcess(){
		  var resultCode  = $("#resultForm").find("#resultCode").val();
		  
		  if(resultCode  ="Sucess"){
			  $(location).attr('href',"<%=root%>/cartList.gnd");
		  }else{
			  $(location).attr('href',"<%=root%>/page.gnd?code=MAIN");
		  }	  
	}

	window.onload = resultProcess;

</script>
<form id="resultForm">
  <input type="hidden" id="resultCode" name="resltCode" value="${resultCode}" />
  </form>

</body>
</html>