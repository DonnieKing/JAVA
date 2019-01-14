package nuc.sw.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;
import nuc.sw.entity.Waybill;

public class updateOrderAction extends ActionSupport implements ModelDriven {
	
	private Order order = new Order();
	Dao dao = new Dao();
	private int orderId;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	private Waybill way = new Waybill();
	public Waybill getWay() {
		return way;
	}
	public void setWay(Waybill way) {
		this.way = way;
	}
	public String updateOrderMethod()
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
		String nowDate = df.format(new Date()); // new Date()为获取当前系统时间
//		System.out.println(order.getConsignee());
//		System.out.println(order.getOrderId());
		dao.updateOrder(order, order.getOrderId());
//		System.out.println(order.getOrderState());
		if(order.getOrderState().equals("已发货"))
		{
			way.setOrderId(order.getOrderId());
			way.setWaybillTime(nowDate);
			dao.insertWay(way);
//			System.out.println(way.getOrderId());
//			System.out.println(way.getWaybillTime());
		}
		return "updateOrderOK";
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return order;
	}
	
}
