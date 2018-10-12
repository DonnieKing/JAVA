package nuc.sw.service;

import java.util.Map;


import nuc.sw.dao.UserDao;

public class UserService {
	// 判断用户是否合法
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
