package nuc.sw.dao;
import java.util.*;


import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.inject.util.Strings;

import nuc.sw.conn.Conn;
import nuc.sw.entity.Book;
import nuc.sw.entity.User;

import java.sql.*;

public class Dao {
	//�û�ע�ᣬ������Ϣ
	public int insertUser(User user)
	{
		int rs = 0;
		try 
		{
			Conn a = new Conn();
			Connection conn = a.getConn();
			System.out.println(conn);
			PreparedStatement pst = null;			
			String insert_user = "insert into user_regist(name,password,tel,address,image) values(?,?,?,?,?)";
			pst = conn.prepareStatement(insert_user);
			pst.setString(1, user.getName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getTel());
			pst.setString(4, user.getAddress());	
			pst.setString(5, user.getImage());
			rs = pst.executeUpdate();
			System.out.println(222);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
 

	//��ѯ�û����ݿ�
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
				 user.setImage(rs.getString("image"));
				 list.add(user);
			 }
		 }catch(Exception e){
				e.printStackTrace();
			}
		 return list;		 		
	}
	
	//��ѯ�����鼮
	public List<Book> selectBooks(){
		ResultSet rs = null;
		List<Book> listbooks = new ArrayList<Book>();
		//Book book = new Book();
		try {
			Conn c =new Conn();
			Connection conn =c.getConn();
			PreparedStatement pst = null;
			String select_book = "select * from book";
			pst = conn.prepareStatement(select_book);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Book book = new Book();
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setType(rs.getString("type"));
				book.setIntro(rs.getString("intro"));
				book.setImage(rs.getString("image"));
				book.setPrice(rs.getFloat("price"));
				listbooks.add(book);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listbooks;
	}
	
	//�������Ͳ�ѯ�鼮
	public List<Book> selectTypeBook(String types)
	{
		ResultSet rs = null;
		List<Book> listbooks = new ArrayList<Book>();
		try {
			Conn d = new Conn();
			Connection conn = d.getConn();
			PreparedStatement pst = null;
			String selectType_book = "select * from book where type="+ "'"+ types +"'";
			//System.out.println(selectType_book);
			pst = conn.prepareStatement(selectType_book);
			rs = pst.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setType(rs.getString("type"));
				book.setIntro(rs.getString("intro"));
				book.setImage(rs.getString("image"));
				book.setPrice(rs.getFloat("price"));
				listbooks.add(book);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listbooks;
		
	}
	//����������ѯ�鼮
	public List<Book> selectABook(String names)
	{
		ResultSet rs = null;
		List<Book> listbooks = new ArrayList<Book>();
		try {
			Conn e = new Conn();
			Connection conn = e.getConn();
			PreparedStatement pst = null;
			String selectAbook = "select * from book where name="+ "'"+ names +"'";
			//System.out.println(selectAbook);
			pst = conn.prepareStatement(selectAbook);
			rs = pst.executeQuery();
			if(rs.next()) {
				Book book = new Book();
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setType(rs.getString("type"));
				book.setIntro(rs.getString("intro"));
				book.setImage(rs.getString("image"));
				book.setPrice(rs.getFloat("price"));
				listbooks.add(book);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listbooks;
	}
	
	//��������빺�ﳵ
	public int insertOrder()
	{
		int rs=0;
		try {
			Conn f = new Conn();
			Connection conn = f.getConn();
			PreparedStatement pst=null;
			String insert_order = "insert into order (tel,user_name,book_name,book_price,address) values(?,?,?,?)";
			pst =conn.prepareStatement(insert_order);
			User user = new User();
			Book book = new Book();
			pst.setString(1, user.getTel());
			pst.setString(2, user.getName());
			pst.setFloat(3, book.getPrice());
			pst.setString(4, user.getAddress());
			rs = pst.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	 
	 
}
