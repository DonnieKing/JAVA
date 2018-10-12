package nuc.sw.dao;

import java.util.Map;

import nuc.sw.db.UserDatabase;

public class UserDao {
	 // 获取所有用户信息
	public Map<String,String> listusers(){
		return UserDatabase.users;
	}
}
