package javajan;

public class ClassObject {
	
	
	public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
    }
}
class Pen{
String color;
String type;

public void write(){
    System.out.println(this.color);
    System.out.println(this.type);
}
}
