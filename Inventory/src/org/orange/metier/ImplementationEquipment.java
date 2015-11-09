package org.orange.metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import org.orange.metier.bean.Equipment;

public class ImplementationEquipment implements IEquipment{

	@Override
	public List<Equipment> getEquipmentsWithTag(String tag) {
		
		List<Equipment> listEquips=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT Id, Type, Constructor, Model FROM equipment WHERE CONCAT(Constructor,Type,Model) LIKE ?");
			prepStat.setString(1, "%"+ tag +"%");//replace ? by tag variable
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment equip=new Equipment();
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setModelEquipment(resSet.getString("Model"));
				listEquips.add(equip);//add equip in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEquips;//return list equipments
	}

	@Override
	public void addEquipment(Equipment equip) {	
		
	}

	@Override
	public List<Equipment> getEquipments() {
		
		List<Equipment> listEquips=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT Id, Type, Constructor, Model FROM equipment;");
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment equip=new Equipment();
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setModelEquipment(resSet.getString("Model"));
				listEquips.add(equip);//add equip in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEquips;//return list equipments
	}

	@Override
	public List<Equipment> getEquipmentsWithFilter(List<String> constructor, List<String> type, List<String> status, List<String> localisation) {
		
		//generation request SQL
		String requestSQL="(";
		for(String filter : constructor){
			requestSQL=requestSQL+"Constructor=\""+filter+"\" OR ";
		}
		if(type.size()>=1 && !requestSQL.equals("(")){
			requestSQL=requestSQL.substring(0, requestSQL.length()-3);
			requestSQL=requestSQL+") AND (";
		}
		for(String filter : type){
			requestSQL=requestSQL+"Type=\""+filter+"\" OR ";
		}
		if(status.size()>=1 && !requestSQL.equals("(")){
			requestSQL=requestSQL.substring(0, requestSQL.length()-3);
			requestSQL=requestSQL+") AND (";
		}
		for(String filter : status){
			requestSQL=requestSQL+"Status=\""+filter+"\" OR ";
		}
		if(localisation.size()>=1 && !requestSQL.equals("(")){
			requestSQL=requestSQL.substring(0, requestSQL.length()-3);
			requestSQL=requestSQL+") AND (";
		}
		for(String filter : localisation){
			requestSQL=requestSQL+"Localisation=\""+filter+"\" OR ";
		}
		if(!requestSQL.equals("(")){
			requestSQL=requestSQL.substring(0, requestSQL.length()-3)+")";
		}

		List<Equipment> listEquips=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		
		try{
			PreparedStatement prepStat;
			if(!requestSQL.equals("(")){
				 prepStat = connection.prepareStatement
					("SELECT Id, Type, Constructor, Model FROM equipment WHERE "+requestSQL+";");
			}
			else{
				prepStat = connection.prepareStatement
						("SELECT * FROM equipment ;");
			}
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment equip=new Equipment();
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setModelEquipment(resSet.getString("Model"));
				listEquips.add(equip);//add equip in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEquips;//return list equipments
	}

	@Override
	public Equipment getEquipmentWithId(int id) {
		
		Equipment equip=new Equipment();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM equipment WHERE Id=\""+id+"\";");
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){				
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setModelEquipment(resSet.getString("Model"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setSnEquipment(resSet.getString("Serial_Number"));
				equip.setPnEquipment(resSet.getString("Part_Number"));
				equip.setLocalisationEquipment(resSet.getString("Localisation"));
				equip.setSupervisorEquipment(resSet.getString("Supervisor"));
				equip.setAdressIpEquipment(resSet.getString("Adress_Ip"));
				equip.setNameEquipment(resSet.getString("Name"));
				equip.setLicenseEquipment(resSet.getString("License"));
				equip.setAccessoriesEquipment(resSet.getString("Accessories"));
				equip.setStateEquipment(resSet.getString("State"));
				equip.setStatusEquipment(resSet.getString("Status"));
				equip.setProprietaryEquipment(resSet.getBoolean("Proprietary"));
				equip.setDateEquipment(resSet.getDate("Date"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equip;//return list equipments
	}

}
