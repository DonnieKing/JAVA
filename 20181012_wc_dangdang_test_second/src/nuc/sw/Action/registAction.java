package nuc.sw.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.entity.User;
import nuc.sw.service.Service;

public class registAction extends ActionSupport  implements ModelDriven{
	
	private User user = new User();
	private String info;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
Service uService = new Service();
	
	//´¦Àí×¢²á
	 public String registMethod() {
		 uService.saveUser(user);
		 info="×¢²á³É¹¦£¬ÇëµÇÂ¼£»";
	     return "registOK";
	 }

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
