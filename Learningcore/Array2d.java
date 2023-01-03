package learn_java;

import java.util.Scanner;

public class Array2d{

    public static void main(String[] args) {
        System.out.println("enter your lenth and width of your matrix: ");
        Scanner s = new Scanner(System.in);
        int matrix = s.nextInt();
        int matrix_height = s.nextInt();

        int a[][] = new int[matrix][matrix_height];

        System.out.println("enter your elements");
        for (int i=0; i<matrix; i++){
            for (int j=0; j<matrix_height; j++){
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("your 2d elements are : ");
        for (int i=0; i<matrix; i++){
            for (int j=0; j<matrix_height; j++){
                System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
    }
}