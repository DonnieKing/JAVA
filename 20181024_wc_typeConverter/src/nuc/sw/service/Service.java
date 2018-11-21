package nuc.sw.service;

 
import java.util.Map;

import nuc.sw.dao.userDao;
import nuc.sw.db.userDataBase;
import nuc.sw.entity.User;
public class Service {
	
 
	private userDao  uDao = new userDao();
	
	
	//存一个用户
	public void  saveUser(User u)
	{
		uDao.saveUser(u);
	}
	
	//获取所有用户
		public Map<String, User> listuser(){
			return userDataBase.users;
		}
  
	//判断集合中是否存在相同昵称
		public boolean isValidUsername(User u) {
			
			boolean flag = false;
			 
			Map<String, User> users = uDao.listUser();
			
			if(users.containsKey(u.getUsername()))
			{
				flag = false;
			}
			else {
				flag = true;
			}
					 
			return flag;
		}
	
	//判断用户是否合法
		public boolean isValidUser(User u)
		{
			boolean flag = false;
			
			Map<String, User> users = uDao.listUser();
			if(users.containsKey(u.getUsername()))
			{
				User user = users.get(u.getUsername());
				if(user.getPassword().equals(u.getPassword())) {
					flag = true;
				}
			
		}
			return flag;
		}
		
		
}
