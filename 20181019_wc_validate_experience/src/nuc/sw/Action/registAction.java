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
	    info = "ע��ɹ������¼";
	    uService.saveUser(user);
	    return "registOK";	   
   } 
   
    public void validateRegistMethod() {
		 
    	if(!user.getEmail() .matches("^[a-zA-Z0-9_.]+@[a-zA-Z0-9_]+\\.[a-zA-Z0-9.]+$"))
    	{
    		this.addFieldError("Error", "�����ʽ����ȷ������������");
    	}
    	
    	
    	if(user.getPassword() == null || user.getPassword().trim().equals(""))
    	{
    		this.addFieldError("Error", "���벻��Ϊ��");
    	}
    	else if(user.getPassword().length()<6 || user.getPassword().length()>15) 
    	{
    		this.addFieldError("Error", "���������6-15λ֮��");
    	}
    	
    	
    	if(!user.getRepassword().equals(user.getPassword()) )
    	{
    		this.addFieldError("Error", "����������¼���뱣��һ��");
    	}
    	
    	
    	
    	if(user.getUsername() == null || user.getUsername().trim().equals(""))
    	{
    		this.addFieldError("Error", "�ǳƲ���Ϊ��");
    	}
    	else if(user.getUsername().length()<6 || user.getUsername().length()>15) 
    	{
    		this.addFieldError("Error", "�ǳƱ�����6-15λ֮��");
    	}
    	else if(!uService.isValidUsername(user) )
    	{
    		this.addFieldError("Error", "���ǳ��Ѵ���");
    	}
    	
    	
    	
    	if(user.getName() == null || user.getName().trim().equals(""))
    	{
    		this.addFieldError("Error", "��������Ϊ��");
    	}
    	 
    	
    	if(!user.getTelephone().matches("1(3|4|5|7|8)\\d{9}"))
    	{
    		this.addFieldError("Error", "����д��ȷ���ֻ�����");
    	}
    		
    }

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
 
}
