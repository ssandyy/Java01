package javajan;

import java.util.Scanner;


public class Test {
    int a; String b;
    Test(){
        a=10;
        b="hello";
    }

    public static void main(String[] args) {
        simpleArray();
        // Test.simpleArray(); 
        Test obj = new Test();
        obj.constructorTesting();
    }
    void constructorTesting(){
        System.out.println(a+" "+b);
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
