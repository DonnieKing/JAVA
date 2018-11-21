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
	<s:form action="uploadAction" method="post" enctype="multipart/form-data">
		<s:textfield name="title" label="文件主题"></s:textfield>
		<s:file name="upload" label="选择图片"></s:file>
		<s:file name="upload" label="选择图片"></s:file>
		<s:file name="upload" label="选择图片"></s:file>
		<s:submit value="上传" ></s:submit>
	</s:form>
</body>
</html>