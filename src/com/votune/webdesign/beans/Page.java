package com.votune.webdesign.beans;

import com.votune.webdesign.util.Pages;
import com.votune.webdesign.util.Permission;

public class Page {
	private String title;
	private String contextUrl;
	private Permission permission;
	
	public Page(String title, String contextUrl, Permission permission) {
		this.title = title;
		this.contextUrl = contextUrl;
		this.permission = permission;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContextUrl() {
		return Pages.PAGE_PREFIX + contextUrl;
		
	}
	
	public Permission getPermission() {
		return permission;
	}
}
