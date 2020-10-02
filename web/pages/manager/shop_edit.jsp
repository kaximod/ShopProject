
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html lang="">
	<head>
		<%@ include file="/pages/common/head.jsp"%>
		<title>编辑商品</title>

		<style type="text/css">
			h1 {
				text-align: center;
				margin-top: 200px;
			}

			h1 a {
				color: red;
			}

			input {
				text-align: center;
			}
		</style>
	</head>
	<script>
		// $(function () {
			// $("#btn").click(function () {
			// 	var upId = $($(this).parents("tr").children("td")[0]).html();
			// 	var updatevar=$($(this).parents("tr").children("td")[1]).html();
			//
			// 	location.href="http://localhost:8084/shop_war_exploded/AddGoodServlet?upid="+upId+"&flag="+updatevar;
			//
			// });
		// });
	</script>
	<body>
		<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif">
			<span class="wel_word">编辑商品</span>
			<div>
				<a href="http://localhost:8084/shop_war_exploded/QueryAllServlet">商品管理</a>
				<a href="pages/manager/order_manager.jsp">订单管理</a>
				<a href="index.jsp">返回商城</a>
			</div>
		</div>

		<div id="main">
			<form action="AddGoodServlet"method="post">
				<table>
					<tr>
						<td>名称</td>
						<td>价格</td>
						<td>品牌</td>
						<td>销量</td>
						<td>库存</td>
						<td colspan="2">操作</td>
					</tr>
					<tr><td hidden><input name="shop_id"type="text"value="<%=request.getAttribute("updateId")%>"></td>
					<tr><td hidden><input name="shop_flag"type="text"value="<%=request.getAttribute("flag")%>"></td>
						<td><input name="shop_name" type="text" value="滚筒洗衣机" /></td>
						<td><input name="shop_price" type="text" value="500.00" /></td>
						<td><input name="shop_author" type="text" value="奥利给" /></td>
						<td><input name="shop_sales" type="text" value="200" /></td>
						<td><input name="shop_stock" type="text" value="300" /></td>
						<td><input type="submit" value="提交"id="btn" /></td>
					</tr>
				</table>
			</form>
		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
