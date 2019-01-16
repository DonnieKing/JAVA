package nuc.sw.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/logistics?useUnicode=true&characterEncoding=utf8&useSSL=true";
	public static final String DBUSER="root";
	public static final String DBPASS="123456";
	Connection conn=null;
	public Connection getConn(){
		try {
			Class.forName(DBDRIVER);
			conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
//			System.out.println(1);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
