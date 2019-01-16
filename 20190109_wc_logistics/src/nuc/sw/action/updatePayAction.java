package nuc.sw.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Pay;

public class updatePayAction extends ActionSupport implements ModelDriven {
		
		private Pay pay = new Pay();

		public Pay getPay() {
			return pay;
		}
			
		private int payId;
		
		public int getPayId() {
			return payId;
		}

		public void setPayId(int payId) {
			this.payId = payId;
		}

		public void setPay(Pay pay) {
			this.pay = pay;
		}
		
		Dao dao = new Dao();
		
		public String updatePayMethod()
		{
//			System.out.println(pay.getPayDescribe());
//			System.out.println(pay.getPayId());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
			String nowDate = df.format(new Date()); // new Date()为获取当前系统时间
			pay.setPayTime(nowDate);
			dao.updatePay(pay, pay.getPayId());
			return "updatePayOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return pay;
		}
}
