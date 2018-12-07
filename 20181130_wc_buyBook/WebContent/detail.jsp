<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>书籍详情页</title>
<link rel="stylesheet"  href="./css/detail.css" />
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
					<li>购物车</li>
					<li>我的订单</li>				
					<li>客服</li>
				</ul>
				<div class="car"></div>
				<div class="out"><a href="">退出</a></div>
			</div>
		</div>
	</div>
<!-- 个人信息栏 -->
	<div id="info">
		<div id="info_img"><img src="${sessionScope.image }" alt=""></div>
		<div id="info_name">用户名：${ sessionScope.name}</div>
	</div>

	<div id="logo">
		<img src="./image/logo_detail.png" alt="">
	</div>
<s:iterator value="listbooks" var="b" status="book">
	<div id="book_info">
		<div id="book_info_title">看见</div>
		<div id="book_info_image"><img src="<s:property value="#b.image"/>" alt=""></div>
		<a href="#" id="buy">购买</a>
	
		<div id="book_info_ul">
			<ul id="book_info_ul_one">
				<li>作者: <s:property value="#b.author"/>著</li>
				<li>出版社: 广西师范大学出版社</li>
				<li>出版时间: 2013-01</li>
				<li>版次: 1</li>
				<li>ISBN: 9787549529322</li>
				<li>定价: <s:property value="#b.price"/></li>
				<li>装帧: 平装</li>
			</ul>
			<ul id="book_info_ul_two">
				<li>开本: 16开</li>
				<li>纸张: 胶版纸</li>
				<li>页数: 424页</li>
				<li>字数: 230千字</li>
				<li>正文语种: 简体中文</li>
				<li>分类: <s:property value="#b.type"/></li>
			</ul>
			<div id="book_content">内容简介</div>
			<div id="book_info_intro"><s:property value="#b.intro"/></div>
		</div>
	</div>
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
 </script>
</body>
</html>