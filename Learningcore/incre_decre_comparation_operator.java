package learn_java;

public class incre_decre_comparation_operator {
	
	int a=5, x=10, y=60, z=36;
	
		
		//Pre and Post 
		static void prePostOperator() {
			
			int a=5;
			System.out.println("Pre and Post");
			System.out.println(a++);	//a = 5       -->a= (a+1) =6
			System.out.println(++a);	//1+a=7       --> a=7
			System.out.println(a--);	//a = 7		  -->a= (a-1))= 6
			System.out.println(--a);	//a-1=5 	  --> a=5

		}
		
		// Relational Operators
		static void comparationOperator() {
			int a=5, x=10, y=60, z=36;
			System.out.println("Comparation Operators");
			System.out.println(x==y);
			System.out.println(x!=y);
			System.out.println(x>y);
			System.out.println(x<y);
			System.out.println(x<=y);
			System.out.println(x>=y);
			
			
		}
		
		// logical operator (AND, OR , NOT)
		static void logicOperator() {
			int x=10, y=60, z=36;
			System.out.println("logic operator..!");
			System.out.println(x>y && y>z);
			System.out.println(x>y || y>z);
			System.out.println(!(x>y));
		}
		
		
		
		
	public static void main(String[] args) {
		incre_decre_comparation_operator obj = new incre_decre_comparation_operator();
		obj.prePostOperator();
		obj.comparationOperator();
		obj.logicOperator();
	}
}
