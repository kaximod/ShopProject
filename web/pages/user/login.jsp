<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String message = (String) request.getAttribute("message");%>
<html>
	<head>
		<%@ include file="/pages/common/head.jsp"%>
		<title>网上商城会员登录页面</title>
		<script>
			$(function(){

				$("#username").blur(function () {
					var usernamevar = $("#username").val();
					if (usernamevar == null || usernamevar == "") {
						$("#mes").css("display", "block").html("用户名不能为空！");
					}
				});
				$("#password").blur(function () {
					var passwordvar = $("#password").val();
					if (passwordvar == null || passwordvar == "") {
						$("#mes").css("display", "block").html("密码不能为空！");
					}
				});
				$("#sub_btn").click(function () {
					if (!$("#username").val()) {
						$("#mes").css("display", "block").html("请输入用户名!");
						return false;
					}
					if (!$("#password").val()) {
						$("#mes").css("display", "block").html("请输入正确密码！");
						return false;
					}

				});

			});
		</script>
	</head>
	<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="static/img/logo.gif">
		</div>

		<div class="login_banner">

			<div id="l_content">
				<span class="login_word">欢迎登录</span>
			</div>

			<div id="content">
				<div class="login_form">
					<div class="login_box">
						<div class="tit">
							<h1>网上商城会员</h1>
							<a href="pages/user/regist.jsp">立即注册</a>
						</div>
						<div class="msg_cont">
							<b></b>
							<span class="errorMsg"style="display: none"id="mes"></span>
							<%if (message != null) {%>
							<span ><%=message%></span>
							<%}%>
						</div>
						<div >
							<form action="LoginServlet"method="post">
								<label>用户名称：</label>
								<input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off"  name="username"id="username" />

								<br />
								<br />
								<label>用户密码：</label>
								<input class="itxt" type="password" placeholder="请输入密码" name="password" id="password"/>
								<br />
								<br />
								<input type="submit" value="登录" id="sub_btn"/>
							</form>
						</div>

					</div>
				</div>
			</div>
		</div>
		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
