package com.votune.webdesign.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.votune.webdesign.beans.NavPanelLink;
import com.votune.webdesign.beans.Page;

public class ServletListener implements ServletContextListener {
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Data.SQL_CONNECTION = DriverManager.getConnection(Data.SQL_URL, Data.SQL_USER, Data.SQL_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		Pages.PAGES.put(Pages.HOME_PAGE_URL, new Page("Cheapest custom Web Design store - Votune", "home.jsp", Permission.GUEST));
		Pages.PAGES.put(Pages.GALLERY_PAGE_URL, new Page("Web design gallery - Votune", "gallery.jsp", Permission.GUEST));
		Pages.PAGES.put(Pages.ORDER_PAGE_URL, new Page("Order a custom web design - Votune", "order.jsp", Permission.GUEST));

		Pages.NAVPANEL.add(new NavPanelLink(Pages.HOME_PAGE_URL, "Home", Permission.GUEST));
		Pages.NAVPANEL.add(new NavPanelLink(Pages.GALLERY_PAGE_URL, "Gallery", Permission.GUEST));
		Pages.NAVPANEL.add(new NavPanelLink(Pages.ORDER_PAGE_URL, "Order", Permission.GUEST));
		Pages.NAVPANEL.add(new NavPanelLink(Pages.REQUESTS_PAGE_URL, "Requests", Permission.DEV));
	}
}