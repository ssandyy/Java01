

import java.util.Scanner;

public class dowhileloop {

//	public static int test() {
//		try {
////			System.out.println(5);
//			return 10;
//		} catch (Exception e) {
//			return 20;
//		} finally {
////			System.out.println(40);
//			return 30;
//		}
//	}

	public static void main(String[] args) {

		int num,k=1;
		int Int =10;
		
		System.out.println("Enter number to print table: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println(Int);
		
		do {
			System.out.println(num*k);
			k++;
		}
		while(k<=10);
		System.out.println("Thank you..!");
//		System.out.println(test());

	}
	
//	static int m2() {
//		System.out.println("Hello test "+ test());
//		return 50;
	}

