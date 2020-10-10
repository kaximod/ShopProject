<%@ page import="com.shop.bean.Goods" %>
<%@ page import="com.shop.dao.Impl.GoodsDaoImpl" %>
<%@ page import="com.shop.dao.GoodsDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.shop.service.GoodsService" %>
<%@ page import="com.shop.service.Impl.GoodsServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>商城首页</title>
    <link type="text/css" rel="stylesheet" href="static/css/style.css">
    <link href="static/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <script src="static/js/bootstrap.js"></script>
    <script>
        $(function () {
            $(".addbtn").click(function () {
                var addId = $($(this).parents("tr").children("td")[0]).html();
                location.href = "http://localhost:8084/shop_war_exploded/CartAddServlet?id=" + addId;
            })
        })
    </script>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">网上商城</span>
    <div>
        <a href="pages/user/login.jsp" class="btn btn-lg btn-info">登录</a> |
        <a href="pages/user/regist.jsp" class="btn btn-lg btn-info">注册</a> &nbsp;&nbsp;
        <a href="http://localhost:8084/shop_war_exploded/IntoCartServlet" class="btn btn-lg btn-info">购物车</a>
        <a href="pages/manager/manager.jsp" class="btn btn-lg btn-info">后台管理</a>
    </div>
</div>
<div id="main">
    <div id="shop">
        <div class="shop_cond">
            <form action="SearchServlet" method="post">
                价格：<input id="min" type="text" name="min" value=""> 元 -
                <input id="max" type="text" name="max" value=""> 元
                <button type="submit" class="btn btn-group-lg btn-primary">查询</button>
            </form>
        </div>
        <div style="text-align: center">
            <span>您的购物车中有3件商品</span>
            <div>
                您刚刚将<span style="color: red">滚筒洗衣机</span>加入到了购物车中
            </div>
        </div>
        <table style="margin-top: 0px">
            <tr>
                <td>ID</td>
                <td>名称</td>
                <td>价格</td>
                <td>品牌</td>
                <td>销量</td>
                <td>库存</td>
                <td>操作</td>
            </tr>
            <% GoodsService goodsService = new GoodsServiceImpl();
                List<Goods> indexgoodsList = (List<Goods>) request.getAttribute("IndexGoodsList");
                for (int i = 0; i < indexgoodsList.size(); i++) {%>
            <tr>
                <td><%=indexgoodsList.get(i).getGoodId()%>
                </td>
                <td hidden>update</td>
                <td><%=indexgoodsList.get(i).getGoodName()%>
                </td>
                <td><%=indexgoodsList.get(i).getGoodPrice()%>
                </td>
                <td><%=indexgoodsList.get(i).getGoodBrand()%>
                </td>
                <td><%=indexgoodsList.get(i).getGoodSales()%>
                </td>
                <td><%=indexgoodsList.get(i).getGoodStock()%>
                </td>
                <td>
                    <button class="addbtn">加入购物车</button>
                </td>
            </tr>
            <%}%>


            <tr>
                <td hidden>insert</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </table>
    </div>
    <div id="page_nav">
        <button>首页</button>
        <button>上一页</button>
        <button>1</button>
        <button>下一页</button>
        <button>末页</button>
        共10页，30条记录 到第<input name="pn" id="pn_input"/>页
        <button class="btn btn-sm btn-default">确定
        </button>
    </div>

</div>

<%@ include file="pages/common/foots.jsp" %>
</body>
</html>
