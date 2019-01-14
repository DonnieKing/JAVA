<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>货物运输管理</title>
	<link rel="stylesheet" href="./css/wayTable.css">
</head>
<body>
	<nav id="nav-two">
		
				<div class="express-border">
					<ul>
						<li class="order-number">货运号</li>
						<li class="order-info">订单号</li>
						<li class="order-info">是否出发</li>
						<li class="order-time">出发时间</li>
						<li class="order-end">是否到达</li>
						<li class="order-damaged">是否破损</li>
						<li class="order-sign">是否签收</li>
						<li class="order-operation">操作</li>
					</ul>
					<s:iterator value="listway" var="way">
					<ul class="order-detail">
						<li class="detail-number"><s:property value="#way.waybillId" /></li>
						<li class="detail-info"><s:property value="#way.orderId" /></li>
						<li class="detail-info"><s:property value="#way.waybillStart" /></li>
						<li class="detail-time"><s:property value="#way.waybillTime" /></li>
						<li class="detail-end"><s:property value="#way.waybillEnd" /></li>
						<li class="detail-damaged"><s:property value="#way.waybillDamaged" /></li>
						<li class="detail-sign"><s:property value="#way.waybillSign" /></li>
						<li class="detail-operation">
							<a href="getOrderDetailAction?orderId=<s:property value="#way.orderId"/>" target="_blank">查看详情</a>
							<a href="getAWayAction?orderId=<s:property value="#way.orderId"/>" target="_blank">修改</a>
							<a href="deleteWayAction?orderId=<s:property value="#way.orderId"/>">删除</a>
						</li>
					</ul>	
					</s:iterator>
				</div>
		
	</nav>
</body>
</html>