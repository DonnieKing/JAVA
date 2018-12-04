package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;
import nuc.sw.conn.*;
import nuc.sw.dao.*;

public class RegistAction extends ActionSupport implements ModelDriven {
	 
	private User user = new User();		 
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	private String name;
	private String password;
	private String tel;
	private String address;
	private String repassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	 
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	private String info;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	private Dao dao = new Dao();
	   public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	public String RegistMethod() {
			dao.insertUser(user);
		    info = "×¢²á³É¹¦£¬ÇëµÇÂ¼";		     
		    return "registOK";	   
	   }
	   
	   
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	 
}
