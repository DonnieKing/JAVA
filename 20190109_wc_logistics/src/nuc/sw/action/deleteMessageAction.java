package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Message;

public class deleteMessageAction extends ActionSupport implements ModelDriven {
	
		private Message me = new Message();

		public Message getMe() {
			return me;
		}

		public void setMe(Message me) {
			this.me = me;
		}
		private int messageId;
		public int getMessageId() {
			return messageId;
		}

		public void setMessageId(int messageId) {
			this.messageId = messageId;
		}
		Dao dao = new Dao();
		
		public String deleteMessMethod()
		{
			
//			System.out.println(me.getMessageId());
			dao.deleteMessage(me.getMessageId());
			
			return "deleteMeOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return me;
		}

}
