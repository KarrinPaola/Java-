package Caculate;

public class Caculate {
	
	public Caculate() {
		// TODO Auto-generated constructor stub
	}
	
	public int Sum(int a, int b) {
		return a + b; 
	}
	public int Multiple(int a, int b) {
		return a * b; 
	}
	public int Factorial(int n) {
		int answer = 1; 
		for(int i = 1; i<=n; i++) {
			answer *= i; 
		}
		return answer; 
	}
}
