package nuc.sw.entity;

public class Message {
	
	private int messageId; //�����id
	private String userName; //�û���
	private String tel;	//��ϵ�绰
	private String identity;	//���
	private int waybillId;	//�˵���
	private String messageType;	//Ͷ������
	private String messageInformation;	//Ͷ�߽���
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
	}	//Ͷ����Ϣ
	
}
