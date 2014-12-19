package com.votune.webdesign.util;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class Data {
	public static final String USERNAME_REGEX = "$[\\d\\w.-]+^";
	
	public static final String SQL_URL = "";
	public static final String SQL_USER = "";
	public static final String SQL_PASSWORD = "";
	public static Connection SQL_CONNECTION;
	public static final Map<String, String> PAGES = new HashMap<String, String>();
	public static final String PAGE_PREFIX = "pages/";
	
	public static String getPageUrl(String request) {
		if (request != null && PAGES.keySet().contains(request)) {
			return PAGE_PREFIX + PAGES.get(request);
		} else {
			return PAGE_PREFIX + PAGES.get("error");
		}
	}
}
