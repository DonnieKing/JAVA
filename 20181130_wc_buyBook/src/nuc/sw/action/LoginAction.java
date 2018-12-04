package nuc.sw.action;


import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;
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
		  for(User user : list)
		  {
			  System.out.println(user.getName());
			  System.out.println(user.getTel());
		  }
	    return "loginOK";	   
   }
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	
 
	
}
