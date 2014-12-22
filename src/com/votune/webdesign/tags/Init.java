package com.votune.webdesign.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import com.votune.webdesign.beans.Page;
import com.votune.webdesign.util.Pages;

public class Init extends SimpleTagSupport {
	
	@Override
	public void doTag() {
		PageContext context = (PageContext) getJspContext();
		HttpServletRequest request = (HttpServletRequest) context.getRequest();
		Page page = Pages.getPage(request);
	}
}
