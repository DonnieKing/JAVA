package nuc.sw.entity;

public class exTime {
	
	private int expressPriceId; 
	private String startProvince;
	private String startCity;
	private String endProvince;
	private String endCity;
	private Float time;
	private Float weight;
	
	public String getStartProvince() {
		return startProvince;
	}
	public void setStartProvince(String startProvince) {
		this.startProvince = startProvince;
	}
	public String getEndProvince() {
		return endProvince;
	}
	public void setEndProvince(String endProvince) {
		this.endProvince = endProvince;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public int getExpressPriceId() {
		return expressPriceId;
	}
	public void setExpressPriceId(int expressPriceId) {
		this.expressPriceId = expressPriceId;
	}
	public String getStartCity() {
		return startCity;
	}
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	public String getEndCity() {
		return endCity;
	}
	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	
}
