<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
	<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./infoPro.gnd" method="post">
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
	 			<td>정보내용</td>
	 			<td>
	 				<textarea name="pd_infocontent" rows="13" cols="35"></textarea>
	 			</td>
			</tr>
		</table>
	    <input type="submit" id="inProduct" value="상품등록">
    </form>