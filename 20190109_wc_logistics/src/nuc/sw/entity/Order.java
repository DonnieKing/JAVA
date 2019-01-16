package nuc.sw.entity;


public class Order {
	private int orderId; //����id
	private String sender; //����������
	private String sendAddress; //�����˵�ַ
	private String tel;  //�������ֻ�
	private String consignee; //�ռ�������
	private String receivingAddress;//�ռ��˵�ַ
	private String receivingPhone;//�ռ����ֻ�
	private String itemType;//��������
	private String itemName;//��������
	private int itemQuality;//��������
	private int itemVolume;//�������
	private int itemNumber;//��������	
	private float itemPrice;//�۸�
	private String paymentMethod;//���ʽ
	private String expressWay;//��ݷ�ʽ
	private String orderTime;//�µ�ʱ��
	private String orderState;//����״̬
	
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSendAddress() {
		return sendAddress;
	}
	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getReceivingAddress() {
		return receivingAddress;
	}
	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}
	public String getReceivingPhone() {
		return receivingPhone;
	}
	public void setReceivingPhone(String receivingPhone) {
		this.receivingPhone = receivingPhone;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuality() {
		return itemQuality;
	}
	public void setItemQuality(int itemQuality) {
		this.itemQuality = itemQuality;
	}
	public int getItemVolume() {
		return itemVolume;
	}
	public void setItemVolume(int itemVolume) {
		this.itemVolume = itemVolume;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
 
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getExpressWay() {
		return expressWay;
	}
	public void setExpressWay(String expressWay) {
		this.expressWay = expressWay;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
}
