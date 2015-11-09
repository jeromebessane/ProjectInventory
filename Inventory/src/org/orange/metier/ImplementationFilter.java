package org.orange.metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ImplementationFilter implements IFilter {

	@Override
	public List<String> getListField(String field) {
		List<String> listFilter = new ArrayList<String>();
		String result;
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT DISTINCT "+field+" FROM equipment;");
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line store result
			while(resSet.next()){
				result=resSet.getString(field);
				listFilter.add(result);//add result in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listFilter;//return list filter
	}

	@Override
	public List<List<String>> getListFilter() {
		List<List<String>> listFilter = new ArrayList<List<String>>();
		String result;
		Connection connection=SingletonConnection.getConnection();

		try {
			//for field constructor
			List<String> listField = new ArrayList<String>();
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT DISTINCT Constructor FROM equipment;");		
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line store result in list of constructor
			while(resSet.next()){
				result=resSet.getString("Constructor");
				listField.add(result);//add constructor in list
			}
			listFilter.add(listField);//add list of constructor in list of lists
			
			//for field type
			listField = new ArrayList<String>();
			prepStat = connection.prepareStatement
					("SELECT DISTINCT Type FROM equipment;");		
			resSet = prepStat.executeQuery();//recovery results
			//for each line store result in list of type
			while(resSet.next()){
				result=resSet.getString("Type");
				listField.add(result);//add type in list
			}
			listFilter.add(listField);//add list of type in list of lists
			
			//for field statut
			listField = new ArrayList<String>();
			prepStat = connection.prepareStatement
					("SELECT DISTINCT Status FROM equipment;");		
			resSet = prepStat.executeQuery();//recovery results
			//for each line store result in list of statut
			while(resSet.next()){
				result=resSet.getString("Status");
				listField.add(result);//add statut in list
			}
			listFilter.add(listField);//add list of statut in list of lists
			
			//for field localisation
			listField = new ArrayList<String>();
			prepStat = connection.prepareStatement
					("SELECT DISTINCT Localisation FROM equipment;");		
			resSet = prepStat.executeQuery();//recovery results
			//for each line store result in list of localisation
			while(resSet.next()){
				result=resSet.getString("Localisation");
				listField.add(result);//add localisation in list
			}
			listFilter.add(listField);//add list of localisation in list of lists
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listFilter;//return list of lists
	}
}
