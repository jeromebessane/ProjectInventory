package org.orange.web.model;

import org.orange.metier.bean.User;

public class UserModele {
	
	private String login;
	private String password;
	private User user;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	

}
