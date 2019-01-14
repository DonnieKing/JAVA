package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.exTime;

public class selectExpresstimeAction extends ActionSupport implements ModelDriven  {
	
		private exTime time = new exTime();

		public exTime getTime() {
			return time;
		}

		public void setTime(exTime time) {
			this.time = time;
		}
		
		public List<exTime> exTimes = new ArrayList<>();
		public List<exTime> getExTimes() {
			return exTimes;
		}

		public void setExTimes(List<exTime> exTimes) {
			this.exTimes = exTimes;
		}
		
		private double expressPrice;
		public double getExpressPrice() {
			return expressPrice;
		}

		public void setExpressPrice(double expressPrice) {
			this.expressPrice = expressPrice;
		}

		Dao dao = new Dao();
		public String selectExpresstimeMethod()
		{
			
			ActionContext.getContext().getSession().put("weight", time.getWeight());
			
			float a =  (float) Math.ceil(time.getWeight());
		    time.setWeight(a);
		     
			if(time.getWeight()<11)
			{
				expressPrice = 10;
			}
			else {
				expressPrice = (time.getWeight()-10)*1.5+10;
			}
			
//			System.out.println(expressPrice);
			
			exTimes = dao.selectTime(time);
//			for(exTime e:exTimes)
//			{
//				System.out.println(e.getTime());
//				System.out.println(e.getWeight());
//			}
			return "selectTimeOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return time;
		}
}	
