package org.orange.metier;

import org.orange.metier.bean.User;

public interface IUser {
	public User getUserValidate(String login, String password);
	public void addUser(User user);
}
