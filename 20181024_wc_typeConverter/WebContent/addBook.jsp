<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
		<form action="addBookAction" method="post"> 
		书名:<input type="text" name="bName"><br>
		作者:<input type="text" name="bAuthor"><br>
		出版社:<input type="text" name="bPublish"><br>
		价格:<input type="text" name="bPrice"><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>