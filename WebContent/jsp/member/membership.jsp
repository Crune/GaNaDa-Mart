<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <html>
<head><title>로그인</title>
 
<tr> 
    <tr> 
      <td width="200">이름</td>
      <td width="700"> 
        <input type="text" name="id" size="30" maxlength="50">
       
      </td>
    </tr>
    <br>
</br>
<tr> 
      <td width="200"> 이메일</td>
      <td width="700"> 
        <input type="text" name="id" size="30" maxlength="50">
       
      </td>
    </tr>
    <tr> 
      <td colspan="2" align="center" bgcolor="${value_c}"> 
          <input type="submit" name="confirm" value="중복 확인" >
          <br>
</br>
          <input type="reset" name="reset" value="다음">
          <input type="button" value="취소" onclick="javascript:window.location='/jsp/member/join.nhn'">
      </td>
    </tr>
    </head>
    </html>
    