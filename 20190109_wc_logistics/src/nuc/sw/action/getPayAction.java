package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Pay;

public class getPayAction extends ActionSupport implements ModelDriven {
		
	private Pay pay = new Pay();

	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	
	private List<Pay> pays = new ArrayList<Pay>();
	
	
	public List<Pay> getPays() {
		return pays;
	}
	public void setPays(List<Pay> pays) {
		this.pays = pays;
	}
	
	Dao dao = new Dao();
	public String getPayMethod()
	{
		pays = dao.selectPay();
//		for(Pay p:pays)
//		{
//			System.
//		}
		return "getPayOK";
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return pays;
	}
	
}
