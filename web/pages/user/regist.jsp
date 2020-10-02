<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String mes = (String) request.getAttribute("mes");%>
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
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>网上商城会员注册页面</title>
    <link type="text/css" rel="stylesheet" href="static/css/style.css">
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <style type="text/css">
        .login_form {
            height: 420px;
            margin-top: 25px;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#sub_btn").click(function () {
                var usernameText = $("#username").val();
                var usernamePatt = /^\w{5,12}$/;
                if (!usernamePatt.test(usernameText)) {
                    $("span.errorMsg").text("用户名不合法！");
                    return false;
                }
                var passwordText = $("#password").val();
                var passwordPatt = /^[a-z0-9_-]{6,18}$/;
                if (!passwordPatt.test(passwordText)) {
                    $("span.errorMsg").text("密码不合法！");
                    return false;
                }
                var repwdText = $("#repwd").val();
                if (repwdText != passwordText) {
                    $("span.errorMsg").text("确认密码和密码不一致！");
                    return false;
                }
                var emailText = $("#email").val();
                var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
                if (!emailPatt.test(emailText)) {
                    $("span.errorMsg").text("邮箱格式不合法！");
                    return false;
                }
                var codeText = $("#code").val();
                codeText = $.trim(codeText);
                if (codeText == null || codeText == "") {
                    $("span.errorMsg").text("验证码不能为空！");
                    return false;
                }
                $("span.errorMsg").text("");
            });
            // 给验证码的图片，绑定单击事件
            $("#code_img").click(function () {
                // alert(this.src);
                this.src = "${basePath}kaptcha.jpg?d=" + new Date();
            });
            $("#username").blur(function () {
                var username = this.value;
                $.getJSON("http://localhost:8084/shop_war_explod" +
                    "ed/UserNameJudge", "username=" +
                    username, function (data) {
                    if ($("#username").val() == null || $("#username").val() == "") {
                        $("span.errorMsg").text("用户名不能为空！");
                    } else if (data.existsUsername) {
                        $("span.errorMsg").text("用户名已存在！");
                    } else {
                        $("span.errorMsg").text("用户名可用！");
                    }
                });
            });
            $("#password").blur(function () {
                var password = this.value;
                var passwordtest = /^[a-z0-9_-]{6,18}$/;
                var passwordvar = $("#password").val();
                if ($("#password").val() == null || $("#password").val() == "") {
                    $("span.errorMsg").text("密码不能为空！");
                } else {
                    if (!passwordtest.test(passwordvar)) {
                        $("span.errorMsg").text("密码格式错误！");
                    } else {
                        $("span.errorMsg").text("密码可用！");
                    }
                }
            });
            $("#repwd").blur(function () {
                var repwdvar = $("#repwd").val();
                if (repwdvar == null || repwdvar == "") {
                    $("span.errorMsg").text("确认密码不能为空！");
                } else {
                    if ($("#password").val() == repwdvar) {
                        $("span.errorMsg").text("密码可用！");
                    } else {
                        $("span.errorMsg").text("密码不一致！");
                    }
                }
            });
            $("#email").blur(function () {
                var emailtest =/^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
                var emailvar = $("#email").val();
                if (emailvar == null || emailvar == "") {
                    $("span.errorMsg").text("邮箱不能为空！");
                } else {
                    if (!emailtest.test(emailvar)) {
                        $("span.errorMsg").text("邮箱格式错误！");
                    } else {
                        $("span.errorMsg").text("邮箱可用！");
                    }
                }
            });
            $("#code").blur(function () {
                var codevar = $("#code").val();
                if (codevar == null || codevar == "") {
                    $("span.errorMsg").text("验证码不能为空！");
                } else {
                        $("span.errorMsg").text("验证码可用！");
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
        <span class="login_word">欢迎注册</span>
    </div>

    <div id="content">
        <div class="login_form">
            <div class="login_box">
                <div class="tit">
                    <h1>注册网上商城会员</h1>
                    <span class="errorMsg" style="margin-left: -20px">${mes}</span>
                </div>
                <br/>
                <div class="form">
                    <form action="RegistServlet" method="post">
                        <label>用户名称：</label>
                        <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1"
                               name="username" id="username"/>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1"
                               name="password" id="password"/>
                        <br/>
                        <br/>
                        <label>确认密码：</label>
                        <input class="itxt" type="password" placeholder="确认密码" autocomplete="off" tabindex="1"
                               name="repwd" id="repwd"/>
                        <br/>
                        <br/>
                        <label>电子邮件：</label>
                        <input class="itxt" type="text" placeholder="请输入邮箱地址" autocomplete="off" tabindex="1"
                               name="email" id="email"/>
                        <br/>
                        <br/>
                        <label>验证码：</label>
                        <input class="itxt" type="text" style="width: 150px;" id="code" name="code"/>
                        <img style="width:70px;height:25px" alt=""
                             src="http://localhost:8084/shop_war_exploded/kaptcha.jpg"
                             style="float: right; margin-right: 40px" id="code_img">
                        <br/>
                        <br/>
                        <input type="submit" value="注册" id="sub_btn"/>

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
