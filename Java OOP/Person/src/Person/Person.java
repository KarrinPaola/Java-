package Person;

public class Person {
	protected String name; 
	protected String address; 
	
	public Person(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.address = address; 
	}
	public Person() {
		
	}
	public  String  getName() {
		return this.name; 
	}
	public String getAddress() {
		return this.address; 
	}
	public void setAddress(String address) {
		this.address = address; 
	}
	public String toString() {
		String result = ""; 
		result = String.format("Person[name = %s, address = %s]", this.name, this.address); 
		return result; 
	}
	
}
