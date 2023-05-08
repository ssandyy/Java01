package javajan.Opps;

// Inheritance do have 4 types:
// Single level Inheritance 
// Multilevel Inheritance
//Hierarchial Inheritance
//Hybrid Inheritance


class Shape{
    public void area(){
        System.out.println("Display Area");
    }
    String color;
}

class Triangle extends Shape {    // Sigle level Inheritance
    public void area(int l, int b){
        System.out.println(1/2*l*b);
    }
}
class EquilateralTriangle extends Triangle {    // multilevel inheritance
    public void area(int l, int b){
        System.out.println(1/2*l*b);
    }
}
class Circle extends Shape{
    public void area(double r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
    	Triangle obj = new Triangle();
        obj.area(5,8);
    }
}
