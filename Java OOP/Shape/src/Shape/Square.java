package Shape;

public class Square extends Retangle{
	private double size = 1.0; 
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(double size) {
		// TODO Auto-generated constructor stub
		super(size, size); 
	}
	public Square(double size, String colorString, boolean filled) {
		// TODO Auto-generated constructor stub
		super(size, size, colorString, filled); 
		
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		super.setLength(length);
	}
	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Square[" + super.toString() + "]");
	}
}
