package com.votune.webdesign.util;

public enum UserClass {
	
	USER(1), MOD(2), ADMIN(3);
	
	private int level;
	
	private UserClass(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
}
