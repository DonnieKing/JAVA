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
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//�������ڸ�ʽ
			String nowDate = df.format(new Date()); // new Date()Ϊ��ȡ��ǰϵͳʱ��
			order.setOrderTime(nowDate);
			order.setOrderState("δ����");
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
