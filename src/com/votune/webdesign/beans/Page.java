package com.votune.webdesign.beans;

public class Page {
	private String name;
	private String url;
	private String title;
	private String tab;
	
	public Page(String name, String url, String title, String tab) {
		super();
		this.name = name;
		this.url = url;
		this.title = title;
		this.tab = tab;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getTab() {
		return tab;
	}
	
}
