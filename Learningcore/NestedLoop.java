package learn_java;

public class NestedLoop {

	public static void main(String[] args) {
		
		int num1=30, num2=40, num3=52;
		
		if(num1 > num2) {
			if(num1>num3) {
				System.out.println("Number 1 is greater..!");
			}else {
				System.out.println("Number 3 is greater..!");
			}
		}else {
				if(num2>num3) {
					System.out.println("Number 2 is greater..!");
				}else {
					System.out.println("Number 3 is greater..!");
				}
			}
		}
	}
