package nuc.sw.entity;

public class Waybill {
	private int waybillId; //���˱�id
	private int orderId;	//����id
	private String waybillStart; //�Ƿ����
	private String waybillTime;  //����ʱ��
	private String waybillTrail;  //����
	private String waybillEnd; 	//�Ƿ񵽴�
	private String waybillDamaged;	//�Ƿ�����
	private String waybillSign;  //�Ƿ�ǩ��
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
