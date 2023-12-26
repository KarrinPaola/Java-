package Shape;

class TestAll {
	public static void main(String[] args) {
		Circle circle = new Circle(1, "red", true); 
		System.out.println(circle.toString());
		System.out.println(circle.getArea());
		Retangle retangle = new Retangle(10, 30); 
		System.out.println(retangle.toString());
		System.out.println(retangle.getArea());
		System.out.println(retangle.getPerimeter());
		Square square = new Square(20); 
		System.out.println(square.toString());
	}
}
