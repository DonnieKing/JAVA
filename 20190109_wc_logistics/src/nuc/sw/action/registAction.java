package nuc.sw.action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.User;

public class registAction extends ActionSupport implements ModelDriven<User> {
	 
	private User user = new User();		 
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	private String image = user.getImage();
	private String imageFileName;
	private String imageContentType;
	private String savePath;

	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getImageContentType() {
		return imageContentType;
	}
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	private String userName;
	private String userPassword;
	private String reuserPassword;
	private String sex;
	private String tel;
	private String address;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getReuserPassword() {
		return reuserPassword;
	}
	public void setReuserPassword(String reuserPassword) {
		this.reuserPassword = reuserPassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private String info;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	private List<User> listTel = new ArrayList<User>();
	public List<User> getListTel() {
		return listTel;
	}
	public void setListTel(List<User> listTel) {
		this.listTel = listTel;
	}

	private Dao dao = new Dao();
	   public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	public String RegistMethod() throws Exception {
		//观察封装文件信息的三个参数
//		System.out.println(user.getImage());
//		System.out.println(imageFileName);
//		System.out.println(imageContentType);
//		System.out.println(savePath);
		//文件上传
		FileInputStream fis = new FileInputStream(user.getImage());
		FileOutputStream fos = new FileOutputStream(savePath + "/" +  imageFileName);
		byte[] buf = new byte[1024];
		int len =0;
		while((len=fis.read(buf))>0) {
			fos.write(buf,0,len);
		}
			//System.out.println( imageFileName);
//			System.out.println(user.getSex());
		    
		    listTel = dao.selectTel();
		     for(User u:listTel)
		     {
		    	 if(u.getTel().equals(user.getTel()))
		    	 {
		    		 info = "该账号已注册！";
		    		 return INPUT;
		    	 }
		     }
		 	user.setImage("./uploadRealFile/"+ imageFileName);
			dao.insertUser(user);
		    info = "注册成功，请登录";		     
		    return "registOK";	   
	   }
	   
	   
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	 
}