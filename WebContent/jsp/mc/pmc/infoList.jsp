<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script language="JavaScript">
<!--
    function openUpdate(userinput) {
        if (userinput.pd_infocode.value == "") {
            alert("정보종류를 선택해주세요");
            return;
        }
        url = "infoUpdate.gnd?pd_infocode=" + userinput.pd_infocode.value ;
        
        open(url, "open", 
        "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
    }
-->
</script>
<form id="inform" action="./infoUpdate.gnd" method="post">
   <table>
	   	<c:forEach var="i" items="${piList }">
	 		<tr>
	 			<td>정보내용
	 				<input type="radio" name="pd_infocode" value="${i.pd_infocode }">
	 			</td>
			 	<td>
			 		${i.pd_infoname }
				</td>
			</tr>
		</c:forEach>
	</table>
    <input type="button" name="openUpdate" value="정보등록" OnClick="javascript:window.location='./infoInsert.gnd'"> 
    <input type="submit" value="정보수정">
	<input type="button" value="닫기" onclick="setInfo()">
</form>
<script language="javascript">
<!--
  function setInfo()
    {		
    	opener.document.userinput.pd_infocode.value="${pi.pd_infocode}";
		self.close();
	}
		-->
</script>