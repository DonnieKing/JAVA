package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Message;

public class getMessageAction extends ActionSupport implements ModelDriven  {
		
		 private Message me = new Message();

		public Message getMe() {
			return me;
		}

		public void setMe(Message me) {
			this.me = me;
		}
		 
		private List<Message> listMess = new ArrayList<Message>();

		public List<Message> getListMess() {
			return listMess;
		}

		public void setListMess(List<Message> listMess) {
			this.listMess = listMess;
		}
		Dao dao = new Dao();
		
		public String getMessMethod()
		{
			listMess = dao.selectMessage();
//			for(Message m:listMess)
//			{
//				System.out.println(m.getUserName());
//			}
		     return "getMessageOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return listMess;
		}
}
