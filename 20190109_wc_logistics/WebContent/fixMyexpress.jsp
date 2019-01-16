<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>修改订单信息</title>
<link rel="stylesheet" href="./css/myExpress.css">
</head>
<body>
		<s:iterator value="listorder" var="order">
			<div class="fix-info" id="fix-info">	
				<form action="updateOrderAction?orderId=<s:property value="#order.orderId"/>" method="post">				
					<ul>
						<li class="first-info">
							<span>寄件人姓名：</span>
							<input type="text" name="sender" value="<s:property value="#order.sender"/>">
						</li>
						<li>
							<span>寄件人手机：</span>
							<input type="text" name="tel" value="<s:property value="#order.tel"/>">
						</li>
						<li>
							<span>收件人姓名：</span>
							<input type="text" name="consignee" value="<s:property value="#order.consignee"/>">
						</li>
						<li>
							<span>收件人手机：</span>
							<input type="text" name="receivingPhone" value="<s:property value="#order.receivingPhone"/>">
						</li>
						<li>
							<span>收件人地址：</span>
							<input type="text" name="receivingAddress" value="<s:property value="#order.receivingAddress"/>">
						</li>
						<li>
							<span>订单状态：</span>
							<input type="text" name="orderState" value="<s:property value="#order.orderState"/>">
						</li>
						<li>
							<span>订单价钱：</span>
							<input type="text" name="itemPrice" value="<s:property value="#order.itemPrice"/>">
						</li>
						<li>
							<input type="submit" value="确认修改" style="width: 110px;height: 45px;border:none;background: lightblue;position: relative;left:120px;">
						</li>
					</ul>
				</form>
			</div>
		</s:iterator>
				
</body>
</html>