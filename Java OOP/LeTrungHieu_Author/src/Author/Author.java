package Author;

public class Author {
	private String name;
	private String email; 
	private char gender; 
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String name, String email, char gender){
		this.name = name; 
		this.email = email; 
		if(gender == 'f' || gender == 'm') {
			this.gender = gender; 
		}else {
			System.out.println("Invalid value. Default value is set to 'f'");
			this.gender = 'f'; 
		}
	}
	public String getName() {
		return this.name; 
	}
	public String getEmail() {
		return this.email; 
	}
	public char getGender() {
		return this.gender; 
	}
	public void setEmail(String email) {
		this.email = email; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setGender(char gender) {
		if(gender == 'f' || gender == 'm') {
			this.gender = gender; 
		}else {
			System.out.println("Invalid value. Default value is set to 'f'");
			this.gender = 'f'; 
		}
	}
	public String toString() {
		String resultString = String.format("Author[name = %s, email = %s, gender = %c]", this.name, this.email, this.gender); 
		return resultString; 
	}
	
}
