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

}
