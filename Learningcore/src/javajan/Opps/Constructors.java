package javajan.Opps;

class Students{
    String name;
    int roll;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }

    // Non-parameterised constructor..!
    Students(){
        System.out.println("this is constructor..!");
    }

    // Parametrised constructor..!
    Students(String name, int age){
        this.name = name;
        this.roll = age;
        System.out.println("my name is : "+name+ " and my age is " +age+ " years");
    }
}


public class Constructors{
    public static void main(String[] args) {
        Students s1 = new Students("Sandeep", 4);
        s1.name="Juhi";
        s1.roll=5;
        s1.printInfo();
    }
}