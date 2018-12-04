<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录界面模板</title>
	<link rel="stylesheet"  href="css/style.css" />
	<link rel="stylesheet"  href="css/body.css"/> 
</head>
<body>
<div class="container">
	<div id="content">
	<s:property value="info" />
		<form action="loginAction" method="post">
			<h1>欢迎您的登录</h1>			 
				<s:textfield name="tel" placeholder="手机号" required="" id="username" />						 
				<s:password name="password" placeholder="密码" required="" id="password" />
			 
			 <div class="">
				<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>	
			</div> 
			<div>
				<s:submit value="登录" class="btn btn-primary" id="js-btn-login"/>
				<a href="regist.jsp">Register</a>
			</div>
		</form> 
	</div>
</div>
</body>
</html>