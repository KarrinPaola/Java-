package Author;

public class TestBook {
	public static void main(String[] args) {
		Author author = new Author("Lê Hiếu", "karin@gamil.com", 'm');
		Book book = new Book("War", author, 100, 100); 
		System.out.println(book); 
	}
}
