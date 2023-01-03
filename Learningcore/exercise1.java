package learn_java;

import java.net.SocketPermission;
import java.util.Scanner;

public class exercise1 {
    public static void main() {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("Enter your number :" +num);
        for (int i=1; i<num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Sandeep Yadav");
            }else if(i%3==0){
                System.out.println("Sandeep");
            }else if(i%5==0){
                System.out.println("Yadav");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
