

public class variable {
	
	int num1 = 2;		//Instance
	int num2 = 4;        //Instance
	static int num3 = 6;	//Static
	static int num4 = 8;	//Static
	
	
	static void m1() {
//		System.out.println(num1); // can't access as this is static block and variable is instance.
//		System.out.println(num2); // can't access as this is static block and variable is instance.
		System.out.println(num3);
		System.out.println(num4);
	}
	
	
	
	public static void main(String[] args) {
		m1(); // Static method calling in static block/class so no need for Object 
	}

}
