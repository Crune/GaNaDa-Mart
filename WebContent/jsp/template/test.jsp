<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script type="text/javascript">
 function mysearch() {
  var dt=new Date();
  dt=(new Date(dt.getFullYear(),dt.getMonth()+1,dt.getDate())).toGMTString();
  var tmp=getCookie("myword");
  if (tmp!="") {
   tmp=tmp.split(",");
   tmp[tmp.length]=txt.value;
   tmp=tmp.join();
  } else {
   tmp=txt.value;
  }
  document.cookie="myword="+tmp+";expires="+dt+";";
  //src.submit();  //원래의 검색로직
 }
 function getCookie(str) {
  var binfo=document.cookie.split(";");
  var tmp="";
  for (var i=0; i<binfo.length; i++) {
   if (binfo[i].indexOf(str)>=0) {
    tmp=binfo[i].substring(binfo[i].indexOf("=")+1,binfo[i].length);
    break;
   }
  }
  return tmp;
 }
 function window.onload() {
  var tmp=getCookie("myword").split(",");
  for (var i=0; i<tmp.length; i++) {
   cookieinfo.insertAdjacentHTML("beforeEnd",tmp[i]+"<br>");
  }
 }
</script>
<form name=src action=test.html>
	<input type=text name=txt> <input type=button value=search
		onclick=mysearch() />
</form>
<br>
<br>
--쿠키정보--
<br>
<span id=cookieinfo></span>