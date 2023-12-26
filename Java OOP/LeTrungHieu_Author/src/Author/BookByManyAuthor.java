package Author;

public class BookByManyAuthor {
	private String name; 
	private Author[] authors; 
	private double price; 
	private int quantity = 0; 
	
	public BookByManyAuthor(String name, Author[] authors, double price) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.authors = authors; 
		this.price = price; 
	}
	public BookByManyAuthor(String name, Author[] authors, double price,int quantity) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.authors = authors; 
		this.price = price; 
		this.quantity = quantity; 
	}
	public String getName() {
		return name; 
	}
	public Author[] getAuthor() {
		return authors; 
	}
	public double getPrice() {
		return price; 
	}
	public void setPrice(double price) {
		this.price = price; 
	}
	public int getQuantity() {
		return quantity; 
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
	public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Book[name = %s, authors = {", this.name));

        for (int i = 0; i < authors.length; i++) {
            result.append(authors[i].toString());

            if (i < authors.length - 1) {
                result.append(", ");
            }
        }

        result.append(String.format("}, price = %.2f, quantity = %d]", this.price, this.quantity));
        return result.toString();
    }
	public String getAuthorName() {
		StringBuilder resultString = new StringBuilder(); 
		resultString.append(String.format("\"")); 
		
		for(int i = 0; i < authors.length; i++) {
			resultString.append(authors[i].getName());
			if(i < authors.length - 1) {
				resultString.append(", "); 
			}
		}
		resultString.append("\""); 
		return resultString.toString(); 
	}
	
}
