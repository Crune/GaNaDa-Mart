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
<TD><a href="">�Ź�</a>&nbsp;<a href="">�Ƿ�</a>&nbsp;<a href="">������</a></TD>
<TD><a href="">�Ź�</a>&nbsp;<a href="">�Ƿ�</a>&nbsp;<a href="">������</a></TD>
</TR>
<tr>
<td>
<a href="">�Ź� ��ü</a>&nbsp;<a href="">���̺꽺Ÿ��</a>&nbsp;<a href="">����</a>&nbsp;
<a href="">Ʈ���̴�&��</a><br/><a href="">��</a>&nbsp;<a href="">�౸</a>&nbsp;<a href="">������Ʈ����</a>&nbsp;
<a href="">����</a>&nbsp;<a href="">�״Ͻ�</a>&nbsp;<a href="">�߱�</a></td>
<td>
<a href="">�Ź� ��ü</a>&nbsp;<a href="">���̺꽺Ÿ��</a>&nbsp;<a href="">����</a>&nbsp;<a href="">Ʈ���̴�&��<br/></a>
<a href="">����</a>&nbsp;<a href="">�״Ͻ�</a>
</td>
</tr>
</TABLE>
</c:forEach>
