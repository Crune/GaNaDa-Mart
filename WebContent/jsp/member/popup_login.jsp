<%@ page contentType="text/html; charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script language="JavaScript">
	function checkIt() {
		var userinput = eval("document.userinput");
		if (!userinput.loginId.value) {
			alert("ID�� �Է��ϼ���");
			return false;
		} else if (!userinput.password.value) {
			alert("��й�ȣ�� �Է��ϼ���");
			return false;
		} else {
			userinput.submit();
		}
	}

    function goLogOut() {
        var logout = eval("document.logout");
        logout.submit();
    }
</script>
<form name="logout" action="doLogout.gnd" method="post"></form>
<form name="userinput" id="loginForm_1"
	action="doLogin.gnd" method="post"
	onSubmit="return checkIt()">

	<div class="global_login_modal" style="height: 1589px; display: none;">
		<div class="gb_register_cont">
			<div class="gb_login_tit">ȸ������</div>
			<p>����Ű ȸ���� �ǽø� �پ��� ������ ������ �� �ֽ��ϴ�.</p>
			<ul>
				<li>�پ��� ���θ�� �ڵ带 ���� ���� ����</li>
			</ul>
			<a href="javascript:goJoinView();" class="global_btn_type1">ȸ������</a>
		</div>
		<div class="gb_login_cont">
			<div class="gb_login_tit">�α���</div>
			<div class="place_input">
				<label for="loginId_1" class="gb_login_label" id="id_text">���̵�
					�Է��ϼ���</label><input type="text" id="loginId_1" name="loginId" value="">
			</div>
			<div class="place_input">
				<label for="password_1" class="gb_login_label" id="pw_text">��й�ȣ��
					�Է��ϼ���</label><input type="password" id="password_1" name="password">
			</div>
			<div class="global_id_pass_info">
				<span><input type="checkbox" id="ck" name="idSave" value="Y"><label
					for="ck">���̵� ����</label></span>
				<div>
					<span><a href="javascript:fn_loginFlag('6');">���̵� ã�� ��</a></span> <span><a
						href="javascript:fn_loginFlag('7');">�н����� ã��</a></span>
				</div>
			</div>
			<a href="javascript:checkIt()" class="global_btn_type1"><span>�α���</span></a>
		</div>
		<a href="#" onclick="return false;" class="global_modal_close">�ݱ�</a>
	</div>
</form>
<div id="login_background"
	style="visibility: hidden; width: 2000px; height: 100%; position: absolute; top: -100px; left: 0px; z-index: 499; background: black; filter: alpha(opacity = 70); opacity: 0.7; -moz-opacity: 0.7"></div>
