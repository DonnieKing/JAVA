package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;

public class getOrderAction extends ActionSupport implements ModelDriven {
	
	 private Order order = new Order();
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	private List<Order> listorders = new ArrayList<Order>();
	public List<Order> getListorders() {
		return listorders;
	}
	public void setListorders(List<Order> listorders) {
		this.listorders = listorders;
	}
	
	private String tel;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	Dao dao = new Dao();
	
	public String getOrderMethod()
	{
		//System.out.println(tel);	   
		listorders = dao.listorder(tel);
		return "getOrderOK";
		 
	}
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listorders;
	}
	
	
 
	 
}
