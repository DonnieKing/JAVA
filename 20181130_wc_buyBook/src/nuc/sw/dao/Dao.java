package nuc.sw.dao;
import java.util.*;


import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.inject.util.Strings;

import nuc.sw.conn.Conn;
import nuc.sw.entity.Book;
import nuc.sw.entity.Order;
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
				 user.setImage(rs.getString("image"));
				 list.add(user);
			 }
		 }catch(Exception e){
				e.printStackTrace();
			}
		 return list;		 		
	}
	
	//查询所有书籍
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
	
	//根据类型查询书籍
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
	//根据书名查询书籍
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
	
	//购买书加入购物车
	public int insertOrder(Order order)
	{
		int rs=0;
		try {
			Conn f = new Conn();
			Connection conn = f.getConn();
			PreparedStatement pst=null;
			String insert_order = "INSERT INTO `order`(tel,user_name,book_name,book_price,image,address) VALUES (?,?,?,?,?,?)";
			pst =conn.prepareStatement(insert_order);
			//Order order = new Order();
			pst.setString(1, order.getTel());
			pst.setString(2, order.getUser_name());
			pst.setString(3, order.getBook_name());
			pst.setFloat(4, order.getBook_price());
			pst.setString(5, order.getImage());
			pst.setString(6, order.getAddress());
			rs = pst.executeUpdate();
			System.out.println("订单创建成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	//获取订单信息
	public List<Order> listorder(String tel){
		ResultSet rs = null;
		List<Order> listorders = new ArrayList<Order>();
		try {
			Conn g = new Conn();
			Connection conn = g.getConn();
			PreparedStatement pst = null;
			String select_order = "SELECT * FROM `order` WHERE tel="+"'"+tel+"'";
			pst = conn.prepareStatement(select_order);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Order order = new Order();
				order.setTel(rs.getString("tel"));
				order.setUser_name(rs.getString("user_name"));
				order.setBook_name(rs.getString("book_name"));
				order.setBook_price(rs.getFloat("book_price"));
				order.setImage(rs.getString("image"));
				order.setAddress(rs.getString("address"));
				listorders.add(order);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listorders;
	}
	//删除订单
	public int deleteOrder(String tel,String book_name) {
		int rs = 0;
		try {
			Conn h = new Conn();
			Connection conn = h.getConn();
			PreparedStatement pst = null;
			String delete_order="DELETE  FROM `order` WHERE tel="+"'"+tel+"'"+ "AND book_name="+"'"+book_name+"'";
			pst = conn.prepareStatement(delete_order);
			rs =pst.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	 
	 
}
