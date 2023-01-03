package learn_java;

import java.util.Arrays;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
		// int arr[] = {4,5,8,6,9,2};
		// for (int b : arr) {
		// 	System.out.print(b+" ");
		// }

			System.out.println("enter your array size");
			Scanner s = new Scanner(System.in);
			int size = s.nextInt();

			int x[] = new int[size];
			System.out.println("enter your "+size+ "array elements: ");
			for (int i=0; i<size; i++){
				x[i] = s.nextInt();
			}
			Arrays.sort(x); // this use to sort the entered random elements in ascending order.
			System.out.println("your elements are :");
			for (int j=0; j<size; j++){
				System.out.println(x[j]);
			}
			
			

	}

}
