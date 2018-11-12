package action;

public class Pa {

    private String  date;
    private Double pa;
	public Pa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pa(String date, Double pa) {
		super();
		this.date = date;
		this.pa = pa;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getPa() {
		return pa;
	}
	public void setPa(Double pa) {
		this.pa = pa;
	}
	@Override
	public String toString() {
		return "Pa [date=" + date + ", pa=" + pa + "]";
	}
    
}
