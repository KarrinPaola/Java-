package Person;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person("Hieu", "Yen Nghia"); 
		System.out.println(person.toString()); 
		Staff staff = new Staff("Hieu", "Yen Nghia", "Navi", 5000); 
		System.out.println(staff.toString()); 
		Student student = new Student("Hieu", "Yen Nghia", "Phenikaa", 2, 30000);
		System.out.println(student.toString()); 
	}
}
