package Mytime;

public class TestMytime {
	public static void main(String[] args) {
		Mytime mytime1 = new Mytime(20,30,15); 
		System.out.println(mytime1.toString()); 
		mytime1.setTime(23, 59, 59); 
		System.out.println(mytime1.toString()); 
		mytime1.nextSecond(); 
		System.out.println(mytime1.toString()); 
		mytime1.nextHour(); 
		System.out.println(mytime1.toString()); 
		mytime1.nextMinute(); 
		System.out.println(mytime1.toString()); 
		mytime1.setTime(23,59,59); 
		mytime1.nextMinute(); 
		System.out.println(mytime1.toString()); 
	}
}
