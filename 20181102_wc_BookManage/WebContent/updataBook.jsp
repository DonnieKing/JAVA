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
<s:form action="confirmUpdataBookAction" method="post">
		<s:iterator value="book" var="b">
			书名：<s:property value="#b.bName"/>
			作者：<s:property value="#b.bAuthor"/>
			出版社：<s:property value="#b.bPublish"/>
			价格：<s:property value="#b.bPrice"/><br>
			<s:textfield label="书名"   name="bName"  value=""/><br>
			<s:textfield label="作者"   name="bAuthor"  value=""/><br>
			<s:textfield label="作者"   name="bPublish"  value=""/><br>
			<s:textfield label="价格"   name="bPrice"  value=""/><br>
			<s:submit value="确认修改"/>
		</s:iterator>
	
	</s:form>
</body>
</html>