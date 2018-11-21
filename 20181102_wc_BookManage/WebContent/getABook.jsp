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
<table border=1>
		<caption>书籍系统</caption>
		<tr>
			<td width="80px" align="center"> 书名</td>
			<td width="80px" align="center"> 作者</td>
			<td width="80px" align="center"> 出版社</td>
			<td width="80px" align="center"> 价格</td>
		</tr>
		
		<s:iterator value="book" var="b">
			<tr>
				<td align="center"><s:property value="#b.bName"/></td>
				<td align="center"><s:property value="#b.bAuthor"/></td>
				<td align="center"><s:property value="#b.bPublish"/></td>
				<td align="center"><s:property value="#b.bPrice"/></td>	
			</tr>
		</s:iterator>
		
	</table>
</body>
</html>