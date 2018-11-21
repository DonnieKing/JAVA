package nuc.sw.Action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.userDao;
import nuc.sw.entity.Address;
import nuc.sw.entity.User;
import nuc.sw.service.Service;

public class registAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	private Address address;
 
   public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private Service uService = new Service();
   private String info;
	public String getInfo() {
	return info;
}
	private String email;
	private String password;
	private String repassword;
	private String username;
	private String name;
	private String telephone;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

public void setInfo(String info) {
	this.info = info;
}


   public String registMethod() {
	    info = "×¢²á³É¹¦£¬ÇëµÇÂ¼";
	    uService.saveUser(user);
	    return "registOK";	   
   }
@Override
public User getModel() {
	// TODO Auto-generated method stub
	return user;
} 
   


	
 
}
