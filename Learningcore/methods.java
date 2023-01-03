package learn_java;

import java.util.Scanner;

public class methods {
	public static void main(String[] args) {
		method1(); // dont need to create object for static method
		
//		method2();      for non-static we have to create obj to call a method
//		method3();
		methods obj = new methods();
		obj.method2(10,50);
		obj.method3();
		
		
		
	}
	
	static void method1() {
		System.out.println("This is method 1..!");
	}
	
	int method2(int a,int b) {
		return a+b; 
	}
	
	String method3() {
		String s;
		System.out.println("enter your name: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		return s;
	}
}
