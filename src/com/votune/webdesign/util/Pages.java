package com.votune.webdesign.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.votune.webdesign.beans.NavPanelLink;
import com.votune.webdesign.beans.Page;

public class Pages {
	public static final Map<String, Page> PAGES = new HashMap<String, Page>();
	public static final List<NavPanelLink> NAVPANEL = new ArrayList<NavPanelLink>();
	public static final Page ERROR404 = new Page("404 - Page not found", "404.jsp", Permission.ALL);
	public static final Page ACCESS_DENIED = new Page("Access Denied", "noaccess.jsp", Permission.ALL);
	public static final String PAGE_PREFIX = "pages/";

	public static final String HOME_PAGE_URL = "/";
	public static final String GALLERY_PAGE_URL = "/web-design-gallery";
	public static final String ORDER_PAGE_URL = "/order-web-design";
	public static final String REQUESTS_PAGE_URL = "/requests";
	
	public static Page getPage(HttpServletRequest request) {
		String url = request.getRequestURI();
		if (url != null && PAGES.containsKey(url)) {
			return PAGES.get(url);
		} else {
			return PAGES.get("/404");
		}
	}
}
