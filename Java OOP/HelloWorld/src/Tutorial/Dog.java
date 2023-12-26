package Tutorial;
import javax.swing.LayoutFocusTraversalPolicy;

public class Dog {
	//Only using in this class 
	protected String nameString; 
	protected int age; 
	
	public Dog(String nameString, int age) {
		this.nameString = nameString; 
		this.age = age; 
	}
	public void speak() {
		System.out.println("I am " + this.nameString + " and I am " + this.age); 
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	
}
