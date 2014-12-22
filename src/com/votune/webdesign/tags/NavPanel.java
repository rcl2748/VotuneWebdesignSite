package com.votune.webdesign.tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import com.votune.webdesign.beans.Page;

public class NavPanel extends SimpleTagSupport {
	
	public void doTag() {
		JspWriter write = getJspContext().getOut();
		Page page = (Page) getJspContext().getAttribute("page");
		
	}
}
