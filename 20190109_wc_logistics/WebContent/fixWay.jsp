<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>修改货运信息</title>
	<link rel="stylesheet" href="./css/fixWay.css ">
</head>
<body>
	<div class="fix-info">
	<s:iterator value="listway" var="way">
					<form action="updateWayAction?orderId=<s:property value="#way.orderId"/>&waybillId=<s:property value="#way.waybillId"/>" method="post">
					
					<ul>
						<li class="first-info">
							<span>是否到达：</span>
							<input type="text" name="waybillEnd" value="<s:property value="#way.waybillEnd" />">
						</li>
						<li>
							<span>是否破损：</span>
							<input type="text" name="waybillDamaged" value="<s:property value="#way.waybillDamaged" />">
						</li>
						<li>
							<span>是否签收：</span>
							<input type="text" name="waybillSign" value="<s:property value="#way.waybillSign" />">
						</li>
						<li>
							<span>物流信息：</span>
							<textarea name="waybillTrail"  cols="35" rows="10" style="resize: none;">
								<s:property value="#way.waybillTrail" />
							</textarea>
						</li>
						 
						<li>
							<input type="submit" value="确认修改" style="width: 110px;height: 45px;border:none;background: lightblue;position: relative;left:120px;top:110px;">
						</li>
					</ul>
					
					</form>
					</s:iterator>
				</div>
</body>
</html>