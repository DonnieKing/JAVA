<%@ page language="java" contentType="text/html; charset=utf-8" 
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/index.css">
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
					<li><a href="#">购物车</a></li>
					<li><a href="#">我的订单</a></li>				
					<li>客服</li>
				</ul>
				<div class="car"></div>
				<div class="out"><a href="">退出</a></div>
			</div>
		</div>
	</div>
<!-- 个人信息栏 -->
	<div id="info">
		<div id="info_img"><img src="${sessionScope.image }" alt=""></div>
		<div id="info_name">用户名：${ sessionScope.name}</div>
	</div>
	<div id="header">
		<form id="searchForm" action="getABookAction" method="post"> 
			<div class="text">
				<input type="text" name="bookName" placeholder="图书名字" style="width:596px;height:37px;z-index:1; " >
			</div>
			<div class="button"><input type="submit" value="搜索" style="background-color: #8c222c;width:92px;height:40px;color:#FFF;font-size: 18px;"></div>
		</form>
	</div>
	<div id="logo"></div>

<!-- 钟表 -->
	<div id="clock">
		 <div id="box"></div>
		 <div id="hour"></div>
		 <div id="minute"></div>
		 <div id="second"></div>
	</div>
<!-- 图书列表 -->
	<div id="book">
		<ul id="book_ul">
			<li><a href="getBookAction">全部</a></li>
			<li><a href="getTypeBookAction?types=文学">文学</a></li>
			<li><a href="getTypeBookAction?types=小说">小说</a></li>
			<li><a href="getTypeBookAction?types=政治">政治</a></li>
			<li><a href="getTypeBookAction?types=军事">军事</a></li>
			<li><a href="getTypeBookAction?types=心理">心理</a></li>
			<li><a href="getTypeBookAction?types=教育">教育</a></li>
			<li><a href="getTypeBookAction?types=经济">经济</a></li>
			<li><a href="getTypeBookAction?types=互联网">互联网</a></li>
			<li><a href="getTypeBookAction?types=国学古籍">国学古籍</a></li>
			<li><a href="getTypeBookAction?types=外文原版">外文原版</a></li>
		</ul>
	</div>
	<div id="book_display">
		<div id="book_display_all">
		<s:iterator value="listbooks" var="b" status="book">
			<a href="getBookDetailAction?names=<s:property value="#b.name" />">
				<div id="book_display_detail">
					<img src="<s:property value="#b.image"/>" alt="">
					<div id="book_title"><s:property value="#b.name"/> </div>
					<div id="book_author"><s:property value="#b.author"/></div>
					<div id="book_price"><span style="font-size:14px;color: #bf7f5f;">￥</span><s:property value="#b.price"/>起</div>
				</div>
			</a>
		</s:iterator>

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

//钟表
	var oHour = document.getElementById('hour');
	var oMinute = document.getElementById('minute');
	var oSecond = document.getElementById('second');
	
	function times(){
		var time = new Date();
		oHour.style.transform="rotate("+(time.getHours()*30+time.getMinutes()/2)+"deg)";
		oMinute.style.transform="rotate("+(time.getMinutes()*6+time.getSeconds()/10)+"deg)";
		oSecond.style.transform="rotate("+(time.getSeconds()*6)+"deg)";
	}
	times();
	setInterval(times,1000);

 
</script>	

</body>
</html>