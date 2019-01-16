package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;

public class getAOrderAction extends ActionSupport implements ModelDriven {
	private Order order = new Order();
	private int orderId;
	private List<Order> listorder = new ArrayList<Order>();
	Dao dao = new Dao();
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Order> getListorder() {
		return listorder;
	}
	public void setListorder(List<Order> listorder) {
		this.listorder = listorder;
	}
	
	public String getAOrderMethod()
	{
//		System.out.println(orderId);
		listorder = dao.listOrderDetail(orderId);
//		for(Order o:listorder)
//		{
//				System.out.println(o.getConsignee());
//		}
		return "getAOrderOK";
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listorder;
	}
}
