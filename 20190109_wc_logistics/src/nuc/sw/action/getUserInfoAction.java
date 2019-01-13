package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;

public class getUserInfoAction extends ActionSupport implements ModelDriven {
	
		private User user = new User();
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
				
		private String tel;
		private String userPassword;
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		private List<User> listuser = new ArrayList<User>();
		public List<User> getListuser() {
			return listuser;
		}

		public void setListuser(List<User> listuser) {
			this.listuser = listuser;
		}

		Dao dao = new Dao();
		
		public String getUserInfoMethod()
		{
//			System.out.println(user.getTel());
//			System.out.println(user.getUserPassword());
			
			listuser = dao.selectUser(user);
//			for(User u:listuser)
//			{
//				System.out.println(u.getAddress());
//				System.out.println(u.getSex());
//			}
			return "getUserInfoOK";
		}

		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return user;
		}
		
}
