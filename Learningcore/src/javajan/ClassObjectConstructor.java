package javajan;

//--------------------- Example 1 -------------------------
//class Student{
//	String name;
//	int age;
//	
//	public void studentDetails() {
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//}
//
//public class ClassObjectConstructor {
//	
//	public static void main(String[] args) {
//		Student studentOne = new Student();
//		studentOne.name = "Hanu";
//		studentOne.age = 25;
//		
//		studentOne.studentDetails();
//	}
//
//}
//   O/P : Hanu
//			25

//-----------------------------------Example 2 -------------------------
//class Student{
//	String name;
//	int age;
//	
//	public void studentDetails() {
//		this.name = "Hanu";
//		this.age = 25;
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//}
//
//public class ClassObjectConstructor {
//	
//	public static void main(String[] args) {
//		Student studentOne = new Student();
//		studentOne.studentDetails();
//	}
//
//}
//
//O/P
//Hanu
//25



//---------------------------------Example 3  --------------------------------
//class Student{
//	String name;
//	int age;
//	
//	public void studentDetails(String name, int age) {
//		this.name = name;
//		this.age = age;
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//}
//
//public class ClassObjectConstructor {
//	public static void main(String[] args) {
//		Student studentOne = new Student();
//		studentOne.studentDetails("Ram", 202);
//	}
//}
//
//
//O/P
//Ram
//202




// ------------------------------ Example 4 ----------------------------
//class Student{
//	String name;
//	int age;
//	
//	public void studentDetails(String name, int age) {
//		this.name = name;
//		this.age = age;
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//	
//	// =========================  Constructor  ==========================
//	Student(){
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//}
//
//public class ClassObjectConstructor {
//	public static void main(String[] args) {
//		Student studentOne = new Student();
//		studentOne.studentDetails("Ram", 202);
//	}
//}
//
//
//O/P
//null
//0
//Ram
//202






//------------------------Example 5  ---------------------------
//class Student{
//	String name;
//	int age;
//	
//	public void studentDetails(String name, int age) {
//		this.name = name;
//		this.age = age;
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//	
//	// =========================  Constructor  ==========================
//	Student(String name, int age){
//		this.name = name;
//		this.age = age;
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//}
//
//public class ClassObjectConstructor {
//	public static void main(String[] args) {
//		Student studentOne = new Student("Hanu", 501);
//		studentOne.studentDetails("Ram", 202);
//	}
//}
//O/p
//Hanu
//501
//Ram
//202


//=========================  Copy Constructor  ==========================
class Student{
	String name;
	int age;
	
	public void studentDetails(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(Student studentTwo){
		this.name = studentTwo.name;
		this.age = studentTwo.age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(){}
}

public class ClassObjectConstructor {
	public static void main(String[] args) {
		Student studentOne = new Student();
		studentOne.studentDetails("Ram", 202);
		
		Student studentTwo = new Student(studentOne);
		
		Student studentThree = new Student(studentOne);
		Student studentFour = new Student(studentOne);
		Student studentFive = new Student(studentOne);
		
	}
}


//O/P
//Ram
//202
//Ram
//202
//Ram
//202
//Ram
//202
//Ram
//202
