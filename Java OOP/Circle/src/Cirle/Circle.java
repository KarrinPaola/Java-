package Cirle;

import java.awt.Color;
import java.lang.Math;

public class Circle {
	protected double radious = 1.0; 
	protected String color = "Red"; 
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radious) {
		// TODO Auto-generated constructor stub
		this.radious = radious; 
	}
	public Circle(double radious, String color) {
		// TODO Auto-generated constructor stub
		this.radious = radious; 
		this.color = color; 
	}
	public void setRadious(double radious) {
		this.radious = radious; 
	}
	public void setColor(String color) {
		this.color = color; 
	}
	public double getRadious() {
		return radious; 
	}
	public String getColor() {
		return color; 
	}
	public double getArea() {
		return radious * radious * 3.14; 
	}
	public String toString() {
		String resultString = String.format("Circle[radious = %.2f, color = %s]", radious, color); 
		return resultString; 
	}
}
