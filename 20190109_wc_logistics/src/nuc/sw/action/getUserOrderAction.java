package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;
import nuc.sw.entity.User;

public class getUserOrderAction extends ActionSupport implements ModelDriven  {
		
	private Order order = new Order();
	   public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
 
	private String tel;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	private List<Order> listorder = new ArrayList<Order>();
	public List<Order> getListorder() {
		return listorder;
	}

	public void setListorder(List<Order> listorder) {
		this.listorder = listorder;
	}

	Dao dao = new Dao();
	public String getUserOrderMethod()
	{
//		System.out.println(tel);
		listorder = dao.listOrder(tel);
		return "getUserOrderOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listorder;
	}
	   
}
