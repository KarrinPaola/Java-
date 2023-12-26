package Quadrilateral;

public class TestQuadrilateral {
	
	public static void main(String[] args) {
		Point point = new Point(2,5); 
		Point point1 = new Point(5,6); 
		Point point2 = new Point(3,8); 
		Point point3 = new Point(4,1); 
		Quadrilateral quadrilateral = new Quadrilateral(point, point1, point2, point3); 
		
		if(quadrilateral.checkQuadrilateral(point, point1, point2, point3) == true){
			System.out.println(quadrilateral.Perimeter()); 
		}else {
			System.out.println("This is not a quadrilateral"); 
		}
	}
}
