package com.votune.webdesign.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.votune.webdesign.util.Data;

@WebServlet("/switchpage")
public class SwitchPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestedPage = request.getParameter("page");
		String page = Data.getPageUrl(requestedPage);
		System.out.println(page);
		request.getRequestDispatcher(page).include(request, response);
	}
}
