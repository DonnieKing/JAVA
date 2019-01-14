package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;

public class updateUserAction extends ActionSupport implements ModelDriven {
		
	private User user = new User();
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	private List<User> listuser = new ArrayList<User>();
	public List<User> getListuser() {
		return listuser;
	}

	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}
	
	private String tel;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	Dao dao = new Dao();
	
	public String updateUserMethod()
	{
//		System.out.println(user.getTel());
//		System.out.println(user.getSex());
		dao.updateUser(user,user.getTel());
		return "updateUserOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
