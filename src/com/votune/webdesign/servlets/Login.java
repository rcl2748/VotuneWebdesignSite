package com.votune.webdesign.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.votune.webdesign.util.Data;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			if ()
			Statement statement = Data.SQL_CONNECTION.createStatement();
			ResultSet set = statement.executeQuery("SELECT * FROM users WHERE");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
