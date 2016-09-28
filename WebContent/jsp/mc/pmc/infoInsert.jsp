<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <input type="button" value="목록으로" onclick="javascript:window.location='./list.gnd'">
<input type="button" value="관리자 메인" onclick="javascript:window.location='./index.gnd'">
    <form id="inform" action="./infoPro.gnd" method="post">
    <input type="hidden" name="pd_code" value=${pd_code }>
   <table>
 <tr>
 <td>  
   상품 정보
   </td><td>
  <textarea name="pd_infocontent1" rows="13" cols="35"></textarea></td>
</td>
  </tr>
  <tr>
  <td>
  배송 정보
  </td><td>
     <textarea name="pd_infocontent2" rows="13" cols="35"></textarea></td>
     </tr>
     <tr>
     <td>
     유의사항</td><td>
       <textarea name="pd_infocontent3" rows="13" cols="35"></textarea></td>
       </tr>
       <tr><td>
  A/S정보</td><td>
  <textarea name="pd_infocontent4" rows="13" cols="35"></textarea></td>
  </tr>
  </table>
    <input type="submit" id="inProduct" value="상품등록">
 
  
  
    </form>