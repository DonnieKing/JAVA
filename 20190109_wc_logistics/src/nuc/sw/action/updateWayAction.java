package nuc.sw.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;
import nuc.sw.entity.Waybill;
import nuc.sw.entity.income;

public class updateWayAction extends ActionSupport implements ModelDriven {
	private income come = new income();
	 private Waybill way = new Waybill();

	public income getCome() {
		return come;
	}
	public void setCome(income come) {
		this.come = come;
	}
	public Waybill getWay() {
		return way;
	}

	public void setWay(Waybill way) {
		this.way = way;
	}
	private List<Order> listorder = new ArrayList<Order>();
	 public List<Order> getListorder() {
		return listorder;
	}
	public void setListorder(List<Order> listorder) {
		this.listorder = listorder;
	}
	private Dao dao =new Dao();
	 
	public String updateWayMethod()
	{
//		System.out.println(way.getWaybillId());
//		System.out.println(way.getOrderId());
		float financeMoney = 0;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
		String nowDate = df.format(new Date()); // new Date()为获取当前系统时间
		listorder = dao.listOrderDetail(way.getOrderId());
		for(Order o:listorder)
		{
			financeMoney = o.getItemPrice();
		}
//		System.out.println(financeMoney);
		dao.updateWay(way, way.getOrderId());
		if(way.getWaybillSign().equals("已签收"))
		{
			come.setWaybillId(way.getWaybillId());
			come.setFinanceMoney(financeMoney);
			come.setFinanceTime(nowDate);
			dao.insertIncome(come);
		}
		return "updateWayOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return way;
	}
	 
}
