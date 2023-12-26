package Tutorial;

//Cat is inheritance of Dog 
public class Cat extends Dog{
	
	private int food; 
	public Cat(String nameString, int age, int food) {
		super(nameString, age);
		this.food = food;
	}
	public Cat(String nameString, int age) {
		super(nameString, age);
		this.food = 50; 
	}
	public Cat(String nameString) {
		super(nameString, 0); 
	}
	public void speak() {
		System.out.println("Meoz my name is " + this.nameString + " and my age is " + this.age); 
	}
	
	public void eat(int x) {
		this.food -= x; 
	}
}
