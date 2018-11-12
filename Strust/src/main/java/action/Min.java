package action;

public class Min {

	private String hour;
	private String min;
	private Double pa;
	private Double ps;
	
	
	public Min(String hour, String min, Double pa, Double ps) {
		super();
		this.hour = hour;
		this.min = min;
		this.pa = pa;
		this.ps = ps;
	}
	public Double getPs() {
		return ps;
	}
	public void setPs(Double ps) {
		this.ps = ps;
	}
	public Min() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public Double getPa() {
		return pa;
	}
	public void setPa(Double pa) {
		this.pa = pa;
	}
	@Override
	public String toString() {
		return "Min [hour=" + hour + ", min=" + min + ", pa=" + pa + ", ps=" + ps + "]";
	}
	
}
