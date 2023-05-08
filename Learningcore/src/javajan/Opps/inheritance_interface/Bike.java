package javajan.Opps.inheritance_interface;

public class Bike extends Vehicle{
	@Override
	void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("Enginee Start with Kick..!");
	}
	
	@Override
	public void noOfTyres() {
		// TODO Auto-generated method stub
		System.out.println("Bike usually do have 2 tyres..!");
	}
}
