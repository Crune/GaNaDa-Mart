<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <form id="inform" action="./infoInsertPro.gnd" method="post">
	    <table>
	    	<tr>
	    		<td>
	    			<select name="pd_infotype">
				    	<option value="" selected>정보구분</option>
				    	<option value="1">상품정보</option>
				    	<option value="2">배송/결재정보</option>
				    	<option value="3">유의사항</option>
				    	<option value="4">A/S정보</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>정보이름</td>
				<td>
					<input type="text" name="pd_infoname" size="30" placeholder="정보이름" maxlength="30">
				</td>
			</tr>
	 		<tr>
	 			<td>정보내용</td>
	 			<td>
	 				<textarea name="pd_infocontent" rows="13" cols="35"></textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" id="inProduct" value="상품등록">
	    <input type="button" value="닫기" onclick="setInfo()">
    </form>
<script language="javascript">
<!--
  function setInfo()
    {		
    	window.close();
	}
		-->
</script>