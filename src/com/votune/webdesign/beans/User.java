package com.votune.webdesign.beans;

import com.votune.webdesign.util.UserClass;

public class User {
	
	private String name;
	private String password;
	private String email;
	private UserClass userClass;
	
	public User() {
		
	}
	
	public User(String name, String password, String email, UserClass userClass) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.userClass = userClass;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserClass getUserClass() {
		return userClass;
	}
	
	public void setUserClass(UserClass userClass) {
		this.userClass = userClass;
	}
	
}