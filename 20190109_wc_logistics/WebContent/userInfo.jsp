<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>用户中心</title>
	<link rel="stylesheet" href="./css/userInfo.css">
 
</head>
<body onload="document.getElementById('item_a').click()">
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
					<a href="send.jsp"><li>在线寄件</li></a>
					<a href=""><li>在线查件</li></a>
					<a href=""><li>帮助与反馈</li></a>
				</ul>
			</div>
			<div class="header-info">
				<a href="">
					<div class="username">
					<img src="./images/login.png">
					<span>欢迎你：${sessionScope.tel }</span>
					<div class="out"><a href="clearSessionAction">退出</a></div>
					</div>
				</a>
			</div>
		</div>
	</div>

	<div class="content" id="content">
		<ul class="content-ul">
			<p class="nav-top"></p>
			<a href="getUserInfoAction?tel=${sessionScope.tel}&userPassword=${sessionScope.userPassword}" id="item_a" target="main"><li class="nav-item active" id="item-one" >个人中心</li></a>
			<a href="getUserOrderAction?tel=${sessionScope.tel}"  target="main"><li class="nav-item" id="item-two">我的快递</li></a>
			<a href="mySuggest.jsp"  target="main"><li class="nav-item" id="item-three">我的建议</li></a>
			<p class="nav-bottom"></p>
		</ul>
		<iframe name="main" src="userCenter.jsp" target="_parent" frameborder="0" scrolling="no" class="content-main" id="content-main">
		</iframe>
	</div>

	<script>
		var oCon = document.getElementById('content');
		var aUl = oCon.getElementsByTagName('ul')[0];
		var aLi = aUl.getElementsByTagName('li');
		for(var i=0;i<aLi.length;i++){
	   			aLi[i].index=i;
	   			// console.log(i);
	   		   aLi[i].onclick=function(){
	   		   	 for(var j=0;j<aLi.length;j++){
	   		   		 aLi[j].className="nav-item";
	   		   		 //aNav[j].style.display="none";
	   		   
	   		    }
	   		   // console.log(this.index);
	   		    	this.className="nav-item active";
	   		    	//aNav[this.index].style.display="block";
	   		    }
	   }
	
	</script>
	
</body>
</html>