<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>添加收入支出信息</title>
	<link rel="stylesheet" href="./css/insertPay.css ">
</head>
<body>
	<div class="fix-info">
					<form action="insertPayAction" method="post">
					<ul>
						<li class="first-info">
							<span>收支人姓名：</span>
							<input type="text" name="payName">
						</li>
						<li>
							<span>收支类型：</span>
							<input type="text" name="payType">
						</li>
						<li>
							<span>用途描述：</span>
							<input type="text" name="payDescribe">
						</li>
						<li>
							<span>金额：</span>
							<input type="text" name="payMoney"	>
						</li>
						 
						<li>
							<input type="submit" value="添加" style="width: 110px;height: 45px;border:none;background: lightblue;position: relative;left:120px;top:30px;">
						</li>
					</ul>
					</form>
				</div>
</body>
</html>