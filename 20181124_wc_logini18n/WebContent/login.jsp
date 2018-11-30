<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name="nuc.sw.i18n.login"> 
<html>
<head>
<meta charset="utf-8">
<title><s:text name="loginPage"></s:text></title>
</head>
<body>
	<font color="red">${requestScope.error}  </font>
	<font color="red"><s:fielderror></s:fielderror></font>
<s:form action="loginAction" methon="post">
	<s:textfield name="username" key="user"></s:textfield>
	<s:password name="password" key="pass"></s:password>
	<s:submit key="login"></s:submit>
</s:form>
	<a href="loginAction?request_locale=en_US"><s:text name="en_version"></s:text></a>
	<a href="loginAction?request_locale=zh_CN"><s:text name="zh_version"></s:text></a>
</body>
</html>
</s:i18n>