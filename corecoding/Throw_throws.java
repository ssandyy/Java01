//  'throws' Keyword is use to by-pass the excetion so that on other call method it can be handled by try-catch 


// Case 4:
import java.io.*;
public class Throw_throws{
	void studentDetails() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Sandy is coding..!");
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("abc.txt");
	}
	void hod() throws InterruptedException, FileNotFoundException{
			studentDetails();
	}
	void principal() throws FileNotFoundException
	{		try{
				hod();
			}catch(InterruptedException i){
				i.printStackTrace();
			}
	}
	void officeBoy()
	{	try{
		principal();
		}catch (FileNotFoundException f){
			f.printStackTrace();
			//Thread.sleep(2000);
			System.out.println("Exception is handled file not found..!");
		}
	}
	public static void main(String[] args){
		Throw_throws t = new Throw_throws();
		t.officeBoy();
	}
}





// Case 3:
// Note: One method can handle multiple Exception at a time
/*
import java.io.*;
public class Throw_throws{
	void studentDetails() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Sandy is coding..!");
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("abc.txt");  
	}
	void hod() throws InterruptedException, FileNotFoundException{
			studentDetails();
	}
	void principal() throws InterruptedException, FileNotFoundException
	{	
			hod();
	}
	void officeBoy()
	{	try{
		principal();
		}catch (InterruptedException | FileNotFoundException f){
			f.printStackTrace();
		}
	}
	public static void main(String[] args){
		Throw_throws t = new Throw_throws();
		t.officeBoy();
	}
}
*/



// Case 2:
// Note: If 'main()' throws exception then JVM will handle exception
/*
public class Throw_throws{
	void studentDetails() throws InterruptedException
	{
		System.out.println("Sandy is coding..!");
		Thread.sleep(2000);
		System.out.println("Sandy's code get executed sucessfully..!");
	}
	void hod() throws InterruptedException{
			studentDetails();
	}
	void principal() throws InterruptedException 
	{
		hod();
	}
	void officeBoy() throws InterruptedException 
	{
		principal();
	}
	public static void main(String[] args)throws InterruptedException {
		Throw_throws t = new Throw_throws();
		t.officeBoy();
	}
}

*/


/*

CASE 1:
Note: Unchecked exception are automatically propagated, But checked exception are propagated using 'throws' keywords.

public class Throw_throws {
	void studentDetails() throws InterruptedException
	{
		System.out.println("Sandy is coding..!");
		Thread.sleep(2000);
		System.out.println("Sandy's code get executed sucessfully..!");
	}
	void hod()throws IntruptedExpection {
			studentDetails();
	}
	void principal() {
		try{
		hod();
		}
		}catch(InterruptedException i){
			i.printStackTrace();
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

output: 
Sandy is coding..!
Sandy's code get executed sucessfully..!
*/