package com.votune.webdesign.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			Class.forName("org.mysql.jdbc.Driver");
			Data.SQL_CONNECTION = DriverManager.getConnection(Data.SQL_URL, Data.SQL_USER, Data.SQL_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}