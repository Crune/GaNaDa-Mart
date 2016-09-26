<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="${urlHeader}" flush="false" />
<div class="global_gridwall_wrap global_body">
	<!-- global_gridwall_inner -->
	<div class="global_gridwall_inner">

		<section class="global_lnb_wrap">
			<div class="global_lnb_box">
				<section class="global_lnb_wrap">
					<nav class="global_lnb">
						<jsp:include page='${urlTypeLNB}' flush="false" />
					</nav>
				</section>
			</div>
		</section>
		
        <jsp:include page='${urlTypeCont}' flush="false" />
	</div>
</div>
<jsp:include page='${urlFooter}' flush="false" />