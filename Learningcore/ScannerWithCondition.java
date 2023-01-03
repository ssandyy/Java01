package learn_java;

import java.util.Scanner;

public class ScannerWithCondition {

	public void testPassword() {

		int k = -4;

		for (int q = 4; q >= k; q--) {
			String s = pwd();
			if (s.equals("12345")) {
				System.out.println("Welcome to pandora..!");
				break;
			} else if (q != k) {
				System.out.println("Wrong password..!, you have " + q + " attempt left, Please Enter your Password again ");
//				System.out.println("Wrong password..!, you have " + q + " attempt left, Please Enter your Password again "
//						+ "Value of K is::: " + k);
			} else {
				System.out.println("You have entered wrong password, and exeed your chance.!");
			}
			++k;
		}

	}

	public String pwd() {
		System.out.println("Enter your password: ");
		Scanner i = new Scanner(System.in);
		String s = i.nextLine();
		return s;
	}

	public static void main(String[] args) {
		ScannerWithCondition obj = new ScannerWithCondition();
		obj.testPassword();
	}
}
