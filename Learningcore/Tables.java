package learn_java;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number to print table: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(num*i);
        }
    }
}
