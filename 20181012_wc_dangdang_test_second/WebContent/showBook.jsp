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

	<table>
		<tr>
			<td>书名</td>
			<td>作者</td>
			<td>出版社</td>
			<td>价格</td>
		</tr>
<s:iterator value="books" status="li" >
		<tr>
			<td> <s:property value="bName"/> </td>
			<td><s:property value="bAuthor"/></td>
			<td><s:property value="bPublish"/></td>
			<td><s:property value="bPrice"/></td>
		</tr>
</s:iterator>
	</table>

</body>
</html>