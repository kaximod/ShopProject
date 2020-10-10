<%@ page import="com.shop.dao.GoodsDao" %>
<%@ page import="com.shop.dao.Impl.GoodsDaoImpl" %>
<%@ page import="com.shop.bean.Goods" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/pages/common/head.jsp" %>
    <title>商品管理</title>
</head>
<script>
	$(function () {
		$(".delbtn").click(function () {
			var delId = $($(this).parents("tr").children("td")[0]).html();
			location.href="http://localhost:8084/shop_war_exploded/DeleteServlet?id="+delId;
		});
		$(".upbtn").click(function () {
			var upId = $($(this).parents("tr").children("td")[0]).html();
			var updatevar=$($(this).parents("tr").children("td")[1]).html();
			location.href="http://localhost:8084/shop_war_exploded/UpdateServlet1?upid="+upId.trim()+"&flag="+updatevar;

		});
        $("#addbtn").click(function () {
            var insertvar=$($(this).parents("tr").children("td")[0]).html();
            location.href="http://localhost:8084/shop_war_exploded/UpdateServlet1?flag="+insertvar;

        });
    });
</script>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">商品管理系统</span>
    <div>
        <a href="http://localhost:8084/shop_war_exploded/QueryAllServlet">商品管理</a>
        <a href="pages/manager/order_manager.jsp">订单管理</a>
        <a href="IndexQueryAllServlet">返回商城</a>
    </div>
</div>

<div id="main">
    <table>
        <tr>
            <td>ID</td>
            <td>名称</td>
            <td>价格</td>
            <td>品牌</td>
            <td>销量</td>
            <td>库存</td>
            <td colspan="2">操作</td>
        </tr>
        <% GoodsDao goodsDao = new GoodsDaoImpl();
            List<Goods> goodsList = (List<Goods>) request.getAttribute("GoodsList");
            for (int i = 0; i < goodsList.size(); i++) {%>
        <tr>
            <td><%=goodsList.get(i).getGoodId()%>
            </td>
            <td hidden>update</td>
            <td><%=goodsList.get(i).getGoodName()%>
            </td>
            <td><%=goodsList.get(i).getGoodPrice()%>
            </td>
            <td><%=goodsList.get(i).getGoodBrand()%>
            </td>
            <td><%=goodsList.get(i).getGoodSales()%>
            </td>
            <td><%=goodsList.get(i).getGoodStock()%>
            </td>
            <td><button class="upbtn">修改</button></td>

            <td><button class="delbtn">删除</button></td>
        </tr>
        <%}%>
        <%--				<tr>--%>
        <%--					<td>滚筒洗衣机</td>--%>
        <%--					<td>500.0</td>--%>
        <%--					<td>奥利给</td>--%>
        <%--					<td>200</td>--%>
        <%--					<td>400</td>--%>
        <%--					<td><a href="shop_edit.jsp">修改</a></td>--%>
        <%--					<td><a href="#">删除</a></td>--%>
        <%--				</tr>--%>

        <tr><td hidden>insert</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td ><button id="addbtn">添加商品</button></td>
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
