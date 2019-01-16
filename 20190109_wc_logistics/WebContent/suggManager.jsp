<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>用户建议管理</title>
	<link rel="stylesheet" href="./css/suggManager.css">
</head>
<body>
	<nav id="nav-two">
				<div class="express-border">
					<ul>
						<li class="order-number">建议号</li>
						<li class="order-info">运单号</li>
						<li class="order-info">用户名</li>
						<li class="order-time">手机号</li>
						<li class="order-end">身份</li>
						<li class="order-end">投诉类型</li>
						<li class="order-end">投诉信息</li>
						<li class="order-operation">操作</li>
					</ul>
				<s:iterator value="listMess" var="me" >
					<ul class="order-detail">
						<li class="detail-number"><s:property value="#me.messageId" /></li>
						<li class="detail-info"><s:property value="#me.waybillId" /></li>
						<li class="detail-info"><s:property value="#me.userName" /></li>
						<li class="detail-time"><s:property value="#me.tel" /></li>
						<li class="detail-end"><s:property value="#me.identity" /></li>
						<li class="detail-end"><s:property value="#me.messageType" /></li>
						<li class="detail-end" title="<s:property value="#me.messageInformation" />"> <s:property value="#me.messageInformation" /></li>
						<li class="detail-operation">
							<a href="deleteMessageAction?messageId=<s:property value="#me.messageId" />">删除</a>
						</li>
					</ul>	
			</s:iterator>
				</div>

			</nav>
</body>
</html>