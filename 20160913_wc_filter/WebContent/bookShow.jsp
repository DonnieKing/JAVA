<%@page import="java.util.*,nuc.sw.entity.Book,nuc.sw.db.BookDatabase,nuc.sw.dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	 <table border="1" width="450px" align="center">
	 	
	 	 <tr>
	 	 	<td>图书名称</td>
	 	 	<td>图书作者</td>
	 	 	<td>图书价格</td>
	 	 </tr>
	 	 
	<%
	request.setCharacterEncoding("utf-8");
		 List<Book> books = (List)request.getAttribute("books");
		//Iterator it = ((ArrayList<Book>)request.getAttribute("books")).iterator();
		Iterator it = books.iterator();
		while(it.hasNext()){
			pageContext.setAttribute("book",it.next());
	%>
	 	 <tr>
	 	 	<td>${book.bookName }</td>
	 	 	<td>${book.bookAuthor }</td>
	 	 	<td>${book.bookPrice }</td>
	 	 </tr>
	 	 <%} %>
	 </table>
	 <a href="addBook.jsp">添加图书</a>
</body>
</html>