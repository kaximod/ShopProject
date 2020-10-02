<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/29
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //    http://localhost:8083/memberdb/
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <!-- <base href="http://localhost:8848/shop01-empty/WebContent/"> -->
    <link type="text/css" rel="stylesheet" href="static/css/style.css">
    <link href="static/css/bootstrap.min.css" rel="stylesheet" />
    <script src="static/js/jquery-1.11.3.min.js"></script>
<script src="static/js/jquery-1.7.2.js"></script>
    <script src="static/js/bootstrap.js"></script>

