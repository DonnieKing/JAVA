<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>后台管理</title>
	<link rel="stylesheet" href="./css/admin.css">
	<script type="text/javascript" src="./js/jquery.min.js" ></script>
	<script type="text/javascript" src="./js/admin.js" ></script>
</head>
<body onload="document.getElementById('item_a').click()">
	<div class="left">
		<div class="bigTitle">后台管理系统</div>
		<div class="lines">
			<div onclick="pageClick(this)" class="active" >
				<img src="images/icon-1.png" />
				<a href="getAllOrderAction" target="main" id="item_a">业务订单管理</a>
			</div>
			<div onclick="pageClick(this)">
				<img src="images/icon-2.png" />
				<a href="getWayTableAction" target="main">货物运输管理</a>
			</div>
			<div onclick="pageClick(this)">
				<img src="images/icon-3.png" />
				<a href="getIncomeAction" target="main">用户回款管理</a>
			</div>
			<div onclick="pageClick(this)">
				<img src="images/icon-4.png" />
				<a href="getPayAction" target="main">收入支出管理</a>
			</div>
			<div onclick="pageClick(this)">
				<img src="images/icon-5.png" />
				<a href="getMessageAction" target="main">用户建议管理</a>
			</div>
			
		</div>
	</div>

	<div class="top">
			<div class="leftTiyle" id="flTitle">业务订单管理</div>
			<div class="thisUser">当前用户：超级管理员</div>
	</div>

	<iframe name="main" target="_parent" frameborder="0" scrolling="no" class="content-main" id="content-main" src="">
	</iframe>

	  
		 
</body>
</html>