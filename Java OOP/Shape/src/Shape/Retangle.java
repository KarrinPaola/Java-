package Shape;

public class Retangle extends Shape{
	protected double width = 1.0; 
	protected double length = 1.0; 
	
	public Retangle() {
		// TODO Auto-generated constructor stub
	}
	public Retangle(double width, double length) {
		// TODO Auto-generated constructor stub
		this.width = width; 
		this.length = length; 
	}
	public Retangle(double width, double length, String color, boolean filled) {
		// TODO Auto-generated constructor stub
		super(color, filled); 
		this.width = width; 
		this.length = length; 
	}
	public double getWidth() {
		return this.width; 
	}
	public double getLength() {
		return this.length;  
	}
	public void setWidth(double width) {
		this.width = width; 
	}
	public void setLength(double length) {
		this.length = length; 
	}
	public double getArea() {
		return width * length; 
	}
	public double getPerimeter() {
		return (width + length)*2; 
	}
	public String toString() {
		String resultString; 
		resultString = String.format("Retangle[%s, width = %.2f, length = %.2f]", super.toString(), this.width, this.length); 
		return resultString; 
	}
}
