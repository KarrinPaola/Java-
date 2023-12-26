package Quadrilateral;

import java.lang.Math;
import javax.security.auth.x500.X500Principal;

public  class Quadrilateral {
	private Point d1; 
	private Point d2; 
	private Point d3; 
	private Point d4; 
	
	public Quadrilateral(Point d1, Point d2, Point d3, Point d4) {
		// TODO Auto-generated constructor stub
		this.d1 = d1; 
		this.d2 = d2; 
		this.d3 = d3;
		this.d4 = d4; 
	}
	
	public  double getLength(Point point1, Point point2) {
		double xpow = Math.pow(point1.getX() - point2.getX(), 2); 
		double ypow = Math.pow(point1.getY() - point2.getY(), 2); 
		return Math.sqrt(xpow + ypow);
	}
	
	public double Perimeter() {
		double line1 = getLength(d1, d2); 
		double line2 = getLength(d2, d3); 
		double line3 = getLength(d3, d4); 
		double line4 = getLength(d4, d1); 
		return line1 + line2 + line3 + line4; 
	}
	
	public boolean checkStraight(Point point1, Point point2, Point point3) {
		double x1 = point2.getX() - point1.getX(); 
		double y1 = point2.getY() - point1.getY(); 
		double x2 = point3.getX() - point2.getX(); 
		double y2 = point3.getY() - point2.getY(); 
		if((x1 / x2) == (y1 / y2)) {
			return true; //Three Point is in a straight line
		}else {
			return false; //Three Point is not in a straight line
		}
	}
	public boolean checkQuadrilateral(Point point1, Point point2, Point point3, Point point4) {
		boolean check1 = checkStraight(point1, point2, point3); 
		boolean check2 = checkStraight(point2, point3, point4);
		boolean check3 = checkStraight(point3, point4, point1); 
		boolean check4 = checkStraight(point4, point1, point2);
		//If Random three points not in a straight line, this is an quadrilateral 
		if(check1 == false && check2 == false && check3 == false && check4 == false) {
			return true; 
		}else {
			return false; 
		}
	}
}
