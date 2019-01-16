package nuc.sw.entity;

public class Pay {
		
	private int payId;
	private String payName ;
	private String payType  ;
	private String payDescribe  ;
	private float payMoney;
	private String payTime;
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayDescribe() {
		return payDescribe;
	}
	public void setPayDescribe(String payDescribe) {
		this.payDescribe = payDescribe;
	}
	public float getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(float payMoney) {
		this.payMoney = payMoney;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	
}
