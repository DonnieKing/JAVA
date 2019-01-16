<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>修改收入支出信息</title>
	<link rel="stylesheet" href="./css/insertPay.css ">
</head>
<body>
	<div class="fix-info">
	<s:iterator value="listPay" var="p">
					<form action="updatePayAction?payId=<s:property value="#p.payId"/>" method="post">
					
					<ul>
						<li class="first-info">
							<span>收支人姓名：</span>
							<input type="text" name="payName" value="<s:property value="#p.payName"/>">
						</li>
						<li>
							<span>收支类型：</span>
							<input type="text" name="payType" value="<s:property value="#p.payType"/>">
						</li>
						<li>
							<span>用途描述：</span>
							<input type="text" name="payDescribe" value="<s:property value="#p.payDescribe"/>">
						</li>
						<li>
							<span>金额：</span>
							<input type="text" name="payMoney"	value="<s:property value="#p.payMoney"/>">
						</li>
						 
						<li>
							<input type="submit" value="修改" style="width: 110px;height: 45px;border:none;background: lightblue;position: relative;left:120px;top:30px;">
						</li>
					</ul>
					
					</form>
					</s:iterator>
				</div>
</body>
</html>