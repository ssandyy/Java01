package com.tcs;

public class Throw_throws {
	void studentDetails() throws InterruptedException
	{
		System.out.println("Sandy is coding..!");
		Thread.sleep(2000);
		System.out.println("Sandy's code get executed sucessfully..!");
	}
	void hod() throws InterruptedException
	{
		studentDetails();
	}
	
	void principal() {
		try {
			hod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void officeBoy() {
		principal();
	}
	
	public static void main(String[] args) {
		Throw_throws t = new Throw_throws();
		t.officeBoy();
	}

}
