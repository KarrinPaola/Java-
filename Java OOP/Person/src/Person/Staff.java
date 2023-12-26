package Person;

public class Staff extends Person{
	private String school; 
	private double pay; 
	
	public Staff(String name, String address, String school, double pay) {
		// TODO Auto-generated constructor stub
		super(name, address); 
		this.school = school; 
		this.pay = pay; 
	}
	public String getSchool() {
		return this.school; 
	}
	public double getPay() {
		return this.pay; 
	}
	public void setSchool(String school) {
		this.school = school; 
	}
	public void setPay (double pay) {
		this.pay = pay; 
	}
	public String toString() {
		String result = "";
		result = String.format("Staff[%s, school = %s, pay = %.2f]", super.toString(), this.school, this.pay); 
		return result; 
	}
}
