package org.orange.metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.orange.metier.bean.User;

public class ImplementationUser implements IUser {

	@Override
	public User getUserValidate(String login, String password) {
		User user=null;
		Connection connection=SingletonConnection.getConnection();

		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM users WHERE login = '"+login+"' AND password = SHA1('"+password+"');");
			//prepStat.setString(1, "%"+ login +"%");//replace ? by login variable
			//prepStat.setString(2, "%"+ password +"%");//replace ? by login variable
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//check password
			while(resSet.next()){
				user = new User(login, password);
				user.setPassword(resSet.getString("password"));
				user.setId(resSet.getInt("id"));
				user.setFirstName(resSet.getString("firstName"));
				user.setLastName(resSet.getString("lastName"));
				user.setEmail(resSet.getString("email"));
				user.setAdmin(resSet.getBoolean("isAdmin"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;//return user
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean changeField(int idUser, String field) {
		// TODO Auto-generated method stub
		return null;
	}

}
