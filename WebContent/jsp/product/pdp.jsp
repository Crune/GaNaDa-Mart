<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<link href="./css/default.css" rel="stylesheet" type="text/css">
<jsp:include page="${urlHeader}" flush="false" />
<jsp:include page='/jsp/product/pdp_top.jsp' flush="false" />
<jsp:include page='/jsp/product/pdp_reco.jsp' flush="false" />
<jsp:include page='/jsp/product/pdp_detail.jsp' flush="false" />
<jsp:include page='/jsp/product/pdp_etc.jsp' flush="false" />
<jsp:include page='${urlFooter}' flush="false" />