package nuc.sw.entity;

public class Message {
	
	private int messageId; //建议表id
	private String userName; //用户名
	private String tel;	//联系电话
	private String identity;	//身份
	private int waybillId;	//运单号
	private String messageType;	//投诉类型
	private String messageInformation;	//投诉建议
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public int getWaybillId() {
		return waybillId;
	}
	public void setWaybillId(int waybillId) {
		this.waybillId = waybillId;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageInformation() {
		return messageInformation;
	}
	public void setMessageInformation(String messageInformation) {
		this.messageInformation = messageInformation;
	}	//投诉信息
	
}
