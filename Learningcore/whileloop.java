package learn_java;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// most probably "while loop" is used in undefinite occurance
		int num;
		System.out.println("Enter number to check Odd or Even: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(num>=0){
			if (num%2 == 0){
				System.out.println(num+ " is an Even number..!");
			}
			else {
				System.out.println(num+ " is Odd number..!");
			}
			break;
		}
	}

}
