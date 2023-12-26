package Point;

public class MovablePoint extends Point{
	private float xSpeed = 0.0f; 
	private float ySpeed = 0.0f; 
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		// TODO Auto-generated constructor stub
		this.x = x; 
		this.y = y; 
		this.xSpeed = xSpeed; 
		this.ySpeed = ySpeed; 
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		// TODO Auto-generated constructor stub
		this.xSpeed = xSpeed; 
		this.ySpeed = ySpeed;
	}
	public MovablePoint() {
		// TODO Auto-generated constructor stub
	}
	public float getXSpeed() {
		return this.xSpeed; 
	}
	public float getYSpeed() {
		return this.ySpeed; 
	}
	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed; 
	}
	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed; 
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed; 
		this.ySpeed = ySpeed; 
	}
	public float[] getSpeed() {
		float[] result = new float[2]; 
		result[0] = xSpeed; 
		result[1] = ySpeed; 
		return result; 
	}
	public String toString() {
		String resultString = ""; 
		resultString = String.format("%s, speed = (%f, %f)",super.toString(), this.xSpeed, this.ySpeed ); 
		return resultString; 
	}
	public MovablePoint move() {
		this.x += xSpeed; 
		this.y += ySpeed; 
		this.xSpeed = 0; 
		this.ySpeed = 0; 
		return this; 
	}
	
}
