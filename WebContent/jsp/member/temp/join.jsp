<%@ page  contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>메인입니다..</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<c:if test="${sessionScope.memId == null }">
<script language="javascript">
<!--
function focusIt()
{      
   document.inform.id.focus();
}
 
 function checkIt()
 {
   inputForm=eval("document.inform");
   if(!inputForm.id.value){
     alert("아이디를 입력하세요..");
	 inputForm.id.focus();
	 return false;
   }
   if(!inputForm.passwd.value){
     alert("아이디를 입력하세요..");
	 inputForm.passwd.focus();
	 return false;
   }
 }
//-->
</script>
</head>

<body onLoad="focusIt();" bgcolor="${bodyback_c}">
  <table width=630 height=100 cellpadding="0" cellspacing="0"  align="center" border="1" >
      <tr>
      <td width="330" rowspan="5" bgcolor="${bodyback_c}" width="300" >회원가입
      <br>나이키 회원이 되시면 다양한 혜택을 누리실 수 있습니다.<br>
          •다양한 프로모션 코드를 통한 할인 혜택<br>
     <input type="button"  value="회원가입" onclick="javascript:window.location='/jsp/member/inputForm.nhn'">
      <form name="membership" method="post" action="/jsp/member/membership.nhn"  onSubmit="return checkIt();">
       </td>
       </tr>
   <tr>
   <th table align="center" width="150"colspan="2" bgcolor="${bodyback_c}"  >로그인
  </th>
       
</tr>
<tr>
        <td bgcolor="${title_c}"  width="150" align="right">아이디</td>
        <td width="150" bgcolor="${value_c}">
            <input type="text" name="id" size="15" maxlength="10"></td>
    </tr>
       <tr>
<form name="membership" method="post" action" " onSumit=return checkIt();"></form>
         <td bgcolor="${title_c}"  width="150" align="right">패스워드</td>
         <td width="150" bgcolor="${value_c}">
            <input type="password" name="passwd" size="15" maxlength="10"></td>
       </tr>
       <tr>
          <td colspan="3" bgcolor="${title_c}"   align="center">
            <input type="submit" name="Submit" value="로그인">
            
          </td></form></tr></table>
          </c:if>
          <c:if test="${sessionScope.memId !=null }">
    
       <table width=500 cellpadding="0" cellspacing="0"  align="center" border="1" >
         <tr>
           <td width="300" bgcolor="${bodyback_c}" height="20">하하하</td>

           <td rowspan="3" bgcolor="${value_c}" align="center">
          
             ${sessionScope.memId}님이<br>
             방문하셨습니다.
             <form  method="post" action="logout.jsp">  
             <input type="submit"  value="로그아웃">
             <input type="button" value="회원정보변경" onclick="javascript:window.location='/member/inputForm.nhn'">
             </form>
         </td>
        </tr>
       <tr > 
         <td rowspan="2" bgcolor="${bodyback_c}" width="300" >메인입니다.</td>
      </tr>
     </table>
     <br>

 </c:if>
 </body>
</html>
