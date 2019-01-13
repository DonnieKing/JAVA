package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;

public class loginAction extends ActionSupport implements ModelDriven {
	
	 private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	 
	private String tel;
	private String userPassword;

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	private Dao dao = new Dao();
	
	public String LoginMethod()
	{
		List<User> list = new ArrayList<User>();
		list = dao.selectUser(user);
		for(User u:list)
		{
			if(u.getTel().equals(user.getTel()))
			{
				ActionContext.getContext().getSession().put("userName", u.getUserName());
				ActionContext.getContext().getSession().put("userPassword", u.getUserPassword());
				ActionContext.getContext().getSession().put("sex", u.getSex());
				ActionContext.getContext().getSession().put("tel", u.getTel());
				ActionContext.getContext().getSession().put("address", u.getAddress());
				ActionContext.getContext().getSession().put("image", u.getImage());
				System.out.println(u.getTel());
				return "loginOK";
			}
		}
		 this.addFieldError("Error","用户名或密码错误");
		  return LOGIN;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
}
