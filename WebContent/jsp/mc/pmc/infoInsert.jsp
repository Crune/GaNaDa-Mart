<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./infoPro.gnd" method="post">
	    <table>
	 		<tr>
	 			<td>상품 정보</td>
	 				<select name="pd_infotype">
				    	<option value="" selected>색상</option>
				    	<option value="1">블랙</option>
				    	<option value="2">블루</option>
				    	<option value="3">레드</option>
				    </select>
	 			<td>
	 				<textarea name="pd_infocontent1" rows="13" cols="35"></textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" id="inProduct" value="상품등록">
    </form>