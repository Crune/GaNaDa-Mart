<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


등록된 상품 목록${count}<br />
<br />
<button id="">상품 등록</button>
<button id="main">관리자 메인으로</button>
<br />
<c:if test ="${count == 0 }">
등록된 상품이 없습니다.
</c:if>
<br />
<c:if test="${count > 0 }">
<table>
<tr>
<td align = "center" width="30"> 상품코드 </td>
<td align = "center" width="30"> 메뉴코드 </td>
<td align = "center" width="100"> 상품 명 </td>
<td align = "center" width="50"> 가격 </td>
<td align = "center" width="100"> 이미지 </td>
<td align = "center" width="30"> infocode1 </td>
<td align = "center" width="30"> infocode2 </td>
<td align = "center" width="30"> infocode3 </td>
<td align = "center" width="30"> infocode4 </td>
<td align = "center" width="70"> 등록일 </td>
<td align = "center" width="30"> 수정 </td>
<td align = "center" width="30"> 삭제 </td>
</tr>

<c:forEach var="pd" items="${plist}">
<tr>
<td align="center" width="30">
${pd.getPd_code()}</td>
<td align="center" width="30">
${pd.getMenu_code()}</td>
<td width="100" align="left">
${pd.getPd_name()}</td>
<td width="50" align="right">
${pd.getPd_price() }</td>
<td width="30" align="center">
${pd.getPd_infocode1()}</td>
<td width="30" align="center">
${pd.getPd_infocode2()}</td>
<td width="30" align="center">
${pd.getPd_infocode3()}</td>
<td width="30" align="center">
${pd.getPd_infocode4()}</td>
<td width="70">
${pd.getReg_date()}</td>
</tr>
</c:forEach>
</table>
</c:if>