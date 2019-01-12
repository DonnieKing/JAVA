<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>我的快递</title>
	<link rel="stylesheet" href="./css/myExpress.css">
</head>
<body>
	<nav id="nav-two">
				<div class="express-border">
					<ul>
						<li class="order-number">订单号</li>
						<li class="order-info">寄-收件人信息</li>
						<li class="order-time">下单时间</li>
						<li class="order-state">状态</li>
						<li class="order-operation">操作</li>
					</ul>
				<s:iterator value="listorder" var="order">
					<div class="order-detail">
						<div class="detail-number"><s:property value="#order.orderId"/></div>
						<div class="detail-info"><s:property value="#order.sender"/> ——> <s:property value="#order.consignee"/></div>
						<div class="detail-time"><s:property value="#order.orderTime"/></div>
						<div class="detail-state"><s:property value="#order.orderState"/></div>
						<div class="detail-operation">
							<a href="getOrderDetailAction?orderId=<s:property value="#order.orderId"/>" target="_blank">查看详情</a>
						</div>
					</div>	
				</s:iterator>
				</div>
			</nav>
</body>
</html>