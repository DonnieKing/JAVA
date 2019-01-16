<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>首页-中北速递</title>
	<link rel="stylesheet" href="./css/index.css">
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
					<li>首页</li>
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
							<a href="send.jsp"><div>在线寄件</div></a>
						</div>
					</div>

					<div class="three_menu_two">
						<div class="three_menu_two_title">
							<span>查询服务</span>
						</div>
						<div class="three_menu_two_content">
							<a href="wayTrail.jsp"><div>查件（物流追踪）</div></a>
							<a href="expressPrice.jsp"><div>运费时效查询</div></a>
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
					<div class="username" id="username">	
					欢迎：<img src="./images/login.png"><span style="color:#25A4BB;"><a href="userInfo.jsp" target="_blank">${sessionScope.tel}</a></span>
					</div>
				</a>
			 </s:else>
			 <s:if test="%{#session.tel =='000000'}">
				<a href="admin.jsp" target="_blank">
					<div class="order">后台管理</div>
				</a>
			 </s:if>
			</div>
		</div>
	</div>

	<div class="content">
		<div class="content-main">
			<div class="bill-search" id="bill-search">
				<div class="bill-search-one" id="bill-search-one" tabIndex="1">
					<div class="bill-title">
						<div class="bill-title-way">
							<img src="./images/search_icon.png" alt="">
							<span>运单号查询</span>
						</div>
						<div class="bill-title-phone">
							<img src="./images/search_phone_icon.png" alt="">
							<span>手机号查询</span>
						</div>
						<div class="search-text">
						<form action="selectTrailAction" method="post">
						<textarea name="waybillId" id="search-text" cols="52" rows="4" style="resize:none;" placeholder="~输入运单号或者手机号"></textarea>
						</div>
					</div>
				</div>
				<div class="bill-search-two" id="bill-search-two">
					<input type="submit" value="运单号查询">								 
					</form>
				</div>
			</div>
			<div class="shortcut-menu">
				<div class="menu-item-one">
					<a href="send.jsp" target="_blank">
						<div class="menu-icon-one">
							<img src="./images/index_icon1_2.png" alt="">
						</div>
						<span>在线寄件</span>
					</a>
				</div>
				<div class="menu-item-two">
					<a href="Map.jsp" target="_blank">
						<div class="menu-icon-two">
							<img src="./images/index_icon2_2.png" alt="">
						</div>
						<span>服务网点查询</span>
					</a>
				</div>
				<div class="menu-item-three">
					<a href="expressPrice.jsp" target="_blank">
						<div class="menu-icon-three">
							<img src="./images/index_icon3_2.png" alt="">
						</div>
						<span>运费时效查询</span>
					</a>
				</div>
				<div class="menu-item-four">
					<a href="customerService.jsp" target="_blank">
						<div class="menu-icon-four">
							<img src="./images/index_icon4_2.png" alt="">
						</div>
						<span>客服支持</span>
					</a>
				</div>
			</div>
		</div>
		<div class="content-business">
			<div class="hrrr"></div>
			<div class="content-business-title">物流业务</div>
			<div class="content-business-flex">
				<div class="content-business-detail">
					<a href="https://www.zto.com/business/privacySurfaceSingle.html" target="_blank">
						<div class="detail-one">
							 <img src="./images/business_icon1_1.jpg" alt="">
							 <strong>隐私面单</strong>
							 <span>个人信息，专业保护</span>
						</div>
					</a>
					<a href="https://www.zto.com/business/freshDelivery.html" target="_blank">
						<div class="detail-one">
							 <img src="./images/business_icon1_2.jpg" alt="">
							 <strong>优鲜送</strong>
							 <span>中转派送，为您优先</span>
						</div>
					</a>
					<a href="https://www.zto.com/business/cloudPrint.html" target="_blank">
						<div class="detail-one">
							 <img src="./images/business_icon1_3.jpg" alt="">
							 <strong>云打印</strong>
							 <span>轻松下单，急速打印</span>
						</div>
					</a>
					<a href="https://www.zto.com/business/electronicsSurfaceSingle.html" target="_blank">
						<div class="detail-one">
							 <img src="./images/business_icon1_4.jpg" alt="">
							 <strong>电子面单</strong>
							 <span>打印结算，高效精准</span>
						</div>
					</a>
					<a href="https://www.zto.com/business/payOnDelivery.html" target="_blank">
						<div class="detail-one">
							 <img src="./images/business_icon1_5.jpg" alt="">
							 <strong>货到付款</strong>
							 <span>闪电付款，周期灵活</span>
						</div>
					</a>
					<a href="https://www.zto.com/business/supportValue.html" target="_blank">
						<div class="detail-one">
							 <img src="./images/business_icon1_6.jpg" alt="">
							 <strong>保价</strong>
							 <span>安全无忧，贴心保障</span>
						</div>
					</a>
				</div>

			</div>
		</div>
	</div>
	<div class="footer">
		<img src="./images/logo2.png" alt="">
		<ul class="footer-ul">
			<a href=""><li>服务指南</li></a>
			<a href=""><li>隐私政策</li></a>
			<a href=""><li>法律声明</li></a>
			<a href=""><li>安全响应中心</li></a>
			<a href=""><li>国家邮政局</li></a>
			<a href=""><li>快递协会</li></a>
		</ul>
		<p class="address">总部地址：太原市尖草坪区华学院路3号中北大学 邮政编码：030000</p>
		<p class="email">简历投递邮箱： 974309696@qq.com</p>
		<p class="copyright">中北速递版权所有 中北速递©版权所有 沪ICP备13044869号</p>
		<div class="picture">
			<div class="pic-one"></div>
			<div class="pic-two"></div>
			<div class="pic-three"></div>
			<div class="pic-four"></div>
		</div>
		<div class="country-pic"></div>
	</div>
	
	
	<div class="user-none" id="info">
			<img src="${sessionScope.image }" alt="">
			<span>用户名：${sessionScope.userName }</span>
		</div>

	<script src="./js/move2.js"></script>
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

		var tip;
		var oSearch = document.getElementById('bill-search');
		var oSearch_one = document.getElementById('bill-search-one');
		var oSearch_two = document.getElementById('bill-search-two');
		var oSearch_text = document.getElementById('search-text');
		oSearch.onclick = function(){	
			tip = 0;
			move(oSearch,"top",-110,function(){
				oSearch_two.style.display = "block";
				oSearch_text.rows = 7;
				tip = 1;
			});
		}
 
		 document.onclick = function(){
		 	if(tip == 1)
		 	{
		 		oSearch_two.style.display = "none";
				oSearch_text.rows = 3;
		 		move(oSearch,"top",0,function(){
				// oSearch_two.style.display = "none";
				// oSearch_text.rows = 3;
				tip = 0;
			});
		 	} 	
		 }
		 

		 var oUserName = document.getElementById('username');
			var oInfo = document.getElementById('info');
			oUserName.onmouseover = function()
			{
				oInfo.style.display="block";
			}
			// oUserName.onmouseout = function()
			 //{
			 //	oInfo.style.display="none";
			 //}
			oInfo.onmouseover = function()
			{
				oInfo.style.display="block";
			}
			oInfo.onmouseout = function()
			{
				oInfo.style.display="none";
			}



	</script>
</body>
</html>