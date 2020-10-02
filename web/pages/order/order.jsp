<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<%@ include file="/pages/common/head.jsp"%>
		<title>我的订单</title>
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
			<span class="wel_word">我的订单</span>
			<div>
				<span>欢迎<span class="um_span">用户</span>光临网上商城</span>
				<a href="pages/order/order.jsp">我的订单</a>
				<a href="index.jsp">注销</a>&nbsp;&nbsp;
				<a href="index.jsp">返回</a>
			</div>
		</div>

		<div id="main">

			<table>
				<tr>
					<td>日期</td>
					<td>金额</td>
					<td>状态</td>
					<td>详情</td>
				</tr>
				<tr>
					<td>2020.04.23</td>
					<td>90.00</td>
					<td>未发货</td>
					<td><a href="#">查看详情</a></td>
				</tr>

				<tr>
					<td>2020.04.20</td>
					<td>20.00</td>
					<td>已发货</td>
					<td><a href="#">查看详情</a></td>
				</tr>

				<tr>
					<td>2014.01.23</td>
					<td>190.00</td>
					<td>已完成</td>
					<td><a href="#">查看详情</a></td>
				</tr>
			</table>


		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
