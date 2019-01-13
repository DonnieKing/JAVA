package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;
import nuc.sw.entity.Waybill;

public class getOrderDetailAction extends ActionSupport implements ModelDriven {
	private Order order = new Order();
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
	
	private int orderId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	private List<Waybill> listWay = new ArrayList<Waybill>();
	public List<Waybill> getListWay() {
		return listWay;
	}
	public void setListWay(List<Waybill> listWay) {
		this.listWay = listWay;
	}

	private List<Order> listorder = new ArrayList<Order>();
	public List<Order> getListorder() {
		return listorder;
	}

	public void setListorder(List<Order> listorder) {
		this.listorder = listorder;
	}

	Dao dao = new Dao();
	public String getOrderDetailMethod()
	{
//		System.out.println(orderId);
		listorder = dao.listOrderDetail(orderId);
		listWay = dao.listWay(orderId);
//		for(Waybill w:listWay)
//		{
//			System.out.println(w.getWaybillDamaged());
//		}
		return "getOrderDetailOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listorder;
	}
	 
		
}
