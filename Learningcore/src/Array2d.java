import java.util.Scanner;

public class Array2d{
	public static void main(String[] args) {
        System.out.println("enter your lenth and width of your matrix: ");
        Scanner s = new Scanner(System.in);
        int matrix_row = s.nextInt();
        int matrix_column = s.nextInt();
        int a[][] = new int[matrix_row][matrix_column];
        System.out.println("enter your elements");
        
        for (int i=0; i<matrix_row; i++){
            for (int j=0; j<matrix_column; j++){
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("your 2d elements are : ");
        for (int i=0; i<matrix_row; i++){
            for (int j=0; j<matrix_column; j++){
                System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
    }
}