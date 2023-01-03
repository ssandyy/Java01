package jdbcapp;

import newapp_crud.DBHandler;

public class preparestatementwithscanner {

	public static void main(String[] args) throws ClassNotFoundException {
		DBHandler db=new DBHandler();
		db.loadDriver();
}
}