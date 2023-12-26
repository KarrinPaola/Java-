package Point;

public class TestMovablePoint {
	public static void main(String[] args) {
		MovablePoint movablePoint = new MovablePoint(2,6,7,3); 
		System.out.println(movablePoint.toString());
		movablePoint.move(); 
		System.out.println(movablePoint.toString());
	}
}
