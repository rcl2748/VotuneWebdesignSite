package com.votune.webdesign.util;

import java.sql.Connection;

public class Data {
	public static final String USERNAME_REGEX = "[\\d\\w.-]+";
	
	public static final String SQL_URL = "jdbc:mysql://localhost:3306/test";
	public static final String SQL_USER = "root";
	public static final String SQL_PASSWORD = "";
	public static Connection SQL_CONNECTION;
}
