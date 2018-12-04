<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>注册界面</title>
	<link rel="stylesheet"  href="css/style.css" />
	<link rel="stylesheet"  href="css/body.css"/> 
</head>
<body>
 
 <div class="container">
	<div id="content">
		<form action="registAction" method="post">
			<h1>请注册</h1>
			<div>
				<s:textfield name="name" placeholder="用户名" required="" id="username" />
			</div>
			<div>
				<s:password name="password" placeholder="密码" required="" id="password" />
			</div>
			<div>
				<s:password name="repassword" placeholder="确认密码" required="" id="repassword" />
			</div>
			<div>
				<s:textfield name="tel" placeholder="联系方式" required="" id="tel" />
			</div>
			<div>
				<s:textfield name="address" placeholder="地址" required="" id="address" />
			</div>
			 <div class="">
				<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>			</div> 
			<div>
				<s:submit value="注册" class="btn btn-primary" id="js-btn-login"/>
				<a href="login.jsp">login</a>
			</div>
		</form> 
	</div>
</div>
</body>
</html>