package javajan;
import java.util.Scanner;

public class Array {
	public static void simpleArray() {
		int[] salary = new int[5];
		salary[0] = 15000;
		salary[1] = 18000;
		salary[2] = 21000;
		salary[3] = 10000;
		salary[4] = 50000;
		for(int i=0; i<salary.length;i++) { 
			  
			System.out.println(salary[i]);
		}
	}
	private static void userInputArray() {
		System.out.print("please enter array length: ");
		Scanner sc = new Scanner(System.in);
		int[] studentRoll = new int[sc.nextInt()];
			System.out.println("Enter your Array elements: ");
		
		for(int i=0; i<studentRoll.length; i++) {
			Scanner sca = new Scanner(System.in);
			studentRoll[i] = sca.nextInt();
//			System.out.println(studentRoll[i]);
			
			}
		System.out.print("Your Entered Array inputes are : ");
		for (int i = 0; i<studentRoll.length; i++) {
			System.out.print(studentRoll[i] + ", ");
		}
	}
	// Q. Take an array as input from the user. Search for a given number x and print the index at which it occurs.
	public static void arrayInputIndex() {
		System.out.print("Enter Array length: ");
		Scanner scn = new Scanner(System.in);
//		int num = sc.nextInt();
		int[] ar = new int[scn.nextInt()];
		
		System.out.println("Enter your array elements: ");
		for(int i=0; i<ar.length; i++) {
			Scanner sc = new  Scanner(System.in);
			ar[i] = sc.nextInt();
 		}
		System.out.print("Your Entered Array inputes are : ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+ ", ");
		}
		Scanner sk = new Scanner(System.in);
		System.out.println("\nplease enter number to search on array: ");
		int snumber = sk.nextInt();
		for(int i=0; i<ar.length; i++) {
			if(snumber==ar[i]) {
				System.out.println("your entered number is available at index: "+i);
				break;
			}else {
			System.out.println("Sorry, your searched input is not available in Array..!");
			}
		}
		
	}
	
	public static void main(String[] args) {
//		Array.simpleArray();  // since simple array is under static block so we can call it using class name 
		System.out.println("--------------Thank you !!--------------");
//		Array.userInputArray();
		System.out.println("--------------Thank you !!--------------");
		Array.arrayInputIndex();
	}
}
