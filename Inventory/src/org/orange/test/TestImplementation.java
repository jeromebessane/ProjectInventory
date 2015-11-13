package org.orange.test;

import java.util.ArrayList;
import java.util.List;

import org.orange.metier.ImplementationEquipment;
import org.orange.metier.ImplementationFilter;
import org.orange.metier.ImplementationUser;
import org.orange.metier.bean.Equipment;
import org.orange.metier.bean.User;

public class TestImplementation {

	public static void main(String[] args) {
		
		testGetAddEquipments();
		//testGetEquipmentsWithFilter();
		//testGetTypesEquipments();
		//testGetLastEquipments();
		//testGetListFilter();
		//testGetListFilter();
		//testCheckUser();
		//testGetEquipments();
		//testGetEquipmentsWithTag();

	}
	
	private static void testGetEquipmentsWithTag(){
		ImplementationEquipment impl = new ImplementationEquipment();
		List<Equipment> listEquips = impl.getEquipmentsWithTag("Cisco");
		for(Equipment equip:listEquips){
			System.out.println(equip.getTypeEquipment());
		}
	}
	
	private static void testGetEquipments(){
		ImplementationEquipment impl = new ImplementationEquipment();
		List<Equipment> listEquips = impl.getEquipments();
		for(Equipment equip:listEquips){
			System.out.println(equip.getTypeEquipment());
		}
	}
	
	private static void testCheckUser(){
		ImplementationUser impl = new ImplementationUser();
		User user = impl.getUserValidate("jbessane", "root");
		System.out.println("test :");
		if(user!=null){
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getPassword());
		}
	}
	
	private static void testGetListField(){
		ImplementationFilter impl = new ImplementationFilter();
		List<String> listFilter = impl.getListField("Constructor");
		for(String result:listFilter){
			System.out.println(result);
		}
	}
	
	private static void testGetListFilter(){
		ImplementationFilter impl = new ImplementationFilter();
		List<List<String>> listFilter = impl.getListFilter();
		for(String result:listFilter.get(0)){
			System.out.println(result);
		}
	}


	private static void testGetEquipmentsWithFilter(){
		List<String> constructeur=new ArrayList<String>();
		//constructeur.add("Cisco");
		constructeur.add("Tandberg");
		List<String> type=new ArrayList<String>();
		type.add("Telephone IP");
		List<String> status=new ArrayList<String>();
		List<String> localisation=new ArrayList<String>();
		ImplementationEquipment impl = new ImplementationEquipment();
		List<Equipment> listEquips = impl.getEquipmentsWithFilter(constructeur, type, status, localisation);
		for(Equipment equip:listEquips){
			System.out.println(equip.getConstructorEquipment());
			System.out.println(equip.getTypeEquipment());
		}
	}


	private static void testGetLastEquipments(){
		ImplementationEquipment impl = new ImplementationEquipment();
		List<Equipment> listEquips = impl.getLastEquipments();
		for(Equipment equip:listEquips){
			System.out.println(equip.getModelEquipment());
		}
	}
		
	private static void testGetTypesEquipments(){
		ImplementationEquipment impl = new ImplementationEquipment();
		List<Equipment> listEquips = impl.getTypesEquipments();
		for(Equipment equip:listEquips){
		System.out.println(equip.getTypeEquipment());
		}
	}
		
	private static void testGetAddEquipments(){
		ImplementationEquipment impl = new ImplementationEquipment();
		Equipment equip = new Equipment();
		equip.setTypeEquipment("toto1");
		equip.setConstructorEquipment("toto2");
		equip.setModelEquipment("toto3");
		equip.setSnEquipment("toto4");
		equip.setPnEquipment("toto5");
		equip.setLocalisationEquipment("toto6");
		equip.setSupervisorEquipment("toto7");
		equip.setAdressIpEquipment("toto8");
		equip.setNameEquipment("toto9");
		equip.setLicenseEquipment("toto10");
		equip.setAccessoriesEquipment("toto11");
		equip.setStateEquipment("toto12");
		equip.setStatusEquipment("toto13");
		System.out.println(impl.addEquipment(equip));
	}
}

