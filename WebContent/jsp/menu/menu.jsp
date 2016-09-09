<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:forEach var="menu" items="${menuList }">

<TABLE>
<TR>
<TD><a href="">${menu.getName }</a></TD>
<TD><a href="">${menu.getName}</TD>
</TR>
<TR>
<TD><a href="">신발</a>&nbsp;<a href="">의로</a>&nbsp;<a href="">스포츠</a></TD>
<TD><a href="">신발</a>&nbsp;<a href="">의로</a>&nbsp;<a href="">스포츠</a></TD>
</TR>
<tr>
<td>
<a href="">신발 전체</a>&nbsp;<a href="">라이브스타일</a>&nbsp;<a href="">러닝</a>&nbsp;
<a href="">트레이닝&짐</a><br/><a href="">농구</a>&nbsp;<a href="">축구</a>&nbsp;<a href="">스케이트보딩</a>&nbsp;
<a href="">골프</a>&nbsp;<a href="">테니스</a>&nbsp;<a href="">야구</a></td>
<td>
<a href="">신발 전체</a>&nbsp;<a href="">라이브스타일</a>&nbsp;<a href="">러닝</a>&nbsp;<a href="">트레이닝&짐<br/></a>
<a href="">골프</a>&nbsp;<a href="">테니스</a>
</td>
</tr>
</TABLE>
</c:forEach>
