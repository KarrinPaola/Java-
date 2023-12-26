package Caculate;

import java.util.Scanner;

public class TestCalculate {
	
	public static void main(String[] args) {
		int n; 
		do {
			Scanner scanner = new Scanner(System.in); 
			System.out.println("Bạn muốn tính cái gì: ");
			n = scanner.nextInt(); 
			while(n > 3 || n < 0) {
				System.out.println("Nhập sai, hãy nhập lại: ");
				n = scanner.nextInt(); 
			}
			Caculate caculate = new Caculate(); 
			switch (n) {
			case 1: {
				int a = scanner.nextInt(); 
				int b = scanner.nextInt(); 
				System.out.println(caculate.Sum(a, b)); 
				break; 
			}case 2: {
				int a = scanner.nextInt(); 
				int b = scanner.nextInt(); 
				System.out.println(caculate.Multiple(a, b)); 
				break; 
			}case 3: {
				int x = scanner.nextInt(); 
				System.out.println(caculate.Factorial(x));
				break; 
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
			System.out.println("Bạn có muốn tiếp tục tính toán: "); 
			n = scanner.nextInt(); 
		}while(n != 0); 
	}
}
