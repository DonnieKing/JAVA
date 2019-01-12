<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>寄件</title>
	<link rel="stylesheet" href="./css/send.css">
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

<form action="insertOrderAction" method="post"> 
	<div class="content">
		<div class="sender">
			<div class="sendlabel">寄</div>
			<div class="send-info">
				<div class="send-info-name">
					<span>姓名：</span>
					<input type="text" name="sender" required>
				</div>
				<div class="send-info-tel">
					<span>电话：</span>
					<input type="text" name="tel" required>
				</div>
				<div class="send-info-address">
					<span>详细住址：</span>
					<input type="text" name="sendAddress" required>
				</div>
			</div>
		</div>

		<div class="receiver">
			<div class="receivelabel">收</div>
			<div class="receive-info">
				<div class="receive-info-name">
					<span>姓名：</span>
					<input type="text" name="consignee" required>
				</div>
				<div class="receive-info-tel">
					<span>电话：</span>
					<input type="text" name="receivingPhone" required>
				</div>
				<div class="receive-info-address">
					<span>详细住址：</span>
					<input type="text" name="receivingAddress" required>
				</div>
			</div>
		</div>

		<div class="otherInfo">
			<div class="itemtype">
				<span>物品类型：</span>
				<select name="itemType" class="itemtype-select">
					<option value="文件" selected>文件</option>
					<option value="数码产品">数码产品</option>
					<option value="生活用品">生活用品</option>
					<option value="服饰">服饰</option>
					<option value="食品">食品</option>
					<option value="其他">其他</option>
				</select>
			</div>
			<div class="itemName">
				<span>物品名称：</span>
				<input type="text" name="itemName">
			</div>
			<div class="itemQuality">
				<span>物品质量：</span>
				<input type="text" name="itemQuality">
				<span style="margin-left: 5px;">kg</span>
			</div>
			<div class="itemVolume">
				<span>物品体积：</span>
				<input type="text" name="itemVolume">
				<span style="margin-left: 5px;">m³</span>
			</div>
			<div class="itemNumber">
				<span>物品数量：</span>
				<input type="text" name="itemNumber">
				<span style="margin-left: 5px;">件</span>
			</div>
			<div class="paymentMethod">
				<span>付款方式：</span>
				<select name="paymentMethod" class="paymentMethod-select">
					<option value="在线支付" selected>在线支付</option>
					<option value="货到付款">货到付款</option>
				</select>
			</div>
			<div class="expressWay">
				<span>快递方式：</span>
				<select name="expressWay" class="expressWay-select">
					<option value="普通" selected>普通</option>
					<option value="加急">加急</option>
				</select>
			</div>
			<div class="class-submit">
				<input type="submit" value="立即下单">
			</div>
		</div>
	</div>
</form>
</body>
</html>