package com.votune.webdesign.beans;

import java.util.ArrayList;
import java.util.List;
import com.votune.webdesign.util.Permission;

public class User {
	
	private String name;
	private String password;
	private String email;
	private List<Permission> permissions = new ArrayList<Permission>();
	
	public User() {
		
	}
	
	public User(String name, String password, String email, List<Permission> permissions) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.permissions = permissions;
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
	
	public List<Permission> getPermissions() {
		return permissions;
	}
	
	public void addPermission(Permission permission) {
		this.permissions.add(permission);
	}
}