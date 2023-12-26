package Shape;

public class Shape {
	protected String color = "red"; 
	protected boolean filled = true; 
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(String color, boolean filled) {
		// TODO Auto-generated constructor stub
		this.color = color; 
		this.filled = filled; 
	}
	public String getColor() {
		return color; 
	}
	public boolean isFilled() {
		return filled; 
	}
	public void setColor(String color) {
		this.color = color; 
	}
	public void setFilled(boolean filled) {
		this.filled = filled; 
	}
	public String toString() {
		String resultString; 
		resultString = String.format("Shape[color = %s, filled = %b",color, filled ); 
		return resultString; 
	}
}
