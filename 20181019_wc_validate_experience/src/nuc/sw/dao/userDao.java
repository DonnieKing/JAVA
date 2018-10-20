package nuc.sw.dao;

import java.util.Map;

import nuc.sw.db.userDataBase;
import nuc.sw.entity.User;

public class userDao {
	
	//存一个用户
	public void saveUser(User u) {
		userDataBase.users.put(u.getName(), u);
	}
	
	//获取所有用户
	public Map<String,User> listUser(){
		return userDataBase.users;
	}
}
