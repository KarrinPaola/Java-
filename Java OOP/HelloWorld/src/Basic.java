import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.synth.Region;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lê Trung Hiếu");
		System.out.println("Welcome to Karin's World");
		
//Input Function
		//Example 1: Sum of two number 
//		Scanner sc = new Scanner(System.in); 
//		int a = sc.nextInt(); 
//		int b = sc.nextInt(); 
//		System.out.println("a + b = " + (a+b));
		
		//Example 2: Tính phần dư của phép chia hai số 
//		Scanner sc = new Scanner(System.in); 
//		int a = sc.nextInt(); 
//		int b = sc.nextInt(); 
//		System.out.println("a % b = " + (a%b));
		
		//Example 3: Input Name and Age 
//		Scanner scanner = new Scanner(System.in); 
//		String name = scanner.next(); 
//		int ageNow = scanner.nextInt(); 
//		System.out.println("In 15 years, age of " + name + " will be " + (15+ageNow)); 
		
		//Example 4: Swap value of two variables 
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt();
//		int b = scanner.nextInt(); 
//		//Swapping 
//		int c = a; 
//		 a = b; 
//		 b = c; 
//		System.out.println("after swapping, a = " + a + ", b = " + b); 
		
		//Example 5: Calculate the Circumference of that circle 
//		Scanner scanner = new Scanner(System.in); 
//		double r = scanner.nextDouble(); 
//		double pi = 3.14; 
//		System.out.println("Circumference = " + (r*2*pi)); 
		
		//Example 6: Display the next character
		//Scanner don't provide a facility to accept a char data 
		//-> Input like a string and take the first character by function "charAt()"
//		Scanner scanner = new Scanner(System.in); 
//		char a = scanner.next().charAt(0); 
//		System.out.println((char)(a+1)); 
		
		//Example 7: Compare two numbers to find which is greater
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt(); 
//		int b = scanner.nextInt(); 
//		boolean c = (a>b); 
//		System.out.println(c); 
		
		//Example 8: How to input a string with space 
//		Scanner scanner = new Scanner(System.in); 
//		String string = scanner.nextLine(); 
//				
//		System.out.print(string);
		
//Convert Type data
//		//Example 1: Convert from string to int 
//		Scanner scanner = new Scanner(System.in); 
//		String str = scanner.next(); 
//		int x = Integer.parseInt(str);
//		System.out.println(x); 
		
//If - else 
		//Example 1: Check odd or even
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt();  
//		if(a % 2 == 0) {
//			System.out.println(a + " is an even number"); 
//		}else {
//			System.out.println(a + " is an odd number"); 
//		}
		
		//Example 2: Check positive or negative number
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt(); 
//		if (a > 0) {
//			System.out.println("n is a positive number"); 
//		}else if (a < 0) {
//			System.out.println("n is a negative number"); 
//		}else {
//			System.out.println("n is equal to 0"); 
//		}
		
		//Example 3: Checks whether these two names are the same or not.
//		Scanner scanner = new Scanner(System.in); 
//		String name1 = scanner.next(); 
//		String name2 = scanner.next(); 
//		//In Java, instead of using == operator to compare String, we use "equals" 
//		if (name1.equals(name2)) {
//			System.out.println("two people have the same name");
//		}else {
//			System.out.println("two people don't have the same name");
//		}
		
		//Example 4: The greatest number among three numbers
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt(); 
//		int b = scanner.nextInt(); 
//		int c = scanner.nextInt(); 
//		if (a >= c) {
//			if(a >= b) {
//				System.out.println(a);
//			}else if(b >= a) {
//				System.out.println(b); 
//			}
//		}else {
//			System.out.println(c); 
//		}
		
		//Example 5: Check a is in the range [10,100] or not
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt(); 
//		if(a >= 10 && a<= 1000) {
//			System.out.println(a + " is in the range [10, 100]"); 
//		}else {
//			System.out.println(a + " is not in the range [10, 100]");
//		}
		
		//Example 6: Check Score of Student 
//		Scanner scanner = new Scanner(System.in); 
//		int n = scanner.nextInt(); 
//		if(n < 0 || n > 10) {
//			System.out.println("The score is not valid"); 
//		}else {
//			System.out.println("The score is valid"); 
//		}
		
		//Example 7: Determine in which quadrant the point (x, y) lies.
//		Scanner scanner = new Scanner(System.in); 
//		int x = scanner.nextInt(); 
//		int y = scanner.nextInt(); 
//		if(y > 0) {
//			if(x > 0) {
//				System.out.println("This point lies in the First quadrant"); 
//			}else {
//				System.out.println("This point lies in the Second quadrant"); 
//			}
//		}else {
//			if(x > 0) {
//				System.out.println("This point lies in the Fourth quadrant"); 
//			}else {
//				System.out.println("This point lies in the Third quadrant"); 
//			}
//		}
		
//Arrays 
		//Example 1: How to declare an arrays 
//		int[] newArr = new int[5]; 
//		String[] newArr1 = new String[5]; 
//		newArr1[0] = "hello";  
//		String x = newArr1[0]; 
		
		//Sort in array 
		int[] x = {-99,4,6,3,5,3,2,4,6,3}; 
		Arrays.sort(x, 2 , 5); //Sort form index a to b
		for(int i : x) {
			System.out.print(i + " "); 
		}
		
//Loop - For 
		//Example 1: Display all the numbers from 1 to n
//		Scanner scanner = new Scanner(System.in); 
//		int n = scanner.nextInt(); 
//		for(int i = 1; i<= n; i++) {
//			System.out.print(i); 
//		}
		
		//Example 2: Sum of all numbers from a to b 
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt(); 
//		int b = scanner.nextInt(); 
//		int sum = 0; 
//		for(int i = a; i<=b; i++) {
//			sum+=i; 
//		}
//		System.out.println(sum); 
		
//Sets and Lists
		//HashSet is unordered
//		Set<Integer> tIntegers = new HashSet<Integer>(); 
//		tIntegers.add(5); 
//		tIntegers.add(7); 
//		tIntegers.add(10); 
//		tIntegers.add(5); 
//		tIntegers.add(-8);
//		System.out.println(tIntegers); 
//		System.out.println(tIntegers.size()); 
//		tIntegers.contains(10); 
//		System.out.println(tIntegers.contains(9)); 
//		tIntegers.clear();
//		System.out.println(tIntegers); 
//		System.out.println(tIntegers.isEmpty()); 
//		
//		System.out.println("--------------------------"); 
//		
//		//TreeSet is ordered
//		Set<Integer> tIntegers2  = new TreeSet<Integer>();
//		tIntegers2.add(5); 
//		tIntegers2.add(7); 
//		tIntegers2.add(10); 
//		tIntegers2.add(5); 
//		tIntegers2.add(-8); 
//		System.out.println(tIntegers2); 
//		System.out.println(tIntegers2.size()); 
//		tIntegers2.contains(10); 
//		System.out.println(tIntegers2.contains(10)); 
//		//tIntegers2.clear();
//		System.out.println(tIntegers2); 
//		System.out.println(tIntegers2.isEmpty()); 
//		
//		//Iterating over elements 
//		System.out.println("Iterating over elements using Iterator:");
//		Iterator<Integer> iterator = tIntegers2.iterator(); 
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next() + " ");
//		}
//		
//		//Iterate over elements using for-each loop
//		System.out.println("\nIterating over elements using for-each loop:");
//		for(int x : tIntegers2) {
//			System.out.print(x + " ");
//		}
		
//List 
		//Same as Vector - It can expand automatically - And you can access to element by index like t[1]
//		ArrayList<Integer> tArrayList = new ArrayList<Integer>(); 
//		tArrayList.add(1); 
//		tArrayList.add(10); 
//		tArrayList.add(1); 
//		tArrayList.add(10); 
//		tArrayList.add(1); 
//		tArrayList.add(10); 
//		tArrayList.get(0); 
//		System.out.println(tArrayList.get(0)); //Return value of element at this index
//		tArrayList.set(1, 20); //This's used to change value of an exist element
//		tArrayList.size(); 
//		System.out.println(tArrayList); 
//		tArrayList.subList(0, 3); 
//		tArrayList.remove(4); //Remove element at "index"
//		System.out.println(tArrayList.contains(10)); 
//		System.out.println(tArrayList.subList(0, 3));
//		System.out.println(tArrayList.indexOf(10));
//		System.out.println(tArrayList.lastIndexOf(10));
//		tArrayList.clear();
//		System.out.println(tArrayList);
//		
//		//It is Linked List you have learned before 
//		LinkedList<Integer> tLinkedList = new LinkedList<Integer>(); 
//		tLinkedList.add(1); 
//		tLinkedList.addFirst(10); 
//		tLinkedList.addLast(1); 
//		tLinkedList.add(10); 
//		System.out.println(tLinkedList.getFirst());
//		tLinkedList.add(1); 
//		tLinkedList.add(10); 
//		System.out.println(tLinkedList.getLast());
//		tLinkedList.get(0); 
//		System.out.println(tLinkedList.get(0)); //Return value of element at this index
//		tLinkedList.set(1, 20); //This's used to change value of an exist element
//		tLinkedList.size(); 
//		tLinkedList.subList(0, 3); 
//		System.out.println(tLinkedList.subList(0, 3));
//		System.out.println(tLinkedList);
		
//Map and HashMaps
		//HashMap - Thứ tự của các key là ngẫu nhiên (Sử dụng cơ chế băm)
//		Map map = new HashMap<String, String>(); 
//		map.put("Lê Hiếu", "Đẹp Zai"); 
//		map.put("Trung Nguyễn", "Óc bò"); 
//		System.out.println(map.get("Lê Hiếu"));
//		System.out.println(map.containsKey("Lê Hiếu"));
//		System.out.println(map.containsValue("Đẹp Zai"));
//		System.out.println(map.keySet()); 
//		System.out.println(map.values()); 
//		System.out.println(map.entrySet()); 
//		
//		//TreeMap - Duy trì thứ tự tăng dần của Key (Tiện duyệt và tìm) 
//		Map map2 = new TreeMap<String, Integer>(); 
//		map2.put("Hoàng Anh", 10); 
//		map2.put("Lê Hiếu", 100); 
//		//Có đủ các phương thức của HashMap nhưng được bổ sung thêm 
//		//Lấy phần tử lớn hơn và nhỏ hơn một key cho trước:
//		System.out.println(((TreeMap<String, Integer>) map2).higherKey("Lê Hiếu"));
//		System.out.println(((TreeMap<String, Integer>) map2).lowerKey("Lê Hiếu"));
//		//Lấy tất cả các phần tử nhỏ hơn key cho trước:
//		System.out.println(((TreeMap<String, Integer>) map2).headMap("Lê Hiếu"));
//		//Lấy tất cả các phần tử lớn hơn key cho trước:
//		System.out.println(((TreeMap<String, Integer>) map2).tailMap("Hoàng Anh"));
//		System.out.println(((TreeMap<String, Integer>) map2).firstKey());
//		System.out.println(((TreeMap<String, Integer>) map2).lastKey());
//		
//		//LinkedHashMap - Duy trì thứ tự key được thêm vào 
//		Map map3 = new LinkedHashMap<String, Double>(); 
//		//Các phương thức tương tự như hai cái trên 
//		
//		//Example 
//		Map map4 = new HashMap<Character, Integer>(); 
//		String string = "hello, my name is Hieu and I am very handsome"; 
//		
//		for(char x : string.toCharArray()) {
//			if(map4.containsKey(x)) {
//				int old = (int) map4.get(x); 
//				map4.put(x, old+1); 
//			}else {
//				map4.put(x, 1); 
//			}
//		}
//		System.out.println(map4); 
	}
}
