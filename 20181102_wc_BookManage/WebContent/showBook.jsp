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
			<td>操作</td>
		</tr>
<s:iterator value="books" var="b" status="book">
		<tr <s:if test="#book.Odd">style="background-color:#bbbbbb" </s:if>>
			<td> <s:property value="#b.bName"/> </td>
			<td><s:property value="#b.bAuthor"/></td>
			<td><s:property value="#b.bPublish"/></td>
			<td><s:property value="#b.bPrice"/></td>
			<td> <a href='<s:url action="updataBookAction"><s:param name="bName" value='#b.bName' /><s:param name="bAuthor" value='#b.bAuthor' /><s:param name="bPublish" value='#b.bPublish' /><s:param name="bPrice" value='#b.bPrice' /></s:url>'>修改</a></td>
			<td><a href='<s:url action="deleteBookAction"><s:param name="bName" value='#b.bName'/></s:url>'>删除</a></td>
			
		</tr>
</s:iterator>
	</table>

</body>
</html>