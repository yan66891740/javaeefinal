package com.iotek.ssm.entity;

public class User {
	
	private int uId;
	private String username;
	private String password;
	private int type;
	
	public User() {
		super();
	}

	public User(String username, String password, int type) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public User(int uId, String username, String password, int type) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", username=" + username + ", password=" + password + ", type=" + type + "]";
	}

}
