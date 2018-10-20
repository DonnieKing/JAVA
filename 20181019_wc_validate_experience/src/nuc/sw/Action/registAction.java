package nuc.sw.Action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.userDao;
import nuc.sw.entity.User;
import nuc.sw.service.Service;

public class registAction extends ActionSupport  implements ModelDriven{
	
  private User user = new User();
   Service uService = new Service();
   private String info;
	public String getInfo() {
	return info;
}


public void setInfo(String info) {
	this.info = info;
}


	public User getUser() {
		return user;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
 

   public String registMethod() {
	    info = "注册成功，请登录";
	    uService.saveUser(user);
	    return "registOK";	   
   } 
   
    public void validateRegistMethod() {
		 
    	if(!user.getEmail() .matches("^[a-zA-Z0-9_.]+@[a-zA-Z0-9_]+\\.[a-zA-Z0-9.]+$"))
    	{
    		this.addFieldError("Error", "邮箱格式不正确，请重新输入");
    	}
    	
    	
    	if(user.getPassword() == null || user.getPassword().trim().equals(""))
    	{
    		this.addFieldError("Error", "密码不能为空");
    	}
    	else if(user.getPassword().length()<6 || user.getPassword().length()>15) 
    	{
    		this.addFieldError("Error", "密码必须在6-15位之间");
    	}
    	
    	
    	if(!user.getRepassword().equals(user.getPassword()) )
    	{
    		this.addFieldError("Error", "密码必须与登录密码保持一致");
    	}
    	
    	
    	
    	if(user.getUsername() == null || user.getUsername().trim().equals(""))
    	{
    		this.addFieldError("Error", "昵称不能为空");
    	}
    	else if(user.getUsername().length()<6 || user.getUsername().length()>15) 
    	{
    		this.addFieldError("Error", "昵称必须在6-15位之间");
    	}
    	else if(!uService.isValidUsername(user) )
    	{
    		this.addFieldError("Error", "此昵称已存在");
    	}
    	
    	
    	
    	if(user.getName() == null || user.getName().trim().equals(""))
    	{
    		this.addFieldError("Error", "姓名不能为空");
    	}
    	 
    	
    	if(!user.getTelephone().matches("1(3|4|5|7|8)\\d{9}"))
    	{
    		this.addFieldError("Error", "请填写正确的手机号码");
    	}
    		
    }

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
 
}
