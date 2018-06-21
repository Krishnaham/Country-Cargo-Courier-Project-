package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	static Connection con = null;
	
	public static Connection getConnection()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			if(con!=null)
			{
				System.out.println("connected");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	

}
