package newapp_crud;

import java.sql.SQLException;

public class EmployeeApplication {

	private static EmployeeOps ops = new EmployeeOps();
	
	public static void main(String[] args) throws SQLException {
		EmployeeApplication.getEmpDetails();
	}
	
	public static void addEmpDetails() throws SQLException{
		Employee employee = ops.getUserInput();
		employee = ops.save(employee);
		System.out.println("Entered Employee : "+employee);
	}
	
	public static void updateEmpDetails() throws SQLException{
		Integer id = ops.getIdFromUser();
		Employee employee = ops.getUserInput();
		employee.setEmpId(id);
		employee = ops.update(employee);
		System.out.println("Details of "+id+"got updated successfully : "+employee);
	}
	
	public static void getEmpDetails() throws SQLException{
		Integer id = ops.getIdFromUser();
		Employee employee = ops.getUserInput();
		employee.setEmpId(id);
		employee = ops.retrieve(id);
		System.out.println("Employee details of "+id+" find below: "+employee);
		
	}

	public static void deleteEmployee() throws SQLException {
		Integer id = ops.getIdFromUser(); 
		Employee employee = ops.getUserInput();
		ops.delete(id);
//		employee = ops.delete(employee);
		System.out.println("Employee id "+id+" details successfully got deleted from database..!");
		
	}
	
	public static void listEmployee() throws SQLException {
		Employee employee = ops.getUserInput();
		ops.list();
		System.out.println("Details available on database: "+employee);
	}
	
	
}
