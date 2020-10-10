<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<%@ include file="/pages/common/head.jsp"%>
		<title>网上商城会员注册页面</title>
		<style type="text/css">
			h1 {
				text-align: center;
				margin-top: 200px;
			}

			h1 a {
				color: red;
			}
		</style>
	</head>
	<body>
		<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif">
			<div>
				<span>欢迎<span class="um_span"><%=request.getSession().getAttribute("username")%></span>光临网上商城</span>
				<a href="pages/order/order.jsp">我的订单</a>
				<a href="LogoutServlet">注销</a>&nbsp;&nbsp;
				<a href="IndexQueryAllServlet">返回</a>
			</div>
		</div>

		<div id="main">

			<h1>欢迎回来 <a href="IndexQueryAllServlet">转到主页</a></h1>

		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
