package learn_java;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
	
		int s,k,y,ch;
		System.out.println("Enter two numbers : ");
		Scanner num = new Scanner(System.in);
		s = num.nextInt();
		k = num.nextInt();
		
		System.out.println("please enter your choice(1=>add; 2=>sub; 3=>mult); 4=>div: ");
		ch = num.nextInt();
		
			switch(ch) {
				case 1:y=s+k;
				System.out.println("Addition of " +s+ "+" +k+ "= "+y);
				break;
				
				case 2:y=s-k;
				System.out.println("Substraction of " +s+ "-" +k+ "= "+y);
				break;
				
				case 3:y=s*k;
				System.out.println("Multiplication of " +s+"*"+k+ "= "+y);
				break;
				
				case 4:y=s/k;
				System.out.println("Division of " +s+"/" +k+ "= "+y);
				break;
				
				case 5:y=s%k;
				System.out.println("Remainder/Modules of " +s+"%" +k+ "= "+y);
				break;
				
				default:
				System.out.println("Error in your entry..!");
				break;
				}
	}

}
