<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>用户回款管理</title>
	<link rel="stylesheet" href="./css/income.css">
</head>
<body>
	<nav id="nav-two">
				<div class="express-border">
					<ul>
						<li class="order-number">货运号</li>
						<li class="order-info">回款金额</li>
						<li class="order-time">回款时间</li>
						<li class="order-end">操作人姓名</li>
						<li class="order-operation">操作</li>
					</ul>
				<s:iterator value="comes" var="c">
					<ul class="order-detail">
						<li class="detail-number"><s:property value="#c.waybillId"/></li>
						<li class="detail-info"><s:property value="#c.financeMoney"/></li>
						<li class="detail-time"><s:property value="#c.financeTime"/></li>
						<li class="detail-end"><s:property value="#c.financeName"/></li>
						<li class="detail-operation">
							<a href="#">修改</a>
							 
						</li>
					</ul>	
				</s:iterator>
				</div>

			</nav>
</body>
</html>