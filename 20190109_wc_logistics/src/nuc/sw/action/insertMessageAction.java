package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Message;

public class insertMessageAction extends ActionSupport implements ModelDriven {
	
		private Message message = new Message();
		public Message getMessage() {
			return message;
		}
		public void setMessage(Message message) {
			this.message = message;
		}
		private String info;
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		Dao dao = new Dao();
		
		public String insertMessageMethod()
		{
			info="您的建议提交成功";
			dao.insertMessage(message);
//			System.out.println("插入建议成功");
			return "insertMessageOK";
		}
		
		
		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return message;
		}
		
}
