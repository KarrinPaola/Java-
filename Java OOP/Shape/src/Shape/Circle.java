package Shape;

import java.lang.Math;

public class Circle extends Shape{
	private double radius = 1.0; 
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius; 
	}
	public Circle(double radius, String color, boolean filled) {
		// TODO Auto-generated constructor stub
		super(color, filled); 
		this.radius = radius; 
	}
	public double getRadius() {
		return radius; 
	}
	public void setRadius(double radius) {
		this.radius = radius; 
	}
	public double getArea() {
		return radius * radius * Math.PI; 
	}
	public String toString() {
		String resultString = ""; 
		resultString = String.format("Circle[%s, radius = %.2f]", super.toString(), this.radius); 
		return resultString; 
	}
	
	
}
