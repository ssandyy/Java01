package javajan;


class Pen{
//	private String color;
	String color1;
	String type;
	
//	public void setColor(String color) {
//		this.color = color;
//	}

	public void write(){
	    System.out.println("This is write function..!");
	}
	public void printColor(){
		System.out.println(this.color1);
	}
}


public class ClassObject {
	public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color1 = "red";
        pen1.type = "gel";
        
        Pen penTwo = new Pen();
        penTwo.color1 = "blue";
        
        pen1.printColor();
        penTwo.printColor();
        System.out.println("hello");
    }
}

