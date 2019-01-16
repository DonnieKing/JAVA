<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>中北速递-登录</title>
	<link rel="stylesheet" href="./css/login.css">

</head>
<body>
	<div id="header">
		<div class="header-main">
			<div class="header-left">
				<div class="logo">
					<img src="./images/logo2.png" alt="">
				</div>
			</div>
			<div class="header-right">
				<ul class="header-right-ul">
					<a href="index.jsp"><li class="li-one">首页</li></a>
					<a href=""><li>在线寄件</li></a>
					<a href=""><li>在线查件</li></a>
					<a href=""><li>帮助与反馈</li></a>
				</ul>
			</div>
		</div>
	</div>

	<div class="content">
		<div class="login">
			<span class="login-header">
				<img src="./images/user.png" alt="">
				<i class="login-text">会员登录</i>
				<a href="regist.jsp"><span class="regist-text">点我注册></span></a>
			</span>
			<div class="login-center">
			   <s:fielderror cssStyle= "color:red"/>
				<form action="loginAction" method="post">
					<div class="login-tel">
						账号：<input type="text" name="tel" placeholder="请输入手机号">
					</div>	
					<div class="login-password">
						密码：<input type="password" name="userPassword" placeholder="请输入密码">
					</div>	
					<div class="login-submit">
						<input class="login-submit-one" type="submit" value="登录">
					</div>
				</form>
			</div>
		</div>
	</div>

	
</body>
</html>