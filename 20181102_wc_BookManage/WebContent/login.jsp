<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<s:fielderror />
<s:property value="address"/>
	<s:property value="info" />
	<a href="regist.jsp">点我注册</a>
	<s:form action="loginAction" method="post">
	 <s:textfield label="用户名(昵称)"  name="username" /> 
	 <s:password label="密码" name="password"/>
	 <s:submit value="登录" />
	</s:form>
</body>
</html>