package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;

public class deleteOrderAction extends ActionSupport implements ModelDriven {
	
	private Order order = new Order();
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	private String tel;
	private String book_name;
	 public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	Dao dao = new Dao();
	 
	 public String deleteOrderMethod() {
		 //System.out.println(order.getTel());
		 //System.out.println(order.getBook_name());
		 dao.deleteOrder(order.getTel(),order.getBook_name());
		return "deleteOrderOK";		 
	 }

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return order;
	}
}
