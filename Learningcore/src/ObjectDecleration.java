

class X {}
class Emp {}


class ObjectDecleration {
	

void method1(X x, Emp e) {
	System.out.println("this is method 1.");
}
static void method2() {
	System.out.println("this is method 2..");
}


	public static void main(String[] args) {
		ObjectDecleration t = new ObjectDecleration();
		t.method1(new X(), new Emp()); // non static method under static block
		method2(); // static method under static block 
	} 
}
