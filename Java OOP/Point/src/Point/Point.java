package Point;

public class Point {
	protected float x = 0.0f; 
	protected float y = 0.0f; 
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(float x, float y) {
		this.x = x; 
		this.y = y; 
	}
	public float getX() {
		return this.x; 
	}
	public void setX(float x) {
		this.x = x; 
	}
	public float getY() {
		return this.y; 
	}
	public void SetY(float y) {
		this.y = y; 
	}
	public void SetXY(float x, float y) {
		this.x = x; 
		this.y = y; 
	}
	public float[] getXY() {
		float[] result = new float[2]; 
		result[0] = this.x;
		result[2] = this.y; 
		return result; 
	}
	public String toString() {
		String result = ""; 
		result = String.format("(%f, %f)", x, y); 
		return result; 
	}
}
