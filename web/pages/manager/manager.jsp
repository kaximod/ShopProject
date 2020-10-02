<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="">
	<head>
		<title>后台管理</title>
		<%@ include file="/pages/common/head.jsp"%>
		<style type="text/css">
			h1 {
				text-align: center;
				margin-top: 200px;
			}
		</style>
	</head>
	<body>

		<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif">
			<span class="wel_word">后台管理系统</span>
			<div>
				<a href="http://localhost:8084/shop_war_exploded/QueryAllServlet">商品管理</a>
				<a href="pages/manager/order_manager.jsp">订单管理</a>
				<a href="index.jsp">返回商城</a>
			</div>
		</div>

		<div id="main">
			<h1>欢迎管理员进入后台管理系统</h1>
		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
