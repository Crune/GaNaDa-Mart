<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

등록된 상품 목록 <font size="3" color="red">${count}</font>
<input type="button" value="상품등록" onclick="javascript:window.location='./mc.gnd?menu=productInsert'">
<br />
<c:if test ="${count == 0 }">
등록된 상품이 없습니다.
</c:if>
<br />
<c:if test="${count > 0 }">
<table class="table">
<tr>
<td align = "center" width="30"> * </td>
<td align = "center" width="100"> 상품 명 </td>
<td align = "center" width="20"> 가격 </td>
<td align = "center" width="70"> 상품정보 </td>
<td align = "center" width="70"> 배송정보 </td>
<td align = "center" width="70"> 유의사항 </td>
<td align = "center" width="70"> A/S정보 </td>
<td align = "center" width="70"> 등록일 </td>
<td align = "center" width="30"> 수정 </td>
<td align = "center" width="30"> 삭제 </td>
<td align = "center" width="30"> 재고 </td>
</tr>

<c:forEach var="pd" items="${plist}">
<tr>
<td align="center" width="30">
${pd.getPd_code()}</td>
<td width="100" align="left">
${pd.getPd_name()}</td>
<td width="50" align="right">
${pd.getPd_price()/1000}</td>
<td width="30" align="center">
${pd.getPd_infocode1()}</td>
<td width="30" align="center">
${pd.getPd_infocode2()}</td>
<td width="30" align="center">
${pd.getPd_infocode3()}</td>
<td width="30" align="center">
${pd.getPd_infocode4()}</td>
<td width="70">
'<fmt:formatDate value="${pd.getPd_reg_date()}" pattern="yy MM-dd" /><br />
</td>
<td>
<input type="button" value="수정" onclick="javascript:window.location='./mc.gnd?menu=productUpdate&pd_code=${pd.getPd_code()}'">
</td>
<td>
<input type="button" value="삭제" onclick="javascript:window.location='./delete.gnd?pd_code=${pd.getPd_code()}'">
</td>
<td>
<input type="button" value="관리" onclick="javascript:window.location='./mc.gnd?menu=stockList&pd_code=${pd.getPd_code()}'">
</td>
</tr>
</c:forEach>
</table>
</c:if>