<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个人信息页</title>
<link rel="stylesheet"  href="./css/userInfo.css" />
</head>
<body>
		<!-- top栏 -->
	<div id="top">
		<div id="top_one">
			<div id="top_content">
				<span>网罗天下图书</span>
				<span>传承中华文明</span>
			</div>
			<div id="top_right">
				<ul class="ul_one">
					<li id="username">${ sessionScope.tel}</li>
					<li>消息</li>
					<li><a href="getOrderAction?tel=${ sessionScope.tel}">购物车</a></li>
					<li><a href="#">我的订单</a></li>				
					<li>客服</li>
				</ul>
				<div class="car"></div>
				<div class="out"><a href="login.jsp">退出</a></div>
			</div>
		</div>
	</div>
<!-- 个人信息栏 -->
	<div id="info">
		<div id="info_img"><img src="${sessionScope.image }" alt=""></div>
		<div id="info_name">用户名：${ sessionScope.name}</div>
	</div>

	<div id="logo">
		<a href="getBookAction"><img src="./image/logo_detail.png" alt=""></a>
	</div>
	<div id="rowLine"></div>

<s:iterator value="listuser" var="user">
	<div id="userinfo">
		<div id="userinfo_img"><img src="<s:property value="#user.image" />"></div>
		<div id="userinfo_name">用户名：<s:property value="#user.name" /></div>
		<div id="userinfo_pass">密码：<s:property value="#user.password" /></div>
		<div id="userinfo_tel">联系方式：<s:property value="#user.tel" /></div>
		<div id="userinfo_address">地址：<s:property value="#user.address" /></div>
		<div id="fixed">修改</div>
		<div id="userinfo_bookimage"><img src="./image/book.jpg" alt=""></div>
	</div>

	<form action="updateUserAction" id="userinfo_form">
		用户名&nbsp;：<input type="text" name="name" value="<s:property value="#user.name" />"><br>
		密码&nbsp;&nbsp;：<input type="text" name="password" value="<s:property value="#user.password" />"><br>
		联系方式：<input type="text" name="tel" value="<s:property value="#user.tel" />"><br>
		地址&nbsp;&nbsp;：<input type="text" name="address" value="<s:property value="#user.address" />"><br>
		<input type="submit" value="修改" style="width:80px;width:100px;margin-left: 140px;margin-top: 10px; ">
	</form>
</s:iterator>

<script>
 //点击用户名显示用户头像与手机号
 var oUsername = document.getElementById('username');
 var oInfo = document.getElementById('info');
  oUsername.onmouseover = function(){
  	oInfo.style.display = 'block';	
  }
  oUsername.onmouseout = function(){
  	oInfo.style.display = 'none';
  }
  oInfo.onmouseover = function(){
  	oInfo.style.display = 'block';
  }
  oInfo.onmouseout = function(){
  	oInfo.style.display = 'none';
  }


  oFixed = document.getElementById('fixed');
  oForm = document.getElementById('userinfo_form');
  oFixed.onclick = function(){
  	oForm.style.display = "block";
  }

 </script>
</body>
</html>