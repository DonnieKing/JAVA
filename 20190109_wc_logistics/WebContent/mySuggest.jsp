<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>我的建议</title>
	<link rel="stylesheet" href="./css/mySuggest.css">
</head>
<body>
	<nav id="nav-three">
				<div class="nav-bar"><span>投诉反馈</span>
					<span class="mytext" style="color:red;margin-left:285px;"><s:property value="info"/></span>
				</div>
				<div class="nav-content">
					<div class="nav-title">
						<span>亲爱的用户，非常感谢您选择中北速递。
						</span>
						<span>您对我们有任何意见和建议，都可以在此留言，我们将尽快给您解答，或者您还可以拨打投诉热线： 95311
						</span>
					</div>
					<div class="nav-form-content">
						<s:form action="insertMessageAction" method="post">
							<div class="nav-type">
								<span>*投诉类型：</span>
								<div class="nav-radio">
									<input type="radio" name="messageType" value="尽快派送/未更新物流">尽快派送/未更新物流 <br>
									<input type="radio" name="messageType" value="显示签收但未签收">显示签收但未签收 <br>
									<input type="radio" name="messageType" value="其他原因">其他原因
								</div>
							</div>
							<div class="way-num">
								*运单号：<input type="text" name="waybillId" placeholder="请填写单号" required>
							</div>
							<div class="user-work">
								<span>*您的身份：</span><input type="radio" name="identity" value="寄件人">寄件人
								<input type="radio" name="identity" value="收件人">收件人
								<input type="radio" name="identity" value="第三方">第三方
							</div>
							<div class="user-name">
								*姓名：<input type="text" name="userName" placeholder="请填写姓名" required>
							</div>
							<div class="user-tel">
								*联系电话：<input type="text" name="tel" placeholder="请填写手机号" required>
							</div>
							<div class="user-sugg">
								*留言建议：<textarea name="messageInformation" id="" cols="48" rows="4" style="margin-top: 8px;margin-left:-5px;" required></textarea>
							</div>
							<div class="user-sub">
								<input type="submit" value="提交">
							</div>
						</s:form>
					</div>
				</div>
			</nav>
</body>
</html>