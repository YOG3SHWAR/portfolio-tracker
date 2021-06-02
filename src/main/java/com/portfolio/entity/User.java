package com.portfolio.entity;

public class User {
	private int uId;
	private String name;
	private String email;

	public User() {

	}

	public User(int uId, String name, String email) {
		super();
		this.uId = uId;
		this.name = name;
		this.email = email;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [uId=" + uId + ", name=" + name + ", email=" + email + "]";
	}

}
