package nuc.sw.action;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Order;

public class insertOrderAction extends ActionSupport implements ModelDriven{
		
		private  Order order = new Order();
		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}
		
		Dao dao = new Dao();
		
		public String insertOrderMethod()
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
			String nowDate = df.format(new Date()); // new Date()为获取当前系统时间
			order.setOrderTime(nowDate);
			order.setOrderState("未发货");
//			System.out.println(nowDate);
//			System.out.println(order.getSender());
//			System.out.println(order.getOrderTime());
			dao.insertOrder(order);
			return "insertOrderOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return order;
		}
}
