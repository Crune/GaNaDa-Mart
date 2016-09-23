<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${count == 0}">
<center>
의견이 있나요?<br />
이 상품의 첫 리뷰를 남겨 보세요. <br />
<input type="button" value="리뷰작성하기" 
            onclick="javascript:window.location='./reviewForm.gnd'">
</center>
</c:if>
<c:if test="${count > 0}">
<center>
<font size="6" color="black">리뷰</font><font size="4" color="orange">${count}</font>
<hr>
<c:forEach var="review" items="${reviewLists}">


</center>
<table>
<tr>
<td align="left">
<c:choose>
<c:when test="${review.getStar() == 5 }">
<font color="Orange">★★★★★</font>
</c:when>
<c:when test="${review.getStar() == 4 }">
<font color="Orange">★★★★</font>
</c:when>
<c:when test="${review.getStar() == 3 }">
<font color="Orange">★★★</font>
</c:when>
<c:when test="${review.getStar() == 2 }">
<font color="Orange">★★</font>
</c:when>
<c:when test="${review.getStar() == 1 }">
<font color="Orange">★</font>
</c:when>
</c:choose>
<small class="date">(${review.getReg_date()})</small>
</td>
</tr>
<tr>
<td colspan="2"><font size="4"><b>${review.getSubject()}</b></font></td>
<td align="right"> ${review.getWriter()} <br />
<c:if test="${review.getItemsize() != null }"><font size="2">구매사이즈 ${review.getItemsize()}</font> </c:if>
<c:if test="${review.getWei() != null }"><font size="2">몸무게 ${review.getWei()}</font></c:if>
<c:if test="${review.getHei() != null }"><font size="2">키  ${review.getHei()}</font></c:if>
<c:if test="${review.getAge() != null }"><font size="2">나이 ${review.getAge()}</font></c:if>
</td>
</tr>
<tr>
<td rowspan="4" align="left">
	<c:if test="${review.img != null}">
		<img src="./img/${review.img}" width="100px"><br />
	</c:if>

${review.getContent()}</td>
<td align="left" > <c:if test="${review.getSiz() != null }"><b>사이즈</b></c:if></td>
<td align="left"><c:if test="${review.getSiz() == 1}"> 큰</c:if>
<c:if test="${review.getSiz() == 0 }"> 보통 </c:if>
<c:if test="${review.getSiz() == -1 }"> 작은 </c:if>
</td>
</tr>
<tr>
<td><c:if test="${review.getComfortable() != null }">
<b>편안함</b></c:if></td><td> <c:if test="${review.getComfortable() == 1}"> 편안한 </c:if>
<c:if test="${review.getComfortable() == 0}"> 보통  </c:if>
<c:if test="${review.getComfortable() == -1}"> 편안하지 않은</c:if>
</td>
</tr>
<tr>
<td><c:if test="${review.getWid() !=null }"><b>폭</b></c:if></td><td> <c:if test="${review.getWid() == 1 }"> 넓은 </c:if>
<c:if test="${review.getWid() == 0 }"> 보통 </c:if>
<c:if test="${review.getWid() == -1 }"> 좁은 </c:if>
</td>
</tr>
<tr>
<td><c:if test="${review.getDura() != null }">
<b>내구성</b></c:if></td><td> <c:if test="${review.getDura() == 1 }"> 내구성 있는 </c:if>
<c:if test="${review.getDura() == 0 }"> 보통 </c:if>
<c:if test="${review.getDura() == -1 }"> 내구성 없는 </c:if>
</td>
</tr>
</table>
<hr>


</c:forEach>
</c:if>
