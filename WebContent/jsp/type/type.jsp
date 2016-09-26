<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="${urlHeader}" flush="false" />
<section class="global_lnb_wrap">
    <div class="global_lnb_box">
        <section class="global_lnb_wrap">
            <nav class="global_lnb">
                <jsp:include page='${urlTypeLNB}' flush="false" />
            </nav>
        </section>
        <div class="global_gridwall_box">
                <jsp:include page='${urlTypeCont}' flush="false" />
        </div>
    </div>
</section>
<jsp:include page='${urlFooter}' flush="false" />