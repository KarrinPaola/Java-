package Author;

public class TestAuthor {
	public static void main(String[] args) {
		Author author = new Author("Lê Hiếu", "karin@gamil.com", 'm');
		System.out.println(author.toString()); 
		author.setEmail("trung@gamil.com");
		System.out.println(author.toString()); 
		author.setName("Hiếu Đẹp Zai");
		System.out.println(author.toString()); 
		System.out.println(author.getEmail()); 
		System.out.println(author.getName()); 
	}
}
