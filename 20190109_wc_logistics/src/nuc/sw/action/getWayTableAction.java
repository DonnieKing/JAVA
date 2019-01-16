package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 

import nuc.sw.dao.Dao;
import nuc.sw.entity.Waybill;

public class getWayTableAction extends ActionSupport implements ModelDriven {
		
		private Waybill way = new Waybill();
		public Waybill getWay() {
			return way;
		}
		public void setWay(Waybill way) {
			this.way = way;
		}
		private List<Waybill> listway = new ArrayList<Waybill>();
		public List<Waybill> getListway() {
			return listway;
		}
		public void setListway(List<Waybill> listway) {
			this.listway = listway;
		}
		private Dao dao = new Dao();
		
		public String getWayTableMethod()
		{
			listway = dao.listWays();
//			for(Waybill w:listway)
//			{
//				System.out.println(w.getWaybillTime());
//			}
			return "getWayTableOK";
		}
		
		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return listway;
		}
}
