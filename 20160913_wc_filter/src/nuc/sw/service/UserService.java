package nuc.sw.service;

import java.util.Map;


import nuc.sw.dao.UserDao;

public class UserService {
	// �ж��û��Ƿ�Ϸ�
	public boolean isValidUser(String username,String password) {
		boolean flag = false;
		UserDao  Udao = new UserDao();
		Map<String, String> users = Udao.listusers();
		if(users.containsKey(username))
		{
			if(password.equals(users.get(username)))
			{
				flag = true;
			}
		}
		return flag;
	}
}
