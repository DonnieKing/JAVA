<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>百度在线地图</title>
<link rel="stylesheet" href="./css/Map.css">
<script type="text/javascript" src="http://api.map.baidu.com/api?v=3.0&ak=mS7iFfCcMbLBbdGPA7DzeBEsvV230dwh"></script>
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
	
	<div class="map">
	<div id="baidu_map" style="width: 700px ; height: 500px">加载中,请稍后...</div>
	</div>
	
	<div class="font-size">欢迎来到中北快递站点前来参观！</div>
</body>
 
<script type="text/javascript">
	//添加地图
	var map = new BMap.Map("baidu_map");
	var point = new BMap.Point(112.456754,38.021132);	//软件学院
	var point_two=new BMap.Point(112.454162,38.021996); //图书馆
	var point_three=new BMap.Point(112.453051,38.021736); //艺术学院
	var point_four=new BMap.Point(112.454381,38.021054); //羽毛球馆
	var point_five=new BMap.Point(112.455818,38.021338); //主楼
	map.centerAndZoom(point, 18);  // 初始化地图,设置中心点坐标和地图级别
 
        map.enableScrollWheelZoom();                  // 启用滚轮放大缩小。
	
 
        //添加一个跳跃的点
	var marker = new BMap.Marker(point);  // 创建标注
	map.addOverlay(marker);               // 将标注添加到地图中
	marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
	var marker_two = new BMap.Marker(point_two);
	map.addOverlay(marker_two);               
	marker_two.setAnimation(BMAP_ANIMATION_BOUNCE); 
	var marker_three = new BMap.Marker(point_three);  
	map.addOverlay(marker_three);               
	marker_three.setAnimation(BMAP_ANIMATION_BOUNCE); 
	var marker_four = new BMap.Marker(point_four);  
	map.addOverlay(marker_four);               
	marker_four.setAnimation(BMAP_ANIMATION_BOUNCE); 
	var marker_five = new BMap.Marker(point_five);  
	map.addOverlay(marker_five);               
	marker_five.setAnimation(BMAP_ANIMATION_BOUNCE); 
	
	//添加控件
        var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// 左上角，添加比例尺
	var top_left_navigation = new BMap.NavigationControl();  //左上角，添加默认缩放平移控件
	var top_right_navigation = new BMap.NavigationControl({anchor: BMAP_ANCHOR_TOP_RIGHT, type: BMAP_NAVIGATION_CONTROL_SMALL}); //右上角，仅包含平移和缩放按钮
	map.addControl(top_left_control);
        map.addControl(top_left_navigation);
        map.addControl(top_right_navigation);	
        
        
        
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
</html>
