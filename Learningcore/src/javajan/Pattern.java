package javajan;

//Solid Rectangle & Nested Loops
//Triangle
//Hollow Rectangle
//Half Pyramid
//Inverted half Pyramid
//Inverted & Rotated Half Pyramid
//Half Pyramid with Numbers
//Inverted Half Pyramid with Numbers
//Floyd's Triangle


public class Pattern {
	
	
	public static void invertedRotatedHalfPyramid(){
		int n = 10;
		for(int i=1; i<=n;i++) {

			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//-------------------------------------------------------------------------------------	
	
	public static void Pyramid(){
		int n = 10;
		for(int i=1; i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	O/P:
//        * 
//       * * 
//      * * * 
//     * * * * 
//    * * * * * 
//   * * * * * * 
//  * * * * * * * 
// * * * * * * * * 
//* * * * * * * * * 
	
//-----------------------------------------------------------------------------
	public static void invertedHalfPyramid() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	O/P:
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	
	
//========================================================================
	public static void hollowRectanglePattern() {
		int row = 5, col=8;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i==1 || j==1 || i==row || j==col) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
//	O/P:
//		********
//		*      *
//		*      *
//		*      *
//		********
	
//=====================================================================
	public static void rectanglePattern() {
		int row = 4, col = 7;
		for(int i=1; i<=row;i++) {
			for(int j=1; j<=col; j++) {
				System.out.print("* ");
				}
			}
	System.out.println();
		}

	
//	O/P:
//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
	
	
//---------------------------------------------------------------------------
	
//	public static void trianglePattern() {
//		int r = 5;
//		for(int i=1; i<=r;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	O/P:
//		*
//		**
//		***
//		****
//		*****
	
	public static void main(String[] args) {
//		Pattern pt = new Pattern();
//		pt.trianglePattern();
//		Pattern.trianglePattern();
//		Pattern.rectanglePattern();
//		Pattern.hollowRectanglePattern();
//		Pattern.invertedHalfPyramid();	
		Pattern.invertedRotatedHalfPyramid();
		
		
	}

}
