<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script>
	function move(menu, get) {
		window.location = './mc.gnd?menu=' + menu + '&' + get;
	}
	function delProduct(prdName) {
		moveConfirm('delete.gnd', 'pd_code=${pd.getPd_code()}', '정말 ' + prdName
				+ '을/를 삭제하시겠습니까?');
	}
	function moveConfirm(url, get, msg) {
		var returnValue = confirm(msg);
		if (returnValue)
			window.location = './' + url + '?' + get;
	}
</script>
<div class="row">
	<div class="col-md-8">
		<h3 style="margin-top: 0px;">
			등록된 상품 목록 <small>(${count}건)</small>
		</h3>
	</div>
	<div class="col-md-4">
		<p align="right">
			<button class="btn btn-primary"
				onclick="javascript:move('productInsert','')">상품등록</button>
		</p>
	</div>
</div>

<c:if test="${count == 0 }">
등록된 상품이 없습니다.
</c:if>
<br />
<c:if test="${count > 0 }">
	<table class="table table-striped">
		<tr>
			<td align="center">*</td>
			<td align="center">상품 명</td>
			<td align="center">가격</td>
			<td align="center">상품정보</td>
			<td align="center">배송정보</td>
			<td align="center">유의사항</td>
			<td align="center">A/S정보</td>
			<td align="center">등록일</td>
			<td align="center">관리</td>
		</tr>

		<c:forEach var="pd" items="${plist}">
			<tr>
				<td align="center">${pd.getPd_code()}</td>
				<td align="left">${pd.getPd_name()}</td>
				<td align="right">${pd.getPd_price()/1000}</td>
				<td align="center">${pd.getPd_infocode1()}</td>
				<td align="center">${pd.getPd_infocode2()}</td>
				<td align="center">${pd.getPd_infocode3()}</td>
				<td align="center">${pd.getPd_infocode4()}</td>
				<td align="center">'<fmt:formatDate
						value="${pd.getPd_reg_date()}" pattern="yy.MM.dd" /><br />
				</td>
				<td align="right">
					<div class="btn-group btn-group-xs" role="group">
						<button class="btn btn-default"
							onclick="javascript:move('productUpdate','pd_code=${pd.getPd_code()}')">설정</button>
						<button class="btn btn-default"
							onclick="javascript:move('stock','pd_code=${pd.getPd_code()}')">재고</button>
						<button class="btn btn-default"
							onclick="javascript:delProduct('상품 ${pd.getPd_code()}번 \'${pd.getPd_name()}\'')">삭제</button>
					</div>
				</td>
			</tr>
		</c:forEach>
	</table>
</c:if>