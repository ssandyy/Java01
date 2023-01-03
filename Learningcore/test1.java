package learn_java;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        
    	int num;
        System.out.println("Enter your number :" );
        Scanner s = new Scanner(System.in);
       num = s.nextInt();
        
        
        for (int i=1; i<num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Sandeep Yadav");
                break;
            }else if(i%3==0){
                System.out.println("Sandeep");
                break;
            }else if(i%5==0){
                System.out.println("Yadav");
                break;
            }
            else {
            	System.out.println("Kumar");
            	
            }
        }
    }
}
