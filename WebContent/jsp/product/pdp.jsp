<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page='${urlHeader}' flush="false" />
<link href="${pageContext.request.contextPath}/css/detail.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/detail_new.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/global_renewal_phase2.css" rel="stylesheet" type="text/css">
<jsp:include page='/jsp/product/pdp_top.jsp' flush="false" />
<jsp:include page='/jsp/product/pdp_reco.jsp' flush="false" />
<jsp:include page='/jsp/product/pdp_detail.jsp' flush="false" />
<jsp:include page='/jsp/product/pdp_review.jsp' flush="false" />
<jsp:include page='${urlFooter}' flush="false" />
<script src="${pageContext.request.contextPath}/js/pdp.js"></script>