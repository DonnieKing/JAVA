package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ResolverUtil.NameEndsWith;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Pay;

public class getAPayAction extends ActionSupport implements ModelDriven  {
		
	 private Pay pay = new Pay();

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}
	 private int payId;
	 
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	private List<Pay> listPay = new ArrayList<Pay>();
	public List<Pay> getListPay() {
		return listPay;
	}
	public void setListPay(List<Pay> listPay) {
		this.listPay = listPay;
	}
	
	Dao dao = new Dao();
	
	public String getAPayMethod()
	{
//		System.out.println(pay.getPayId());
		listPay = dao.listPay(pay.getPayId());
		return "getAPayOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return pay;
	}
	
}
