<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>模拟智能客服在线系统2</title>

<style>
		body{
			background: #7A75F8;
		}
		.robot{
		 	position: relative;
		 	top:185px;
		 	left:90px;
		 }
		 .robot-words{
		 	position: relative;
		 	top:-246px;
		 	left:-240px;
		 }
		 .function-list{
		 	position: relative;
		 	top:110px;
		 	left:80px;
		 	width: 400px;
		 	height: 250px;
		 	/*background: red;*/
		 }
		 .list-detail{
		 	float: left;
		 	position: relative;
		 	left:15px;
		 	top:10px;
		 	margin-right: 40px;
		 	margin-left: 30px;
		 	margin-top: 20px;
		 	width: 56px;
		 	height: 59px;
		 	/*background: #33addd;*/
		 }
		 .list-detail img{
		 	margin-left: 10px;
		 	margin-top: 3px;
		 }
		 .list-detail span{
		 	display: block;
		 	/*background: #aa22cc;*/
		 	width: 64px;
		 	margin-left: -3px;
		 	margin-top: 5px;
		 	text-align: center;
		 	line-height: 20px;
		 	height: 20px;
		 	color: #fff;
		 	font-size: 14px;
		 }

		.contents{
			position: absolute;
			left: 850px;
			top:60px;
			width: 550px;
			height: 650px;
			background: #fff;
			border-radius: 6px;
		}
		.content{
			border-radius: 5px;
			position: relative;
			top:-15px;
			width: 500px;
			height: 400px;
			background: lightblue;
			margin: 10px auto;
			overflow: auto;
		}
		table{
			width: 450px;
			height:80px;
			margin:0 auto;
		}

		textarea{
			border:none;
			background: lightyellow;
			resize: none;
			width: 500px;
			height: 120px;
			margin-left: 24px;
			padding-left: 6px;
			border-radius: 6px;
		}
		button{
			position: relative;
			top:35px;
			left:-90px;
			width: 80px;
			height:40px;
			border:none;
			background: #12B7F5;
			color: #FFF;
		}

		button:hover{
			cursor:pointer;
			background: orange;
		}
		ul{
			list-style: none;
			line-height: 20px;
			font-size: 12px;
			
		}
		 
	</style>
		 
</head>
<body>
	<div class="pic-robot">
		<img src="./images/robot.png" alt="" class="robot" width="395px" height="402px">
		<img src="./images/words.png" class="robot-words" alt="">
	</div>

	<div class="function-list">
		<a href="wayTrail.jsp" target="_blank">
			<div class="list-detail">
				<img src="./images/check.png" alt="">
				<span>查件</span>
			</div>	
		</a>
		<a href="userInfo.jsp" target="_blank">
			<div class="list-detail">
				<img src="./images/complaint.png" alt="">
				<span>投诉</span>
			</div>
		</a>
		<a href="#">
			<div class="list-detail">
				<img src="./images/cuipai.png" alt="">
				<span>催派</span>
			</div>
		</a>
		<a href="expressPrice.jsp" target="_blank">
			<div class="list-detail">
				<img src="./images/Agingquery.png" alt="">
				<span>时效查询</span>
			</div>	
		</a>
		<a href="userInfo.jsp" target="_blank">
			<div class="list-detail">
				<img src="./images/feedback.png" alt="">
				<span>问题反馈</span>
			</div>
		</a>
		<a href="#">
			<div class="list-detail">
				<img src="./images/fontSize.png" alt="">
				<span>文字大小</span>
			</div>
		</a>
	</div>

	<div class="contents">
		<h2 style="color: #33aacc;margin:3px auto;margin-bottom:13px;margin-left: 230px;">在线客服</h2>
		<div class="content">
			<ul>
				<li></li>
			</ul>
		</div>
		<table>
				<tr>
					<td ><textarea name="text"  cols="50" rows="4" placeholder="点击输入内容..."></textarea></td>
					<td ><button>发送</button></td>					
				</tr>	
		</table>
	</div>
	
	<script type="text/javascript">
		//获取元素
		let text = document.getElementsByName('text')[0];
		let btn = document.getElementsByTagName('button')[0];
		let list = document.getElementsByTagName('ul')[0];
		let sum = 0; //计数器

		//添加点击事件,获取用户说的内容并且发送到窗口
		 btn.onclick = function(){
		 	//获取用户提交的内容
		 	if(text.value.length==0){
		 		alert('好像忘了什么东西');
		 		return false;
		 }
		 	//创建一个li
		 	let li = document.createElement('li');
		 	//获取用户的提交的内容并将内容保存
		 	let userContent = text.value;
		 	//获取用户头像
		 	let img = '<img src="${sessionScope.image}" style="width:40px;border-radius:50%" >'
		 	//改变li的内容
		 	li.innerHTML= img +'  '+ userContent;
		 	list.appendChild(li);
		 	sum+=1;
		 	//立即将用户留言区清空
		 	text.value="";

		 	//设置一个定时器,1s后自动回复
		 	setTimeout(function(){
		 		//自动回复信息模板
		 		let info = [
		 				'亲，你好啊',
		 				'请问有什么需要帮助的呢',
		 				'欢迎来到中北快递',
		 				'亲，对不起哦，这个问题我不清楚哦',
		 				'亲，小通家一般拒收后24小时内正常退回哟，最晚暂放72小时，具体退回情况，是以网点扫描退件记录为准的哟，谢谢！',
		 				'亲，不好意思呢，没有运单号小通也无能为力帮您查询到具体情况，您可以联系发件人索要，若您是发件人建议您直接联系当地发件网点核实单号再联系我们查询哟，谢谢。'
				 		];
				 //随机选取0-5句回复,获取自动回复的内容
				let temp = info[Math.floor(Math.random()*6) ];
				//创建一句自动回复
				let reply = document.createElement('li');
				//获取客服头像
				let serviceImg = '<img src="./uploadRealFile/timg.jpg" style="width:40px;border-radius:50%" >';
				//改变reply的内容
				reply.innerHTML= serviceImg+'<span style="color:red">'+temp+'</span>'+'  ';
				list.appendChild(reply);
				sum+=1;
		 	},1000);

		 	//清空窗口并将计数器清零
		 	if(sum>10){
		 		list.innerHTML="";
		 		sum=0;
		 	}
		 	
		 }
		

	</script>
</body>
</html>