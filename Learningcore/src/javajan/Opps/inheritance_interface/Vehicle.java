package javajan.Opps.inheritance_interface;

public abstract class Vehicle {
		abstract void engineStart();   // abstract methods
		public abstract void noOfTyres();  // abstract method
		
		public void company() {            // normal/concret method
			System.out.println("RR");
		}
	}
