<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
     
          <table>
     <tr>
     <td>
 <font size="4"> 상품 평가</font>
 </td>
 <td> 작성자 정보 </td></tr>
 </table>
 <hr>




     <form id="revForm" action="/jsp/review/reviewPro.gnd" method = "post" encType="multipart/form-data">
<table>
<tr>
<td> 별점주기 </td>
<td><input type="radio" id="star" name="star" value="1">★<input type="radio" id="star" name="star" value="2">★★
<input type="radio" id="star" name="star" value="3">★★★<input type="radio" id="star" name="star" value="4">★★★★
<input type="radio" id="star" name="star" value="5">★★★★★</td>
<td>구매사이즈</td><td><select id="itemsize" name="itemsize">
<option value="225">225</option>
<option value="230">230</option>
<option value="235">235</option>
<option value="240">240</option>
<option value="245">245</option>
<option value="250">250</option>
<option value="255">255</option>
</select>
</td>
</tr>
<tr><td> 사이즈  </td>
<td><input type="radio" id="siz" name="siz" value="-1">작은
<input type="radio" id="siz" name="siz" value="0">보통
<input type="radio" id="siz" name="siz" value="1">큰 </td>
<td>체중 </td><td> <input type="text" name="wei" size="7"> kg
</td>
</tr>
<tr><td>편안함</td>
<td><input type="radio" id="comfortable" name="comfortable" value="-1">편안하지 않은
<input type="radio" id="comfortable" name="comfortable" value="0">보통
<input type="radio" id="comfortable" name="comfortable" value="1">편안한</td>
<td>키</td><td><input type="text" name="hei" size="7"> cm
</td>
</tr>
<tr><td>폭</td>
<td><input type="radio" id="wid" name="wid" value="-1">좁은
<input type="radio" id="wid" name="wid" value="0">보통
<input type="radio" id="wid" name="wid" value="1">넓은</td>
<td>나이</td><td> <input type="text" name="age" size="7">세
</td>
</tr>
<tr><td>내구성</td>
<td>
<input type="radio" id="dura" name="dura" value="-1">내구성 없는
<input type="radio" id="dura" name="dura" value="0">보통
<input type="radio" id="dura" name="dura" value="1">내구성 있는 </td></tr>
</table>
<font size="4"><b>리뷰내용</b></font>
<hr>

<table>
<tr>
<td>제목 </td>
<td> <input type="text" name="subject" size="40"></td>
</tr>
<tr>
<td>내용</td>
<td>  <textarea name="content" rows="13" cols="35"></textarea></td>
<td><font size="2">리뷰 작성 가이드</br>
1.  제품을 사용하신 후 느낀 점 또는 구매를 선택하신 동기에 초점을 두고 작성하시면 됩니다. </br>
2.  제품에 대한 요청이나 아이디어를 적어주셔도 좋습니다. </br>
3.  리뷰를 보는 고객들이 제품구매에 도움이 될 수 있도록 작성합니다. </br>
4.  E-Mail, 전화번호 등 개인정보 표기는 되도록이면 피해주세요. </br>
5.  상품 또는 나이키닷컴에 대한 문의는 1:1문의하기를 이용해주세요. </br>
1:1 E-Mail 문의 ▶ </br></font>
</td>
</tr>
<tr><td>이미지</td><td>
<input id="review_image" type="file" name="review_image" /> </td> </tr>
<tr><td colspan="3"><font size="2">모든 리뷰 정보는 나이키에 귀속됩니다. 부적절한 리뷰는 삭제될 수 있습니다.</font>
<input type="checkbox"> <font size="2"><b><u>동의합니다 </u></b></font></td></tr>
</table>
<hr>
<center>
<input type="submit" id="review" value="등록하기">
 <input type="button" value="취소" onclick="javascript:window.location='/item_review.gnd'">
</center>
 </form>