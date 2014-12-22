package com.votune.webdesign.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.votune.webdesign.beans.User;
import com.votune.webdesign.util.Data;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("user");
			String password = request.getParameter("pass");
			if (username.matches(Data.USERNAME_REGEX) && password.matches(Data.USERNAME_REGEX)) {
				Statement userStatement = Data.SQL_CONNECTION.createStatement();
				ResultSet userSet = userStatement.executeQuery(String.format("SELECT * FROM users WHERE username='%s'", username));
				Statement permStatement = Data.SQL_CONNECTION.createStatement();
				ResultSet permSet = permStatement.executeQuery(String.format("SELECT Permission FROM permissions WHERE username='%s'", username));
				
				
				if (userSet.next()) {
					User user = new User(userSet.getString("username"), userSet.getString("password"), userSet.getString("email"), UserClass.getClassByLevel(userSet.getInt("rank")));
					request.getSession().setAttribute("user", user);
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
