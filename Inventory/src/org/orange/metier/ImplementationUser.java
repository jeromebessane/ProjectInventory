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

	public User getDataUser(int idUser) { // The function take the information of the user in the database
		User user = null;
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM users WHERE id = '"+idUser+"';");
			
			ResultSet resSet = prepStat.executeQuery();
			
			while(resSet.next()){
				
				String login = resSet.getString("login");
				String password = resSet.getString("password");
				user = new User(login, password);
				user.setFirstName(resSet.getString("firstName"));
				user.setLastName(resSet.getString("lastName"));
				user.setEmail(resSet.getString("email"));
				user.setLogin(resSet.getString("login"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public int checkField(String field, String data) {
		Boolean regroup_data = true;
		Connection connection=SingletonConnection.getConnection();
		int idUser = 0;
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM users WHERE "+ field +" = '"+data+"';");
			ResultSet resSet = prepStat.executeQuery();
			
			if(!resSet.next()){
				regroup_data = false;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			regroup_data = false;
		}
		return idUser;
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
	
	public void changeData(int idUser, String field, String new_data) {
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("UPDATE users SET "+ field +"  = '"+new_data+"' WHERE id = '"+idUser+"';");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
