<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${count == 0}">
<center>
의견이 있나요?<br />
이 상품의 첫 리뷰를 남겨 보세요. <br />
<input type="button" value="리뷰작성하기" 
            onclick="javascript:window.location='/jsp/review/reviewForm.gnd'">
</center>
</c:if>
<c:if test="${count > 0}">
<c:forEach var="review" items="${reviewLists}">

</c:forEach>
</c:if>
