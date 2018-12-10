package nuc.sw.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;

public class updateUserAction extends ActionSupport implements ModelDriven{
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

	Dao dao = new Dao();
	public String updateUserMethod() {
		//System.out.println(user.getTel());
		//System.out.println(user.getName());
		//System.out.println(user.getPassword());
		//System.out.println(user.getAddress());
		dao.UpdateUser(user, user.getTel());
		
		return "updateUserOK";
		 
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
