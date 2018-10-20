<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
 
</head>
<body>
	欢迎 ${sessionScope.user } 登录<br>
	<hr>
	<a href="addBook.jsp"  target="main">添加书籍</a>
	<a href="getBookAction" target="main">查看书籍</a><br>
 
	<iframe name="main" target="_parent"  width="80%" height="400px">	
	</iframe>
</body>
</html>