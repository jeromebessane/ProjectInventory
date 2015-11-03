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
		
		testGetListFilter();
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

}
