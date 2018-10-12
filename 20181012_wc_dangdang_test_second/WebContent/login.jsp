<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

		<script>
			
			function login(){
				targetForm = document.forms[0];
				targetForm.action = "loginAction!loginMethod";
				targetForm.submit();
			}
			function regist(){
				targetForm = document.forms[0];
				targetForm.action = "registAction!registMethod";
				targetForm.submit();
			}
				
		</script>
</head>
<body>
<s:property value="info" />
<s:fielderror />
	<form action="action!MethodName" method="post">
		用户名: <input   type="text" name="name" placeholder="请输入用户名"><br>
		密码: <input   type="password" name="password" placeholder="请输入密码"><br>
		<input type="submit" value="登录" onclick="login()">
		<input type="submit" value="注册" onclick="regist()">
	</form>
</body>
</html>