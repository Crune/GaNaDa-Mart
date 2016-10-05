<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

등록된 상품재고 목록 <font size="3" color="red">${count}</font>
<input type="button" value="재고등록" onclick="javascript:window.location='./mc.gnd?menu=stockInsert&pd_code=${pd_code}'">
<br />
<c:if test ="${count == 0 }">
등록된 상품재고가 없습니다.
</c:if>
<br />
<c:if test="${count > 0 }">
<table class="table">
<tr>
<td align = "center" width="30"> 재고코드 </td>
<td align = "center" width="30"> 상품코드 </td>
<td align = "center" width="30"> 색상코드 </td>
<td align = "center" width="20"> 사이즈 </td>
<td align = "center" width="70"> 수량 </td>
<td align = "center" width="30"> 수정 </td>
<td align = "center" width="30"> 삭제 </td>
</tr>

<c:forEach var="pd" items="${plist}">
<tr>
<td align="center" width="30">
${pd.getSk_code()}</td>
<td width="30" align="center">
${pd.getPd_code()}</td>
<td width="30" align="center">
${pd.getC_code()}</td>
<td width="30" align="center">
${pd.getPd_size()}</td>
<td width="30" align="center">
${pd.getAmount()}</td>
<td align="center">
<input type="button" value="수정" onclick="javascript:window.location='./mc.gnd?menu=stockUpdate&sk_code=${pd.getSk_code()}&pd_code=${pd.getPd_code()}'">
</td>
<td align="center">
<input type="button" value="삭제" onclick="javascript:window.location='./stockDeletePro.gnd?sk_code=${pd.getSk_code()}&pd_code=${pd.getPd_code()}'">
</td>
</tr>
</c:forEach>
</table>
</c:if>