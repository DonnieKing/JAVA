package nuc.sw.entity;


public class Order {
	private int orderId; //订单id
	private String sender; //发件人姓名
	private String sendAddress; //发送人地址
	private String tel;  //发件人手机
	private String consignee; //收件人姓名
	private String receivingAddress;//收件人地址
	private String receivingPhone;//收件人手机
	private String itemType;//货物类型
	private String itemName;//货物名称
	private int itemQuality;//货物质量
	private int itemVolume;//货物体积
	private int itemNumber;//货物数量	
	private float itemPrice;//价格
	private String paymentMethod;//付款方式
	private String expressWay;//快递方式
	private String orderTime;//下单时间
	private String orderState;//订单状态
	
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
