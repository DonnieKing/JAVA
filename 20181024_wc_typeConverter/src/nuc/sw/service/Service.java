package nuc.sw.service;

 
import java.util.Map;

import nuc.sw.dao.userDao;
import nuc.sw.db.userDataBase;
import nuc.sw.entity.User;
public class Service {
	
 
	private userDao  uDao = new userDao();
	
	
	//��һ���û�
	public void  saveUser(User u)
	{
		uDao.saveUser(u);
	}
	
	//��ȡ�����û�
		public Map<String, User> listuser(){
			return userDataBase.users;
		}
  
	//�жϼ������Ƿ������ͬ�ǳ�
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
	
	//�ж��û��Ƿ�Ϸ�
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
