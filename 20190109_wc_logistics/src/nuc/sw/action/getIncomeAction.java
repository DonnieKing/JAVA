package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.income;

public class getIncomeAction extends ActionSupport implements ModelDriven {
	
	private income come = new income();
	public income getCome() {
		return come;
	}
	public void setCome(income come) {
		this.come = come;
	}
	
	private List<income> comes = new ArrayList<income>();
	public List<income> getComes() {
		return comes;
	}
	public void setComes(List<income> comes) {
		this.comes = comes;
	}
	private Dao dao = new Dao();
	
	public String getIncomeMethod()
	{
		comes = dao.listComes();
		
		return "getIncomeOK";
	}
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return come;
	}
	 
}	
