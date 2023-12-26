package Tutorial;
import java.util.Scanner;

public class Object {
	
	public static void main(String[] args) {
		Dog timDog = new Dog("tim", 4); 
		timDog.speak();
		
		int x = timDog.getAge(); 
		System.out.println("x = " + x);
		
		timDog.setAge(10);
		x = timDog.getAge(); 
		System.out.println("x = " + x);
		
		Cat timCat = new Cat("tim", 10, 20); 
		timCat.speak();
		Cat bobCat = new Cat("Bob", 23); 
		bobCat.speak();
		
	}		
	
}
