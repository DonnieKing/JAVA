<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddBookServlets" method="post">
		图书名称<input type="text" name="bookName"><br>
		图书作者<input type="text" name="bookAuthor"><br>
		图书价格<input type="text" name="bookPrice"><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>