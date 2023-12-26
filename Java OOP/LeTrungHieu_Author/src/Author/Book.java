package Author;

public class Book {
	private String nameString; 
	private Author author; 
	private double price; 
	private int quantity = 0; 
	
	public Book(String nameString, Author author, double price) {
		this.nameString = nameString; 
		this.author = author; 
		this.price = price; 
	}
	
	public Book(String nameString, Author author, double price, int quantity) {
		this.nameString = nameString; 
		this.author = author; 
		this.price = price; 
		this.quantity = quantity; 
	}
	
	public String getName() {
		return this.nameString; 
	}
	public Author getAuthor() {
		return this.author; 
	}
	public double getPrice() {
		return this.price; 
	}
	public int getQuantity() {
		return this.quantity; 
	}
	public void setPrice(double price) {
		this.price = price; 
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
	public String toString() {
		String resultString = String.format("Book[name = %s, %s, price = %f, quantity = %d]", this.nameString, author.toString(),this.price, this.quantity);
		return resultString; 
	}
	
}
