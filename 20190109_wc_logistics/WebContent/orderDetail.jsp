<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>订单详情</title>
	<link rel="stylesheet" href="./css/orderDetail.css">
</head>
<body>
	<div id="header">
		<div class="header-main">
			<div class="header-left">
				<div class="logo">
					<img src="./images/logo2.png" alt="">
				</div>
			</div>
			<div class="header-right">
				<ul class="header-right-ul">
					<a href="index.jsp"><li class="li-one">首页</li></a>
					<a href=""><li>在线寄件</li></a>
					<a href=""><li>在线查件</li></a>
					<a href=""><li>帮助与反馈</li></a>
				</ul>
			</div>
		</div>
	</div>

	<div class="order-detail">
		<s:iterator value="listorder" var="list">
			<ul class="order-info">
				<li>订单Id：<s:property value="#list.orderId"/></li>
				<li>发件人姓名：<s:property value="#list.sender"/></li>
				<li>发件人地址：<s:property value="#list.sendAddress"/></li>
				<li>发件人手机：<s:property value="#list.tel"/></li>
				<li>收件人姓名：<s:property value="#list.consignee"/></li>
				<li>收件人地址：<s:property value="#list.receivingAddress"/></li>
				<li>收件人手机：<s:property value="#list.receivingPhone"/></li>
				<li>货物类型：<s:property value="#list.itemType"/></li>
				<li>货物名称：<s:property value="#list.itemName"/></li>
				<li>货物质量：<s:property value="#list.itemQuality"/></li>
				<li>货物体积：<s:property value="#list.itemVolume"/></li>
				<li>货物数量：<s:property value="#list.itemNumber"/></li>
				<li>价格：<s:property value="#list.itemPrice"/></li>
				<li>付款方式：<s:property value="#list.paymentMethod"/></li>
				<li>快递方式：<s:property value="#list.expressWay"/></li>
				<li>下单时间：<s:property value="#list.orderTime"/></li>
				<li>订单状态：<s:property value="#list.orderState"/></li>
			</ul>
		</s:iterator>
		<s:iterator value="listWay" var="way">
		<ul class="way-detail">
			<li class="way-id">货运ID：<s:property value="#way.waybillId"/></li>
			<li class="isSend">是否出发：<s:property value="#way.waybillStart"/></li>
			<li class="way-time">出发时间：<s:property value="#way.waybillTime"/></li>
		</ul>
		</s:iterator>

		<div class="way-trail">
			<span>物流信息：</span>
		<s:iterator value="listWay" var="way">
			<div class="time-trail">
				<s:property value="#way.waybillTrail" />
			</div>
			</s:iterator>
		</div>
	</div>
</body>
</html>