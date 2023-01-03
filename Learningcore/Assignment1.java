package learn_java;
// Write a Program to print sum of whole number between 0 to 10, then print sum of even number and odd number

public class Assignment1 {

	public static void main(String[] args)
	   {
		int evensum=0, oddsum=0;
	      System.out.println("Even numbers between 1 and 10: ");
	      for(int a = 1; a <= 10; a++)
	      {
	         if(a % 2 == 0)
	         {
	            System.out.print(a + " ");
	            evensum = evensum + a;
	         }
	         
	      }
	      System.out.print("sum of even number :" +evensum);
	      
	      System.out.println("\nOdd numbers between 1 and 10: ");
	      for(int a = 1; a <= 10; a++)
	      {
	         if(a % 2 != 0)
	         {
	            System.out.print(a + " ");
	            oddsum = oddsum + a;
	         }
	         
	      }
	      System.out.print("sum of odd number :" +oddsum);
	   }
}
