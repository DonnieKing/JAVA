<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="searchBookAction" method="post">
			<s:textfield label="请输入书名"  name="bookName"/>			
			<s:submit value="查询"/>
	</s:form>
</body>
</html>