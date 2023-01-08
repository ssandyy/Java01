package javajan;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter you name : ");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String r_name="";
		char c,d;
		
		for(int i=0;i<name.length();i++) {
			
			//System.out.println(c);
			for(int j=0;j<=i;j++) {
				int a=i;
				d=name.charAt(j+a);
				System.out.print(d);
				
			}
			System.out.println();
		}
		
		}

}




//public class StringReverse {
//
//	public static void main(String[] args) {
//		System.out.println("Enter you name : ");
//		Scanner sc = new Scanner(System.in);
//		String name=sc.nextLine();
//		String r_name="";
//		char c;
//		
//		for(int i=0;i<name.length();i++) {
//			c = name.charAt(i);
//			r_name=c+r_name;
//			System.out.println(r_name);
//		}
//		System.out.println("Reverse of rntered name: "+r_name);
//		
//		}
//
//}
