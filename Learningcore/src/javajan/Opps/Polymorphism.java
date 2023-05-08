package javajan.Opps;


class Student{
    String name;
    int age, roll;
    public void Student(String name, int roll){
        System.out.println("My name is " +name+ " and my roll is : " +roll);
    }
    public void Student(String name){
        System.out.println("My name is "+name);
    }
    public void Student(int roll){
        System.out.println("My roll is "+roll);
    }
}



public class Polymorphism{
    public static void main(String[] args) {
        System.out.println("Hello..!");
       Student obj = new Student();
        obj.Student("Harry", 12);
        obj.Student(22);
        obj.Student("SSANDYY");
    }
}