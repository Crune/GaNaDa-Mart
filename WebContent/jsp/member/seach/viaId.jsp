<%@ page language="java" contentType="text/html; charset=EUC-KR"

    pageEncoding="EUC-KR"%>

<%@ page import="ganada.obj.member.AccountDao" %>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>

</head>

<%--

   request.setCharacterEncoding("euc-kr");

   String userName = request.getParameter("userName");

   String userPhone = request.getParameter("userPhone");

   String phone1 = request.getParameter("phone1");

   String phone2 = request.getParameter("phone2");

   String Phone = userPhone+"-"+phone1+"-"+phone2;

   SearchService searchService = SearchService.getInstance();

   String userId = searchService.searchId(userName, Phone);

--%>

<body>

   <form method="post" action="startPage.jsp">

<table width="1330px"  border="0"  height="430px" align="center"   >

   <tr>

    <td>

     <table width="450px" align="center"  border="0" style="color:black; background-color: #F6F6F6; font-size:20px; ">

    <tr>

    <td>

     <table width="750px" align="center" border=0; style="background-color:white; margin-top:3%" >

      <%--if(userId!= null){ --%>

      <tr>

       <td><%--=userName --%>���� ���̵��</td>

      </tr>

      <tr>

      <td><h1><%--=userId --%></h1>�Դϴ�.</td>

      </tr>

      </table>

    </td> 

    </tr>       

   <tr> 

    <td>

      <table width="150px"  align="center" border="0" style="margin-top:1%">

       <tr>

        <td><input type="submit" name="search" value="�α����ϱ�" class="btn btn-primary">

       </tr>

      </table>

      <%--} else{--%>

      <tr>

      <td><%--=userName --%>��!</td>

      </tr>

      <tr>

      <td><h1>���������� �����ϴ�.</h1></td>

      </tr>   

      </table>

    </td> 

    </tr>       

   <tr> 

    <td>

      <table width="150px"  align="center" border="0" style="margin-top:1%">

       <tr>

        <td><input type="button" value="ȸ�������ϱ�" class="btn btn-primary" onclick="location.href='joinUs.jsp'"></td>

        <td><input type="button" value="ó������" class="btn btn-primary" onclick="location.href='startPage.jsp'"></td>

       </tr>

      </table>   

      <%--} --%>

      

     

     </td>

    </tr>

  </table>

 </td>

</tr>

</table>

</form>

</body>

</html>



