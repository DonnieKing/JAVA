package nuc.sw.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
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
	 
     public String LoginMethod()
     {
    	 if("wangchu".equals(username) && "123456".equals(password))
    	 {
    		 ActionContext.getContext().getSession().put("user", username);
    		 return "loginOK";
    	 }
    	   
    	 return LOGIN;
 		      	 
     }
}
