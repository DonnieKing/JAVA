<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>购物车</title>
<link rel="stylesheet"  href="./css/order.css" />
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
					<li id="username">${ sessionScope.tel}</li>
					<li>消息</li>
					<li>购物车</li>
					<li>我的订单</li>				
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
<!-- 配送地址 -->
	<div id="rowLine"></div>
	<div id="give_address">
		<div id="border">
			<div id="icon_car"></div>
			<div id="text_address">配送地址：</div>
		<s:iterator value="listorders" var="b" status="order">
			<div id="real_addrss"><s:property value="#b.address"/></div>
		</s:iterator>
		</div>		
	</div>
<!-- 订单详情 -->
	<div id="order_info">
		<ul id="order_info_operation">
			<li id="ul_one">商品信息</li>
			<li id="ul_two">单价（元）</li>
			<li id="ul_three">数量</li>
			<li id="ul_four">金额（元）</li>
			<li id="ul_five">操作</li>
		</ul>
	<s:iterator value="listorders" var="b" status="order">
		<ul id="order_book_info"  >
			<li id="order_book_info_image"><img src="<s:property value="#b.image"/>" alt=""></li>
			<li id="order_book_info_title"><s:property value="#b.book_name"/></li>
			<li id="order_book_info_ad">购买此商品,可享促销<span class="ad_text">加价购→</span></li>
			<li id="order_book_info_price">¥<span id="APrice"><s:property value="#b.book_price"/></span></li>
			<li id="order_book_info_num">
				<button id="plus" class="plus">+</button>
				<input id="input" class="input" type="text" value="1" disabled="" style="width:24px;height:24px;">
				<button id="subtract" class="subtract">-</button>
			</li>
			<li id="order_book_info_totalPrice">¥<span id="span_price" class="span_price"><s:property value="#b.book_price"/></span></li>
			<li id="order_book_info_delete">
				<a href="deleteOrderAction?tel=${ sessionScope.tel}&book_name=<s:property value="#b.book_name"/>">删除</a>
			</li>
		</ul>
	</s:iterator>
	<div id="final">
		<div id="final_text">总计(不含运费)：</div>
		<div id="final_price">¥<span id="totalPrice"><s:property value="#b.book_price"/></span></div>
		<div id="final_jiesuan">结算</div>
	</div>

	</div>


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

  //计算价钱
 var oPlus = document.getElementById('plus');
 var oSubtract = document.getElementById('subtract');
 var i = document.getElementById("input").value;
 var money = document.getElementById("span_price").innerText;
 oPlus.onclick = function(){
 	i++;
 	document.getElementById("input").value = i;
 	document.getElementById("span_price").innerText = i*money;
 }
 oSubtract.onclick = function(){
 	if(i>0){
 		i--;
 		document.getElementById("input").value = i;
 		document.getElementById("span_price").innerText = i*money;
 	}else{
 		i=0;
 		document.getElementById("input").value = i;	
 		document.getElementById("span_price").innerText = i*money;
 	}
 }


 var oFresh = document.getElementById('order_info');
  oFresh.onclick = function(){
  	var aSpan = document.getElementsByClassName("span_price"); 
	 var totalPrice = document.getElementById('totalPrice');
	 
	 for(var i=0;i<aSpan.length;i++)
	 {	
	 	var sum=0;
	 	sum+=aSpan[i].innerText;	
	 	console.log(sum);
	 	
	 }
	 totalPrice.innerText = (sum.replace(/\b(0+)/gi,""));
  }
 

</script>

</body>
</html>