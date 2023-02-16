package javajan;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Test.simpleArray(); 
        minMaxArrayElement();
    }


//Question:  take input from user and define an array
    public static void simpleArray(){
        System.out.println("enter your array length: ");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int array[] = new int[array_size];
    
        for(int i = 0; i<array_size;i++){
            System.out.println("Enter your array elements: ");
            array[i] = sc.nextInt();
        }
        for (int i=0; i<array_size; i++){
            System.out.print(array[i] +",");
        }
        sc.close();
    }


     
}
