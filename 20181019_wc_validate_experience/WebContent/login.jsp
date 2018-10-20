<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<script>
			
			function login(){
				targetForm = document.forms[0];
				targetForm.action = "loginAction!loginMethod";
				targetForm.submit();
			}
			function regist(){
				targetForm = document.forms[0];
				targetForm.action = "registAction!registMethod";
				targetForm.submit();
			}
				
		</script>
</head>
<body>
<s:property value="info" />
<s:fielderror cssStyle= "color:red"/>
	<s:form action="action!MethodName" method="post">
		 <s:textfield label="Email地址" name="email"  /> <br>
		 <s:password  label="登录密码" name="password" /><br>
		 <s:password  label="确认密码" name="repassword" /><br>
		  <s:textfield label="用户名(昵称)"  name="username"  /><br>
		  <s:textfield label="真实姓名"  name="name"  /><br>
		  <s:textfield label="手机号码"  name="telephone"  /><br>
		  <s:submit  value="注册" onclick="regist()"/>
		  <s:submit  value="登录" onclick="login()"/>
	</s:form>
</body>
</html>