<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>收入支出管理</title>
	<link rel="stylesheet" href="./css/pay.css">
</head>
<body>
	<nav id="nav-two">
				<div class="express-border">
					<ul>
						<li class="order-number">收支号</li>
						<li class="order-info">收支人姓名</li>
						<li class="order-time">收支类型</li>
						<li class="order-end">用途描述</li>
						<li class="order-end">金额</li>
						<li class="order-end">收支时间</li>
						<li class="order-operation">操作</li>
					</ul>
					<s:iterator value="pays" var="p">
					<ul class="order-detail">
						<li class="detail-number"><s:property value="#p.payId"/></li>
						<li class="detail-info"><s:property value="#p.payName"/></li>
						<li class="detail-time"><s:property value="#p.payType"/></li>
						<li class="detail-end"><s:property value="#p.payDescribe"/></li>
						<li class="detail-end"><s:property value="#p.payMoney"/></li>
						<li class="detail-end"><s:property value="#p.payTime"/></li>
						<li class="detail-operation">
							<a href="getAPayAction?payId=<s:property value="#p.payId"/>" target="_blank">修改</a>
						</li>
					</ul>	
					</s:iterator>
				</div>
				
				<div class="insert"><a href="insertPay.jsp" target="_blank">点我添加</a></div>

			</nav>
</body>
</html>