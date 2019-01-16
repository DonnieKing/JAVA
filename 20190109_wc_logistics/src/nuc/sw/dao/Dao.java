package nuc.sw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Patch;

import com.opensymphony.xwork2.Result;

import nuc.sw.conn.Conn;
import nuc.sw.entity.Message;
import nuc.sw.entity.Order;
import nuc.sw.entity.Pay;
import nuc.sw.entity.User;
import nuc.sw.entity.Waybill;
import nuc.sw.entity.exTime;
import nuc.sw.entity.income;

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
			String insert_user = "insert into user(userName,userPassword,sex,tel,address,image) values(?,?,?,?,?,?)";
			pst = conn.prepareStatement(insert_user);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getUserPassword());
			pst.setString(3, user.getSex());
			pst.setString(4, user.getTel());
			pst.setString(5, user.getAddress());	
			pst.setString(6, user.getImage());
			rs = pst.executeUpdate();
//			System.out.println(222);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	//查询所有手机号
	public List<User> selectTel()
	{
		ResultSet rs = null;
		List<User> listTel = new ArrayList<User>(); 
		try {
			Conn b = new Conn();
			Connection conn = b.getConn();
			PreparedStatement pst = null;
			String select_tel = "select tel,userPassword from user";
			pst = conn.prepareStatement(select_tel);
			rs = pst.executeQuery();
			while(rs.next())
			{
				User user = new User();
				user.setTel(rs.getString("tel"));
				listTel.add(user);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listTel;
	}
	
	//登录查询该用户是存在
	public List<User> selectUser(User user)
	{
		ResultSet rs = null;
		List<User> listUser = new ArrayList<User>();
		try {
			Conn c = new Conn();
			Connection conn = c.getConn();
			PreparedStatement pst = null;
			String select_user = "select * from user where tel=? AND userPassword=?";
			pst = conn.prepareStatement(select_user);
			pst.setString(1, user.getTel());
			pst.setString(2, user.getUserPassword());
			rs = pst.executeQuery();
			while(rs.next())
			{
				user.setUserName(rs.getString("userName"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setSex(rs.getString("sex"));
				user.setAddress(rs.getString("address"));
				user.setTel(rs.getString("tel"));
				user.setImage(rs.getString("image"));
				listUser.add(user);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listUser;
	}
	
	//修改个人信息
	public int updateUser(User user,String tel)
	{
		int rs=0;
		try {
			Conn d = new Conn();
			Connection conn = d.getConn();
			PreparedStatement pst = null;
			String update_user = "update user set userName=?,userPassword=?,sex=?,address=? where tel="+"'"+tel+"'";
			pst = conn.prepareStatement(update_user);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getUserPassword());
			pst.setString(3, user.getSex());
			pst.setString(4, user.getAddress());
			rs = pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	//插入订单
	public int insertOrder(Order order)
	
	{
		int rs = 0;
		try {
			Conn a = new Conn();
			Connection conn = a.getConn();
			PreparedStatement pst = null;
			String insert_order = "INSERT INTO `order` (sender,tel,sendAddress,consignee,receivingPhone,receivingAddress,itemType,itemName,itemQuality,itemVolume,itemNumber,itemPrice,paymentMethod,expressWay,orderTime,orderState)\r\n" + 
					" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pst = conn.prepareStatement(insert_order);
			pst.setString(1, order.getSender());
			pst.setString(2, order.getTel());
			pst.setString(3, order.getSendAddress());
			pst.setString(4, order.getConsignee());
			pst.setString(5, order.getReceivingPhone());
			pst.setString(6, order.getReceivingAddress());
			pst.setString(7, order.getItemType());
			pst.setString(8, order.getItemName());
			pst.setInt(9, order.getItemQuality());
			pst.setInt(10, order.getItemVolume());
			pst.setInt(11, order.getItemNumber());
			pst.setFloat(12, order.getItemPrice());
			pst.setString(13, order.getPaymentMethod());
			pst.setString(14, order.getExpressWay());
			pst.setString(15, order.getOrderTime());
			pst.setString(16, order.getOrderState());
			rs = pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	//查询用户订单信息
	public List<Order> listOrder(String tel)
	{
		ResultSet rs = null;
		List<Order> listOrder = new ArrayList<Order>();
		try {
			Conn e = new Conn();
			Connection conn = e.getConn();
			PreparedStatement pst = null;
			String select_userOrder = "SELECT * FROM `order` WHERE tel="+"'"+tel+"'";
			pst = conn.prepareStatement(select_userOrder);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Order order = new Order();
				order.setOrderId(rs.getInt("orderId"));
				order.setSender(rs.getString("sender"));
				order.setSendAddress(rs.getString("sendAddress"));
				order.setTel(rs.getString("tel"));
				order.setConsignee(rs.getString("consignee"));
				order.setReceivingAddress(rs.getString("receivingAddress"));
				order.setReceivingPhone(rs.getString("receivingPhone"));
				order.setItemType(rs.getString("itemType"));
				order.setItemName(rs.getString("itemName"));
				order.setItemQuality(rs.getInt("itemQuality"));
				order.setItemVolume(rs.getInt("itemVolume"));
				order.setItemNumber(rs.getInt("itemNumber"));
				order.setItemPrice(rs.getFloat("itemPrice"));
				order.setPaymentMethod(rs.getString("paymentMethod"));
				order.setExpressWay(rs.getString("expressWay"));
				order.setOrderTime(rs.getString("orderTime"));
				order.setOrderState(rs.getString("orderState"));
				listOrder.add(order);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listOrder;
	}
	
	//根据订单号查询订单信息
	public List<Order> listOrderDetail(int orderId)
	{
		ResultSet rs = null;
		List<Order> listOrder = new ArrayList<Order>();
		try {
			Conn f = new Conn();
			Connection conn = f.getConn();
			PreparedStatement pst = null;
			String select_userOrder = "SELECT * FROM `order` WHERE orderId="+"'"+orderId+"'";
			pst = conn.prepareStatement(select_userOrder);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Order order = new Order();
				order.setOrderId(rs.getInt("orderId"));
				order.setSender(rs.getString("sender"));
				order.setSendAddress(rs.getString("sendAddress"));
				order.setTel(rs.getString("tel"));
				order.setConsignee(rs.getString("consignee"));
				order.setReceivingAddress(rs.getString("receivingAddress"));
				order.setReceivingPhone(rs.getString("receivingPhone"));
				order.setItemType(rs.getString("itemType"));
				order.setItemName(rs.getString("itemName"));
				order.setItemQuality(rs.getInt("itemQuality"));
				order.setItemVolume(rs.getInt("itemVolume"));
				order.setItemNumber(rs.getInt("itemNumber"));
				order.setItemPrice(rs.getFloat("itemPrice"));
				order.setPaymentMethod(rs.getString("paymentMethod"));
				order.setExpressWay(rs.getString("expressWay"));
				order.setOrderTime(rs.getString("orderTime"));
				order.setOrderState(rs.getString("orderState"));
				listOrder.add(order);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listOrder;
	}
	
	//根据订单号查询货运表信息
	public List<Waybill> listWay(int orderId)
	{
		ResultSet rs = null;
		List<Waybill> listWay = new ArrayList<Waybill>();
		try {
			Conn f = new Conn();
			Connection conn = f.getConn();
			PreparedStatement pst = null;
			String select_userOrder = "SELECT * FROM `waybill` WHERE orderId="+"'"+orderId+"'";
			pst = conn.prepareStatement(select_userOrder);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Waybill way = new Waybill();
				way.setOrderId(rs.getInt("orderId"));
				way.setWaybillId(rs.getInt("waybillId"));
				way.setWaybillStart(rs.getString("waybillStart"));
				way.setWaybillTime(rs.getString("waybillTime"));
				way.setWaybillTrail(rs.getString("waybillTrail"));
				way.setWaybillEnd(rs.getString("waybillEnd"));
				way.setWaybillDamaged(rs.getString("waybillDamaged"));
				way.setWaybillSign(rs.getString("waybillSign"));
				listWay.add(way);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listWay;
	}
	
	//根据订单号删除货运表信息
		public int deleteWay(int orderId)
		{
			int rs = 0;
			try {
				Conn f = new Conn();
				Connection conn = f.getConn();
				PreparedStatement pst = null;
				String select_userOrder = " DELETE FROM waybill WHERE orderId ="+"'"+orderId+"'";
				pst = conn.prepareStatement(select_userOrder);
				rs = pst.executeUpdate();
				System.out.println("删除成功");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return rs;
		}
	
	//查询所有货运表信息
		public List<Waybill> listWays()
		{
			ResultSet rs = null;
			List<Waybill> listWay = new ArrayList<Waybill>();
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String select_userOrder = "SELECT * FROM `waybill`";
				pst = conn.prepareStatement(select_userOrder);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Waybill way = new Waybill();
					way.setOrderId(rs.getInt("orderId"));
					way.setWaybillId(rs.getInt("waybillId"));
					way.setWaybillStart(rs.getString("waybillStart"));
					way.setWaybillTime(rs.getString("waybillTime"));
					way.setWaybillTrail(rs.getString("waybillTrail"));
					way.setWaybillEnd(rs.getString("waybillEnd"));
					way.setWaybillDamaged(rs.getString("waybillDamaged"));
					way.setWaybillSign(rs.getString("waybillSign"));
					listWay.add(way);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return listWay;
		}
	
	//根据运单号查询货运表信息
		public List<Waybill> listWays(int waybillId)
		{
			ResultSet rs = null;
			List<Waybill> listWay = new ArrayList<Waybill>();
			try {
				Conn h = new Conn();
				Connection conn = h.getConn();
				PreparedStatement pst = null;
				String select_userOrder = "SELECT * FROM `waybill` WHERE waybillId="+"'"+waybillId+"'";
				pst = conn.prepareStatement(select_userOrder);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Waybill way = new Waybill();
					way.setOrderId(rs.getInt("orderId"));
					way.setWaybillId(rs.getInt("waybillId"));
					way.setWaybillStart(rs.getString("waybillStart"));
					way.setWaybillTime(rs.getString("waybillTime"));
					way.setWaybillTrail(rs.getString("waybillTrail"));
					way.setWaybillEnd(rs.getString("waybillEnd"));
					way.setWaybillDamaged(rs.getString("waybillDamaged"));
					way.setWaybillSign(rs.getString("waybillSign"));
					listWay.add(way);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return listWay;
		}
	
	//插入投诉建议
	 public int insertMessage(Message message)
	 {
		 int rs = 0;
		 try {
			 Conn g = new Conn();
			 Connection conn = g.getConn();
			 PreparedStatement pst = null;
			 String insert_message = "INSERT INTO `message` (userName,tel,identity,waybillId,messageType,messageInformation) VALUES (?,?,?,?,?,?)";
			 pst=conn.prepareStatement(insert_message);
			 pst.setString(1, message.getUserName());
			 pst.setString(2, message.getTel());
			 pst.setString(3, message.getIdentity());
			 pst.setInt(4, message.getWaybillId());
			 pst.setString(5, message.getMessageType());
			 pst.setString(6, message.getMessageInformation());
			 rs = pst.executeUpdate();
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
		 return rs;		 
	 }
	 
	 //运费时效查询
	 public List<exTime> selectTime(exTime time)
	 {
		 ResultSet rs = null;
		 List<exTime> listTime = new ArrayList<exTime>();
		 try {
			 Conn a= new Conn();
			 Connection conn = a.getConn();
			 PreparedStatement pst = null;
			 String select_time = "SELECT time from expresstime WHERE startCity=? AND endCity=?";
			 pst = conn.prepareStatement(select_time);
			 pst.setString(1, time.getStartCity());
			 pst.setString(2, time.getEndCity());
			 rs = pst.executeQuery();
			 while(rs.next())
			 {
				 time.setTime(rs.getFloat("time"));
				 listTime.add(time);
			 }
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }	
		 return listTime;
	 }
	 
	//管理员查询所有订单
		public List<Order> listOrders()
		{
			ResultSet rs = null;
			List<Order> listOrder = new ArrayList<Order>();
			try {
				Conn e = new Conn();
				Connection conn = e.getConn();
				PreparedStatement pst = null;
				String select_userOrder = "SELECT * FROM `order` ";
				pst = conn.prepareStatement(select_userOrder);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Order order = new Order();
					order.setOrderId(rs.getInt("orderId"));
					order.setSender(rs.getString("sender"));
					order.setSendAddress(rs.getString("sendAddress"));
					order.setTel(rs.getString("tel"));
					order.setConsignee(rs.getString("consignee"));
					order.setReceivingAddress(rs.getString("receivingAddress"));
					order.setReceivingPhone(rs.getString("receivingPhone"));
					order.setItemType(rs.getString("itemType"));
					order.setItemName(rs.getString("itemName"));
					order.setItemQuality(rs.getInt("itemQuality"));
					order.setItemVolume(rs.getInt("itemVolume"));
					order.setItemNumber(rs.getInt("itemNumber"));
					order.setItemPrice(rs.getFloat("itemPrice"));
					order.setPaymentMethod(rs.getString("paymentMethod"));
					order.setExpressWay(rs.getString("expressWay"));
					order.setOrderTime(rs.getString("orderTime"));
					order.setOrderState(rs.getString("orderState"));
					listOrder.add(order);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return listOrder;
		}
		
		//管理员修改订单信息
		public int updateOrder(Order order,int orderId)
		{
			int rs = 0;
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String update_order = "UPDATE `order` SET sender=?,tel=?,consignee=?,receivingPhone=?,receivingAddress=?,orderState=?,itemPrice=? WHERE orderId="+"'"+orderId+"'";
				pst = conn.prepareStatement(update_order);
				pst.setString(1, order.getSender());
				pst.setString(2, order.getTel());
				pst.setString(3, order.getConsignee());
				pst.setString(4, order.getReceivingPhone());
				pst.setString(5, order.getReceivingAddress());
				pst.setString(6, order.getOrderState());
				pst.setFloat(7, order.getItemPrice());
				rs = pst.executeUpdate();
//				System.out.println("修改成功");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return rs;
		}
		
		//管理员修改货运信息
		public int updateWay(Waybill way,int orderId)
		{
			int rs = 0;
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String update_way = "UPDATE `waybill` SET waybillEnd=?,waybillDamaged=?,waybillSign=?,waybillTrail=? WHERE orderId="+"'"+orderId+"'";
				pst = conn.prepareStatement(update_way);
				pst.setString(1, way.getWaybillEnd());
				pst.setString(2, way.getWaybillDamaged());
				pst.setString(3, way.getWaybillSign());
				pst.setString(4, way.getWaybillTrail());
				rs = pst.executeUpdate();
				//System.out.println("修改成功");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return rs;
		}
		
		//判断是否发货，如发货则插入一条货运表信息
		public int insertWay(Waybill way)
		{
			int rs=0;
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String insert_way = "INSERT INTO `waybill` (orderId,waybillStart,waybillTime,waybillTrail,waybillEnd,waybillDamaged,waybillSign) VALUES\r\n" + 
						"(?,'是',?,'暂无','否','否','未签收')";
				pst = conn.prepareStatement(insert_way);
				pst.setInt(1, way.getOrderId());
				pst.setString(2, way.getWaybillTime());
				rs=  pst.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return rs;
		}
		
		//如果已收货，则向回款表插入一条信息
		public int insertIncome(income come)
		{
			int rs=0;
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String insert_income = "INSERT INTO income (waybillId,financeMoney,financeTime,financeName) VALUES (?,?,?,'王楚')";
				pst = conn.prepareStatement(insert_income);
				pst.setInt(1, come.getWaybillId() );
				pst.setFloat(2, come.getFinanceMoney());
				pst.setString(3, come.getFinanceTime());
				rs = pst.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return rs;
		}
	
		//管理员查询 所有回款表 表项
		public List<income> listComes()
		{
			ResultSet rs = null;
			List<income> listCome = new ArrayList<income>();
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String select_userOrder = "SELECT * FROM `income`";
				pst = conn.prepareStatement(select_userOrder);
				rs = pst.executeQuery();
				while(rs.next())
				{
					income come = new income();
					come.setIncomeId(rs.getInt("incomeId"));
					come.setWaybillId(rs.getInt("waybillId"));
					come.setFinanceMoney(rs.getFloat("financeMoney"));
					come.setFinanceTime(rs.getString("financeTime"));
					come.setFinanceName(rs.getString("financeName"));
					listCome.add(come);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return listCome;
		}
		
		//管理员查询  收入支出表
		public List<Pay> selectPay()
		{
			ResultSet rs = null;
			List<Pay> listPay = new ArrayList<Pay>();
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String select_userOrder = "SELECT * FROM `pay`";
				pst = conn.prepareStatement(select_userOrder);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Pay pay = new Pay();
					pay.setPayId(rs.getInt("payId"));
					pay.setPayName(rs.getString("payName"));
					pay.setPayDescribe(rs.getString("payDescribe"));
					pay.setPayMoney(rs.getFloat("payMoney"));
					pay.setPayType(rs.getString("payType"));
					pay.setPayTime(rs.getString("payTime"));
					listPay.add(pay);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return listPay;
		}
		
		//插入 收入支出
		 public int insertPay(Pay pay)
		 {
			 int rs = 0;
			 try {
				 Conn g = new Conn();
				 Connection conn = g.getConn();
				 PreparedStatement pst = null;
				 String insert_pay = "INSERT INTO `pay` (payName,payType,payDescribe,payMoney,payTime) VALUES (?,?,?,?,?)";
				 pst=conn.prepareStatement(insert_pay);
				 pst.setString(1, pay.getPayName());
				 pst.setString(2, pay.getPayType());
				 pst.setString(3, pay.getPayDescribe());
				 pst.setFloat(4, pay.getPayMoney());
				 pst.setString(5, pay.getPayTime());
				 rs = pst.executeUpdate();
			 }
			 catch (Exception e) {
				e.printStackTrace();
			}
			 return rs;		 
		 }
		 
		 //根据收入支出表id来查询某条数据
		 public List<Pay> listPay(int payId)
			{
				ResultSet rs = null;
				List<Pay> listPay = new ArrayList<Pay>();
				try {
					Conn h = new Conn();
					Connection conn = h.getConn();
					PreparedStatement pst = null;
					String select_pay = "SELECT * FROM `pay` WHERE payId="+"'"+payId+"'";
					pst = conn.prepareStatement(select_pay);
					rs = pst.executeQuery();
					while(rs.next())
					{
						Pay pay = new Pay();
						pay.setPayId(rs.getInt("payId"));
						pay.setPayName(rs.getString("payName"));
						pay.setPayType(rs.getString("payType"));
						pay.setPayDescribe(rs.getString("payDescribe"));
						pay.setPayMoney(rs.getFloat("payMoney"));
						pay.setPayTime(rs.getString("payTime"));
						listPay.add(pay);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return listPay;
			}
		 
		//管理员修改收入支出表信息
			public int updatePay(Pay pay,int payId)
			{
				int rs = 0;
				try {
					Conn a = new Conn();
					Connection conn = a.getConn();
					PreparedStatement pst = null;
					String update_way = "UPDATE `pay` SET payName=?,payType=?,payDescribe=?,payMoney=?,payTime=? WHERE payId="+"'"+payId+"'";
					pst = conn.prepareStatement(update_way);
					pst.setString(1, pay.getPayName() );
					pst.setString(2, pay.getPayType());
					pst.setString(3, pay.getPayDescribe());
					pst.setFloat(4, pay.getPayMoney());
					pst.setString(5, pay.getPayTime());
					rs = pst.executeUpdate();
					//System.out.println("修改成功");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return rs;
			}
			
			
		//管理员查询用户建议表
		public List<Message> selectMessage()
		{
			ResultSet rs = null;
			List<Message> listMessage = new ArrayList<Message>();
			try {
				Conn a = new Conn();
				Connection conn = a.getConn();
				PreparedStatement pst = null;
				String select_message = "SELECT * from message";
				pst = conn.prepareStatement(select_message);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Message me = new Message();
					me.setMessageId(rs.getInt("messageId"));
					me.setUserName(rs.getString("userName"));
					me.setTel(rs.getString("tel"));
					me.setIdentity(rs.getString("identity"));
					me.setWaybillId(rs.getInt("waybillId"));
					me.setMessageType(rs.getString("messageType"));
					me.setMessageInformation(rs.getString("messageInformation"));
					listMessage.add(me);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return listMessage;
		}
		
		//根据建议表id删除信息
		public int deleteMessage(int messageId)
		{
			int rs = 0;
			try {
				Conn f = new Conn();
				Connection conn = f.getConn();
				PreparedStatement pst = null;
				String delete_userOrder = " DELETE FROM message WHERE messageId ="+"'"+messageId+"'";
				pst = conn.prepareStatement(delete_userOrder);
				rs = pst.executeUpdate();
				System.out.println("删除成功");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return rs;
		}

}
