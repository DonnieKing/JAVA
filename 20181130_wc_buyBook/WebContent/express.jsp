<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>快递</title>
<link rel="stylesheet"  href="./css/express.css" />
</head>
<body>
<!-- top栏 -->
	<div id="top">
		<div id="top_one">
			<div id="top_content">
				<span>网罗天下图书</span>
				<span>传承中华文明</span>
			</div>
			<div id="top_right">
				<ul class="ul_one">
					<li id="username"><a href="getAUserAction?tel=${ sessionScope.tel}">${ sessionScope.tel}</a></li>
					<li>消息</li>
					<li><a href="getOrderAction?tel=${ sessionScope.tel}">购物车</a></li>
					<li><a href="#">我的订单</a></li>				
					<li>客服</li>
				</ul>
				<div class="car"></div>
				<div class="out"><a href="login.jsp">退出</a></div>
			</div>
		</div>
	</div>
<!-- 个人信息栏 -->
	<div id="info">
		<div id="info_img"><img src="${sessionScope.image }" alt=""></div>
		<div id="info_name">用户名：${ sessionScope.name}</div>
	</div>

	<div id="logo">
		<a href="getBookAction"><img src="./image/logo_detail.png" alt=""></a>
	</div>
	<div id="rowLine"></div>

	<div id="express_info">
		<div id="express_info_title">即时快递信息：</div>
		<div id="express_info_content">
			<span id="time"></span>：您的快递正马不停蹄的送往您的手上
		</div>
	</div>
	<div id="express_car"><img src="./image/express.png" alt=""></div>

<script>
 //点击用户名显示用户头像与手机号
 var oUsername = document.getElementById('username');
 var oInfo = document.getElementById('info');
  oUsername.onmouseover = function(){
  	oInfo.style.display = 'block';	
  }
  oUsername.onmouseout = function(){
  	oInfo.style.display = 'none';
  }
  oInfo.onmouseover = function(){
  	oInfo.style.display = 'block';
  }
  oInfo.onmouseout = function(){
  	oInfo.style.display = 'none';
  }

  //获取当前时间
   var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //一月是0，一定要注意
	var yyyy = today.getFullYear();
	var hour = today.getHours();
	var minutes = today.getMinutes() ;
	var seconds = today.getSeconds();
	if(dd<10) {
	dd='0'+dd;
	}
	if(mm<10) {
	mm='0'+mm;
	}
	today = yyyy +'/'+mm+'/'+dd;
	//console.log(today);

	var oTime = document.getElementById('time');
	oTime.innerText = today;
 </script>
</body>
</html>