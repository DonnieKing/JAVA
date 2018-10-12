package nuc.sw.db;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
	 public static Map<String, String> users = new HashMap<String,String>();
	  
	 static {                              //比构造方法更早执行的代码块，放在static中
		 users.put("admin1","123");
		 users.put("admin2","456");
	 }
}
