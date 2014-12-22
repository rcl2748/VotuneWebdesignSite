package com.votune.webdesign.beans;

import com.votune.webdesign.util.Permission;

public class NavPanelLink {
	private String link;
	private String title;
	private Permission permission;
	
	public NavPanelLink() {
		
	}
	
	public NavPanelLink(String link, String title, Permission permission) {
		this.link = link;
		this.title = title;
		this.permission = permission;
	}
	
	public String getLink() {
		return link;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Permission getPermission() {
		return permission;
	}
	
}
