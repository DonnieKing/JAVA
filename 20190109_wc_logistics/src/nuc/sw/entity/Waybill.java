package nuc.sw.entity;

public class Waybill {
	private int waybillId; //货运表id
	private int orderId;	//订单id
	private String waybillStart; //是否出发
	private String waybillTime;  //出发时间
	private String waybillTrail;  //物流
	private String waybillEnd; 	//是否到达
	private String waybillDamaged;	//是否破损
	private String waybillSign;  //是否签收
	public int getWaybillId() {
		return waybillId;
	}
	public void setWaybillId(int waybillId) {
		this.waybillId = waybillId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getWaybillStart() {
		return waybillStart;
	}
	public void setWaybillStart(String waybillStart) {
		this.waybillStart = waybillStart;
	}
	public String getWaybillTime() {
		return waybillTime;
	}
	public void setWaybillTime(String waybillTime) {
		this.waybillTime = waybillTime;
	}
	public String getWaybillTrail() {
		return waybillTrail;
	}
	public void setWaybillTrail(String waybillTrail) {
		this.waybillTrail = waybillTrail;
	}
	public String getWaybillEnd() {
		return waybillEnd;
	}
	public void setWaybillEnd(String waybillEnd) {
		this.waybillEnd = waybillEnd;
	}
	public String getWaybillDamaged() {
		return waybillDamaged;
	}
	public void setWaybillDamaged(String waybillDamaged) {
		this.waybillDamaged = waybillDamaged;
	}
	public String getWaybillSign() {
		return waybillSign;
	}
	public void setWaybillSign(String waybillSign) {
		this.waybillSign = waybillSign;
	}
	
}
