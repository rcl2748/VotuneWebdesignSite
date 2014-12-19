package com.votune.webdesign.util;

import java.util.HashMap;
import java.util.Map;

public enum UserClass {
	
	USER(1), MOD(2), ADMIN(3);
	
	private int level;
	
	private static Map<Integer, UserClass> classes = new HashMap<Integer, UserClass>();
	
	static {
		for (UserClass userClass : UserClass.values()) {
			classes.put(userClass.getLevel(), userClass);
		}
	}
	
	private UserClass(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public static UserClass getClassByLevel(int level) {
		return classes.get(level);
	}
}
