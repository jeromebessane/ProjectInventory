package org.orange.metier;

import org.orange.metier.bean.User;

public interface IUser {
	public User getUserValidate(String login, String password);
	public User getDataUser(int idUser);
	public int checkField(String field, String data);
	public void addUser(User user);
	public Boolean changeField(int idUser, String field);
	public void changeData(int idUser, String field, String new_data);
}
