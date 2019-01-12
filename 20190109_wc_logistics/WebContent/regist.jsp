<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>新用户注册</title>
	<link rel="stylesheet" href="./css/regist.css">
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
		<div class="regist-content">
			<div class="regist-content-title">
				<p>欢迎注册</p>
				<a href="login.jsp"><div class="regist-login">登录</div></a>
			</div>
			<div class="form-information">
			<s:property value="info"/>
				<form action="registAction" method="post" enctype="multipart/form-data">
				<div class="regist-username">
					<span class="name">
						<img src="./images/icon_user.png" alt=""> 
					</span>
					<input type="text" name="userName" placeholder="请输入用户名" required>
				</div>
				<div class="regist-password">
					<span class="password">
							<img src="./images/icon_pwd.png" alt=""> 
					</span>
					<input type="password" name="userPassword" placeholder="请输入新密码" required>
				</div>
				<div class="regist-repassword">
					<span class="password">
							<img src="./images/icon_pwd.png" alt=""> 
					</span>
					<input type="password" name="reuserPassword" placeholder="请确认密码" required>
				</div>
				<div class="regist-sex">
					 性别：<input type="radio" name="sex" value="男" checked>男&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="女">女
				</div>
				<div class="regist-tel">
					<span class="tel">
							<img src="./images/icon_tel.png" alt=""> 
					</span>
					<input type="text" name="tel" placeholder="请输入手机号"  required>
				</div>
				<div class="regist-address">
					<span class="address">
								<img src="./images/icon_address.png" alt=""> 
					</span>
					<input type="text" name="address" placeholder="请输入地址"  required>
				</div>
				<div class="regist-image">
					 头像：<input type="file" name="image" required>
					 <div class="upload-image">上传头像</div>
				</div>
				<div class="regist-submit">
					<input class="regist-submit-one" type="submit" value="注册">
				</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>