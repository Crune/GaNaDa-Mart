<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ajax" uri="http://ajaxtags.sourceforge.net/tags/ajaxtags" %>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/egovframework/com/uss/ion/rsm/prototype-1.6.0.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/scriptaculous/scriptaculous.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/overlibmws/overlibmws.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/ajaxtags.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/egovframework/com/uss/ion/rsm/recentSrchwrd.js"></script>
 
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/ajaxtags/css/ajaxtags.css">
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/ajaxtags/css/displaytag.css">


<ajax:autocomplete
  baseUrl="${pageContext.request.contextPath}/uss/ion/rsm/listRecentSrchwrdResultSerach.do"
  source="searchKeyword"
  target="searchKeyword"
  className="autocomplete"
  parameters="srchwrdManageId=SRCMGR_0000000000001"
  minimumCharacters="1" />
  
  <input type="hidden" name="rsm_url" id="rsm_url" value="<c:url value='/uss/ion/rsm/registRecentSrchwrdResult.do'/>" >
<a href="javascript:fn_egov_regist_RecentSrchwrdResult('SRCMGR_0000000000001',$('searchKeyword').value,'fn_egov_search_RecentSrchwrd()', document.listForm)" id="btnInquire">
<spring:message code="button.inquire" /></a></span>