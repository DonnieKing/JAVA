package nuc.sw.db;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
	 public static Map<String, String> users = new HashMap<String,String>();
	  
	 static {                              //�ȹ��췽������ִ�еĴ���飬����static��
		 users.put("admin1","123");
		 users.put("admin2","456");
	 }
}
