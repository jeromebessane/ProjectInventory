package org.orange.metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.sql.PreparedStatement;

import org.orange.metier.bean.Equipment;

public class ImplementationEquipment implements IEquipment{

	@Override
	public List<Equipment> getEquipmentsWithTag(String tag) {
		
		List<Equipment> listEquips=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM equipment WHERE CONCAT(Constructor,Type,Model) LIKE ?");
			prepStat.setString(1, "%"+ tag +"%");//replace ? by tag variable
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment equip=new Equipment();
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setModelEquipment(resSet.getString("Model"));
				equip.setSnEquipment(resSet.getString("Serial_Number"));
				equip.setPnEquipment(resSet.getString("Part_Number"));
				equip.setLicenseEquipment(resSet.getString("License"));
				equip.setLocalisationEquipment(resSet.getString("Localisation"));
				equip.setSupervisorEquipment(resSet.getString("Supervisor"));
				equip.setStatutEquipment(resSet.getString("Statut"));
				equip.setAdressIpEquipment(resSet.getString("Adress_Ip"));
				equip.setNameEquipment(resSet.getString("Name"));
				equip.setProprietaryEquipment(resSet.getString("Proprietary"));
				equip.setAccessoriesEquipment(resSet.getString("Accessories"));
				equip.setDateEquipment(resSet.getDate("Date"));
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Equipment> getEquipments() {
		
		List<Equipment> listEquips=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM equipment");
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment equip=new Equipment();
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setModelEquipment(resSet.getString("Model"));
				equip.setSnEquipment(resSet.getString("Serial_Number"));
				equip.setPnEquipment(resSet.getString("Part_Number"));
				equip.setLicenseEquipment(resSet.getString("License"));
				equip.setLocalisationEquipment(resSet.getString("Localisation"));
				equip.setSupervisorEquipment(resSet.getString("Supervisor"));
				equip.setStatutEquipment(resSet.getString("Statut"));
				equip.setAdressIpEquipment(resSet.getString("Adress_Ip"));
				equip.setNameEquipment(resSet.getString("Name"));
				equip.setProprietaryEquipment(resSet.getString("Proprietary"));
				equip.setAccessoriesEquipment(resSet.getString("Accessories"));
				equip.setDateEquipment(resSet.getDate("Date"));
				listEquips.add(equip);//add equip in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEquips;//return list equipments
	}

	@Override
	public List<Equipment> getLastEquipments() {
		
		List<Equipment> listEquips=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT * FROM equipment ORDER BY Id DESC LIMIT 5");
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment equip=new Equipment();
				equip.setIdEquipment(resSet.getLong("Id"));
				equip.setTypeEquipment(resSet.getString("Type"));
				equip.setConstructorEquipment(resSet.getString("Constructor"));
				equip.setModelEquipment(resSet.getString("Model"));
				equip.setSnEquipment(resSet.getString("Serial_Number"));
				equip.setPnEquipment(resSet.getString("Part_Number"));
				equip.setLicenseEquipment(resSet.getString("License"));
				equip.setLocalisationEquipment(resSet.getString("Localisation"));
				equip.setSupervisorEquipment(resSet.getString("Supervisor"));
				equip.setStatutEquipment(resSet.getString("Statut"));
				equip.setAdressIpEquipment(resSet.getString("Adress_Ip"));
				equip.setNameEquipment(resSet.getString("Name"));
				equip.setProprietaryEquipment(resSet.getString("Proprietary"));
				equip.setAccessoriesEquipment(resSet.getString("Accessories"));
				equip.setDateEquipment(resSet.getDate("Date"));
				listEquips.add(equip);//add equip in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEquips;//return list equipments
		
	}
	
	@Override
	public List<Equipment> getTypesEquipments() {
		
		List<Equipment> tmp_listTypes=new ArrayList<Equipment>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prepStat = connection.prepareStatement
					("SELECT DISTINCT Type FROM equipment");
			
			ResultSet resSet = prepStat.executeQuery();//recovery results
			//for each line create one equipment
			while(resSet.next()){
				Equipment type=new Equipment();
				type.setTypeEquipment(resSet.getString("Type"));
				tmp_listTypes.add(type);//add equip in list
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<Equipment> EpureList = new HashSet<Equipment>(tmp_listTypes);
		List<Equipment> listTypes = new ArrayList<Equipment>(EpureList);
		return listTypes;//return list equipments
	}
}
