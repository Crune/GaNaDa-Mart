<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <form name="stinform" action="./stockInsertPro.gnd" method="post">
	    <div id="productForm" class="box">
		    <ul>
			   	<input name="pd_code" type="hidden" value="${pd_code }">
			   <li><label for="c_name">색상코드</label>
			    <input type="text" name="c_code" readonly placeholder="색상등록버튼으로 등록가능">
    			<input type="button" name="c_codebt" value="색상등록" onclick="window.open('./colorList.gnd?pd_code=${pd_code}','win','width=1000,height=500,toolbar=0,scrollbars=0,resizable=0')"> 
   
			    <li><label for="pd_size">사이즈</label>
			    	<input id="pd_size" name="pd_size" type="text" size="10" placeholder="사이즈" maxlength="10">
			    <li><label for="amount">수량</label>
			    	<input id="amount" name="amount" type="text" size="10" placeholder="수량" maxlength="10">
			    
			    <li class="label2">
			   		<input type="submit" id="stinProduct" value="상품재고등록">
			    
		    </ul>
	    </div>
    </form>