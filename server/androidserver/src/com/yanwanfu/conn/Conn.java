package com.yanwanfu.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**database connection*/
public class Conn {
	public Connection getConn(){
		
		try {
			//load JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			//androiduser: database name;
			String url = "jdbc:mysql://localhost/androiduser?useUnicode=true&characterEncoding=utf-8";
			String user="root";
			String password="";
			Connection conn=DriverManager.getConnection(url,user,password);
			//test
			System.out.println(conn.getMetaData().getURL());
			return conn;			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		return null;		
	}

}
