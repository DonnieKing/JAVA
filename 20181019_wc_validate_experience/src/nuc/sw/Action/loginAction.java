package nuc.sw.Action;

 

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.inject.Context;

import nuc.sw.dao.userDao;
import nuc.sw.entity.User;
import nuc.sw.service.Service;

public class loginAction extends ActionSupport implements ModelDriven {
	
	private User user = new User();
		
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	Service uService = new Service();
	
	/*
	 //����ע��
	 public String registMethod() {
		 uService.saveUser(user);
		 info="ע��ɹ������¼��";
	     return "registOK";
	 }
	 */
	 //�����¼
	 public String loginMethod() {
		 
		 if(uService.isValidUser(user))
		 {
			 ActionContext.getContext().getSession().put("user", user.getUsername());
			 return SUCCESS;
		 }
		 else {
			 this.addFieldError("Error","�û������������");
			 return LOGIN;
		 }
	 }
	 
	 
	 
	 
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
