package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;

public class getAllOrderAction extends ActionSupport implements ModelDriven  {
		

		private List<Order> listorder = new ArrayList<Order>();
		
		Dao dao = new Dao();

		public List<Order> getListorder() {
			return listorder;
		}

		public void setListorder(List<Order> listorder) {
			this.listorder = listorder;
		}

 	
		public String getAllOrderMethod()
		{
			//System.out.println(11111);
			listorder = dao.listOrders();
			
			return "getAllOrderOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return listorder;
		}
}
