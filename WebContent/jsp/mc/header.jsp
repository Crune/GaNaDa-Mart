<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="menu" uri="/WEB-INF/tld/menu.tld"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${sessionScope.pageTitle }</title>

<link href="${pageContext.request.contextPath}/css/mc.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css">

<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
    
</head>
<body>
<div class="contDiv">
	<div class="row upperRow">
	    <jsp:include page="/jsp/mc/top.jsp" flush="false" />
	</div>	
	<div class="row upperRow">
	    <jsp:include page="/jsp/mc/breadcrumb.jsp" flush="false" />
	</div>
	<div class="row">
	    <div class="col-md-2 menu">
            <jsp:include page="/jsp/mc/menu.jsp" flush="false" />
	    </div>
	    <div class="col-md-10 contents">