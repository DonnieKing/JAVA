package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Waybill;

public class selectTrailAction extends ActionSupport implements ModelDriven {
	
		private Waybill way = new Waybill();

		public Waybill getWay() {
			return way;
		}		public void setWay(Waybill way) {
			this.way = way;
		}
		
		private int waybillId;
		public int getWaybillId() {
			return waybillId;
		}
		public void setWaybillId(int waybillId) {
			this.waybillId = waybillId;
		}
		private List<Waybill> listWay = new ArrayList<Waybill>();
		public List<Waybill> getListWay() {
			return listWay;
		}
		public void setListWay(List<Waybill> listWay) {
			this.listWay = listWay;
		}

		Dao dao = new Dao();
		public String selectTrailMethod()
		{
//			System.out.println(way.getWaybillId());
			listWay = dao.listWays(way.getWaybillId());
			return "selectWayOK";
		}
		
		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return way;
		}
		 
		
		
}
