package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Step1: Load driver
//Step2: connection establishment
//step3: statement deceleration
//step4: write and process query
//step5: close connection and open loop


public class statementwithscanner {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
//		Step1: Load driver
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded sucessfully..!");
// Step2: Connection with DB
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "manager");
		System.out.println("connection established successfully..!");
		
// Step3: Statement deceleration 
		statement = connection.createStatement();
		
		Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("Enter employee id : ");
				int empid = scanner.nextInt();
				System.out.println("Enter employee name: ");
				String ename = scanner.next();
				System.out.println("enter employee salary: ");
				double esalary = scanner.nextDouble();
				
//			statement.executeUpdate("insert into emp values(11,'asdf',565555)");
				String q = "insert into emp values("+empid+",'"+ename+"',"+esalary+" )";
				statement.executeUpdate(q);
				System.out.println("New entry updated successfully..!");
				
				System.out.println("Do you want to add more entries? : yes/no");
				String option = scanner.next();
				if(option.equals("no")) {
					System.out.println("Thank you !!");
					break;
				}
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
// step 5 : Resource close
				statement.close();
				connection.close();
				System.out.println("connection closed successfully..!");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
