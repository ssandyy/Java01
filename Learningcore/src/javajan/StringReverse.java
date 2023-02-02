package javajan;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		System.out.print("Enter you name : ");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String r_name="";
		char c;
		
		for(int i=0;i<name.length();i++) {
			c = name.charAt(i);
			r_name=c+r_name;
//			System.out.println(r_name);
		}
		System.out.println("Reverse of entered name: "+r_name);
		}

}
