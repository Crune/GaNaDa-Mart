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
</head>
<jsp:include page="${urlHeader}" flush="false" />
<body>
  <script type="text/javascript">
  
  function  init(){
	  //debugger;
	  var login_status = $("#cartForm").find("#userLogin").val();
	  
	  console.log("login+status : " + login_status);
	  
	  if(login_status =='yes' || login_status=="YES"){
		  $(location).attr('href',"<%=root%>/cartList.gnd");
	  }else{
		  alert("로그인이 필요합니다.");
		  $(location).attr('href',"<%=root%>/page.gnd?code=MAIN");
	  }	
  }
  
  window.onload = init;
  </script>
   <form id="cartForm" method="post">
    <input type="text" id="userLogin" name ="userLogin" value="${login_status}"/>
   
   </form>
   
</body>
</html>