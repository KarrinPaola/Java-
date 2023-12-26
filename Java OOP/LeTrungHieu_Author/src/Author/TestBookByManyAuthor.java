package Author;

public class TestBookByManyAuthor {
	public static void main(String[] args) {
		// Tạo một mảng các đối tượng Author
        Author[] authors = new Author[3];
        authors[0] = new Author("Lê Hiếu", "karin@gmail.com", 'm');
        authors[1] = new Author("Ngọc Trâm", "tram@yahoo.com", 'f');
        authors[2] = new Author("Minh Anh", "minhanh@gmail.com", 'f');
        
        BookByManyAuthor bookByManyAuthor = new BookByManyAuthor("War", authors, 100, 100); 
        System.out.println(bookByManyAuthor.toString()); 
        
        System.out.println(bookByManyAuthor.getAuthorName()); 

	}
}
