package org.orange.metier.bean;

public class User {
	
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private int id;
	private boolean isAdmin;
	
	   
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

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

}
