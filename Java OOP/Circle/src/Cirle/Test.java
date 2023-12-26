package Cirle;

public class Test {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(8.35, 20, "Blue"); 
		System.out.println(cylinder.getVolume());
		System.out.println(cylinder.getArea());
		System.out.println(cylinder.toString());
	}
}
