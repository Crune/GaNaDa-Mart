


<%@ page language="java" contentType="text/html; charset=EUC-KR"

    pageEncoding="EUC-KR"%>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>���ϴ´��</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<script src="js/bootstrap.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>




</head>

<body>

<form name="searchId" method="post" action="viaId.jsp">

<table width="1330px"  border="0"  height="430px" align="center"   >

   <tr>

    <td>

     <table width="450px" align="center"  border="0" style="color:black; background-color: #F6F6F6; font-size:20px; ">

    <tr>

    <td>

     <table width="750px" align="center" border=0; style="background-color:white; margin-top:3%" >

      <tr>

       <td>���̵� ã��</td>

       <td><div id="sub-title"> |  ȸ�������� ����� ������ ����.</td>

       <td style="width:300px"></td>

      </tr>

     </table>

    </td> 

    </tr>       

   <tr> 

    <td>

   <table width="600px"  height="300px" align="center" border="0"  style=" background-color:none; border:dotted 5px none;">

    <tr>

     <td>

      <table width="400px"  border="0" style="margin-top:3%">

       <tr>

        <td><div id="middle-title">&nbsp;�̸��� �ڵ��� ��ȣ�� �Է����ּ���.</div>

        </td>

       </tr>

      </table>

     </td>

    </tr>

    <tr>

     <td>

      <table width="380px" align="center" border="0" style="font-size:19px">

       <tr>

        <td>�̸�</td>

        <td><input type="text" name="userName"></td>

       </tr>

       <tr>

        <td>�޴���</td>

        <td><select name="userPhone">

        <option value ="010" selected="selected">010</option>

        <option value ="011">011</option>

        <option value ="016">016</option> 

        <option value ="017">017</option>

        </select> -

        <input type="text" name="phone1" style="width:70px"> -

        <input type="text" name="phone2" style="width:70px"></td>

       </tr>

      </table>

     </td>

    </tr>

   

    <tr>

     <td>

      <table width="150px"  align="center" border="0" style="margin-top:1%">

       <tr>

        <td><input type="submit" name="search" value="ã��" class="btn btn-primary">

         <input type="button" name="cancel" value="���" class="btn btn-primary" onclick="location.href='startPage.jsp'"></td>

       </tr>

      </table>

     </td>

    </tr>

  </table>

 </td>

</tr>

</table>

</td>

</table>

</form>

</body>

</html>





