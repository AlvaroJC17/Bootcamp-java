package dbConnection.ds;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

	static Connection c;
	
	public static Connection Conectar() {
		
		try {
			 c = DriverManager.getConnection("jdbc:mysql://localhost/supermercado", "root", "17911977");
		
		} catch (Exception e) {
			System.out.println("No conectado a la base de datos...");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return c;
	}
}
