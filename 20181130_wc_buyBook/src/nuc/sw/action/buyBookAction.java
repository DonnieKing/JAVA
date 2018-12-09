package nuc.sw.action;

import javax.websocket.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;

public class buyBookAction extends ActionSupport implements ModelDriven{
	
	private Order order = new Order();
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	private String tel;
	private String user_name;
	private String book_name;
	private float book_price;
	private String address;
	private String image;	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	Dao dao = new Dao();
	
	public String buyBookMethod() {
		System.out.println(order.getTel());
		System.out.println(order.getUser_name());
		System.out.println(order.getBook_name());
		System.out.println(order.getBook_price());
		System.out.println(order.getAddress());
		System.out.println(order.getImage());
		//ActionContext.getContext().getSession().put("names", order.getBook_name()); 
		dao.insertOrder(order);
		//System.out.print("≤Â»Î≥…π¶");		
		return "insertOrderOK";
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return order;
	}
	
	
}
