package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class trycatch {

	public static void main(String[] args) {
		Connection connection  = null;
		Statement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "manager");
			
			System.out.println("Successfull connection with database...!");
			
			String q1 = "insert into emp values(111, 'rajeev', 15000)";
			String q2 = "insert into emp values(112, 'raj', 18000)";
			String q3 = "insert into emp values(113, 'raju', 20000)";
			String q4 = "insert into emp values(114, 'rajendra', 19000)";
			
			st = connection.createStatement();
			st.executeUpdate(q1);
			st.executeUpdate(q2);
			st.executeUpdate(q3);
			st.executeUpdate(q4);
			System.out.println("Data inserted successfully..!");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				if(st!=null && connection!=null) {
					st.close();
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
