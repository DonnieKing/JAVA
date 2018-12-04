package nuc.sw.dao;
import java.util.*;

import com.opensymphony.xwork2.Result;

import nuc.sw.conn.Conn;
import nuc.sw.entity.User;

import java.sql.*;

public class Dao {
	//用户注册，插入信息
	public int insertUser(User user)
	{
		int rs = 0;
		try 
		{
			Conn a = new Conn();
			Connection conn = a.getConn();
			System.out.println(conn);
			PreparedStatement pst = null;			
			String insert_user = "insert into user_regist(name,password,tel,address) values(?,?,?,?)";
			pst = conn.prepareStatement(insert_user);
			pst.setString(1, user.getName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getTel());
			pst.setString(4, user.getAddress());	
			rs = pst.executeUpdate();
			System.out.println(222);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	//查询用户数据库
	public List<User> selectUser(User user)
	{
		 ResultSet rs = null;
		 List<User> list = new ArrayList<User>();
		 try {
			 Conn b = new Conn();
			 Connection conn = b.getConn();
			 PreparedStatement pst = null;
			 String select_user = "select * from user_regist where tel=? AND password=?";
			 pst = conn.prepareStatement(select_user);
			 pst.setString(1, user.getTel());
			 pst.setString(2, user.getPassword());
			 rs = pst.executeQuery();
			 if(rs.next()) {
				 user.setName(rs.getString("name"));
				 user.setPassword(rs.getString("password"));
				 user.setTel(rs.getString("tel"));
				 user.setAddress(rs.getString("address"));
				 list.add(user);
			 }
		 }catch(Exception e){
				e.printStackTrace();
			}
		 return list;
		 		
	}
	 
	 
}
