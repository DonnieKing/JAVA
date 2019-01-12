<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>个人中心</title>
	<link rel="stylesheet" href="./css/userCenter.css">
</head>
<body>
	<nav class="active" id="nav-one">
				<div class="content-main-header">
					<img src="./images/header-title-icon.png" alt="">
					<span>个人资料设置</span>
				</div>
				<div class="content-main-info">
					<s:iterator value="listuser" var="user" >
						<div class="content-main-info-left">
							<img src="<s:property value="#user.image"/>" alt="">
						</div>
					</s:iterator>
					<div class="fix-info" id="fix-info">修改</div>
					<s:iterator value="listuser" var="user" >
					<div class="user-info">
						<div class="user-info-name">昵称：<s:property value="#user.userName"/></div>
						<div class="user-info-sex">性别：<s:property value="#user.sex"/></div>
						<div class="user-info-tel">手机：${sessionScope.tel }</div>
						<div class="user-info-address">地址：<s:property value="#user.address"/></div>
					</div>
					</s:iterator>
					<div class="content-main-info-right" id="Form">
						<s:iterator value="listuser" var="user" >
							<form action="updateUserAction?tel=${sessionScope.tel }" method="post" id="userinfo_form">
							 <div>
								昵称：<input type="text" name="userName" value="<s:property value="#user.userName"/>">
							</div>
							<div class="class-password">
								密码：<input type="text" name="userPassword" value="<s:property value="#user.userPassword"/>">
							</div>
							<div class="sex">
								性别：<input type="radio" name="sex" value="男" checked>男<input type="radio" value="女"  name="sex">女
							</div>
							<div>
								手机号：<input type="text" name="tel" value="<s:property value="#user.tel"/>" disabled>
							</div>
							<div>
								地址：<input type="text" name="address" value="<s:property value="#user.address"/>">
							</div>
							<div>
								<input class="class-submit" type="submit" value="修改">
								</form>
							</s:iterator>
						</div>
					</div>
				 
			</nav>



			<script>
		var oFix = document.getElementById('fix-info');
		var oForm = document.getElementById('Form');
		oFix.onclick = function(){
			oForm.style.display = "block";
			oFix.style.display = "none";
		}

		var oCon = document.getElementById('content');
		var oContent = document.getElementById('content-main');
		var aUl = oCon.getElementsByTagName('ul')[0];
		var aLi = aUl.getElementsByTagName('li');
		var aNav = oContent.getElementsByTagName('nav');
		//console.log(aLi.length);
		// console.log(aNav.length);

	 		   // for(var i=0;i<aLi.length;i++){
	 		   // 			aLi[i].index=i;
	 		   // 			// console.log(i);
	 		   // 		   aLi[i].onclick=function(){
	 		   // 		   	 for(var j=0;j<aLi.length;j++){
	 		   // 		   		 aLi[j].className="nav-item";
	 		   // 		   		 aNav[j].style.display="none";
	 		   		   
	 		   // 		    }
	 		   // 		    console.log(this.index);
	 		   // 		    	this.className="nav-item active";
	 		   // 		    	aNav[this.index].style.display="block";
	 		   // 		    }
	 		   // }
	 

	</script>
</body>
</html>