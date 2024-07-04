package kalyan;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Oracle {
public static void main(String[] args) {
	try {
		OracleDriver d=new OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","SCOTT","TIGER");
		Statement stat = con.createStatement();
		ResultSet s = stat.executeQuery("SELECT * FROM EMP");
		
		while (s.next()) {
			System.out.println(s.getString(1));
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		
	}
}
}
