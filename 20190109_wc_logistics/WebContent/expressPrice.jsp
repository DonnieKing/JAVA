<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>运费时效查询</title>
	<link rel="stylesheet" href="./css/expressPrice.css">
	<link rel="stylesheet" href="./css/layui.css">
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
					欢迎：<img src="./images/login.png"><span style="color:#25A4BB;"><a href="userInfo.jsp">${sessionScope.tel}</a></span>
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
		<div class="content-one">
			<div class="one-header">
				<div class="one-header-img"></div>
				<span class="one-header-title">运费时效查询</span>
			</div>
		<form action="selectExpresstimeAction"  method="post">
			<div class="one-info">
				<span>始发地：</span>
				<select class="se1" name="startProvince" id="province" onchange="change(this.value)"><!--定义省份下拉列表-->
					<option value="1">北京</option>
					<option value="2">上海</option>
					<option value="3">山西</option>
					<option value="4">福建省</option>
					<option value="5">广东</option>
				</select>
				<select class="se2" name="startCity" id="city"><!--定义城市下拉列表-->
						<option value="0">请选择城市</option>
				</select>
			</div>

			<div class="one-info">
				<span>目的地：</span>
				<select class="se1" name="endProvince" id="province2" onchange="change2(this.value)"><!--定义省份下拉列表-->
					<option value="1">北京</option>
					<option value="2">上海</option>
					<option value="3">山西</option>
					<option value="4">福建省</option>
					<option value="5">广东</option>
				</select>
				<select class="se2" name="endCity" id="city2"><!--定义城市下拉列表-->
						<option value="0">请选择城市</option>
				</select>
			</div>

			<div class="quality">
				<span>重量：</span>
				<div class="kg">kg</div>
				<div id="plus" class="plus">+</div>
				<input id="input" name="weight" class="input" type="text" value="1" >
				<div id="subtract" class="subtract">-</div>
			</div>
			<button class="layui-btn layui-btn-lg" style="background: #00A0E9;width: 130px;">查询</button>
		</form>
		</div>
	<s:iterator value="exTimes" var="ex" >
		<div class="content-two">
			<div class="item">
				<span class="item-name">实际计费重量</span>
				<span class="item-number"><s:property value="#ex.weight" /></span>
				<span class="item-unit">KG</span>
			</div>	
			<div>
				<span class="item-name">预估配送时长</span>
				<span class="item-number"><s:property value="#ex.time" /></span>
				<span class="item-unit">天</span>
			</div>
			<div>
				<span class="item-name">预估运费</span>
				<span class="item-number" style="margin-left: 60px;"><s:property value="expressPrice" /></span>
				<span class="item-unit ">元</span>
			</div>
			<a href="send.jsp" class="layui-btn layui-btn-lg layui-btn-a" style="background: #00A0E9;width: 350px;">在线寄件</a>
		</div>
	</s:iterator>
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


var citys = new Array();         //一个二维数组，用于存储省市，依次对应
citys[1]=new Array("朝阳区","丰台区","海淀区","房山区 ","顺义区","大兴区","东城区","西城区","怀柔区");
citys[2]=new Array("浦东","虹口","长宁","静安","宝山");
citys[3]=new Array("太原市","大同市","阳泉市","长治市","晋城市");
citys[4]=new Array("福州","龙岩","宁德","莆田");
citys[5]=new Array("潮州","佛山","广州");
function change(value)       //change()方法             
{
document.getElementById("city").options.length=0;//初始化城市了下拉列表（每次选择省份时，自动清除上一次选择省份的城市 ）                       
for(var m =0 ;m<citys[value].length;m++){//如果用户选择了广东,则会将5传递到 change() 方法里，就会选择city[5]={.......}, 循环取出里面的城市	
var opt=document.createElement("option");//创建一个 <option></option> 标签  
var node=document.createTextNode(citys[value][m]+"");// 创建一个文本 文本内容就是 读取出来的城市       等同于    潮州
opt.appendChild(node);//将文本添加到标签里等同于<option>潮州</option>
document.getElementById("city").appendChild(opt);//将<option>潮州</option>添加到下拉列表里等同于<select class="se2" id="city"><option>潮州</option></select>
}
}

function change2(value)       //change()方法             
{
document.getElementById("city2").options.length=0;//初始化城市了下拉列表（每次选择省份时，自动清除上一次选择省份的城市 ）                       
for(var m =0 ;m<citys[value].length;m++){//如果用户选择了广东,则会将5传递到 change() 方法里，就会选择city[5]={.......}, 循环取出里面的城市	
var opt=document.createElement("option");//创建一个 <option></option> 标签  
var node=document.createTextNode(citys[value][m]+"");// 创建一个文本 文本内容就是 读取出来的城市       等同于    潮州
opt.appendChild(node);//将文本添加到标签里等同于<option>潮州</option>
document.getElementById("city2").appendChild(opt);//将<option>潮州</option>添加到下拉列表里等同于<select class="se2" id="city"><option>潮州</option></select>
}
}


var oPlus = document.getElementById('plus');
 var oSubtract = document.getElementById('subtract');
 var i = document.getElementById("input").value;
 
 console.log(i);
 oPlus.onclick = function(){
 	i++;
 	document.getElementById("input").value = i;
  
 }
 oSubtract.onclick = function(){
 	if(i>0){
 		i--;
 		document.getElementById("input").value = i;
 		 
 	}else{
 		i=0;
 		document.getElementById("input").value = i;	
 	}
 }

	</script>
</body>
</html>