<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="">
	<head>
		<%@ include file="/pages/common/head.jsp"%>
		<title>结算页面</title>
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
			<span class="wel_word">结算</span>
			<div>
				<span>欢迎<span class="um_span">用户</span>光临网上商城</span>
				<a href="pages/order/order.jsp">我的订单</a>
				<a href="LogoutServlet">注销</a>&nbsp;&nbsp;
				<a href="IndexQueryAllServlet">返回</a>
			</div>
		</div>

		<div id="main">

			<h1>你的订单已结算，订单号为2937474382928484747</h1>


		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
