package nuc.sw.dao;

import java.util.Map;

import nuc.sw.db.UserDatabase;

public class UserDao {
	 // ��ȡ�����û���Ϣ
	public Map<String,String> listusers(){
		return UserDatabase.users;
	}
}
