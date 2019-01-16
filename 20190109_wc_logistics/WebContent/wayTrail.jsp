<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>物流查询</title>
	<link rel="stylesheet" href="./css/wayTrail.css">
</head>
<body>
	<div id="header">
		<div class="header-main">
			<div class="header-left">
				<div class="logo">
					<img src="./images/logo2.png" alt="">
				</div>
			</div>
			<div class="header-middle">
				<ul>
					<li><a href="index.jsp">首页</a></li>
					<li>物流业务</li>
					<li id="three" class="header-middle-three">客户服务</li>
					<li>加盟合作</li>
					<li>金融</li>
					<li>招聘</li>
					<li>关于中北</li>
					<li>INVESTORS</li>
				</ul>
				<div id="three_menu" class="three_menu">
					<div class="three_menu_one">
						<div class="three_menu_one_title">
							<span>寄件服务</span>
						</div>
						<div class="three_menu_one_content">
							<a href=""><div>在线寄件</div></a>
						</div>
					</div>

					<div class="three_menu_two">
						<div class="three_menu_two_title">
							<span>查询服务</span>
						</div>
						<div class="three_menu_two_content">
							<a href=""><div>查件（物流追踪）</div></a>
							<a href=""><div>运费时效查询</div></a>
							<a href=""><div>违禁品查询</div></a>
						</div>
					</div>

					<div class="three_menu_three">
						<div class="three_menu_three_title">
							<span>客户支持</span>
						</div>
						<div class="three_menu_three_content">
							<a href=""><div>常见问题</div></a>
							<a href=""><div>投诉建议</div></a>
						</div>
					</div>
				</div>
			</div>
			<div class="header-right">
				<div class="numPhone">
					<img src="./images/phoneNumber.png" alt="">
				</div>
			<s:if test="%{!#session.tel }">
				<a href="login.jsp">
					<div class="login">
					<img src="./images/login.png">登录
					</div>
				</a>
				<a href="regist.jsp">
					<div class="register">
						<img src="./images/register.png">注册
					</div>
				</a>
			</s:if>
			<s:else>
				<a href="">
					<div class="username">
					欢迎：<img src="./images/login.png"><span style="color:#25A4BB"><a href="userInfo.jsp" >${sessionScope.tel}</a></span>
					</div>
				</a>
			</s:else>
			 <s:if test="%{#session.tel =='000000'}">
				<a href="">
					<div class="order">查看订单</div>
				</a>
			</s:if> 
			</div>
		</div>
	</div>

	<div class="banner-box">
		<img src="./images/express_banner.jpg" alt="">
	</div>
	
	<div class="content">
		<div class="content-trail">
			<div class="content-header">
				<span>运单号查询</span>
			</div>
			<div class="content-area">
				<form action="selectTrailAction" method="post">
				<textarea name="waybillId" id="" cols="82" rows="5" style="resize: none;padding-left:10px;font-size: 16px;" placeholder="请输入单号"></textarea>
				<input type="submit" value="查询">
				</form>
			</div>
		</div>
		<div class="trail-detail">
		<s:iterator value="listWay" var="list">
			<div class="detail-billID">
				<span class="detail-billID-one">运单号:<s:property value="#list.waybillId" /></span>
				<span class="detail-billID-two"><s:property value="#list.waybillSign" /></span>
			</div>
			<div class="detail-content">
				 <s:property value="#list.waybillTrail" />
			</div>
			</s:iterator>
		</div>
	</div>




	<script>
		var oThree = document.getElementById('three');
		var oThree_menu = document.getElementById('three_menu'); 
		oThree.onmouseover = function(){
			oThree_menu.style.display = "block";
		}
		oThree.onmouseout = function(){
			oThree_menu.style.display = "none";
		}
		oThree_menu.onmouseover = function(){
			oThree_menu.style.display = "block";
		}
		oThree_menu.onmouseout = function(){
			oThree_menu.style.display = "none";
		}

		</script>
</body>
</html>