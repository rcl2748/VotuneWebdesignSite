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
import com.votune.webdesign.util.UserClass;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("user");
			String password = request.getParameter("pass");
			if (username.matches(Data.USERNAME_REGEX) && password.matches(Data.USERNAME_REGEX)) {
				Statement statement = Data.SQL_CONNECTION.createStatement();
				ResultSet set = statement.executeQuery(String.format("SELECT * FROM users WHERE username='%s'", username));
				
				if (set.next()) {
					User user = new User(set.getString("username"), set.getString("password"), set.getString("email"), UserClass.getClassByLevel(set.getInt("rank")));
					request.getSession().setAttribute("user", user);
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
