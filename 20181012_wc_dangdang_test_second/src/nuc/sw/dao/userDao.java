package nuc.sw.dao;

import java.util.Map;

import nuc.sw.db.userDataBase;
import nuc.sw.entity.User;

public class userDao {
	
	//��һ���û�
	public void saveUser(User u) {
		userDataBase.users.put(u.getName(), u);
	}
	
	//��ȡ�����û�
	public Map<String,User> listUser(){
		return userDataBase.users;
	}
}
