package nuc.sw.service;

 
import java.util.Map;

import nuc.sw.dao.userDao;
import nuc.sw.entity.User;
public class Service {
	
 
	private userDao  uDao = new userDao();
	
	
	//存一个用户
	public void  saveUser(User u)
	{
		uDao.saveUser(u);
	}
	
	//判断用户是否合法
	public boolean isValidUser(User u)
	{
		boolean flag = false;
		
		Map<String, User> users = uDao.listUser();
		if(users.containsKey(u.getName()))
		{
			User user = users.get(u.getName());
			if(user.getPassword().equals(u.getPassword())) {
				flag = true;
			}
		
	}
		return flag;
	}
}
