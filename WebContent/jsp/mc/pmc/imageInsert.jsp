<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="imgup" action="./imageInsertPro.gnd?pd_code=${Image.getPd_code() }" method="post" encType="multipart/form-data">
<input type="hidden" name="im_order" value="1">
right : <input type="file" name="right"> 
<select id="c_code" name="c_code">
<option value="1">1</option> 
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select>	<br />
<input type="hidden" name="im_order" value="2">
left : <input type="file" name="left"> <br />

<input type="hidden" name="im_order" value="3">
bot : <input type="file" name="bot"><br />

<input type="hidden" name="im_order" value="4">
top : <input type="file" name="top"><br />

<input type="hidden" name="im_order" value="5">
image : <input type="file" name="image"><br />

<input type="hidden" name="im_order" value="6">
back : <input type="file" name="back"><br />

<input type="submit"  value="파일올리기">

</form>