<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</div>
<div class="col-md-2 menu">
       <jsp:include page="/jsp/mc/menu.jsp" flush="false" />
</div>	    
</div>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>

<!-- Custom Javascript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/mc.js"></script>

<script type="text/javascript">

$(function() {
	$(window).load(function(){
	    $("#menu_${mc_menu}").addClass("active");
	});
});
</script>
</body>
</html>