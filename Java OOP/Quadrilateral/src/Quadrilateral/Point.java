package Quadrilateral;

public class Point {
	private int x; 
	private int y; 
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x; 
		this.y = y; 
	}
	
	public int getX() {
		return x; 
	}
	public int getY() {
		return y; 
	}
	
	public void setX(int x) {
		this.x = x; 
	}
	public void setY(int y) {
		this.y = y; 
	}
	
	public void Display() {
		System.out.println("x = " + x); 
		System.out.println("y = " + y); 
	}
	
}
