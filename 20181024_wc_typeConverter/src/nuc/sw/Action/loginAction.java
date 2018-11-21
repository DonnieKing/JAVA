package nuc.sw.Action;

 

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.inject.Context;

import nuc.sw.dao.userDao;
import nuc.sw.entity.User;
import nuc.sw.service.Service;

public class loginAction extends ActionSupport {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Service getuService() {
		return uService;
	}

	public void setuService(Service uService) {
		this.uService = uService;
	}
	
	Service uService = new Service();
	private userDao  uDao = new userDao();
	/*
	 //处理注册
	 public String registMethod() {
		 uService.saveUser(user);
		 info="注册成功，请登录；";
	     return "registOK";
	 }
	 */
	 //处理登录
	 public String loginMethod() {

		  //System.out.println(uService.listuser());
		 Map<String, User> users = uDao.listUser();
		  if(users.containsKey(username)) {
			   System.out.println(1);
			  User user = users.get(username);
			  if(user.getPassword().equals(password)) {
				  ActionContext.getContext().getSession().put("user", user.getUsername());
					 return SUCCESS;
			  }
			  
		  }
		 
			  this.addFieldError("Error","用户名或密码错误");
			  return LOGIN;
		 
		  	    
		 
	 }
	 
	 


}
