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
<s:property value="info" />

	<s:form action="registAction" method="post">
		 <s:textfield label="Email地址" name="email"  /> 
		 <s:password  label="登录密码" name="password" /> 
		 <s:password  label="确认密码" name="repassword" /> 
		  <s:textfield label="用户名(昵称)"  name="username" /> 
		  <s:textfield label="真实姓名"  name="name"  /> 
		  <s:textfield label="手机号码"  name="telephone" /> 
		  <s:textfield label="省"  name="address" />
		  <s:textfield label="市"  name="address" />
		  <s:textfield label="区"  name="address" />
		  <s:textfield label="街道"  name="address" />
		  <s:submit  value="注册"  />
		 
	</s:form>
	 
</body>
</html>