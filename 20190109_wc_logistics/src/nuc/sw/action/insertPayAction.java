package nuc.sw.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Pay;

public class insertPayAction extends ActionSupport implements ModelDriven {
		
		private Pay pay = new Pay();

		public Pay getPay() {
			return pay;
		}

		public void setPay(Pay pay) {
			this.pay = pay;
		}
		
		Dao dao = new Dao();
		
		public String insertPayMethod()
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
			String nowDate = df.format(new Date()); // new Date()为获取当前系统时间
//			System.out.println(pay.getPayName());
			pay.setPayTime(nowDate);
			dao.insertPay(pay);
			return "insertPayOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return pay;
		}
}
