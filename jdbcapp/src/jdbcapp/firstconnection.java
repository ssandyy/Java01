package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class firstconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver loading completed..!");
	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System", "manager");
	System.out.println("connection with Db successfully..!"+connection);

}
}


//O/P:
//	Driver loading process completed..!
//	Connection created successfully..! oracle.jdbc.driver.T4CConnection@6913c1fb