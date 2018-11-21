<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	欢迎！
	<s:iterator value="uploadFileName" var="filePath">
		<a href="<s:property value="#filePath"/>">超链接：<s:property value="#filePath"/></a><br>
	</s:iterator> 
	
	Struts2下载：
	<br>
	<s:iterator value="fileItems" var="fItems">
		<a href="downloadAction?inputPath=${fItems.filePath}&contentType=${fItems.contentType}&downFileName=${fItems.fileName}">${fItems.fileName}</a><br> 
	</s:iterator>
	
	
</body>
</html>