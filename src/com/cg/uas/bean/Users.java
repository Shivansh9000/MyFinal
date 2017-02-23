package com.cg.uas.bean;

public class Users 
{

	private String loginid;
	private String password;
	private String role;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String loginid, String password, String role) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.role = role;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [loginid=" + loginid + ", password=" + password
				+ ", role=" + role + "]";
	}
	
}
	