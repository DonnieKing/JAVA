package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Waybill;

public class deleteWayAction extends ActionSupport implements ModelDriven {
		
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

	Dao dao = new Dao();
	
	public String deleteWayMethod()
	{
//		System.out.println(way.getOrderId());
		dao.deleteWay(way.getOrderId());
		return "deleteWayOK";
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return way;
	}
	 
}
