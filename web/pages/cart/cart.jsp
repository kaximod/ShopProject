<%@ page import="com.shop.bean.Cart" %>
<%@ page import="java.util.List" %>
<%@ page import="com.shop.service.CartService" %>
<%@ page import="com.shop.service.Impl.CartServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="">
<head>
    <%@ include file="/pages/common/head.jsp" %>
    <title>购物车</title>
</head>
<script>
    $(function () {
        $(".delbtn").click(function () {
            var delId = $($(this).parents("tr").children("td")[0]).html();
            location.href = "http://localhost:8084/shop_war_exploded/CartDeleteServlet?delid=" + delId;
        });
        $("#clean").click(function () {
            location.href = "http://localhost:8084/shop_war_exploded/CartCleanAllServlet"
        });
    });
</script>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">购物车</span>
    <div>
        <span>欢迎<span class="um_span"><%=request.getSession().getAttribute("username")%></span>光临网上商城</span>
        <a href="pages/order/order.jsp">我的订单</a>
        <a href="LogoutServlet">注销</a>&nbsp;&nbsp;
        <a href="IndexQueryAllServlet">返回</a>
    </div>
</div>

<div id="main">

    <table>
        <tr>
            <td>商品名称</td>
            <td>数量</td>
            <td>单价</td>
            <td>金额</td>
            <td>操作</td>
        </tr>
        <% CartService cartService = new CartServiceImpl();
            List<Cart> cartList = (List<Cart>) request.getAttribute("CartList");
            for (int i = 0; i < cartList.size(); i++) {%>
        <tr>
            <td hidden><%=cartList.get(i).getCartId()%>
            </td>
            <td><%=cartList.get(i).getCartName()%>
            </td>
            <td><%=cartList.get(i).getCartNum()%>
            </td>
            <td><%=cartList.get(i).getCartPrice()%>
            </td>
            <td><%=cartList.get(i).getCartPriceTotal()%>
            </td>
            <td>
                <button class="delbtn">删除</button>
            </td>
        </tr>
        <%}%>

    </table>

    <div class="cart_info">
        <span class="cart_span">购物车中共有<span class="b_count">${CartListSize}</span>件商品</span>
        <span class="cart_span">总金额<span class="b_price">${resultPrice}</span>元</span>
        <span class="cart_span"><button id="clean">清空购物车</button></span>
        <span class="cart_span"><a href="pages/cart/checkout.jsp">去结账</a></span>
    </div>

</div>

<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
</div>
</body>
</html>
