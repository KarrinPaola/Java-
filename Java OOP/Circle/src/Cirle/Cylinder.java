package Cirle;

public class Cylinder extends Circle{
	private double height = 1.0; 
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	public Cylinder(double radious) {
		// TODO Auto-generated constructor stub
		this.radious = radious; 
	}
	public Cylinder(double radious, double height) {
		// TODO Auto-generated constructor stub
		this.radious = radious; 
		this.height = height; 
	}
	public Cylinder(double radious, double height, String color) {
		// TODO Auto-generated constructor stub
		this.radious = radious; 
		this.height = height; 
		this.color = color; 
	}
	public double getHeight() {
		return height; 
	}
	public void setHeight(double height) {
		this.height = height; 
	}
	public double getVolume() {
		return getArea() * getHeight(); 
	}
	
}
