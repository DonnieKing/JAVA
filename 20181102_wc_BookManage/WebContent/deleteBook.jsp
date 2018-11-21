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
	<s:iterator value="books" var="b" status="book">
		 
			<td> <s:property value="#b.bName"/> </td>
			<td><s:property value="#b.bAuthor"/></td>
			<td><s:property value="#b.bPublish"/></td>
			<td><s:property value="#b.bPrice"/></td>
			<td><a href="">修改</a>	</td>
			<td><a href="deleteBookAction?bookName='<s:property value="#b.bName" />'">删除</a></td>
		</tr>
</s:iterator>
</body>
</html>