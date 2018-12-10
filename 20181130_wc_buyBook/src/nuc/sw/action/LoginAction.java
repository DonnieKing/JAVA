package nuc.sw.action;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import com.mysql.fabric.xmlrpc.base.Array;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;

public class LoginAction extends ActionSupport implements ModelDriven {
	private User user = new User();	 
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	private String tel;
	private String Password;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
 

	private Dao dao = new Dao();
	
	public String LoginMethod() {
	
		  List<User> list = new ArrayList<User>();
		  list = dao.selectUser(user);
		  //System.out.println(user.getName());
		  //System.out.println(user.getTel());
		  for(User u : list)
		  {
			  //System.out.println(u.getName());
			  //System.out.println(u.getTel());	
			  //System.out.println(u.getImage());
			  //System.out.println(u.getImage());
			  if(u.getTel().equals(user.getTel()))
			  {
				  ActionContext.getContext().getSession().put("tel", u.getTel());
				  ActionContext.getContext().getSession().put("password", u.getPassword());
				  ActionContext.getContext().getSession().put("name", u.getName());
				  ActionContext.getContext().getSession().put("image", u.getImage());
				  ActionContext.getContext().getSession().put("address", u.getAddress());
				  return "loginOK";
			  }		 
		  }
		  this.addFieldError("Error","用户名或密码错误");
		  return LOGIN;
	        
   }
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	
 
	
}
